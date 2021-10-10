package com.sudhanshu;

public class SearchinString {
    public static void main(String[] args) {
        String name = "Sudhanshu";
        char target = 'n';
        System.out.println( search(name , target));
    }

    static boolean search(String name, char target) {
        if ( name.length() == 0){
            return false ;
        }
        for (char element:
             name.toCharArray() ) {
            if( element == target){
                return true;
            }
        }
        return false;
    }
}
