import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        
        List<String>list1 = new ArrayList<>();
        List<String>list2 = new ArrayList<>();
        
        for(int i=0; i<str1.length()-1; i++){
            char a = str1.charAt(i);
            char b = str1.charAt(i+1);
            
            if(Character.isLetter(a) && Character.isLetter(b)){
                list1.add("" + a + b);
            }
        }
        
        for(int i=0; i<str2.length()-1; i++){
            char a = str2.charAt(i);
            char b = str2.charAt(i+1);
            
            if(Character.isLetter(a) && Character.isLetter(b)){
                list2.add("" + a + b);
            }
        }
        
        if(list1.isEmpty() && list2.isEmpty()){
            return 65536;
        }
        
        List<String>intersection = new ArrayList<>();
        List<String>copyList2 = new ArrayList<>(list2);
        
        for(String s : list1){
            if(copyList2.contains(s)){
                intersection.add(s);
                copyList2.remove(s);
            }
        }
        
        int unionSize = list1.size() + list2.size() - intersection.size();
        
        double jacard = (double)intersection.size() / unionSize;
        
        return (int)(jacard * 65536);
    }
}