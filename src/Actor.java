
public class Actor {
	
String firstname;
String lastname;

	public Actor(String Taraji, String Henson) {
		// TODO Auto-generated constructor stub
		firstname = Taraji;
		lastname = Henson;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Actor actor =  new Actor ("Taraji", "Henson");
		System.out.println(actor.firstname);
		System.out.println(actor.lastname);
	}

}
