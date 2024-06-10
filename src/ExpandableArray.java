import java.util.Arrays;

public class ExpandableArray {
    String[] arr = new String[1];
    int currentIndex = 0;
    int newSize = 1;
    String[] newArr;
    int length;

    public void add(String value) {
        //
        if (currentIndex < arr.length) {
            arr[currentIndex] = value;
            this.currentIndex += 1;
        } else {
            newSize += 1;
            newArr = new String[newSize]; // instantiate a larger array
            System.arraycopy(arr, 0, newArr, 0, arr.length); // copy elements in old array to new array
            arr = newArr; // reference old array to new array
            newArr[currentIndex] = value;
            this.currentIndex += 1;
            this.length = newArr.length;
        }
    }

    public void printEach(){
        for (String s : arr) {
            System.out.println(s);
        }
    }

    public String toString(){
        //System.out.println(Arrays.toString(arr));
        return Arrays.toString(arr);
    }

    public String index(int index){
        return arr[index];
    }
}
