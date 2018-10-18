package conversation;

public class ResponderTester {

	public static void main(String[] args) {
		Echo e = new Echo();
		System.out.println(e.respond("Hello"));
		Bore b = new Bore("Hello");
		System.out.println(b.respond("Morning"));
		Disemvoweler d = new Disemvoweler();
		System.out.println(d.respond("Hello"));
		System.out.println(d.respond("Morning"));
		Recapitulator r = new Recapitulator();
		System.out.println(r.respond("Hello"));
		System.out.println(r.respond(" World"));
		System.out.println(r.respond(" !"));
	}
}
