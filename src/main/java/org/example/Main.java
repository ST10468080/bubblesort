package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public void main(String[]args) {
      int [] arrayToSort = {79, 1, 55, 17, 12};

      System.out.println("Unsorted Array");
      displayArray(arrayToSort);
      bubblesort(arrayToSort);

      System.out.println("\nSorted Array");
      displayArray(arrayToSort);
  }
  public static void bubblesort(int []valuesToSort){
      int temp;
      for (int i = 0; i < valuesToSort.length -1; i++)
          for (int j = 0; j < valuesToSort.length -1 - i; j++) {
              if(valuesToSort[j] > valuesToSort[j+1]){
                  temp = valuesToSort [j];
                  valuesToSort[j] = valuesToSort[j +1];
                  valuesToSort [j + 1] = temp;
              }

          }


  }
  public static void displayArray (int[] valueToSort){
      for (int i = 0; i < valueToSort.length; i++) {
          System.out.print(valueToSort[i] + "   ");

      }
  }
}
