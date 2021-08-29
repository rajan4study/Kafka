/**
 * 
 */
package com.study.kafka.producer.model;

/**
 * @author rajan
 *
 */
public class Message {
	private String msg;

    public Message(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
