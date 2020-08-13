class Employee{
   private int id;
   private String name;
   Employee(int id, String name){
      this.id=id;
      this.name=name;
   }
  public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	public static void main(String[]args){
		 Employee e = new Employee(101,"Aman");
		 System.out.println(e.getName());
		  
	}
}


	
