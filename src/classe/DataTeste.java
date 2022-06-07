package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data d1 = new Data(6, 8, 2002);
		
		Data d2 = new Data();
		d2.dia= 27;
		d2.mes = 1;
		d2.ano = 1966;
		
		Data d3 = new Data();
		
		String dataFormatada1 = d1.obterDataFormatada();
		
		System.out.printf(dataFormatada1);
		System.out.printf(d2.obterDataFormatada());
		System.out.printf(d3.obterDataFormatada());
		
	}
}
