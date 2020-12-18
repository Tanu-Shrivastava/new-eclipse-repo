package mini_project;

public class complaint_model {
	
	private String date_received;
	private String product;
	private String sub_product;
	private String issue;
	private String sub_issue;
	private String company;
	private String state;
	private String zip_code;
	private String submitted_via;
	private String date_sent_to_company;
	private String company_response_to_consumer;
	private String timely_response;
	private String consumer_disputed;
	private String company_id;
	public String getDate_received() {
		return date_received;
	}
	public void setDate_received(String date_received) {
		this.date_received = date_received;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getSub_product() {
		return sub_product;
	}
	public void setSub_product(String sub_product) {
		this.sub_product = sub_product;
	}
	public String getIssue() {
		return issue;
	}
	public void setIssue(String issue) {
		this.issue = issue;
	}
	public String getSub_issue() {
		return sub_issue;
	}
	public void setSub_issue(String sub_issue) {
		this.sub_issue = sub_issue;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip_code() {
		return zip_code;
	}
	public void setZip_code(String zip_code) {
		this.zip_code = zip_code;
	}
	public String getSubmitted_via() {
		return submitted_via;
	}
	public void setSubmitted_via(String submitted_via) {
		this.submitted_via = submitted_via;
	}
	public String getDate_sent_to_company() {
		return date_sent_to_company;
	}
	public void setDate_sent_to_company(String date_sent_to_company) {
		this.date_sent_to_company = date_sent_to_company;
	}
	public String getCompany_response_to_consumer() {
		return company_response_to_consumer;
	}
	public void setCompany_response_to_consumer(String company_response_to_consumer) {
		this.company_response_to_consumer = company_response_to_consumer;
	}
	public String getTimely_response() {
		return timely_response;
	}
	public void setTimely_response(String timely_response) {
		this.timely_response = timely_response;
	}
	public String getConsumer_disputed() {
		return consumer_disputed;
	}
	public void setConsumer_disputed(String consumer_disputed) {
		this.consumer_disputed = consumer_disputed;
	}
	public String getCompany_id() {
		return company_id;
	}
	public void setCompany_id(String company_id) {
		this.company_id = company_id;
	}
	public complaint_model(String date_received, String product, String sub_product, String issue, String sub_issue,
			String company, String state, String zip_code, String submitted_via, String date_sent_to_company,
			String company_response_to_consumer, String timely_response, String consumer_disputed, String company_id) {
		super();
		this.date_received = date_received;
		this.product = product;
		this.sub_product = sub_product;
		this.issue = issue;
		this.sub_issue = sub_issue;
		this.company = company;
		this.state = state;
		this.zip_code = zip_code;
		this.submitted_via = submitted_via;
		this.date_sent_to_company = date_sent_to_company;
		this.company_response_to_consumer = company_response_to_consumer;
		this.timely_response = timely_response;
		this.consumer_disputed = consumer_disputed;
		this.company_id = company_id;
	}
	public complaint_model() {
		
	}
	
	void fetchcomplaints()
	{
		System.out.println("date recieved" + date_received);
		System.out.println("product" + product);
		System.out.println("sub product" + sub_product);
		System.out.println("issue" + issue);
		System.out.println("sub issue" +sub_issue);
		System.out.println("comapny" + company);
		System.out.println("state" + state);
		System.out.println("zip" + zip_code);
		System.out.println("sub via" + submitted_via);
		System.out.println("date sent to company" + date_sent_to_company);
		System.out.println("response" + company_response_to_consumer);
		System.out.println("timely response" + timely_response);
		System.out.println("disuted ?" + consumer_disputed);
		System.out.println("company id" + company_id);
		
	}
	
	
}
