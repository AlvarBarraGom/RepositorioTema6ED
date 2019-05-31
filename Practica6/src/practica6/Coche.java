package practica6;

public class Coche {
	public static final String EL_COCHE_CON_MATRICULA = "El coche con matricula ";
	String matricula;
	String combustible;
	String modelo;
	String fabricante;

	public Coche() {
		matricula = "";
		combustible = "";
		modelo = "";
		fabricante = "";
	}

	public Coche(String m, String c, String mo, String f) {
		matricula = m;
		combustible = c;
		modelo = mo;
		fabricante = f;
	}

	public String metodo1() {
		String resultado = "";
		if (combustible == "Gasolina") {
			resultado += EL_COCHE_CON_MATRICULA + matricula + " ";
			resultado += metodoA(modelo, fabricante);
		} else if (combustible == "Diesel") {
			resultado += EL_COCHE_CON_MATRICULA + matricula + " ";
			resultado += metodoB(modelo, fabricante);
		} else if (combustible == "H�brido") {
			resultado += EL_COCHE_CON_MATRICULA + matricula + " ";
			resultado += metodoC(modelo, fabricante);
		} else {
			resultado += EL_COCHE_CON_MATRICULA + matricula + " ";
			resultado += "no dispone de informaci�n";
		}
		return resultado;
	}
}
