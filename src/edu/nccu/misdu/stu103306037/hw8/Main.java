package edu.nccu.misdu.stu103306037.hw8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		KeywordList kl = new KeywordList();
		while (sc.hasNext()) {
			String cmd = sc.next();
			switch (cmd) {
			case "add":
				String name = sc.next();
				int count = sc.nextInt();
				float weight = sc.nextFloat();
				kl.add(new Keyword(name, count, weight));
				break;
			case "output":
				kl.output();
				break;
			case "Sort":
				kl.sort();
				break;
			default:
				break;
			}
		}

		sc.close();
	}
}