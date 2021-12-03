package Assignment8;

public class Question1 {



    public static class Tire{

        private static class Node{
            Node[] link=new Node[26];
            boolean isEnd=false;
            String word;
        }
        Node root;
        // this is for the Root
        public Tire() {
            root=new Node();
        }


        public void insert(String word) {
            Node temp= root;
            for(char c : word.toCharArray()){
                if(temp.link[c-'a']==null){
                    temp.link[c-'a']= new Node();
                }
                temp= temp.link[c-'a'];
            }
            temp.isEnd=true;
            temp.word=word;
        }

        /**
         * how to judge is there is a word in this tire. we can do that base on the "isEnd"
         * And Why?
         * Think two words: "abc", and want to search "ab". Abviously, we go through this prefix tree and DFS
         * we can come across the node "ab" from the path "abc". Can we say that "ab" exist in this prefix tree.
         * Of course, It isn't. so, wo can do this by the "isEnd" property.
         *
         * @param word
         */
        public boolean search(String word) {
            Node temp= root;
            for(char c : word.toCharArray()){
                if(temp.link[c-'a']==null) return false;
                temp= temp.link[c-'a'];
            }
            return temp.isEnd;
        }


        public boolean startsWith(String prefix) {
            Node temp= root;
            for(int i=0;i<prefix.length();i++){
                char c=prefix.charAt(i);
                if(temp.link[c-'a']==null){
                    return false;
                }
                temp=temp.link[c-'a'];
            }
            return true;
        }
    }
}
