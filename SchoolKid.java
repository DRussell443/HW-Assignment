import javax.swing.JOptionPane;
public class SchoolKid{

public String children;

public SchoolKid (String name, int age, String teacher, String greeter){

n = name;
a = age;
t = teacher;
g = greeter;

}

public static void main(String[] args){

String name;
int age; 
String teacher;
String greeter;

name = JOptionPane.showInputDialog(" Enter childs name");
age = JOptionPane.showInputDialog(" Enter childs age");
teacher = JOptionPane.showInputDialog(" Enter childs teacher");
greeter = JOptionPane.showInputDialog("Enter childs greeter");

}

/**
@return childs name 
*/

public String getname(){
 
 return name;
 
 }
 
 /**
@return childs name 
*/

public int getage (){
 return age;
 
 }


/**
@return childs name 
*/

public String geteacher (){
 return teacher;
 
 }
 
 
 /**
@return childs name 
*/

public String getgreeter (){
 return greeter;
 
 }
 


}

