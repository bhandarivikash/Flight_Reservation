package com.Flight.Utility;

import java.io.File;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component
public class EmailUtil {

	@Autowired
	 JavaMailSender sender;
	
	public void sendItinerary(String toAddress, String filePath) {
		MimeMessage message = sender.createMimeMessage();
		try {
			MimeMessageHelper MessageHelper = new MimeMessageHelper(message,true);
			MessageHelper.setTo(toAddress);
			MessageHelper.setSubject("Flight Booking Done");
			MessageHelper.setText("Please find the attached");
			MessageHelper.addAttachment("Itinerary", new File(filePath));
			sender.send(message);
		}catch (MessagingException e){
			e.printStackTrace();
		}
	}
}

