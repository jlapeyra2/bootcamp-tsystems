
public class TA04 {
	static void ej1() {
		int x = 10, y = 2;
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		System.out.println(x%y);
		
	}
	
	static void ej2() {
		int n = 3;
		double a = 3.3;
		char c = 'c';
		System.out.println("N = "+n);
		System.out.println("A = "+a);
		System.out.println("C = "+c);
		System.out.println("N + A = "+(n+a));
		System.out.println("N - A = "+(n-a));
		System.out.println("(num)C = "+((int)c));
	}

	static void ej3() {
		int x = 5;
		int y = 6;
		double n = 3.3;
		double m = 2.2;
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x/y);
		System.out.println(x%y);
		System.out.println(n+m);
		System.out.println(n-m);
		System.out.println(n*m);
		System.out.println(n/m);
		System.out.println(n%m);
		System.out.println(x+n);
		System.out.println(y/m);
		System.out.println(y%m);
		System.out.println((x*2)+" "+(y*2)+" "+(n*2)+" "+(m*2));
		System.out.println(x+y+n+m);
		System.out.println(x*y*n*m);
	}

	static void ej4() {
		int n = 10;
		n += 77;
		n -= 3;
		n *= 2;
	}

	static void ej5() {
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;
		int aux = b;
		b = c;
		c = a;
		a = d;
		d = aux;
	}
	
}
