package com.www.ch01;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		// String str2="" ;
		String[] str1 = new String[100];
		Scanner a = new Scanner(System.in);
		int j = 0;

		do {
			String b = a.nextLine();
			str1[j] = b;
			// str2+=str1[i];

		} while (!(str1[j++].equals("元整")));
		// System.out.println(str1[0]);

		Test test = new Test();
		test.change(str1, j);
		// test.changemax(str4,j);
	}

	public String[] change(String str[], int j) {

		String str3 = "";
		String[] str4 = new String[j];
		for (int i = 0; i < j; i++) {

			switch (str[i]) {
			case "0":
				str[i] = "零";

				break;
			case "1":
				str[i] = "壹";
				break;
			case "2":
				str[i] = "贰";

				break;
			case "3":
				str[i] = "叁";
				break;
			case "4":
				str[i] = "肆";

				break;
			case "5":
				str[i] = "伍";
				break;
			case "6":
				str[i] = "陆";

				break;
			case "7":
				str[i] = "柒";
				break;
			case "8":
				str[i] = "捌";

				break;
			case "9":
				str[i] = "玖";
				break;
			default:
				break;

			}
			// str3+=str[i];
			str4[i] = str[i];
			// System.out.println(str4[i]);
		}
		// System.out.println(str3);
		Test test1 = new Test();
		test1.changemax(str4, j);
		return str4;
	}

	public String changemax(String str4[], int j) {
		String[] str5 = new String[j];
		String str6 = "";

		for (int i = 0; i < j; i++) {
			if (str4[i].equals("零")) {
				if (str4[i - 1].equals("零") || str4[i - 1].equals("")) {
					str4[i] = "";

				}

				else
					;
			}
			// System.out.println(str4[i]);
		}

		for (int i = 0; i < j; i++) {
			int b = j - i;
			if (str4[i].equals("零") || str4[i].equals("")) {
				str5[i] = str4[i];
			}

			else {
				switch (b) {
				case 1:
					str5[i] = str4[i];
					break;
				case 2:
					str5[i] = str4[i];

					break;
				case 3:
					str5[i] = str4[i] + "拾";
					break;
				case 4:
					str5[i] = str4[i] + "百";

					break;
				case 5:
					str5[i] = str4[i] + "千";
					break;
				case 6:
					str5[i] = str4[i] + "万";

					break;
				case 7:
					str5[i] = str4[i] + "拾";
					break;
				case 8:
					str5[i] = str4[i] + "百";

					break;
				case 9:
					str5[i] = str4[i] + "千";
					break;
				case 10:
					str5[i] = str4[i] + "亿";
					break;
				}

			}

			str6 += str5[i];
		}
		System.out.println(str6);
		return str6;

	}

}
