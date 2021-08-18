import java.util.Scanner;
public class Power {
	 static int x;
	    static int y;
	    static Scanner scan=new Scanner(System.in);


	    	public int test(int a, int b) {
	        int result = 1;

	        for(int i = 1; i <= b; ++i) {
	            result *= a;
	        }

	        return result;
	    
	    	}

		 public int getX() {
		        System.out.println("Введите x:");
		        int rez = 0;
		         Scanner scan1 = new Scanner(System.in);
		        int num = scan1.nextInt();
		        if (num <= 999 && num >= -1) {
		            rez = num;
		        } else {
		            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
		            rez = this.getX();
		        }

		        return rez;
		    }

		    public int getY() {
		        System.out.println("Введите y:");
		        int rez = 0;
		        Scanner scan2 = new Scanner(System.in);
		        int num = scan2.nextInt();
		        if (num <= 100 && num >= 1) {
		            rez = num;
		        } else {
		            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
		            rez = this.getY();
		        }

		        return rez;
		    }

		    public void printRez(int x, int y) {
		        System.out.println("Результат вычисления равен " + this.test(x, y));
		    }

	public static void main(String[] args) {
		   Power app = new Power();
	        x = app.getX();
	        y = app.getY();
	        app.printRez(x, y);
	       //System.console().readLine();
	}

}
