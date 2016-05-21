/*
 * [A]100
 * [TA's Advise]
 * 1. 沒什麼太大問題, Good!
 * */

package assignment3;

import javax.swing.JOptionPane;

public class GradeAnalyzerTester {

	public static void main(String[] args) {
		GradeAnalyzer GAT = new GradeAnalyzer();

		while (true) {
			String Input = JOptionPane.showInputDialog(null, "Please input one score");
			if (Input.equalsIgnoreCase("Q"))
				break;
			try {
				GAT.addGrade(Double.parseDouble(Input));
			} catch (Exception e) {
				System.out.println("Please enter vaild number");
			}

		}
		if (GAT.GradeCount < 2) {
			System.out.println("You need to enter two vaild number at least");
		} else {
			GAT.analyzeGrades();
			System.out.println("You entered " + GAT.GradeCount
					+ " valid grades from 0 to 110. Invalid grades are ignored!\n" + "The average= " + GAT.Avg
					+ " with a standard deviation= " + GAT.SD + "\n" + GAT.toString());
		}
	}

}
