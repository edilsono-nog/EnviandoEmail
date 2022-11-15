package com.enviandoemail;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.enviandoemail.controller.ObjetoEnviaEmail;

@SpringBootTest
class EnviandoEmailApplicationTests {


	@Test
	public void testeEmail() throws Exception {
		
		StringBuilder stringBuilderTextoEmail = new StringBuilder();
		
		stringBuilderTextoEmail.append("Olá, <br/><br/>");
		stringBuilderTextoEmail.append("Você está recebendo o acesso ao curso de Java <br/><br/>");
		stringBuilderTextoEmail.append("Para ter acesso clique no botão abaixo. <br/><br/>");
		
		stringBuilderTextoEmail.append("<b>Login: </b> alex@lkjljkmnb.com<br/>");
		stringBuilderTextoEmail.append("<b>Senha: </b> lkjklklkljj<br/><br/>");
		
		stringBuilderTextoEmail.append("<a target=\"_blank\" href=\"http://projetojavaweb.com/certificado-aluno/login\" "
				+ "style=\"color: #2525a7; padding: 14px 25px; text-align: center; text-decoration: none;"
				+ "display: inline-block; border-radius: 30px; font-size: 20px; font-family:courier; "
				+ "border: 3px solid green; background-color: #99DA39;\">Acessar Portal</a><br/><br/>");
		
		stringBuilderTextoEmail.append("<span style=\"font-size: 8px;\">Ass.: Alex do JDev</span>");
		
		
		ObjetoEnviaEmail enviaEmail = new ObjetoEnviaEmail("edilson.n@hotmail.com", 
														   "Edilson O Nogueira", 
														   "Testando e-mail com Java", 
														   stringBuilderTextoEmail.toString());
		
		enviaEmail.enviarEmail(true);
		
	}

}
