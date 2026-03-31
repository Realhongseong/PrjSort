package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class Member{
	private int mno;

	public Member(int mno) {
		super();
		this.mno = mno;
	}

	public int getMno() {
		return mno;
	}
	
	@Override
	public String toString() {
		return "Member [mno=" + mno + "]";
	}
	
}

public class TestClassArrayListSort {

	public static void main(String[] args) {

		// ArrayList 는 생성자를 통해 초기값을 설정 : java 8이하
	/*	ArrayList<Member> mList = new ArrayList<>(
			Arrays.asList(
				new Member(1),new Member(15),new Member(14),
				new Member(95),new Member(9),new Member(17),
			)			
		);
		*/
		// ArrayList 는 생성자를 통해 초기값을 설정 : java 9 이상
		List<Member> mList = new ArrayList<>(
			  List.of(
				new Member(1),new Member(15),new Member(14),
				new Member(95),new Member(9),new Member(17)
			)			
		);
		 
		dispList(mList);
		// 오름차순 정렬
		
		Comparator<Member>  compAsc = new Comparator<Member>() {
			
			@Override
			public int compare(Member o1, Member o2) {				
				return o1.getMno() - o2.getMno();
			}
		};
		Comparator<Member>  compDesc = new Comparator<Member>() {
			
			@Override
			public int compare(Member o1, Member o2) {				
				return o2.getMno() - o1.getMno();
			}
		};
		
		Collections.sort( mList, compAsc );		
		dispList( mList );
		
		Collections.sort( mList, (a, b) -> {return b.getMno() - a.getMno();} );
		
		dispList( mList );
		
	}

	private static void dispList(List<Member> mList) {
		for (Member member : mList) {
			System.out.print(member + " ");
		}
		System.out.println();
	}

}
