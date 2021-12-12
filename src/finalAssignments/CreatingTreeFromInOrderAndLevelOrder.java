package finalAssignments;


import java.util.HashMap;
import java.util.Map;

public class CreatingTreeFromInOrderAndLevelOrder {



    public static void main(String[] args) {

        int[] inorderArr=new int[]{4,2,5,1,6,3};
        int[] levelOrder=new int[]{1,2,3,4,5,6};

        Map<Integer, Integer> hash = buildHashFromLevel(inorderArr);
        Node node = constructEntireTree(levelOrder, inorderArr, 0, inorderArr.length - 1,0 );
        System.out.println(node);

    }
    static Map<Integer, Integer> buildHashFromLevel(int[] inorderArr) {
        Map<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < inorderArr.length; i++) {
            hash.put(inorderArr[i], i);
        }
        return hash;
    }
    private static Node constructEntireTree(int[] levelOrder, int[] inOrder, int inorderSrart, int iEnd, int lStart) {
        if (inorderSrart > iEnd) {
            return null;
        }
        Node temp = null;
        int findForCurindex = 0;

        for (int i = lStart; i <= levelOrder.length; i++) {
            for (int j = inorderSrart; j <= iEnd; j++) {
                if (levelOrder[i] == inOrder[j]) {
                    temp = new Node(inOrder[j]);
                    findForCurindex = j;
                    break;
                }
            }
            if (temp != null) {
                break;
            }
        }
        temp.left=(constructEntireTree(levelOrder, inOrder, inorderSrart, findForCurindex - 1, lStart + 1));
        temp.right=(constructEntireTree(levelOrder, inOrder, findForCurindex + 1, iEnd, lStart + 1));
        return temp;
    }
}
