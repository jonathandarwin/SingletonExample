public class Animal{
  private static Animal instance;

  public static synchronized getInstance(){
      if (instance == null){
          instance = new Animal();
      }
      return instance;
  }
}