package pl.pawelprzystarz.PortfolioPawelPrzystarz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@Service
@EnableAutoConfiguration
public class ContactService {

    @Autowired
    private JavaMailSender javaMailSender;


    public void sendEmail(String message, String reply){
        MimeMessage mail = javaMailSender.createMimeMessage();
        try {
            MimeMessageHelper helper = new MimeMessageHelper(mail, true);
            helper.setTo("gienasd@gmail.com");
            helper.setFrom("portfolio.testmaill@gmail.com");
            helper.setSubject("PortfolioContact");
            helper.setText(message, true);
            helper.setReplyTo(reply);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
        javaMailSender.send(mail);
    }
}
