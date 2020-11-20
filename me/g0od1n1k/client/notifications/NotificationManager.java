package me.g0od1n1k.client.notifications;

import java.util.ArrayList;

public class NotificationManager {

	private ArrayList<Notification> notifications;
	
	public NotificationManager() {
		super();
		this.notifications = new ArrayList<Notification>();
	}
	
	public void addNotification(final NotificationType type, final String message, final int stayTime) {
		this.notifications.add(new Notification(type, message, stayTime));
	}

	public ArrayList<Notification> getNotifications() {
		return this.notifications;
	}
}
