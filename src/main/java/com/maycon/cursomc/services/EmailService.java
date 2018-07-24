package com.maycon.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.maycon.cursomc.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);

}
