package problem4;

public class BlogEntry {
	String username;
	String postText;
	int month;
	int day;
	int year;
	public void setName(String inputName) {
		username=inputName;
	}
	public void setText(String inputText) {
		postText=inputText;
	}
	public void setDate(int inputMonth, int inputDay, int inputYear) {
		month=inputMonth;
		day=inputDay;
		year=inputYear;
	}
	public void clearName() {
		setName(null);
	}
	public void clearText() {
		setText(null);
	}
	public void clearDate() {
		setDate(0,0,0);
	}
	BlogEntry(){
		
	}
	BlogEntry(String inputName){
		setName(inputName);
	}
	BlogEntry(String inputName, String inputText){
		setName(inputName);
		setText(inputText);
	}
	BlogEntry(String inputName, String inputText, int inputMonth, int inputDay, int inputYear){
		setName(inputName);
		setText(inputText);
		setDate(inputMonth, inputDay, inputYear);
	}
	public void post() {
		if(month!=0&&day!=0&&year!=0)System.out.print("("+month+"/"+day+"/"+year+") ");
		if(username!=null)System.out.print(username+": ");else System.out.print("Anonymous: ");
		if(postText!=null)System.out.println(postText);else System.out.println();
	}
}
