package day03;

import java.util.List;
import java.util.Vector;

public class ����Ʈ2 {

	public static void main(String[] args) {
		List<Board> vlist= new Vector<Board>();
        vlist.add(new Board("����1", "����1", "�ۼ���1"));
        vlist.add(new Board("����2", "����2", "�ۼ���2"));
        vlist.add(new Board("����3", "����3", "�ۼ���3"));
        
        System.out.println( vlist.get(0) ) ;
		
	}

}
class Board{
	String subject;
	String content;
	String writer;
	public Board(String subject, String content, String writer) {
		super();
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return subject + "   " + content + "  " + writer ;
	}
	
}
