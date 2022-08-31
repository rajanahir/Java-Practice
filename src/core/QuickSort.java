package core;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {
	
	
	public static void main(String[] args) {
		Random rand = new Random();
		int[] number = new int[10];
		
		for (int i = 0; i<number.length; i++) {
			number[i] = rand.nextInt(100);
		}
		
		System.out.println("Before");
		Arrays.stream(number).forEach(System.out::println);
		
		quickSort(number);
		
		System.out.println("After");
		Arrays.stream(number).forEach(System.out::println);
	}
	
	private static void quickSort(int[] number) {
		 quickSort(number, 0, number.length - 1);
	}
	
	
	private static void quickSort( int[] number, int lowIndex, int highIndex ) {
		if (lowIndex >= highIndex)
			return;
		
		int leftPointer = lowIndex;
		int rightPointer = highIndex;
		int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
		int pivot = number[pivotIndex];
		swap(number, pivotIndex, highIndex);
		
		while( leftPointer < rightPointer ) {
			
			while( number[leftPointer] <= pivot && leftPointer < rightPointer  ) {
				leftPointer++;
			}
			
			while( number[rightPointer] >= pivot && leftPointer < rightPointer  ) {
				rightPointer--;
			}
			
			swap(number, leftPointer, rightPointer);
			
		}
		swap(number, leftPointer, highIndex);
		
		quickSort(number, lowIndex, leftPointer - 1);
		quickSort(number, leftPointer + 1, highIndex);	
		
	}
	
	
	private static void swap( int[] array, int index1, int index2 ) {
		int temp =  array[index1];
		array[index1] = array[index2];
		array[index1] = temp;
	}

}
