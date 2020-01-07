package qiang.algori;

import org.junit.Test;
import qiang.base.algori.DP;
public class DPTest {

    @Test
    public void dp1() {

        System.out.println(DP.dp1(6, 6));
    }

    @Test
    public void minDistance() {
        String str = "abcd";
        String str2 = "efg";

        System.out.println(DP.minDistance(str, str2));

    }
}