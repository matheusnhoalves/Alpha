
public class Controle {

	public static void main(String[] args) {
		 char sexo;
		 String nome="";
		int questoes=1;
		Interacao IU = new Interacao();
		Personagem P = new Personagem();
		switch(questoes){
		case 1:
		
		IU.exibirMSG("Voc� acaba de acordar em um quarto de hotel e n�o se lembra de nada");
		IU.exibirMSG("Voc� se olha no espelho e descobre qual o sexo seu ? (H)omem ou (M)ulher");
		P.setSexo(sexo = (char) IU.ler.nextShort());
		questoes=2;
		case 2:
			sexo=P.getSexo();
			switch(sexo){
			case 'M':
				P = new personagemMasc(nome,sexo);
				questoes=3;
			case 'F':
				P = new personagemFem(nome,sexo);
				questoes=31;
			}
		case 3:
			IU.exibirMSG("Ao colocar a m�o no bolso voc� se depara com sua carteira de identidade, qual seu nome?");
			P.setNome(nome=IU.ler.nextLine());
			questoes=4;
		}
	}
	
}
