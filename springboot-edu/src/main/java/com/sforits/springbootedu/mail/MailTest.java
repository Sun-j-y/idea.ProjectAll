package com.sforits.springbootedu.mail;

import com.sun.xml.internal.messaging.saaj.packaging.mime.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

/**
 * @Author：sforits
 * @E-mail：sforits@gmail.com
 * @Date：2020/10/16-12:34 Created by IntelliJ IDEA.
 */
@Service
public class MailTest {

    @Autowired
    private JavaMailSender javaMailSender;

    public void sendMail() throws MessagingException {
        //简单邮件
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom("admin@163.com");
        simpleMailMessage.setTo("socks@qq.com");
        simpleMailMessage.setSubject("Happy New Year");
        simpleMailMessage.setText("新年快乐！");
        mailSender.send(simpleMailMessage);

        //复杂邮件
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage);
        messageHelper.setFrom("admin@163.com");
        messageHelper.setTo("socks@qq.com");
        messageHelper.setSubject("Happy New Year");
        messageHelper.setText("新年快乐！");
        messageHelper.addInline("doge.gif", new File("xx/xx/doge.gif"));
        messageHelper.addAttachment("work.docx", new File("xx/xx/work.docx"));
        mailSender.send(mimeMessage);
    }


}