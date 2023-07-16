package br.com.home.mensageria;

import java.io.IOException;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

@Component
public class MonitoramentoSchedule {

	/**
	 * Verifica a cada minuto
	 * 
	 * @throws IOException
	 * @throws JsonMappingException
	 * @throws JsonParseException
	 */
	@Scheduled(cron = "* * * * * *")
	public void executaMensageria() throws JsonParseException, JsonMappingException, IOException {

		HelloWorldConsumer c = new HelloWorldConsumer();
		c.run();

	}

}
