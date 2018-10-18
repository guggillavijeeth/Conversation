package conversation;

public class Bore implements Responder {
	private String str2;
	
	public Bore(String str_con) {
		str2 = str_con;
	}
	
	public String respond(String str) {
		return str2;
	}

}
