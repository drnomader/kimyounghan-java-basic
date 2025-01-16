package poly.ex.sender;

public class SenderMain {
	public static void main(String[] args) {
		Sender[] senders = {new EmailSender(), new SmsSender(), new FacebookSender()};
		for (Sender sender : senders) {
			sender.sendMessage("환영합니다!");
		}
	}
}
