package nontestcases;
import java.util.Scanner;
class Teachers {
protected String type;
public void Teaches() {
System.out.println("The teacher is teaching.");
}
}
class TeacherTeaches extends Teachers {
String name;
public void
Subjects(String subject) {
System.out.println("The teacher " + name + " is teaching " + subject + ".");
}

public void setName(String name)
{
this.name = name;
}
public String getName()
{
return name;
}
}
public class Teacher {
public static void main(String[] args)
{
	System.out.println("Aishwarya Shirodkar RBCA22113");
Scanner scan=new Scanner(System.in);

TeacherTeaches teacher = new TeacherTeaches();
System.out.print("Enter the teacher's name: ");
String name = scan.nextLine();
teacher.setName(name);
System.out.print("Enter the subject the teacher is teaching: ");
String subject = scan.nextLine();
teacher.Subjects(subject);
scan.close();
}
}