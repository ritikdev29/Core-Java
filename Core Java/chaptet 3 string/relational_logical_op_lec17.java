public class relational_logical_op_lec17 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false; // agar dono true rahaga to yes dega varna faslse or true rha \to no dega and
                           // false false rha to bhi no dega

        if (a && b) {
            System.out.println("y");

        } else {
            System.out.println("n");
        }

        // mltiples values kai liye bhi likh sakte hai
        boolean r = true;
        boolean s = true;
        boolean t = true;
        if (r && s && t) {
            System.out.println("yes");

        } else {
            System.out.println("no");
        }
    }
}
