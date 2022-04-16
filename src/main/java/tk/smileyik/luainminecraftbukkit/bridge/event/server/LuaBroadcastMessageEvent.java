package tk.smileyik.luainminecraftbukkit.bridge.event.server;

import org.bukkit.event.EventHandler;
import org.bukkit.event.server.BroadcastMessageEvent;
import tk.smileyik.luainminecraftbukkit.plugin.LuaEvent;

public class LuaBroadcastMessageEvent extends LuaEvent<BroadcastMessageEvent> {

  public LuaBroadcastMessageEvent(String id) {super(id);}

  @EventHandler
  public void event(BroadcastMessageEvent e) {super.event(e);}
}