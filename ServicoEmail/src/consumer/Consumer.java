package consumer;

public interface Consumer {
	
	void processMessages(String message, String receiver);
}
