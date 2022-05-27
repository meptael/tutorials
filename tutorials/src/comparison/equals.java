package comparison;

public class equals {

	public static void main(String[] args) {
		String a = "Hello world";
		String b = new String("Hello world");
		
		System.out.println(a == b);
		System.out.println(a.equals(b));

	}

}

/*
	new String 을 사용하는 이유
		String a의 경우 하나의 위치에 저장된 데이터를 가르키고 있고
		new String b의 경우 다른 위치에 데이터를 생성
		
		a == b의 경우 데이터의 위치가 다르기 때문에 false
		a.equals(b)의 경우 데이터의 위치는 다르지만 저장된 값은 같으므로 true
 
*/