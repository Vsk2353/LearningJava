package SearchingAndSorting;

public class SearchInString {
    public static void main(String[] args) {
        String name = "Vivek";
        char target = 'i';
        System.out.println(searchstring(name,target));
        System.out.println(searchstring2(name,target));
    }
    static boolean searchstring(String str, char target){
        if(str.isEmpty()){
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if(target==str.charAt(i)){
                return true;
            }
        }
        return false;
    }

    static boolean searchstring2(String str, char target){
        if(str.isEmpty()){
            return false;
        }

        for (char ch : str.toCharArray()){
            if(ch == target){
                return true;
            }
        }
        return false;
    }
}
/*
We can do the same for 2D array
 */