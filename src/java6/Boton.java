package java6;

public class Boton {
	String nombre;
	String color2;

	//clase inner, clase interna
	public class Color2 {
		String color = "Color2";

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}
	}

	//clases internas estáticas
	//solo se puede acceder a atributos estátics
	public static class pBoton {
		static String label = "enviar";

		public static String getLabel() {
			return label;
		}
	}

	//clase Local
	public Boton ModificarColor(String color) {
		Boton b = new Boton();

		// clase local
		class BotonColor {

			BotonColor() {
				b.color2 = color;
			}

			public Boton devolverBoton() {
				return b;
			}
		}
		BotonColor b1 = new BotonColor();
		return b1.devolverBoton();
	}

}