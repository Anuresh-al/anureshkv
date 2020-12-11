package web.application.phaseone;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@EntityScan
@Document (collection="shoper")
public class Shopper {
	@Id
	public String name;
	public String email;
	public String message;
	@Override
	public String toString() {
		return "Shopper [name=" + name + ", email=" + email + ", message=" + message + "]";
	}
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
