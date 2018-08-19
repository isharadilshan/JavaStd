/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bunty
 */

import java.sql.SQLException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.*;
import javax.mail.internet.*;
import javax.mail.internet.MimeMessage;
import model.Postgraduate;

public class EmailPostgraduate {
    
    public static void main(String args[]) throws ClassNotFoundException, SQLException{
        
        ArrayList<Postgraduate>postglist = PostgraduateController.getAllPostgraduates();
        for(int i=0;i<postglist.size();i++){ 
            try{

                String host = "smtp.gmail.com";
                String user = "dilshanishara73@gmail.com";
                String pass = "PHpid_75";
                String to = postglist.get(i).getEmail();
                String from = "dilshanishara73@gmail.com";
                String subject = "This is a only example";
                String messageText = "This is a test email";
                boolean sessionDebug = false;

                Properties props = System.getProperties();

                props.put("mail.smtp.starttls.enable","true");
                props.put("mail.smtp.host", host);
                props.put("mail.smtp.port", "587");
                props.put("mail.smtp.auth", "true");
                props.put("mail.smtp.starttls.required", "true");

                java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
                Session mailSession = Session.getDefaultInstance(props,null);
                mailSession.setDebug(sessionDebug);
                Message msg = new MimeMessage(mailSession);
                msg.setFrom(new InternetAddress(from));
                InternetAddress[] address = {new InternetAddress(to)};
                msg.setRecipients(Message.RecipientType.TO, address);
                msg.setSubject(subject);
                msg.setSentDate(new Date());
                msg.setText(messageText);

                Transport transport = mailSession.getTransport("smtp");
                transport.connect(host,user,pass);
                transport.sendMessage(msg,msg.getAllRecipients());
                transport.close();
                System.out.println("Message Sent Succesfully");


            } catch (AddressException ex) {
                Logger.getLogger(EmailUndergraduate.class.getName()).log(Level.SEVERE, null, ex);
            } catch (MessagingException ex) {
                Logger.getLogger(EmailUndergraduate.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
