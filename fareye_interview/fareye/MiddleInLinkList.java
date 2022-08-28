package fareye_interview.fareye;

import LinkedListQuestions.MyLinkedList;

public class MiddleInLinkList {
	

	public static void main(String[] args) {
		MyLinkedList linkedList = new MyLinkedList();
		linkedList.insertAtFirst("ankit");	
		linkedList.insertAtFirst("niti");	
		linkedList.insertAtFirst("steve");	
		linkedList.insertAtLast("bakner");	
		linkedList.insertAtFirst("papa");	
		linkedList.insertAtFirst("mummy");	
		linkedList.insertAtLast("choti");	
		linkedList.insertAtFirst("bhai");
//		linkedList.reverse();
		linkedList.rotate(3);
		System.out.println("\n"+linkedList.middleNode2().value);
//		[ bhai , mummy , papa , steve , niti , ankit , bakner , choti , ]
	}

}
