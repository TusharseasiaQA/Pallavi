package Inheritance;






        import java.io.File;
        import java.io.IOException;
        import java.util.Properties;

        import javax.mail.*;
        import javax.mail.internet.*;
        import javax.sound.sampled.Port;

        import org.openqa.selenium.By;
        import org.openqa.selenium.OutputType;
        import org.openqa.selenium.TakesScreenshot;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.openqa.selenium.io.FileHandler;
        import org.testng.Assert;
        import org.testng.ITestResult;
        import org.testng.annotations.AfterMethod;
        import org.testng.annotations.AfterTest;
        import org.testng.annotations.BeforeTest;
        import org.testng.annotations.Test;



public class Screen {



    public static void main(String[] args) {
        String to = "pallavimonga12@gmail.com";

        // Sender's email ID needs to be mentioned
        String from = "palvimonga884@gmail.com";

        // Assuming you are sending email from through gmails smtp
        String host = "smtp.gmail.com";
//String port;
        // Get system properties
        Properties properties = System.getProperties();

        // Setup mail server
//        properties.put("mail.smtp.host", host);
//        properties.put("mail.smtp.port", "465");
//        properties.put("mail.smtp.ssl.enable", "true");                         //ssl-security socket layer
//        properties.put("mail.smtp.auth", "true");
//        properties.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
        // enable authentication
        properties.put("mail.smtp.auth", "true");

        // enable STARTTLS
        properties.put("mail.smtp.starttls.enable", "true");

        // Setup mail server
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.ssl.trust", "smtp.gmail.com");

        // TLS Port
        properties.put("mail.smtp.port", "587");

        // Get the Session object.// and pass username and password
        Session session = Session.getInstance(properties, new javax.mail.Authenticator() {

            protected PasswordAuthentication getPasswordAuthentication() {

                return new PasswordAuthentication("palvimonga884@gmail.com", "12qwerty34");
            }
        });
        // Used to debug SMTP issues
        session.setDebug(true);

        try {
            // Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(session);

            // Set From: header field of the header.
            message.setFrom(new InternetAddress(from));

            // Set To: header field of the header.
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

            // Set Subject: header field
            message.setSubject("This is the Subject Line!");

            // Now set the actual message
            message.setText("This is actual message");

            System.out.println("sending...");
            // Send message
            Transport.send(message);
            System.out.println("Sent message successfully....");
        }
        catch (MessagingException mex) {
            mex.printStackTrace();
        }}}