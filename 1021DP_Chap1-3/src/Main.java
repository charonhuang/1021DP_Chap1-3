import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("請輸入數字A: ");
		double A = sc.nextDouble();
		
		System.out.print("請輸入運算符號(+、-、*、/): ");
		String op = sc.next();
		
		System.out.print("請輸入數字B: ");
		double B = sc.nextDouble();
		
		double result = -1.0;
		
		Operation oper = null;
		
		switch(op)
		{
		case "+":
			oper = new OperationAdd();
			break;
		case "-":
			oper = new OperationSub();
			break;
		case "*":
			oper = new OperationMul();
			break;
		case "/":
			oper = new OperationDiv();			
			break;
		default:
			break;
		}
		
		if(oper != null)
		{
			oper.setNumA(A);
			oper.setNumB(B);
			result = oper.getResult();
			
			System.out.println("結果是: " + String.valueOf(result));
		}
		else
		{
			System.out.println("Input Error !");
		}

		sc.close();

	}

}
