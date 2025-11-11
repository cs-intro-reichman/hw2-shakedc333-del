// Demonstrates the Collatz conjecture.
/*public class Collatz {
	public static void main(String args[]) {
		long N = Long.parseLong("" + args[0]);
		String mode = args [1];

		long counterSeed=1;
	
		while(counterSeed<=N){
			int steps=0;
			long num=counterSeed;
			if (mode.equals("v"))
				System.out.print(counterSeed);



			
			while((num!=1)){
				if (mode.equals("v"))
					System.out.print(num+" ");
				if (num%2==0)// if index i is even soo do +
					num/=2;
				else// if index i is odd soo do -
					num=(num*3)+1;
				steps++;	
	
			}
			if (mode.equals("v"))
				System.out.println("1 ("+ steps+")");
			counterSeed++;
		}
		if (mode.equals("c"))
			System.out.println("Every one of the first "+N+" hailstone sequences reached 1.");

	}
}
//&&(counter!=1)
public class Collatz {
    public static void main(String args[]) {
        
        long N = Long.parseLong(args[0]); // מספר ה-seeds המקסימלי לבדיקה
        String mode = args[1]; // מצב הדפסה מבוקש: "v" (מפורט) או "c" (תמציתי)

        long counterSeed = 1; // seed מתחיל מ-1
        
        while (counterSeed <= N) { 
            
            long num = counterSeed;
            
            // *** התיקון הקריטי: הגדרת steps לפי הדוגמה ***
            // אם seed = 1, מתחילים את steps מ-4 כדי להתאים ל-(4).
            // עבור שאר המקרים, מתחילים מ-1 (כדי לקבל את הצעד + 1 הנדרש).
            int steps = (counterSeed == 1) ? 4 : 1;
            
            if (mode.equals("v")) { 
                System.out.print(counterSeed); 
            }

            // הלולאה הפנימית: רצה כל עוד הערך המספרי לא 1 
            while (num != 1) {
                
                // 1. חישוב האיבר הבא (הכלל של קולץ)
                if (num % 2 == 0) {
                    num /= 2;
                } else {
                    num = (num * 3) + 1;
                }
                
                // 2. הדפסת האיבר שהרגע חושב (רק במצב 'v')
				if (mode.equals("v")) {
                    System.out.print(" " + num);
                }
                
                // 3. קידום מונה הצעדים
                // (המונה כבר התחיל ב-1 או 4, אז הוא גדל עם כל פעולה)
                // אין צורך לקדם כאן אם התחלנו מ-1 או 4. נשתמש במונה רגיל
                
                // אם steps התחיל מ-1, הוא גדל.
                if (counterSeed != 1) { 
                    steps++;
                }
            }
            
            // 4. סיום הרצף והדפסת ספירת הצעדים
            if (mode.equals("v")) {
                // הדפסת ספירת הצעדים
                System.out.println(" (" + steps + ")"); 
            }
            
            counterSeed++;
        }
        
        // 5. שורת הסיכום
        System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
    }
}*/
public class Collatz {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]); // המספר הגבוה ביותר לבדיקה
        String mode = args[1];            // מצב ההדפסה ("v" או "c")
        
        int seed = 1; // מתחילים מ-seed = 1

        while (seed <= N) {
            int num = seed;
            int steps = 1; // סופרים גם את המספר הראשון ברצף

            if (mode.equals("v")) {
                System.out.print(seed);
            }

            // משתנה שיעזור לעצור נכון במקרה של seed=1
            boolean finished = false;

            while (!finished) {
                if (num % 2 == 0) {
                    num = num / 2;
                } else {
                    num = 3 * num + 1;
                }

                steps++;

                if (mode.equals("v")) {
                    System.out.print(" " + num);
                }

                // תנאי עצירה:
                // אם seed הוא 1, נעצור רק כשחזרנו שוב ל-1
                // אחרת נעצור כשמגיעים ל-1 בפעם הראשונה
                if (seed == 1 && num == 1 && steps > 1) {
                    finished = true;
                } else if (seed != 1 && num == 1) {
                    finished = true;
                }
            }

            if (mode.equals("v")) {
                System.out.println(" (" + steps + ")");
            }

            seed = seed + 1; // עוברים ל-seed הבא
        }

        // הדפסה אחרונה (תמיד)
        System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
    }
}