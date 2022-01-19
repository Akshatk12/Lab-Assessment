package Q2;
public class Owner {
	private String name;
	private Date date_of_birth;
	private String nic;
	public Owner(String name, Date date_of_birth, String nic) {
		this.name = name;
		this.date_of_birth = date_of_birth;
		this.nic = nic;
	}
	public Owner() {}
	public Owner(Owner owner) {
		this.name = owner.name;
		this.date_of_birth = owner.date_of_birth;
		this.nic = owner.nic;
	}
	public void print() {
		System.out.println("\nOwner details are:");
		System.out.println("Name: " + this.name);
		System.out.println("Date: " + this.date_of_birth);
		System.out.println("Nic: " + this.nic);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Owner [name=").append(name).append(", dateOfBirth=").append(date_of_birth).append(", nic=")
		.append(nic).append("]");
		return sb.toString();
	}	
}
