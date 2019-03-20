package com.jvm.oom;

public class HeapMemUseTest {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        while (true){
            sb.append(System.currentTimeMillis());
            System.gc();
        }

    }
}
