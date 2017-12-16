package jms.com.spring.receiver;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import jms.com.spring.pojo.Email;

@Component
public class Receiver {

	@JmsListener(destination="mailbox", containerFactory="myFactory")
	public void receiveMessage(Email email){
		System.out.println("Received<" + email + ">");
	}
}
