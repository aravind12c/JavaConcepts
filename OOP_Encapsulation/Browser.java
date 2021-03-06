package OOP_Encapsulation;

import java.net.URL;
import java.net.URLConnection;

public class Browser {

	public String name;
	public double version;

	private String plugin;
	public void setPlugin(String plugin) {
		this.plugin = plugin;
	}
	
	public String getPlugin() {
		return plugin;
	}

	public void launchBrowser() {
		System.out.println("launching browser...");
		checkOSCompatible();
		System.out.println(" browser...is launched");

	}
	
	
	String a = getPlugin();

	private void checkOSCompatible() {
		System.out.println("checkOSCompatible");
		checkBrowserExecutable();
	}

	private void checkBrowserExecutable() {
		System.out.println("checkBrowserExecutable");
		browserVersionCheck();
	}

	private void browserVersionCheck() {
		System.out.println("browserVersionCheck");
	}

}
