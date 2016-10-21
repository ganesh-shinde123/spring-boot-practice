package com.bitwise.demo.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.core.convert.converter.Converter;

import com.bitwise.demo.spring.boot.bo.InMemoryMessageRepository;
import com.bitwise.demo.spring.boot.bo.MessageRepository;
import com.bitwise.demo.spring.boot.vo.Message;

/**
 * 
 */
/**
 * @author ganeshs
 *
 */
@SpringBootApplication
public class SpringBootSampleApplication extends SpringBootServletInitializer {
	
	@Bean
	public MessageRepository messageRepository() {
		return new InMemoryMessageRepository();
	}

	@Bean
	public Converter<String, Message> messageConverter() {
		return new Converter<String, Message>() {
			@Override
			public Message convert(String id) {
				return messageRepository().findMessage(Long.valueOf(id));
			}
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSampleApplication.class, args);
	}

}
