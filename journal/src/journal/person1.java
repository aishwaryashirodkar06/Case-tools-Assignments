package journal;
class Person {
private String name;
private int age;
public Person(String name, int age) {
this.name = name;
this.age = age;
}
public String getName() {
return name;
}
public int getAge() {
return age;
}
}
public class person1 {
public static void main(String[] args) {
	System.out.println("Aishwarya Shirodkar RBCA22113");
Person person1 = new Person("Ram", 20);
Person person2 = new Person("Pavan", 12);
System.out.println(person1.getName() + " is " + person1.getAge() + " years old.");
System.out.println(person2.getName() + " is " + person2.getAge() + " years old.");
}
}