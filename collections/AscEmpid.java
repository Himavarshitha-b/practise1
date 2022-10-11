package com.me.entity;

import java.util.Comparator;

public class AscEmpid implements Comparator<Employee> {

	public int compare(Employee o1, Employee o2) {
		return o1.getEmpid() - o2.getEmpid();
	}
}
/*
 * for(int i = 0 ; i < length-1 ; i++){
 *    for(int j = i + 1 ; j < length - 1 ; j++) {
 *       if(a[i] > a[j]) {
 *         //swap
 *        }
 *     }
 *  }
 */