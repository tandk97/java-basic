package day04;

public class 스택 {

	public static void main(String[] args) {
		Stack<Character> s = new Stack<Character>();

		s.push('A');
		s.push('B');
		s.push('C');
		s.push('D');
		s.push('E');

		System.out.println((char) s.pop()); // 꺼내기
		System.out.println((char) s.pop()); // 꺼내기
		System.out.println((char) s.pop()); // 꺼내기
		System.out.println((char) s.pop()); // 꺼내기
		System.out.println((char) s.pop()); // 꺼내기

		Stack<Integer> s1 = new Stack<Integer>();

		s1.push(3331);
		s1.push(8888);
		s1.push(7777);
		s1.push(6561);
		s1.push(5398);

		System.out.println((Integer) s1.pop()); // 꺼내기
		System.out.println((Integer) s1.pop()); // 꺼내기
		System.out.println((Integer) s1.pop()); // 꺼내기
		System.out.println((Integer) s1.pop()); // 꺼내기
		System.out.println((Integer) s1.pop()); // 꺼내기

	}

}

class Stack<T> {
	private T stack[];
	private int top; // 배열의 인덱스로 스택의 최상위를 가르켜 준다
	// 스택의 기본생성자로 생성하면 10개의 스택공간이 확보

	@SuppressWarnings("unchecked")
	public Stack() {
		stack = (T[]) new Object[10];
		top = -1; // 스택이 비어 있는 상황
	}

	@SuppressWarnings("unchecked")
	public Stack(int size) {
		if (size < 10)
			size = 10;
		stack = (T[]) new Object[size];
		top = -1; // 스택이 비어 있는 상황
	}

	public void push(T a) {
		// 스택의 공간이 꽉 차 있는지 확인하기
		if (isFull()) {
			System.out.println(" Stack OverFlower ");
			return;
		}
		top++;
		System.out.println(top + "~~");
		stack[top] = a;
		System.out.println(stack[top] + "~~~");
	}

	private boolean isFull() {
		if (top == stack.length - 1) {
			return true;
		} else {
			return false;
		}
	}

	public T pop() {
		if (isEmpty()) {
			System.out.println("Stack UnderFlower");
			return null;
		}
		T temp = stack[top];
		top--;
		return temp;
	}

	private boolean isEmpty() {
		if (top == -1) {
			return true;
		} else {
			return false;
		}
	}
}