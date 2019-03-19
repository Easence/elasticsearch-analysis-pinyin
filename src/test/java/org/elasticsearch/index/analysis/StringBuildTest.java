package org.elasticsearch.index.analysis;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class StringBuildTest {
    @Test
    public void TestPinyinFunction() {
//        List<StringBuilder> l = new ArrayList<>();
        StringBuilder a = new StringBuilder("abc");
        StringBuilder b = a.append("bc");
//        l.add(a);
//        l.get(0).append("bc");
        System.out.println(a);
        System.out.println(b);
    }
}
