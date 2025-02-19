import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class SortingAlgorithm {

    static int CONVERT_TO_MILLI_SECONDS = 1000000;

    public void sort(int[] numberArray){} //Override in subclass
        
    
    
        public static boolean isSorted(int a[]){
            int n = a.length;
            for (int i = 0; i < n-1; i++){
                if (a[i] > a[i+1]){
                    return false;
                }
            }
            return true;
        }
    
        public int[] fileReader(String filename){
            List<Integer> numberList = new ArrayList<Integer>();
    
            try {
                BufferedReader reader = new BufferedReader(new FileReader(filename));
                String line;
                while ((line = reader.readLine()) != null){
                    numberList.add(Integer.parseInt(line));
                }
                reader.close();
    
            } catch (Exception e) 
            {
                e.printStackTrace();
            }
            //Change list into array
            int numbersArray[] = new int[numberList.size()];
            for (int i=0; i < numberList.size(); i++){
                numbersArray[i] = numberList.get(i);
            }
            return numbersArray;
    
        }
    
        public void timeCalculator(String filename){
            int[] numberArray = fileReader(filename);
            final long startTime = System.nanoTime();
            sort(numberArray);
        final long duration = (System.nanoTime() - startTime)/CONVERT_TO_MILLI_SECONDS;
        System.out.println(duration);

    }


}
