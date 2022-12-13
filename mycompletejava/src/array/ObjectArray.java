package array;

public class ObjectArray {
	public static void main(String[] args) {
		Student stArr[]=new Student[4];
		Student[] stuArr = null;
		stuArr[0] = new Student(123, "Raj", 12, 67);
		stuArr[1] = new Student(456, "Sam", 18, 56);
		stuArr[2] = new Student(342, "Thaniga", 17, 98);
		stuArr[3] = new Student(908, "Mohan", 15, 87);

		Student highestMark = stuArr[0];
		for(Student stu : stuArr) {
			System.out.println(stu.id+" "+stu.name+" "+stu.age+" "+stu.mark);
		    if(stu.mark> highestMark.mark) {
		    	highestMark = stu;
		    }
		}
		System.out.println("---------");
		System.out.println("Top student : - "+highestMark.name);
	}
}

class Student {
	int id;
	String name;
	int age;
	int mark;

	public Student(int id, String name, int age, int mark) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.mark = mark;
	}


		
	}


