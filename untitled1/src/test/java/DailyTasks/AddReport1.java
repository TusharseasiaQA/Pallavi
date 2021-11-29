package DailyTasks;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;

import java.net.MalformedURLException;

public class AddReport1 {
      public static void main(String[] args) throws EmailException, MalformedURLException {


        // Create the attachment
        EmailAttachment attachment = new EmailAttachment();
        attachment.setPath("D:\\Java Practice\\untitled1\\target\\Report.html");
        attachment.setDisposition(EmailAttachment.ATTACHMENT);
        attachment.setDescription("Picture of John");
        attachment.setName("John");

        // Create the email message
        MultiPartEmail email = new MultiPartEmail();
        email.setHostName("smtp.gmail.com");
        email.setSSLOnConnect(true);
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator("palvimonga884@gmail.com","12qwerty34"));
        email.setStartTLSEnabled(true);

 


        email.addTo("pallavimonga12@gmail.com", "John Doe");
        email.setFrom("palvimonga884@gmail.com", "Me");
        email.setSubject("The picture");
        email.setMsg("Here is the picture you wanted");

        // add the attachment
        email.attach(attachment);

        // send the email
        email.send();
        System.out.println("email sent");

    }

}
