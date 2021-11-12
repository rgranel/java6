package java6;

////principal
public class Principal {

	public static void main(String[] args) {

		// Invocar a una clase inner
		Boton b = new Boton();
		b.nombre = "boton";
		Boton.Color2 c = b.new Color2();
		c.setColor("red");
		System.out.println(c.getColor());

		// Invocar a una clase inner que es estática
		Boton.pBoton pboton = new Boton.pBoton();

		System.out.println(Boton.pBoton.getLabel());
		System.out.println("Clase Local");
		Boton bnuevo = b.ModificarColor("negro");
		System.out.println(bnuevo.color2);

		// clase anónima
		OperacionFigura fi = new OperacionFigura() {

			@Override
			public void area(int l) {
				System.out.println("soy una area" + l);

			}

			@Override
			public void lado(int l) {
				System.out.println("soy una lado" + l);

			}

		};

		System.out.println("soy una clase anónima");
		fi.area(3);

		IOperacion io = new IOperacion() {

			@Override
			public void area(int l) {
				System.out.println("soy el área de la interface");

			}

		};
		io.lado(3);
		io.area(5);

		ICalculadora suma = new ICalculadora() {

			@Override
			public void calcular(Object i, Object j) {
				int valor1 = ((Integer) i).intValue();
				int valor2 = ((Integer) j).intValue();
				int total = valor1 + valor2;
				System.out.println("suma: " + total);
			}

		};
		// fin
		suma.calcular(new Integer(5), new Integer(3));
	}

}