package com.ypf.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ypf.beans.Activity;
import com.ypf.beans.Server;
import com.ypf.beans.Type;
import com.ypf.service.ActService;

@Controller
public class ActController {

	@Resource
	private ActService ser;
	
	@RequestMapping("queryAct")
	public String queryAct(@RequestParam(defaultValue="1")Integer pageNum,Model model,
			String createstart,String createend,String aname,Integer tid){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("createstart", createstart);
		map.put("createend", createend);
		map.put("aname", aname);
		map.put("tid", tid);
		PageHelper.startPage(pageNum, 3);
		List<Activity> list = ser.queryAct(map);
		PageInfo<Activity> page = new PageInfo<Activity>(list);
		model.addAttribute("page", page);
		return "list";
	}
	
	@RequestMapping("queryType")
	@ResponseBody
	public List<Type> queryType(){
		List<Type> list = ser.queryType();
		return list;
	}
	
	@RequestMapping("queryServer")
	@ResponseBody
	public List<Server> queryServer(){
		List<Server> list = ser.queryServer();
		return list;
	}
	
	@RequestMapping("addAct")
	@ResponseBody
	public boolean addAct(Activity activity,String sid){
		try {
			ser.addAct(activity);
			Map<String, Object> map = new HashMap<String, Object>();
			String[] split = sid.split(",");
			for (String string : split) {
				map.put("aid", activity.getAid());
				map.put("sid", string);
				ser.addActSer(map);
			}
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}
	
	@RequestMapping("delAct")
	public String delAct(Integer aid){
		try {
			ser.delAct(aid);
			ser.delActSer(aid);
			return "redirect:queryAct";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "redirect:false";
		}
	}
	
	@RequestMapping("toUpdate")
	public String queryActivityByAid(Integer aid,Model model){
		Activity activity = ser.queryActivityByAid(aid);
		model.addAttribute("activity", activity);
		
		return "update";
	}
	
	@RequestMapping("updateAct")
	@ResponseBody
	public boolean updateAct(Activity activity,String sid){
		try {
			ser.updateAct(activity);
			ser.delActSer(activity.getAid());
			Map<String, Object> map = new HashMap<String, Object>();
			String[] split = sid.split(",");
			for (String string : split) {
				map.put("aid", activity.getAid());
				map.put("sid", string);
				ser.addActSer(map);
			}
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}
}
