package ex4_IO;
import java.io.*; 

class Person implements Serializable { 
	private String id; 
	private String name;
	private String sex; 

	public Person (String id, String name, String sex) { 
		this.id = id;
		this.name = name;
		this.sex = sex; 
	}

	public String toString() {
		return "id: " + id + "\nname: " + name + "\nsex: " + sex + "\n";
	} 
} 
 

public class Text2 {
	public static void main(String[] args) throws Exception {
		String path = "C:\\Users\\admin\\eclipse-workspace\\java基础入门\\实验\\src\\ex4_IO\\t2.txt";
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
		Person p1 = new Person("13565464", "John", "male");
		Person p2 = new Person("12446746", "Rose", "female"); 
		oos.writeObject(p1);
		oos.writeObject(p2);
		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
		System.out.println(ois.readObject());
		System.out.println(ois.readObject());
		ois.close();
	}
} 