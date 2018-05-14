package com.exam.junit.junittest;

public class BeanAppManager {
	
	public BeanApp objectWithId(String appname){
		return null;
	}
	
	public boolean validate(String appid, String appsecret){
		BeanApp app = objectWithId(appid);
		if(app == null){
			return false;
		}
		return app.getAppsecret().equals(appsecret);
	}
	
	public static boolean validateApplication(String appid,String appsecret){
		BeanAppManager manager = new BeanAppManager();
		return manager.validate(appid, appsecret);
	}

}
