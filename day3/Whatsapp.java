package day3;

public class Whatsapp {

	public void makeWhatsappCall() {
		System.out.println("whatsappCall");
	}
	protected void makeWhatsappVoiceCall() {
		System.out.println("whatsappVoiceCall");
	}
	private void whatsappPayment() {
		System.out.println("payment");
	}
	void sendText() {
		System.out.println("Text");
	}
		public static void main (String[]args) {
			Whatsapp app=new Whatsapp();
			app.makeWhatsappCall();
			app.makeWhatsappVoiceCall();
			app.whatsappPayment();
			app.sendText();
		}
			
			
					
					
		
	}

