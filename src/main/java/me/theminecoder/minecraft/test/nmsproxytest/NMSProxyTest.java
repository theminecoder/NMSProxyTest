package me.theminecoder.minecraft.test.nmsproxytest;

import com.google.common.primitives.Doubles;
import me.theminecoder.minecraft.nmsproxy.proxy.NMSProxyProvider;
import me.theminecoder.minecraft.test.nmsproxytest.nms.*;
import me.theminecoder.minecraft.test.nmsproxytest.nms.pathfinder.PathfinderGoalTest;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class NMSProxyTest extends JavaPlugin implements Listener, Runnable {

    private NMSProxyProvider proxyProvider;
    private NMSCraftServer nmsCraftServer;

    @Override
    public void onEnable() {
        System.out.println(); //idk why logger needs a line reset but meh
        this.proxyProvider = NMSProxyProvider.get(this);
        this.nmsCraftServer = proxyProvider.getNMSObject(NMSCraftServer.class, this.getServer());
        this.getServer().getPluginManager().registerEvents(this, this);
        this.getServer().getScheduler().runTaskTimer(this, this, 0, 200);
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        NMSCraftPlayer craftPlayer = proxyProvider.getNMSObject(NMSCraftPlayer.class, event.getPlayer());
        System.out.println();
        System.out.println("craftPlayer = " + craftPlayer);
        System.out.println("craftPlayer.getHandle() = " + craftPlayer.getHandle());
        System.out.println("craftPlayer.getHandle().playerConnection() = " + craftPlayer.getHandle().playerConnection());

        try {
            NMSMountPacket mountPacket = proxyProvider.constructNMSObject(NMSMountPacket.class, craftPlayer.getHandle());
            System.out.println("mountPacket = " + mountPacket);
        } catch (ReflectiveOperationException e) {
            e.printStackTrace();
        }

        System.out.println("craftPlayer.getHandle().getProfile() = " + craftPlayer.getHandle().getProfile());

        try {
            NMSChatComponentText chatComponentText = proxyProvider.constructNMSObject(NMSChatComponentText.class, "hello there!");
            NMSChatPacket chatPacket = proxyProvider.constructNMSObject(NMSChatPacket.class, chatComponentText);
            craftPlayer.getHandle().playerConnection().networkManager().sendPacket(chatPacket);
        } catch (ReflectiveOperationException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            Creeper creeper = player.getWorld().spawn(player.getLocation(), Creeper.class);
            NMSCraftLivingEntity craftLivingEntity = proxyProvider.getNMSObject(NMSCraftLivingEntity.class, creeper);

            craftLivingEntity.getHandle().goalSelector().b().clear();
            try {
                NMSPathfinderGoal pathfinderGoalTest = proxyProvider.constructNMSSubclass(PathfinderGoalTest.class);
                craftLivingEntity.getHandle().goalSelector().a(1, pathfinderGoalTest);
            } catch (ReflectiveOperationException e) {
                e.printStackTrace();
            }

        }
        return true;
    }

    @Override
    public void run() {
        System.out.println("TPS (1m, 5m, 15m): " + Doubles.join(", ", this.nmsCraftServer.getTPS()));
    }

}
