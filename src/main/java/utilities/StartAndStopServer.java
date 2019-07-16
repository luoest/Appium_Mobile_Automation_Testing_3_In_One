package utilities;

import java.util.concurrent.TimeUnit;

public class StartAndStopServer {

	Runtime runtime = Runtime.getRuntime();
	// 自动启动appium server
	public void startServer() {
		try {
			runtime.exec("cmd.exe /c start cmd.exe /k \"appium\"");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	// 自动关闭appium server
	public void stopServer() {
		try {
			runtime.exec("taskkill /F /IM node.exe");
			runtime.exec("taskkill /F /IM cmd.exe");	
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
