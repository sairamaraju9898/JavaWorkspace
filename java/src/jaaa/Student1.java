package jaaa;
 abstract class Person1 {

public  void display(){
System.out.println("Display method in Person");
}
public static void main(String[] args) { 
Person1 person =new Student1(); 
person.display(); 
}
 }
 
 
public class Student1 extends Person1{
public void display() {  
System.out.println("Display method in Student");
}

}
 

