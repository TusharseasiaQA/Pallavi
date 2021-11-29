package DailyTasks;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

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

public class DoneScreenShot {





    public static void main(String[] args) {
        System.out.println("prparing send message");
        String message="hello dear i am Lavkush";
        String subject="media confirmation";
        String to="pallavimonga12@gmail.com";
        String from="palvimonga884@gmail.com";

        //sendEmail(message,subject,to,from);
        sendAttach(message,subject,to,from);
    }

    private static void sendAttach(String message, String subject, String to, String from) {
        // TODO Auto-generated method stub


        // TODO Auto-generated method stub
        //variablefor gmail
        String host="smtp.gmail.com";

        //get the system prperties
        Properties properties=System.getProperties();
        System.out.println("PROPERTIES"+properties);

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


        Session  session = Session.getInstance(properties, new Authenticator() {

            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("palvimonga884@gmail.com","12qwerty34");
            }
        });



        session.setDebug(true);

        MimeMessage m=new MimeMessage(session);

        try {


            m.setFrom();
            m.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            m.setSubject(subject);

            String path="D:\\Java Practice\\untitled1\\Titletest.png";
            MimeMultipart mimipa=new MimeMultipart();

            MimeBodyPart textmine=new MimeBodyPart();
            MimeBodyPart filemine=new MimeBodyPart();

            try {
                textmine.setText(path);
                File file=new File(path);
                filemine.attachFile(file);

                mimipa.addBodyPart(filemine);
                mimipa.addBodyPart(textmine);

            }catch(Exception e) {

                e.printStackTrace();
            }
            m.setContent(mimipa);
            Transport.send(m);
            System.out.println("sent sccess");
        }catch(Exception e) {

            e.printStackTrace();
        }


    }
}