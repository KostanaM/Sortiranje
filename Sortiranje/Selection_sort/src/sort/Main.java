package sort;

public class Main {
	//Selection sortiranje je jedan od načina sortiranja podataka.
	//i-ti element se dobija tako što zameni mesta sa najmanjim elementom dela niza od i-te pozicije do kraja
	  
	public static void selectionSort(int[] arr){  
	        for (int i = 0; i < arr.length - 1; i++)  
	        {  
	            int index = i;  
	            for (int j = i + 1; j < arr.length; j++){  
	                if (arr[j] < arr[index]){  
	                    index = j;//traženje najnižeg indeksa 
	                }  
	            }  
	            //zamena elemenata
	            int smallerNumber = arr[index];   
	            arr[index] = arr[i];  
	            arr[i] = smallerNumber;  
	        }  
	    }  
	       
	    public static void main(String a[]){  
	        int[] arr1 = {987, 65, 3, 45, 67, 852};  
	        System.out.println("Niz pre Selection Sort");  
	        for(int i:arr1){  
	            System.out.print(i+" ");  
	        }  
	        System.out.println();  
	          
	        selectionSort(arr1);//sortiranje niza koristenjem selection sort  
	         
	        System.out.println("Niz posle Selection Sort");  
	        for(int i:arr1){  
	            System.out.print(i+" ");  
	        }  
	    }  
	}  