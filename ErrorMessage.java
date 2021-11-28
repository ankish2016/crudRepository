package empAdress.curd.Exception.Model;

import java.util.Date;

import lombok.Data;


public class ErrorMessage {

	private int statusCode;
	private Date TimeStamp;
	private String message;
	private String Description;
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public Date getTimeStamp() {
		return TimeStamp;
	}
	public void setTimeStamp(Date timeStamp) {
		TimeStamp = timeStamp;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public ErrorMessage(int statusCode, Date timeStamp, String message, String description) {
		super();
		this.statusCode = statusCode;
		TimeStamp = timeStamp;
		this.message = message;
		Description = description;
	}
	public ErrorMessage() {
		super();
		
	}
	
	
}
