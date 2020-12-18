package RelationShipTypes;

public class TestQuesAns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Answer a = new Answer(1, "yes");
		Question q = new Question(1, "is it a book? ", a);
		 q.display();
	}

}
