package tk.smileyik.luainminecraftbukkit.plugin.mode.outside;

import tk.smileyik.luainminecraftbukkit.plugin.AbstractLuaPlugin;
import tk.smileyik.luainminecraftbukkit.plugin.mode.hybrid.RunType;

import java.io.File;
import java.util.List;

public class LuaPluginOutside extends AbstractLuaPlugin {

  public LuaPluginOutside(String id, String displayName, String author,
                          String version, List<String> softDependents,
                          List<String> dependents, File pluginPath,
                          File configPath, RunType runType) {
    super(id, displayName, author, version,
            softDependents, dependents, pluginPath, configPath, runType);
  }

  @Override
  public String getRequirePath(String module) {
    return getPluginPath().getPath() + "/" + module;
  }
}