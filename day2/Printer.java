package day2;

public class Printer {

	private String content;
	
	public Printer()
	{
		content="Good Night";
	}
    public Printer(String content)
    {
    	this.content=content;
    }
	
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	 public void print()
	 {
		 System.out.println(content);
	 }
	 public void print(String decoration)
	 {
		 System.out.println(decoration+content+decoration);
	 }
	
}
