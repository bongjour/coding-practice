package io.jourbong.code.practice.beijing;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by coupang on 2017. 3. 9..
 */
public class FindCommon2 {

	List<Integer> findCommon(int arr1[], int arr2[], int arr3[]) {

		int i = 0, j = 0, k = 0;
		List<Integer> result = new ArrayList<>();

		while (i < arr1.length && j < arr2.length && k < arr3.length) {

			if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
				result.add(arr1[i]);
				i++;
				j++;
				k++;
			}
			if (arr1[i] < arr2[j] || arr1[i] < arr3[k]) {
				i++;
			}
			if (arr2[j] < arr3[k] || arr2[j] < arr1[i]) {
				j++;
			}
			if (arr3[k] < arr1[i] || arr3[k] < arr2[j]) {
				k++;
			}
		}

		return result;
	}

	public static void main(String args[]) {

		FindCommon2 fc = new FindCommon2();

		int ar1[] = { 1, 5, 10, 20, 40, 80 };
		int ar2[] = { 6, 7, 20, 80, 100 };
		int ar3[] = { 3, 4, 15, 20, 30, 70, 80, 120 };

		System.out.print("Common elements are " + fc.findCommon(ar1, ar2, ar3));
	}
}
