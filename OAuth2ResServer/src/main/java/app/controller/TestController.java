package app.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/services")
public class TestController {

	@GetMapping("/hello/{name}")
	public ResponseEntity<?> getHelloMessage(@PathVariable("name")String name){
		
		return ResponseEntity.ok(new Message("Hello "+name));
	}
	
	
	static public class Message{
		private String message;

		public Message() {
		}

		public Message(String message) {
			this.message = message;
		}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}
		
		
	}
}
