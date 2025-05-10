package pack1;

// { } indicate the boundary of the class(body of the class)
// complete code we will write in the body of the class
public class Student 
{
	int age,rollNo;  // declared a variable here dataType variableName;
	public void study() // methodname---study () indicate this is a method
	{
		System.out.println("Welcome to all of you");
	}
	public void play()
	{
		System.out.println("I want to play cricket...");
	}
	public static void main(String[] args)  // method given by java
	{
		Student amit=new Student(); // className referencV=new className();
		amit.study(); // calling the study method
		amit.play();  // calling the play method
		amit.age=30;
		amit.rollNo=122;
		System.out.println("age is : "+amit.age);
		System.out.println("rollNo is : "+amit.rollNo);
		
		Student Stephan=new Student(); // className referencV=new className();
		Stephan.study(); // calling the study method
		Stephan.play();  // calling the play method
		Stephan.age=31;
		Stephan.rollNo=16;
		System.out.println("age is : "+Stephan.age);
		System.out.println("rollNo is : "+Stephan.rollNo);
		
		
	}

}
