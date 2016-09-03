
public class AlexQuang extends Friend {

	public AlexQuang(String name, int age, String sex) {
		super(name);
		super.setAge(age);
		super.setSex(sex);
		System.out.println("Object " + super.getName() + " has been created!");
	}
	
	public void message(){
		System.out.println("Object"+numberOfFriends+" is " + super.getName());
	}

	public void sayMyName() {
		System.out.println("I am " + super.getName());
	}

}
