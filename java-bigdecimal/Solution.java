import java.math.BigDecimal;
import java.util.*;
class Solution{

    public static void main(String []argh)
    {
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++)
        {
            s[i]=sc.next();
        }
        
        List<Pair<BigDecimal, String>> arr = new ArrayList<>();
        for(int i = 0; i < n; i++) arr.add(new Pair<BigDecimal, String>(new BigDecimal(s[i]), s[i]));
        Collections.sort(arr, new Comparator<Pair<BigDecimal, String>>() {
            
            public int compare(Pair<BigDecimal, String> p1, Pair<BigDecimal, String> p2) {
                return -1 * p1.getKey().compareTo(p2.getKey());
            }
            
        } );
        
        for(Pair<BigDecimal, String> p : arr)
            System.out.println(p.getValue());
        
    }


}
class Pair<K, V> {
    
    final private K key;
    final private V value;
    
    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }
    
    public K getKey() { return key; }
    public V getValue() { return value; }
    
}
