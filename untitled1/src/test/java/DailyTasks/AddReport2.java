package DailyTasks;

import org.apache.commons.mail.*;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class AddReport2 {

    public static void main(String[] args) throws EmailException {


        System.out.println("prparing send message");
        String message = "hello dear i am Lavkush";
        String subject = "media confirmation";
        String to = "pallavimonga12@gmail.com";
        String from = "palvimonga884@gmail.com";

        //sendEmail(message,subject,to,from);
        sendAttach(message, subject, to, from);
    }

    private static void sendAttach(String message, String subject, String to, String from) throws EmailException {
        // TODO Auto-generated method stub



        // TODO Auto-generated method stub
        //variablefor gmail
        String host = "smtp.gmail.com";

        //get the system prperties
        Properties properties = System.getProperties();
        System.out.println("PROPERTIES" + properties);

        //host set
//        properties.put("mail.smtp.host", host);
//        properties.put("mail.smtp.port", "465");
//        properties.put("mail.smtp.ssl.enable", "true");
//        properties.put("mail.smtp.auth", "true");

        properties.put("mail.smtp.auth", "true");

        // enable STARTTLS
        properties.put("mail.smtp.starttls.enable", "true");

        // Setup mail server
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.ssl.trust", "smtp.gmail.com");

        // TLS Port
        properties.put("mail.smtp.port", "587");


        Session session = Session.getInstance(properties, new Authenticator() {

            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("palvimonga884@gmail.com", "12qwerty34");
            }
        });


        session.setDebug(true);

        MimeMessage m = new MimeMessage(session);
        EmailAttachment attachment = new EmailAttachment();
        attachment.setPath("D:\\Java Practice\\untitled1\\target\\Report.html");

        Email email = new SimpleEmail();
       email.setFrom("palvimnga884@gmail.com");
        email.addTo("pallavimonga12@gmail.com");
        email.setAuthenticator(new DefaultAuthenticator("palvimonga884@gmail.com", "12qwerty34\""));
        email.send();
        email.setSmtpPort(587);
        email.setHostName("smtp.gmail.com");
        System.out.println("email sent");

    }
}