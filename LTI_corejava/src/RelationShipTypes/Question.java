package RelationShipTypes;

public class Question {

	private int qno;
	private String ques;
	Answer ans;
	public int getQno() {
		return qno;
	}
	public void setQno(int qno) {
		this.qno = qno;
	}
	public String getQues() {
		return ques;
	}
	public void setQues(String ques) {
		this.ques = ques;
	}
	public Answer getAns() {
		return ans;
	}
	public void setAns(Answer ans) {
		this.ans = ans;
	}
	public Question(int qno, String ques, Answer ans) {
		super(); 
		this.qno = qno;
		this.ques = ques;
		this.ans = ans;
	}
	
	void display(){
		
		System.out.println("Question number : " +qno);
		
		System.out.println("Question : " +ques);
		System.out.println("Answer number : " +ans.getAnsno());
		System.out.println("Answer : " +ans.getAnswer());
		
	}
}
