package day07;

public class 해쉬 {

	public static void main(String[] args) {
		// 추가, 삭제, 검색 해쉬표를 사용함
		Hash hash = new Hash();
		hash.createHashTable();
		hash.display();
		hash.search("비비빅");
		hash.search("김밥");
	}

}

class Hash {
	int BUCKET_SIZE = 10;
	Node[] bucket = new Node[BUCKET_SIZE];

	public Hash() {
		for (int i = 0; i < BUCKET_SIZE; i++) {
			bucket[i] = new Node();
		}
	}

	public void search(String string) {

	}

	public void display() {

	}

	public void createHashTable() {
		String[] words = new String[] { "학교", "곰돌이", "김밥", "비비빅", "비빔밥" };
		for (String w : words)
			insert(w);
	}

	public void insert(String data) {
		int hash = getHash(data);
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = bucket[hash].next;
		System.out.println(bucket[hash].next);
	}

	private int getHash(String data) {
		int i, sum = 0;
		for (i = 0; i < data.length(); i++) {
			sum += data.charAt(i); // 개발자가 임의로 해쉬함수를 정의함
		}
		return sum % BUCKET_SIZE;
	}
}