enum result {
    PASS, FAIL, NO_RESULT; // jitni bar constant define karenge enum kai under utni bar constructor call
                           // hota hai like,--PASS, FAIL, NO_RESULT; thre time i write the output =
                           // Constructor in Enum..*3 times

    // CRATE VARIABLE
    int marks;

    result() // crate a constructor used for some massage

    {
        System.out.println("Constructor in Enum..");

    }

    void setmarks(int marks) {
        this.marks = marks;
    }

    int getmarks() {
        return marks;
    }
}

public class enum_advance_09 {
    public static void main(String[] args) {

        result.PASS.setmarks(50); // print some task-->
        int m1 = result.PASS.getmarks(); // ak class kai under setter and getter work karte hai same type of works
        System.out.println(m1);

    }

}
