import java.util.*;
class Solution {
    public int superPow(int a, int[] b) {
        String st ="";
        for(int x:b)
        st= st + Integer.toString(x);
     java.math.BigInteger p= new java.math.BigInteger(Integer.toString(a));
      java.math.BigInteger q = new java.math.BigInteger(st);
       java.math.BigInteger r = new java.math.BigInteger("1337");
        java.math.BigInteger res = p.modPow(q,r);
     return res.intValue();
    }
}
