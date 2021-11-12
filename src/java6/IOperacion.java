package java6;

public interface IOperacion {

    public  void area(int l);
    public default void lado(int l) {
        System.out.println("el lado defecto es");
    }
	
}
