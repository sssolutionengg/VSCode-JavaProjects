import java.lang.reflect.Modifier;

import ReflectionInJava.Dog;

public class JavaOOPApp {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        JavaOOPApp app = new JavaOOPApp();
        EnumTest test = new EnumTest(Size.MEDIUM);
        test.orderPizza();

        app.runReflectionExample();
    }

    public void runReflectionExample() {
        try {
      // create an object of Dog˜
      Dog d1 = new Dog();

      // create an object of Class
      // using getClass()
      Class obj = d1.getClass();

      // get name of the class
      String name = obj.getName();
      System.out.println("Name: " + name);

      // get the access modifier of the class
      int modifier = obj.getModifiers();

      // convert the access modifier to string
      String mod = Modifier.toString(modifier);
      System.out.println("Modifier: " + mod);

      // get the superclass of Dog
      Class superClass = obj.getSuperclass();
      System.out.println("Superclass: " + superClass.getName());
    }

    catch (Exception e) {
      e.printStackTrace();
    }
    }
}
