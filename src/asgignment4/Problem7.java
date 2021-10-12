package asgignment4;

public class Problem7 {


    class PolyNode {
        int coefficient, power;
        PolyNode next = null;

        PolyNode() {
        }

        PolyNode(int x, int y) {
            this.coefficient = x;
            this.power = y;
        }

        PolyNode(int x, int y, PolyNode next) {
            this.coefficient = x;
            this.power = y;
            this.next = next;
        }
    }

    /**
     * Time Complexity : O(n)
     * Space Complexity : O(1)
     */
    public PolyNode addPoly(PolyNode l1, PolyNode l2) {
        PolyNode result = new PolyNode();
        PolyNode prev = result;
        while (l1 != null && l2 != null) {
            if (l1.power > l2.power) {
                prev.next = l1;
                l1 = l1.next;
                prev = prev.next;
            } else if (l1.power < l2.power) {
                prev.next = l2;
                l2 = l2.next;
                prev = prev.next;
            } else {
                l2.coefficient += l1.coefficient;
                if (l2.coefficient != 0) {
                    prev.next = l2;
                    prev = prev.next;
                }
                l2 = l2.next;
                l1 = l1.next;
            }
        }
        prev.next = (l1 == null) ? l2 : l1;
        return result.next;
    }

}
