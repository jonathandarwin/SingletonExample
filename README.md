# Singleton
Singleton is the simplest design pattern.
The concept is you only use 1 instance of class in different object. It means that you are not going to create a new object of the class
continuously in different context. So this code below will be not used :
    
    Animal animal = new Animal();
    
Instead, we use this :

  Animal animal = Animal.getInstance();
  
static method getInstance() declared in the Animal Class :

    public class Animal{
        private static Animal instance;
      
        public static getInstance(){
            if (instance == null){
                instance = new Animal();
            }
            return instance;
        }
    }

getInstance() method will check whether the private object "instance" is null or not. If the instance" is null, then we create a new object
and save it to "instance", otherwise we just return the instance.
We only create a new object once for all use. It will reduce your memory allocation because we only use one source of the instance.
<br>
"Singleton can act as global variable". Yes, the purpose of using singleton in our project is to make the certain class act as the global variable.
For example, when we want to use Calendar class that have a static behavior. Rather than we create a new Calendar object continuously in different
use, its better to only create one object and use it when we need it.
