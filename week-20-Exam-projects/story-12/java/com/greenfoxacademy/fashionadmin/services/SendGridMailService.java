package com.greenfoxacademy.fashionadmin.services;

import com.sendgrid.*;;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class SendGridMailService {

    private SendGrid sendGrid;

    public SendGridMailService() {
    }

    public SendGridMailService(SendGrid sendGrid) {
        this.sendGrid = sendGrid;
    }

    public void sendMail(String email, String URL) {
        Email from = new Email("codegirlz.fashion@gmail.com");
        String subject = "Activation mail";
        Email to = new Email(email);
        Content content = new Content("text/plain", URL);
        Mail mail = new Mail(from, subject, to, content);
        SendGrid sg = new SendGrid(System.getenv("SENDGRID_PASSWORD"));

        Request request = new Request();

        try {
            request.setMethod(Method.POST);
            request.setEndpoint("mail/send");
            request.setBody(mail.build());
            Response response = sg.api(request);

        } catch (IOException ex) {
            System.out.println("Email address does not exist or send failed");
        }
    }
}

