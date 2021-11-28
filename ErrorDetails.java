package empAdress.curd.Exception;

import java.util.Date;

import lombok.Data;
@Data
public class ErrorDetails  {


	public ErrorDetails(Date date, String message2, String description) {
		// TODO Auto-generated constructor stub
	}
	private Date timestamp;
	private String message;
	private String Details; 
	
}
