package com.cpw.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 任务实体
 * 
 * @author epeicen
 *
 */
@Entity
@Table(name = "task")
public class TaskVO {
	@Id
	@GeneratedValue
	private int taskId;
	@Column
	private int userId;
	@Column
	private int printerId;
	@Column
	private int totalNum;
	@Column
	private int lastNum;
	@Column
	private String status;
	@Column
	private int lastNumCount;
	@Column
	private String printerName;

	public String getPrinterName() {
		return printerName;
	}

	public void setPrinterName(String printerName) {
		this.printerName = printerName;
	}

	public int getLastNumCount() {
		return lastNumCount;
	}

	public void setLastNumCount(int lastNumCount) {
		this.lastNumCount = lastNumCount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getTaskId() {
		return taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getPrinterId() {
		return printerId;
	}

	public void setPrinterId(int printerId) {
		this.printerId = printerId;
	}

	public int getTotalNum() {
		return totalNum;
	}

	public void setTotalNum(int totalNum) {
		this.totalNum = totalNum;
	}

	public int getLastNum() {
		return lastNum;
	}

	public void setLastNum(int lastNum) {
		this.lastNum = lastNum;
	}

}
