package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.TaskRepo;
import com.example.demo.model.TaskModel;

@Service
public class TaskService {

	@Autowired
	TaskRepo tr;
	
	public List<TaskModel> getTaskDetails(TaskModel tm) {
		List<TaskModel> getTaskDetails=tr.getTaskDetails(tm);  
		return getTaskDetails;	
	}
	
	public List<TaskModel> createTask(TaskModel tm) {
		List<TaskModel> createTask=tr.createTask(tm);  
		return createTask;

	}
	public List<TaskModel> updateTask(TaskModel tm) {
	    List<TaskModel> updatedTaskDetails=tr.updateTask(tm);
    	return updatedTaskDetails;
	}

	public List<TaskModel> taskDetails(TaskModel tm) {
		List<TaskModel> taskDetails=tr.taskDetails(tm);
		return taskDetails;
	}


	public List<TaskModel> editTask(TaskModel tm) {
		List<TaskModel> editedTaskDetails=tr.editTask(tm);
		return editedTaskDetails;
	}
	public List<TaskModel> updateTaskValues(TaskModel tm) {
		List<TaskModel> updatedTaskValues=tr.updateTaskValues(tm);
		return updatedTaskValues;

	}

	public List<TaskModel> updateTaskActualHour(TaskModel tm) {
		List<TaskModel> updateTaskActualHour=tr.updateTaskActualHour(tm);
		return updateTaskActualHour;
	}
	

	
	
}
