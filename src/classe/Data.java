package classe;

public class Data {

	int dia, mes, ano;
	
	Data() {
		dia = 1;
		mes = 1;
		ano = 1970;
	}
	
	Data(int oDia, int oMes, int oAno) {
		dia = oDia;
		mes = oMes;
		ano = oAno;
	}
	
		String obterDataFormatada() {
		return String.format("%d/%d/%d\n", dia, mes, ano);
	}
}
