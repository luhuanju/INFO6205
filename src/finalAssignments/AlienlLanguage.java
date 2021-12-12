package finalAssignments;

public class AlienlLanguage {


    public static void main(String[] args) {


        String[] words=new String[]{"hello","leetcode"};
        String order = "hlabcdefgijkmnopqrstuvwxyz";
        boolean ans=isAlienSorted(words,order);
        System.out.println(ans);

        String[] words1=new String[]{"word","world","row"};
        String order1 = "worldabcefghijkmnpqstuvxyz";
        boolean ans1=isAlienSorted(words1,order1);
        System.out.println(ans1);

        String[] words2=new String[]{"apple","app"};
        String order2 = "abcdefghijklmnopqrstuvwxyz";
        boolean ans2=isAlienSorted(words2,order2);
        System.out.println(ans2);

    }

    static boolean isAlienSorted(String[] words, String order) {

        int n=  words.length;

        for(int i=0; i< n-1; i++){
            if(!helper(words[i], words[i+1], order))
                return false;
        }
        return true;
    }

    static boolean helper(String s1, String s2, String order) {
        if(s1.equals(s2))
            return true;

        int min = Math.min(s1.length(), s2.length());
        int j = 0;

        while(j < min && s1.charAt(j) == s2.charAt(j)){
            j++;
        }
        if(j==min){
            return (min == s1.length());
        }else{
            char c1 = s1.charAt(j);
            char c2 = s2.charAt(j);
            boolean res = (order.indexOf(c1) < order.indexOf(c2));
            return res;
        }
    }
}
