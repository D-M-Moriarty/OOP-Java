public class Message {
	String recipient, sender, message;
	
	public Message(String sender, String recipient){
		setSender(sender);
		setRecipient(recipient);
	}
	
	public void setSender(String sender){
		this.sender = sender;
	}
	
	public void setRecipient(String recipient){
		this.recipient = recipient;
	}
	
	public String getSender(){
		return sender;
	}
	
	public String getRecipient(){
		return recipient;
	}
	
	public void append(String message){
		this.message = message;
	}
	
	public String toString(){
		return "From: "+sender+"\nTo: "+recipient+
			"\nMessage: "+message;
	}
}