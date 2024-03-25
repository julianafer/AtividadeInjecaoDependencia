package injector;

import consumer.Consumer;
import consumer.MyApplication;
import service.EmailService;

public class EmailServiceInjector implements MessageServiceInjector {
	
	@Override
	public Consumer getConsumer() {
		return new MyApplication(new EmailService());
	}
}
