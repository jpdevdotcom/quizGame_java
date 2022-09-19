package gameApp;

import java.util.Scanner;

public class quizGame {

	public quizGame() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		quizContents qa = new quizContents();
		technologyQuiz tq = new technologyQuiz();
		scienceQuiz sq = new scienceQuiz();
		polsciQuiz pq = new polsciQuiz();
		boolean isDone = false;
		boolean xUserInput = false;

		System.out.println("Welcome to JPD Quiz Game!");

		while (!isDone) {
			System.out.println("Choose only one (1) category.");
			for (int i = 1; i < qa.quizCategories.length; i++) {
				System.out.println(i + ". " + qa.quizCategories[i]);
			}

			// HISTORY
			String userAnswer = "";
			int correctAns = 0;
			int wrongAns = 0;

			while (!xUserInput) {
				System.out.print("\nEnter Category: ");
				String userCategory = scan.nextLine().toUpperCase().trim();
				System.out.println("");
				
				if (userCategory.equals(qa.quizCategories[1])) {
					for (int hQ = 0; hQ < qa.historyQuestions.length; hQ++) {
						System.out.print(hQ + 1 + ". " + qa.historyQuestions[hQ]);
						userAnswer = scan.nextLine().toLowerCase().trim();

						if (userAnswer.equals(qa.historyAnswers[hQ])) {
							correctAns++;
							xUserInput = true;
						} else {
							wrongAns++;
							xUserInput = true;
						}
					}
				} else if (userCategory.equals(qa.quizCategories[2])) {
					for (int tQ = 0; tQ < tq.technologyQuestions.length; tQ++) {
						System.out.print(tQ + 1 + ". " + tq.technologyQuestions[tQ]);
						userAnswer = scan.nextLine().toLowerCase().trim();

						if (userAnswer.equals(tq.technologyAnswers[tQ])) {
							correctAns++;
							xUserInput = true;
						} else {
							wrongAns++;
							xUserInput = true;
						}
					}
				} else if (userCategory.equals(qa.quizCategories[3])) {
					for (int sQ = 0; sQ < sq.scienceQuestions.length; sQ++) {
						System.out.print(sQ + 1 + ". " + sq.scienceQuestions[sQ]);
						userAnswer = scan.nextLine().toLowerCase().trim();
						
						if (userAnswer.equals(sq.scienceAnswers[sQ])) {
							correctAns++;
							xUserInput = true;
						} else {
							wrongAns++;
							xUserInput = true;
						}
					}
				} else if (userCategory.equals(qa.quizCategories[4])) {
					for (int pQ = 0; pQ < pq.polsciQuestions.length; pQ++) {
						System.out.print(pQ + 1 + ". " + pq.polsciQuestions[pQ]);
						userAnswer = scan.nextLine().trim().toLowerCase();
						
						if (userAnswer.equals(pq.polsciAnswers[pQ])) {
							correctAns++;
							xUserInput = true;
						} else {
							wrongAns++;
							xUserInput = true;
						}
					}
				} else {
					System.out.println("Wrong input!");
				}
			}

			if (correctAns >= 3) {
				System.out.println("\nExcellent, you won!");
				System.out.println("You got " + correctAns + " correct answer.");
			} else {
				System.out.println("\nYou Lose, better luck next time!");
				System.out.println("You got " + wrongAns + " incorrect answer.");
			}

			boolean xInput = false;

			while (!xInput) {
				System.out.print("\nDo you still want to play? Y/N: ");
				String userInput = scan.nextLine().toUpperCase().trim();

				if (userInput.equals("N")) {
					xInput = true;
					isDone = true;
					System.out.println("Okay, thanks for playing!");

				} else if (!userInput.equals("Y")) {
					System.out.println("Wrong input!");
				} else {
					xInput = true;
					System.out.println("");
				}
			}
		}
	}

}
