public class Main{
	public static void main(String[] args){
		// Initialize singleton class
		Animal animal = Animal.getInstance();

		System.out.println(animal.roar());
		// set animal name in object "animal"
		animal.setName("Cow");

		// both object "animal" and "animal2" have the same object
		// therefore, eventhough we set the animal name in object "animal", the object "animal2" has the same name
		Animal animal2 = Animal.getInstance();
		System.out.println("Animal Name : " + animal2.getName());
	}
}