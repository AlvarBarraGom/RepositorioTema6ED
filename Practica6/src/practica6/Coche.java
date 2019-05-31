package practica6;

public class Coche {
	public static final String EL_COCHE_CON_MATRICULA = "El coche con matricula ";
	String matricula;
	String combustible;
	String modelo;
	String fabricante;
	public String resultado;

	public Coche() {
		matricula = "";
		combustible = "";
		modelo = "";
		fabricante = "";
	}

	public String getMatricula()
	{
		return matricula;
	}

	public String getCombustible()
	{
		return combustible;
	}

	public String getModelo()
	{
		return modelo;
	}

	public String getFabricante()
	{
		return fabricante;
	}

	public void setMatricula(String matricula)
	{
		this.matricula = matricula;
	}

	public void setCombustible(String combustible)
	{
		this.combustible = combustible;
	}

	public void setModelo(String modelo)
	{
		this.modelo = modelo;
	}

	public void setFabricante(String fabricante)
	{
		this.fabricante = fabricante;
	}

	public Coche(String m, String c, String mo, String f) {
		matricula = m;
		combustible = c;
		modelo = mo;
		fabricante = f;
	}

	public String cocheTipo() {
		resultado = "";
		if (combustible == "Gasolina") {
			resultado += EL_COCHE_CON_MATRICULA + matricula + " "+ metodoA(modelo, fabricante);
		} else if (combustible == "Diesel") {
			resultado += EL_COCHE_CON_MATRICULA + matricula + " "+ metodoB(modelo, fabricante);
		} else if (combustible == "Híbrido") {
			resultado += EL_COCHE_CON_MATRICULA + matricula + " "+ metodoC(modelo, fabricante);
		} else {
			resultado += EL_COCHE_CON_MATRICULA + matricula + " "+ "no dispone de información";
		}
		return resultado;
	}

	private String metodoC(String modelo2, String fabricante2)
	{
		// TODO Auto-generated method stub
		return null;
	}

	private String metodoB(String modelo2, String fabricante2)
	{
		// TODO Auto-generated method stub
		return null;
	}

	private String metodoA(String modelo2, String fabricante2)
	{
		// TODO Auto-generated method stub
		return null;
	}
}
