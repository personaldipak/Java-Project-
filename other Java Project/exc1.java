Exercise 7.1 – student scores [remember, the point is to populate an array of scores]
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter number of students: ");
    int students = input.nextInt();
    System.out.print("Please enter a score: ");
      
    
    int[] scores = new int[students]; 
    int best = 0; 
    char grade; 

    for (int i = 0; i < scores.length; i++) {
      scores[i] = input.nextInt();
      if (scores[i] > best)
        best = scores[i];
    }


    String output = "";

    for (int i = 0; i < scores.length; i++) {
      if (scores[i] >= best - 10)
        grade = 'A';
      else if (scores[i] >= best - 20)
        grade = 'B';
      else if (scores[i] >= best - 30)
        grade = 'C';
      else if (scores[i] >= best - 40)
        grade = 'D';
      else
        grade = 'F';

      output += "Student " + i + " score is " +
        scores[i] + " and grade is " + grade + "\n";
    }

    System.out.println(output);
  }
}

