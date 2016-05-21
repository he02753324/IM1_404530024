package assignment3;

import java.util.ArrayList;

public class GradeAnalyzer {
	int GradeCount;
	double Sum, Avg, Var, SD;
	boolean First = true;
	ArrayList<Double> Grades = new ArrayList<Double>();// ��J�����Z
	GradeDistribution[] GD = new GradeDistribution[11];

	static boolean isValidGrade(double aGrade)// �P�_���Z�O�_�����ĭ�
	{
		if (aGrade >= 0 && aGrade <= 110) {
			return true;
		} else {
			return false;
		}
	}

	void addGrade(double aGrade)// �p���J�����Ħ��Z�ƻP���Z�`�M
	{
		// Good, +2.
		if (First == true)// ���Ū�l��
		{
			GD[0] = new GradeDistribution("A+:", 0);
			GD[1] = new GradeDistribution("A:", 0);
			GD[2] = new GradeDistribution("A-:", 0);
			GD[3] = new GradeDistribution("B+:", 0);
			GD[4] = new GradeDistribution("B:", 0);
			GD[5] = new GradeDistribution("B-:", 0);
			GD[6] = new GradeDistribution("C+:", 0);
			GD[7] = new GradeDistribution("C:", 0);
			GD[8] = new GradeDistribution("C-:", 0);
			GD[9] = new GradeDistribution("D:", 0);
			GD[10] = new GradeDistribution("F:", 0);
			First = false;
		}
		if (isValidGrade(aGrade) == true) {
			Grades.add(aGrade);// �N���Z�[�J�}�C
			GradeCount += 1;// �p�⦳�Ħ��Z��
			Sum += aGrade;// �p���`�M
			if (aGrade >= 98) {
				GD[0].Count++;
			} // ���Z����
			else if (aGrade < 98 && aGrade >= 92) {
				GD[1].Count++;
			} else if (aGrade < 92 && aGrade >= 90) {
				GD[2].Count++;
			} else if (aGrade < 90 && aGrade >= 88) {
				GD[3].Count++;
			} else if (aGrade < 88 && aGrade >= 82) {
				GD[4].Count++;
			} else if (aGrade < 82 && aGrade >= 80) {
				GD[5].Count++;
			} else if (aGrade < 80 && aGrade >= 78) {
				GD[6].Count++;
			} else if (aGrade < 78 && aGrade >= 72) {
				GD[7].Count++;
			} else if (aGrade < 72 && aGrade >= 70) {
				GD[8].Count++;
			} else if (aGrade < 70 && aGrade >= 60) {
				GD[9].Count++;
			} else if (aGrade < 60) {
				GD[10].Count++;
			}
		}
		;
	}

	void analyzeGrades()// �p�⦳�Ħ��Z�����μзǮt
	{
		Avg = Sum / GradeCount;
		for (int i = 0; i < Grades.size(); i++) {
			// ���H�Ӽ����ӬO�̫�@��Ʊ���, -2.
			Var += (Grades.get(i) - Avg) * (Grades.get(i) - Avg) / GradeCount;
		}
		SD = Math.round(Math.sqrt(Var));
	}

	public String toString() {
		String GDText = "";
		for (int i = 0; i < GD.length; i++) {
			GDText += GD[i].toString();
		}
		return "The grade distribution is:\n" + GDText;
	}
}
