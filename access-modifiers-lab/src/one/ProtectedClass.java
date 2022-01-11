package one;

import two.ProtectedSubClass;

public class ProtectedClass {
    protected long id = 1L;
    protected void printID() {
        System.out.println(this.id);
    }
}
