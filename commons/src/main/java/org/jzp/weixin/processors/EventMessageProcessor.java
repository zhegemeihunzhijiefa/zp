package org.jzp.weixin.processors;


import org.jzp.weixin.domain.event.EventInMessage;

public interface EventMessageProcessor {

	public void onMessage(EventInMessage msg);
}
