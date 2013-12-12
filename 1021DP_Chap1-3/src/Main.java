import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�п�J�ƦrA: ");
		double A = sc.nextDouble();
		
		System.out.print("�п�J�B��Ÿ�(+�B-�B*�B/): ");
		String op = sc.next();
		
		System.out.print("�п�J�ƦrB: ");
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
			
			System.out.println("���G�O: " + String.valueOf(result));
		}
		else
		{
			System.out.println("Input Error !");
		}

		sc.close();

	}

}
