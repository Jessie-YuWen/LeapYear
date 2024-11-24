package tw.jessie.leap;

import java.util.Scanner;

public class RandomYear {
//	閏年的判斷程式
//	地球自轉一圈=繞太陽365天
//	每經過四年多轉1圈(1天)會比較剛好
//	但每滿100年不閏
//	400年要閏

	public static void main(String[] args) {
		int Leap = 0;
		int nonLeap = 0;
//		判斷隨機產的年份為平閏年，同時判斷在此年份以前有幾個平年與閏年
//		亂數產生要查詢的年份
		int randomYear = (int) (Math.random() * 3000);
		System.out.printf("亂數產生的年份為 : 西元 %d 年%n", randomYear);

		if (randomYear % 400 == 0) {
			System.out.printf("西元 %d 年是閏年%n", randomYear);
		} else if (randomYear % 100 == 0) {
			System.out.printf("西元 %d 年是平年%n", randomYear);
		} else if (randomYear % 4 == 0) {
			System.out.printf("西元 %d 年是閏年%n", randomYear);
		} else {
			System.out.printf("西元 %d 年是平年%n", randomYear);
		}

		for (int i = 1; i <= randomYear; i++) {
			if (i % 4 == 0 && i % 400 == 0) {
				Leap++;
			} else if (i % 4 == 0 && i % 100 != 0) {
				Leap++;
			} else {
				nonLeap++;
			}
		}
		System.out.printf("包含 %d 年，一共經歷 %d 次閏年%n", randomYear, Leap);
		System.out.printf("包含 %d 年，一共經歷 %d 次平年%n", randomYear, nonLeap);
		int all = Leap + nonLeap;
		System.out.printf("平年加閏年的總數 %d%n", all);
	}

}

