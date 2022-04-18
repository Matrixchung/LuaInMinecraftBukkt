package tk.smileyik.luainminecraftbukkit.plugin.util;

import org.bukkit.plugin.Plugin;
import tk.smileyik.luainminecraftbukkit.LuaInMinecraftBukkit;
import tk.smileyik.luainminecraftbukkit.plugin.outside.LuaPluginManagerOutside;

public class LuaPluginHelper {
  /**
   * 指定脚本插件是否加载.
   * @param id 脚本插件id
   * @return 如果已经加载则返回true.
   */
  public boolean isLoadPlugin(String id) {
    return LuaInMinecraftBukkit.getPluginManager().isLoadPlugin(id);
  }

  /**
   * 以指定id对应的函数为run方法主体创建一个Runnable子类实例
   * @param id 函数路径
   * @return LuaRunnable实例
   */
  public LuaRunnable newLuaRunnable(String id) {
    return new LuaRunnable(id);
  }

  /**
   * 以指定id对应的函数为run方法主体创建一个Runnable子类实例
   * @param id 函数路径
   * @param obj 带入的参数.
   * @return LuaRunnable实例
   */
  public LuaRunnable newLuaRunnable(String id, Object obj) {
    return new LuaRunnable(id, obj);
  }

  public Plugin getPlugin() {
    return LuaInMinecraftBukkit.getInstance();
  }

  public Class<?> getClass(String name) throws ClassNotFoundException {
    return Class.forName(name);
  }

  public boolean isNativeMode() {
    return LuaInMinecraftBukkit.getPluginManager() instanceof LuaPluginManagerOutside;
  }
}