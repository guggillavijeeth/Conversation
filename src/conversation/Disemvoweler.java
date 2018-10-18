package conversation;

public class Disemvoweler implements Responder {

	public Disemvoweler() {
		
	}

	public String respond(String str) {
		StringBuilder str2 = new StringBuilder();
		for(int i = 0; i < str.length(); i++)
		{
			char c = str.charAt(i);
			if((c == 'a') || (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u')) {
				continue;
			}
			else {
				str2.append(c);
			}
		}
		String str3 = str2.toString();
		return (String) str3;
	}
}
