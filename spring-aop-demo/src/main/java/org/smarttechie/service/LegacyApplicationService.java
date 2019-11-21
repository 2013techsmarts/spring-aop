package org.smarttechie.service;

import org.springframework.stereotype.Service;

@Service
public class LegacyApplicationService {

	public void pushNotification(){
		System.out.println("pushNotification() is running ");
	}

	public String pushNotificationReturnValue(){
		System.out.println("pushNotificationReturnValue() is running ");
		return "abc";
	}

	public void pushNotificationThrowException() throws Exception {
		System.out.println("pushNotificationThrowException() is running ");
		throw new Exception("Generic Error");
	}

	public void pushNotificationAround(String name){
		System.out.println("pushNotificationAround() is running, args : " + name);
	}

}
