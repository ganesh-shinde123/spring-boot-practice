/**
 * 
 */
package com.bitwise.demo.spring.boot.bo;

import com.bitwise.demo.spring.boot.vo.Message;

/**
 * @author ganeshs
 *
 */
public interface MessageRepository {
	Iterable<Message> findAll();

	Message save(Message message);

	Message findMessage(Long id);

	void deleteMessage(Long id);
}
