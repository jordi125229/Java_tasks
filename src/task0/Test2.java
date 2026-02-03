package task0;

import task01.TaskProtected;

class Test2 extends TaskProtected {
    public void test() {
        System.out.println(name); //bez protected nie daloby rady tego
    }

    public static void main(String[] args) {
        Test2 test = new Test2();
        test.test();
    }
}
