package com.ypf.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ypf.beans.Activity;
import com.ypf.beans.Server;
import com.ypf.beans.Type;
import com.ypf.mapper.ActMapper;

@Service
public class ActServiceImpl implements ActService {

	@Resource
	private ActMapper mapper;
	
	public List<Activity> queryAct(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return mapper.queryAct(map);
	}

	public List<Type> queryType() {
		// TODO Auto-generated method stub
		return mapper.queryType();
	}

	public List<Server> queryServer() {
		// TODO Auto-generated method stub
		return mapper.queryServer();
	}

	public void addAct(Activity activity) {
		// TODO Auto-generated method stub
		mapper.addAct(activity);
	}

	public void addActSer(Map<String, Object> map) {
		// TODO Auto-generated method stub
		mapper.addActSer(map);
	}

	public void delAct(Integer aid) {
		// TODO Auto-generated method stub
		mapper.delAct(aid);
	}

	public void delActSer(Integer aid) {
		// TODO Auto-generated method stub
		mapper.delActSer(aid);
	}

	public Activity queryActivityByAid(Integer aid) {
		// TODO Auto-generated method stub
		return mapper.queryActivityByAid(aid);
	}

	public void updateAct(Activity activity) {
		// TODO Auto-generated method stub
		mapper.updateAct(activity);
	}

}
