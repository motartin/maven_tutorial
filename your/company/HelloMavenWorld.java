public class HelloMavenWorld {

	public static void main(String[] args) {
		Greeting yourGreetingMessage = new Greeting("Fill in your greeting message");
		System.out.println("From the generated getMessage(): " + yourGreetingMessage.getMessgage());
		System.out.println("From the generated toString(): " + yourGreetingMessage.toString());
	}
}
