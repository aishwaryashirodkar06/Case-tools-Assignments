package nontestcases;
public class student {
private String name;
private int age;
private String address;

public student() {
this.name = "unknown";
this.age = 0;
this.address = "not available";
}
// First setInfo method
public void setInfo(String name, int age) {
this.name = name;
this.age = age;
}
// Second setInfo method
public void setInfo(String name, int age, String address) {
	System.out.println("Aishwarya Shirodkar RBCA22113");
this.name = name;
this.age = age;
this.address = address;
}
@Override
public String toString() {
return "Name: " + name + " Age: " + age + ", Address: " + address;



}
public static void main(String[] args) {
// Using array of objects
student[] students = new student[3];
// Create instances and set their values
students[0] = new student();
students[0].setInfo("Anu",23);

students[1] = new student();
students[1].setInfo("Diya",21, "Raia");
students[2] = new student();
students[2].setInfo("Raj",26,"Pernem");
// Print the name, age, and address of the 3 students
for (int i = 0; i < 3; i++) {
System.out.println(students[i]);

}
}
{
}
}