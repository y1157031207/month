package com.ypf.service;

import java.util.List;
import java.util.Map;

import com.ypf.beans.Activity;
import com.ypf.beans.Server;
import com.ypf.beans.Type;

public interface ActService {

	List<Activity> queryAct(Map<String, Object> map);
	
	List<Type> queryType();
	
	List<Server> queryServer();

	void addAct(Activity activity);

	void addActSer(Map<String, Object> map);
	
	void delAct(Integer aid);
	
	void delActSer(Integer aid);
	
	Activity queryActivityByAid(Integer aid);
	
	void updateAct(Activity activity);
}
