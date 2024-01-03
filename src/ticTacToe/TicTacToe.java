package ticTacToe;

import java.util.Scanner;

public class TicTacToe {
	static int x = 3;
	static int y = 3;

	// static String tik[3][3] = new String[x][y];
	static String tik[][] = { { "1", "2", "3" }, { "4", "5", "6" }, { "7", "8", "9" } };

	static String[][] getBoard() {
		int s = 1;

		for (int i = 0; i < tik.length; i++) {
			for (int j = 0; j < tik.length; j++) {

				System.out.print(tik[i][j] + " ");

			}

			System.out.println();
		}
		return tik;
	}

	// Store value
	static boolean input(int a, int index) {

		for (int i = 0; i < tik.length; i++) {
			for (int j = 0; j < tik.length; j++) {
				// System.out.println("for loop");

				if (tik[i][j].equals(Integer.toString(index))) {
					// System.out.println("for loop equal");

					if (a > 0) {
						// System.out.println("for X");

						tik[i][j] = "X";
						getBoard();

						return true;
					} else {
						// System.out.println("for O");

						tik[i][j] = "O";
						getBoard();

						return true;

					}

				}

			}

		}
		System.out.println();
		System.out.println();

		System.out.println("----------------------------");
		System.out.println();

		return false;

	}

	/// check winnin user

	static int checkWinner(int a){
		if(a==0){
			String aa="O";
			if(tik[0][0]==aa &&tik[0][1]==aa&&tik[0][2]==aa)
				
			{return 1;
			
			}else if (tik[0][0]==aa &&tik[1][0]==aa&&tik[2][0]==aa) {
				return 1;
			}else if (tik[0][1]==aa &&tik[1][1]==aa&&tik[2][1]==aa) {
				return 1;
			}else if (tik[0][2]==aa &&tik[1][2]==aa&&tik[2][2]==aa) {
				return 1;
			}else if (tik[2][0]==aa &&tik[2][1]==aa&&tik[2][2]==aa) {
				return 1;
			}else if (tik[0][0]==aa &&tik[1][1]==aa&&tik[2][2]==aa) {
				System.out.print(" loop running");
				return 1;
			}else if (tik[0][2]==aa &&tik[1][1]==aa&&tik[2][0]==aa) {
				return 1;
			}else{
				return -1;
			}
				
			}else{
				String aa="X";
				if(tik[0][0]==aa &&tik[0][1]==aa&&tik[0][2]==aa)
					
				{return 1;
				
				}else if (tik[0][0]==aa &&tik[1][0]==aa&&tik[2][0]==aa) {
					return 1;
				}else if (tik[0][1]==aa &&tik[1][1]==aa&&tik[2][1]==aa) {
					return 1;
				}else if (tik[0][2]==aa &&tik[1][2]==aa&&tik[2][2]==aa) {
					return 1;
				}else if (tik[2][0]==aa &&tik[2][1]==aa&&tik[2][2]==aa) {
					return 1;
				}else if (tik[0][0]==aa &&tik[1][1]==aa&&tik[2][2]==aa) {
					return 1;
				}else if (tik[0][2]==aa &&tik[1][1]==aa&&tik[2][0]==aa) {
					return 1;
				}else{
					return -1;
				}
					
				}
//			
//		for(int i=0;i<3;i++){
//			for(int j=0;j<3;j++){
//				if (a==0){
//					
//				} 
//				
//			}
//		}
//		
//		
	
		}
	static void startGame(){
		getBoard();
		int a = 0;
		Scanner sc = new Scanner(System.in);
		for (int i = 9; i >= 1; i--) {
			// System.out.println("on loop");

			if (a == 0) {
				// System.out.println("on loop if");

				System.out.println("user 1 chance");
				int aa = sc.nextInt();
				boolean f = input(a, aa);
				if (f == true) {
					int w=checkWinner(a);
					if(w==1){
						System.out.println("user 1 winner");
						break;
					}
					// System.out.println("on loop tr");

					a = 1;
					//System.out.println(i);

				} else {
					// System.out.println("on loop el");

					a = 0;
					i++;
					System.out.println("Sorry this is alrady aqupide" + i);
					System.out.println("Please chose another index");

				}
			} else {
				// System.out.println("on loop el");

				System.out.println("user second hance");
				int aa = sc.nextInt();
				boolean f = input(a, aa);
				if (f == true) {
					int w=checkWinner(a);
					if(w==1){
						System.out.println("user 2 winner");
						break;
					}
					// System.out.println("on loop el if");

					a = 0;
					//System.out.println(i);

				} else {
					// System.out.println("on loop el el");

					a = 1;
					i++;
					System.out.println("Sorry this is alrady aqupide" + i);
					System.out.println("Please chose another index");

				}
			}

		}
		System.out.println("game over");

		
	}

	public static void main(String[] args) {
		startGame();

//		getBoard();
//		int a = 0;
//		Scanner sc = new Scanner(System.in);
//		for (int i = 9; i >= 1; i--) {
//			// System.out.println("on loop");
//
//			if (a == 0) {
//				// System.out.println("on loop if");
//
//				System.out.println("user 1 chance");
//				int aa = sc.nextInt();
//				boolean f = input(a, aa);
//				if (f == true) {
//					int w=checkWinner(a);
//					if(w==1){
//						System.out.println("user 1 winner");
//						break;
//					}
//					// System.out.println("on loop tr");
//
//					a = 1;
//					//System.out.println(i);
//
//				} else {
//					// System.out.println("on loop el");
//
//					a = 0;
//					i++;
//					System.out.println("Sorry this is alrady aqupide" + i);
//					System.out.println("Please chose another index");
//
//				}
//			} else {
//				// System.out.println("on loop el");
//
//				System.out.println("user second hance");
//				int aa = sc.nextInt();
//				boolean f = input(a, aa);
//				if (f == true) {
//					int w=checkWinner(a);
//					if(w==1){
//						System.out.println("user 2 winner");
//						break;
//					}
//					// System.out.println("on loop el if");
//
//					a = 0;
//					//System.out.println(i);
//
//				} else {
//					// System.out.println("on loop el el");
//
//					a = 1;
//					i++;
//					System.out.println("Sorry this is alrady aqupide" + i);
//					System.out.println("Please chose another index");
//
//				}
//			}
//
//		}
//		System.out.println("game over");
	}
}



