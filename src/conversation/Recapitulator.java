package conversation;

public class Recapitulator implements Responder {

	public Recapitulator() {
		calls = 0;
	}

	private int calls = 0;
	private StringBuilder full = new StringBuilder();

	public String respond (String str) {
		if(calls==0) {
			calls++;
			full.append(str);
			return null;
		}
		else {
			full.append(str);
		}
		calls++;
		return full.toString();
	}
}
