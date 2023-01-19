package chapter17.stack_queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest2 {

	
	public static void main(String[] args) {
	
		Queue<Message> messageQueue = new LinkedList<>();
		
		messageQueue.offer(new Message("sendMail", "홍길동"));// 입력을해서 넣는것
		messageQueue.offer(new Message("sendSNS", "김유신"));// 입력을해서 넣는것
		messageQueue.offer(new Message("sendKakaotalk", "이순신"));// 입력을해서 넣는것
	
		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			switch (message.command) {
			case "sendMail":
				System.out.println(message.to+" 님에게 메일을 보냅니다.");
				break;
			case "sendSNS":
				System.out.println(message.to+" 님에게 SNS을 보냅니다.");
				break;
			case "sendKakaotalk":
				System.out.println(message.to+" 님에게 Kakaotalk을 보냅니다.");
				break;
			default:
				break;
			}
		}
	}
}
