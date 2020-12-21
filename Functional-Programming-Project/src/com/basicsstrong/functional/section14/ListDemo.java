package com.basicsstrong.functional.section14;

import java.util.List;

public class ListDemo {

	public static void main(String[] args) {

		ListFun<Integer> list = ListFun.list(3, 6, 9);
		list.forEach(System.out::println);

		ListFun<Integer> newList = list.addEle(56);
		newList.forEach(System.out::println);

		ListFun<Integer> removeEle = newList.removeEle(9);
		System.out.println();
		removeEle.forEach(System.out::println);

		System.out.println();
		ListFun<Integer> reverseList = removeEle.reverseList();
		reverseList.forEach(System.out::println);

		ListFun<Integer> list1 = ListFun.list(3, 6, 9, 8);
		ListFun<Integer> list2 = ListFun.list(35, 78, 90);

		System.out.println();
		ListFun.concat(list1, list2).forEach(System.out::println);

		System.out.println();

		List<Integer> l = List.of(2, 5, 8, 6);
		list1.addAllEle(l).forEach(System.out::println);
	}

}
