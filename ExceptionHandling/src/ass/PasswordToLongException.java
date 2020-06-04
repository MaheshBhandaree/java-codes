package ass;

public class PasswordToLongException extends Exception
{
	private String message;

	public PasswordToLongException(String message) {
		super();
		this.message = "The Password is To long more Than 12 char";
		
	}

	@Override
	public String toString() {
		return "PasswordToLongException [message=" + message + "]";
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
 
}
