package snackWaterGun;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Swc {static int result, d, c, u;
static String arg[] = { "Snack", "Water", "gun" };
static Map<String, String> m = new HashMap<>();

static int ge() {
	int min = 0;
	int max = 3;
	Random random = new Random();
	return random.nextInt(max - min) + min;
}

static int gaame(int us) {
	int com = ge();
	if (us == com) {
		m.put(arg[com], arg[us]);

		System.out.println();
		System.out.println(" Computer Chose --> " + arg[com] + "    User chose -->  " + arg[us]);

		System.out.println("this round is Match drow");
		System.out.println();

		d++;
		return 0;
	} else if (com == 0 && us == 1) {
		m.put(arg[com], arg[us]);

		System.out.println(" Computer Chose --> " + arg[com] + "    User chose -->  " + arg[us]);
		System.out.println();

		System.out.println("This round is Computer Win");
		System.out.println();

		c++;
		return -1;

	} else if (com == 1 && us == 2) {
		m.put(arg[com], arg[us]);

		System.out.println(" Computer Chose --> " + arg[com] + "    User chose -->  " + arg[us]);
		System.out.println();

		System.out.println("This round is Computer Win");
		c++;
		return -1;

	} else if (com == 2 && us == 0) {
		m.put(arg[com], arg[us]);

		System.out.println(" Computer Chose --> " + arg[com] + "    User chose -->  " + arg[us]);
		System.out.println();

		System.out.println("This round isComputer Win");
		c++;
		return -1;

	} else
		m.put(arg[com], arg[us]);

	System.out.println(" Computer Chose --> " + arg[com] + "    User chose -->  " + arg[us]);

	System.out.println();

	System.out.println("This rond is User Win Win");
	u++;
	return 1;

}

public static void main(String[] args) {
	// Random ra =new Random();
	// System.out.printlnln( ra.nextInt());
	// TODO Auto-generated method stub
	// System.out.printlnln(ge(0,3));
	Scanner sc = new Scanner(System.in);
	System.out.println("Pleace Select how many round you play");
	int p = sc.nextInt();
	System.out.println("Snack for ---> 0" + "     Water for ---> 1" + "   Gun for --> 2");
	int i=0;
	while (p >= 1) {
		
		System.out.println("");

		System.out.println("Pleace Select User Choice 0 to 2");

		i = sc.nextInt();
		
		if (i > 2) {
			System.out.println("you Type wrong input");
			continue;

		}

		int res = gaame(i);
		result = res + result;
		p--;

	
	}
	
	
	if (result == 0) {
		System.out.println("match drow" + "User point  --> " + u + ",   computer point --->" + c);

	} else if (result < 0) {
		System.out.println("Computer Win  " + "User point  --> " + u + ",   computer point --->" + c);

	} else
		System.out.println("User Win" + "User point  --> " + u + ",   computer point --->" + c);

	System.out.println("Show all reslt type 1 other wise  0");
	int a = sc.nextInt();
	if (a == 1) {
		for (Map.Entry<String, String> map : m.entrySet()) {
			System.out.println(map.getKey() + " | " + map.getValue());
		}
	}

}

}
