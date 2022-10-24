package day03;

import java.util.List;
import java.util.Vector;

public class 리스트2 {

	public static void main(String[] args) {
		List<Board> vlist = new Vector<Board>();
		vlist.add(new Board("제목 1", "내용 1", "작성자1"));
		vlist.add(new Board("제목 2", "내용 2", "작성자2"));
		vlist.add(new Board("제목 3", "내용 3", "작성자3"));
		System.out.println(vlist.get(0));
	} // public static void main

} // class 리스트2

class Board {

	String subject;
	String content;
	String writer;

	public Board(String subject, String content, String writer) {
		super();
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	} // public Board

	@Override
	public String toString() {
		return "subject=" + subject + ", content=" + content + ", writer=" + writer + "]";
	} // public String toString
} // class Board
