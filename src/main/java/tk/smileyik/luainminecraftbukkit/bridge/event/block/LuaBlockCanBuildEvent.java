package tk.smileyik.luainminecraftbukkit.bridge.event.block;

import org.bukkit.event.EventHandler;
import org.bukkit.event.block.BlockCanBuildEvent;
import tk.smileyik.luainminecraftbukkit.plugin.event.LuaEvent;

public class LuaBlockCanBuildEvent extends LuaEvent<BlockCanBuildEvent> {

  public LuaBlockCanBuildEvent(String id) {super(id);}

  @EventHandler
  public void event(BlockCanBuildEvent e) {super.event(e);}
}