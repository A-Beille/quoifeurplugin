package quoifeurplugin.quoifeurplugin.handlers;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import quoifeurplugin.quoifeurplugin.Quoifeurplugin;

import java.util.Timer;
import java.util.TimerTask;

public class TchatHandlers implements Listener {
    public TchatHandlers(Quoifeurplugin plugin){
        Bukkit.getPluginManager().registerEvents(this,plugin);
    }
    @EventHandler
    public void onBlockPlace(AsyncPlayerChatEvent event){
        if(event.getMessage().toLowerCase().endsWith("quoi")  || event.getMessage().toLowerCase().endsWith("koi") || event.getMessage().toLowerCase().endsWith("koa")) {
            new Timer().schedule(new TimerTask() {
                @Override
                public void run() {
                    Bukkit.broadcastMessage("feur");
                }
            },100);

        }
        if(event.getMessage().toLowerCase().endsWith("oui")  || event.getMessage().toLowerCase().endsWith("ui")) {
            new Timer().schedule(new TimerTask() {
                @Override
                public void run() {
                    Bukkit.broadcastMessage("fi");
                }
            },100);

        }
        if(event.getMessage().toLowerCase().endsWith("non")  || event.getMessage().toLowerCase().endsWith("nn") || event.getMessage().toLowerCase().endsWith("nan")) {
            new Timer().schedule(new TimerTask() {
                @Override
                public void run() {
                    Bukkit.broadcastMessage("bril");
                }
            },100);
        }
        if(event.getMessage().toLowerCase().endsWith("fi")) {
            new Timer().schedule(new TimerTask() {
                @Override
                public void run() {
                    Bukkit.broadcastMessage("celle");
                }
            },100);

        }
        if(event.getMessage().toLowerCase().endsWith("celle")) {
            new Timer().schedule(new TimerTask() {
                @Override
                public void run() {
                    Bukkit.broadcastMessage("si");
                }
            },100);

        }
        if(event.getMessage().toLowerCase().endsWith("si")) {
            new Timer().schedule(new TimerTask() {
                @Override
                public void run() {
                    Bukkit.broadcastMessage("zo");
                }
            },100);

        }
        if(event.getMessage().toLowerCase().endsWith("feur")) {
            new Timer().schedule(new TimerTask() {
                @Override
                public void run() {
                    Bukkit.broadcastMessage("ouge");
                }
            },100);

        }
    }

}
