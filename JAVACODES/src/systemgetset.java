
public class systemgetset {
	
	public static void main(String[] args) {
     String property = System.getProperty("user.dir");
     
     String pathToExe = property+ "\\driverExes\\IEDriverServer_Win32_2.48.0\\IEDriverServer.exe";
	System.out.println(pathToExe);
	
	pathToExe =  property+ "driverExes\\chromedriver_win32 (1)\\chromedriver.exe";
	System.out.println(pathToExe);
		
		
	}

}
