public class Rombo implements Poligonos{
	private String name;
	private double lado;
	private double dMayor;
	private double dMenor;
	public Rombo(String name, double lado, double dMayor, double dMenor) {
		super();
		this.name = name;
		this.lado = lado;
		this.dMayor = dMayor;
		this.dMenor = dMenor;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	public double getdMayor() {
		return dMayor;
	}
	public void setdMayor(double dMayor) {
		this.dMayor = dMayor;
	}
	public double getdMenor() {
		return dMenor;
	}
	public void setdMenor(double dMenor) {
		this.dMenor = dMenor;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 4*lado;
	}
	@Override
	public double getPerimetro() {
		// TODO Auto-generated method stub
		return dMayor*dMenor/2;
	}
	
}