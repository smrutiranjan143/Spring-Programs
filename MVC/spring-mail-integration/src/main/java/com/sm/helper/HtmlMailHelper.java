package com.sm.helper;

import java.io.File;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Component;

import com.sm.mail.beans.MailMessage;

@Component("htmlMailHelper")
public class HtmlMailHelper {
	@Autowired
	private JavaMailSenderImpl javaMailSender;

	public void sendMail(MailMessage mailMessage) {
		javaMailSender.send(new AttachmentsMimeMessagePreparator(mailMessage));
	}

	private final class AttachmentsMimeMessagePreparator implements MimeMessagePreparator {
		@Autowired
		private MailMessage mailMessage;

		public AttachmentsMimeMessagePreparator(MailMessage mailMessage) {
			this.mailMessage = mailMessage;
		}

		public void prepare(MimeMessage mimeMessage) throws Exception {
			MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
			helper.setTo(mailMessage.getTo());
			helper.setFrom(mailMessage.getFrom());
			helper.setSubject(mailMessage.getSubject());
			helper.setText(mailMessage.getBody(), true);

			File f = new File(mailMessage.getAttachmentFileNames()[0]);

			helper.addInline("c1", f);
		}

	}
}
