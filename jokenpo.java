import java.util.Scanner;

public class Jokenpo {
	
	private static int Placarplayer = 0;
	private static int Placarcomputer = 0;
	private static int choseplayer;
	private static int chosecomputer;
	
	public static void main(String[] args) {
		
		int rounds = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("OLÁ JOGADOR! PRONTO PARA SE DIVERTIR? DIGAME A QUANTIDADE DE RODADAS:   ");
		rounds = input.nextInt();
		
		for(int i = 1; i <= rounds; i++) {
			
			//escolha
			chosecomputer = (int) ( Math.random()*3 ) + 1;
			escolha();
			choseplayer = input.nextInt();
			
			verifica();
			Placar();
			
		}
		Resultado();
	}
	public static void Resultado() {
		if( Placarplayer > Placarcomputer) {
			System.out.println("PLAYER WIN!");
			System.out.println("SCORE: " + Placarplayer);
		}else if( Placarplayer < Placarcomputer) {
			System.out.println("COMPUTER WIN!");
			System.out.println("SCORE: " + Placarcomputer);
		}else if( Placarplayer == Placarcomputer ){
			System.out.println("EMPATE!");
			System.out.println("SCORE PLAYER: " + Placarplayer );
			System.out.println("SCORE COMPUTER: " + Placarcomputer);
		}
	}
	public static void escolha() {
		System.out.println("[                ESCOLHAS:                      ]");
		System.out.println("[                1 - PAPEL                      ]");
		System.out.println("[                2 - PEDRA                      ]");
		System.out.println("[                3 - TESOURA                    ]");
		System.out.println("[ AGORA DENTRE ESSES NUMEROS ESCOLHA APENAS UM: ]");
		
	}
	public static void verifica(){
		if( chosecomputer == choseplayer) {
				System.out.print("\n");
				System.out.println("- EMPATE -");
			}else if( chosecomputer == 1 && choseplayer == 2){
				System.out.print("\n");
				System.out.println("- PLAYER WIN -");
				Placarplayer++;
			}else if( chosecomputer == 1 && choseplayer == 3 ){
				System.out.print("\n");
				System.out.println("- COMPUTER WIN -");
				Placarcomputer++;
			}else if( chosecomputer == 2 && choseplayer == 1 ){
				System.out.print("\n");
				System.out.println("- COMPUTER WIN -");
				Placarcomputer++;
			}else if( chosecomputer == 2 && choseplayer == 3 ){
				System.out.print("\n");
				System.out.println("- PLAYER WIN -");
				Placarplayer++;
			}else if (chosecomputer == 3 && choseplayer == 1){
				System.out.print("\n");
				System.out.println("- PLAYER WIN -");
				Placarplayer++;
			}else if (chosecomputer == 3 && choseplayer == 2) {
				System.out.print("\n");
				System.out.println("- COMPUTER WIN -");
				Placarcomputer++;
			}
	}
	public static void Placar() {
		System.out.print("\n");
		System.out.println("[                      PLACAR                    ]");
		System.out.println("[        MAQUINA: " + Placarcomputer + "	                         ]");
		System.out.println("[        PLAYER:  " + Placarplayer   + "                              ]");
		System.out.println("ESPERO QUE TENHA SE DIVERTIDO, ATÉ A PROXIMA JOGADOR");
		
	}
}
