/*
 * Decompiled with CFR 0_114.
 */
package methods;

public class TestCaseFailed
extends Exception {
    private static final long serialVersionUID = 1;
    String message = null;

    public TestCaseFailed() {
    }

    public TestCaseFailed(String message) {
        super(message);
        this.message = message;
    }
}

