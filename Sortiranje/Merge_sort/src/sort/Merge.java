package sort;

public class Merge {
	//Merge sortiranje je jedan od načina sortiranja podataka.
	//Podrazumeva kombinovanje 2 ili više nizova u jedan uređeni niz.
	//Najjednostavniji način za ovo je upoređivati dva najmanja elementa iz tih nizova te kao rezultat izbaciti manji od njih dva
	
	
	/* Funkcija za spajanje podnizova a[] */
	void merge(int a[], int beg, int mid, int end) {
		int i, j, k;
		int n1 = mid - beg + 1;
		int n2 = end - mid;

		/* privremeni nizovi */
		int LeftArray[] = new int[n1];
		int RightArray[] = new int[n2];

		/* kopiraj podatke u privremene nizove */
		for (i = 0; i < n1; i++)
			LeftArray[i] = a[beg + i];
		for (j = 0; j < n2; j++)
			RightArray[j] = a[mid + 1 + j];

		i = 0; /* početni indeks prvog podniza */
		j = 0; /* početni indeks drugog podniza */
		k = beg; /* početni indeks spojenog podniza */

		while (i < n1 && j < n2) {
			if (LeftArray[i] <= RightArray[j]) {
				a[k] = LeftArray[i];
				i++;
			} else {
				a[k] = RightArray[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
			a[k] = LeftArray[i];
			i++;
			k++;
		}

		while (j < n2) {
			a[k] = RightArray[j];
			j++;
			k++;
		}
	}

	void mergeSort(int a[], int beg, int end) {
		if (beg < end) {
			int mid = (beg + end) / 2;
			mergeSort(a, beg, mid);
			mergeSort(a, mid + 1, end);
			merge(a, beg, mid, end);
		}
	}

	/* Funkcija za ispis niza */
	void printArray(int a[], int n) {
		int i;
		for (i = 0; i < n; i++)
			System.out.print(a[i] + " ");
	}

	public static void main(String args[]) {
		int a[] = { 5, 78, 365, 125, 45, 3 };
		int n = a.length;
		
		Merge m1 = new Merge();
		
		System.out.println("Niz pre Merge sort");
		
		m1.printArray(a, n);
		m1.mergeSort(a, 0, n - 1);
		System.out.println();
		System.out.println("\nNiz posle Merge sort");
		m1.printArray(a, n);
		System.out.println("");
	}

}