package com.jms.demo1;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

public class MyListener implements MessageListener {
  public void onMessage(Message message) {
    try {
      TextMessage msg = (TextMessage) message;
      System.out.println("following message is received:" + msg.getText());
    } catch (JMSException e) {
      System.out.println(e);
    }
  }
}
