package sort;

public class Main {
	
	static void bubbleSort(int[] arr) {
		
		//Bubble sortiranje je jedan od načina sortiranja podataka.
		//Podaci se sortiraju tako da se uspoređuju dva susedna podatka i koji je manji ide ispred, a veći iza.
	
		int n = arr.length;
		int temp = 0;
		
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (arr[j - 1] > arr[j]) {
					
					// zamena elemenata
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {

		int arr[] = { 5, 55, 35, 74, 305, 689, 12, 17, 354 };

		System.out.println("Niz pre Bubble Sort");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		bubbleSort(arr);// sortiranje elemenata niza pomoću bubble sort
		
		System.out.println("Niz posle Bubble Sort");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}