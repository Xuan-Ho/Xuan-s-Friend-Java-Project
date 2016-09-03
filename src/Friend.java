
public class Friend {
	
	//Xuan's friends informations
	private String name;
	private int age;
	private String sex;
	private String ethnicity;
	private String major;
	private boolean onGoodterm;
	private boolean inRelationship;
	protected static int numberOfFriends;
	/**
	 * @param name
	 * @param age
	 * @param sex
	 * @param ethnicity
	 * @param major
	 * @param onGoodterm
	 * @param inRelationship
	 */
	public Friend(String name) {
		this.name = name;
		numberOfFriends++;
		System.out.println("Creating...Object"+numberOfFriends+" ");
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}
	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
	/**
	 * @return the ethnicity
	 */
	public String getEthnicity() {
		return ethnicity;
	}
	/**
	 * @param ethnicity the ethnicity to set
	 */
	public void setEthnicity(String ethnicity) {
		this.ethnicity = ethnicity;
	}
	/**
	 * @return the major
	 */
	public String getMajor() {
		return major;
	}
	/**
	 * @param major the major to set
	 */
	public void setMajor(String major) {
		this.major = major;
	}
	/**
	 * @return the onGoodterm
	 */
	public boolean isOnGoodterm() {
		return onGoodterm;
	}
	/**
	 * @param onGoodterm the onGoodterm to set
	 */
	public void setOnGoodterm(boolean onGoodterm) {
		this.onGoodterm = onGoodterm;
	}
	/**
	 * @return the inRelationship
	 */
	public boolean isInRelationship() {
		return inRelationship;
	}
	/**
	 * @param inRelationship the inRelationship to set
	 */
	public void setInRelationship(boolean inRelationship) {
		this.inRelationship = inRelationship;
	}
	
	public void message()
	{
		System.out.println("COCK SUCKER!");
	}
	


	
	
	
	
	

}
