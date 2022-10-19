package quoifeurplugin.quoifeurplugin;

import org.bukkit.plugin.java.JavaPlugin;
import quoifeurplugin.quoifeurplugin.handlers.TchatHandlers;

public final class Quoifeurplugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
new TchatHandlers(this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
