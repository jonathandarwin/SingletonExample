public class Animal{
	private static Animal instance;
	private String name;

	public static Animal getInstance(){
		// When the Animal class is null / empty, it will create a new object of the class and save it to instance,
		// otherwise return the instance
		if(instance == null){
			instance = new Animal();
		}
		return instance;
	}

	public String roar(){
		return "ROAR";
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}
}