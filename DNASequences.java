import java.util.*;

/*
See problem: https://leetcode.com/problems/repeated-dna-sequences/
*/
public class DNASequences
{
   public static List<String> findRepeatedDnaSequences(String dna) {
        List<String> seqSet = new ArrayList<String>();
        List<String> foundList = new ArrayList<String>();
        // Need string greater than 10 in length for sequence.
        
        int seqSize = 10;
        if ( dna.length() < seqSize )
          return foundList;
        
                
        for ( int i = 0; i + 9 < dna.length(); i++) {
          String seq =  dna.substring(i,seqSize+i);          
          
          //System.out.println(seq);
          //System.out.println(seq+" "+rest);
          //System.out.println(dna);
          
          if ( seqSet.contains(seq) ) {                                    
            if ( !foundList.contains(seq))
              foundList.add(seq);
          }
          else {
            seqSet.add(seq);
          }
        } 
        return foundList;
    }
  
  
  public final static void main(String S[]) {
    String dna =  "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
    
    List<String> seqList = new ArrayList<String>();
    seqList = findRepeatedDnaSequences(dna);
    Iterator iter = seqList.iterator();
    while (iter.hasNext()) {      // any more element
        // Retrieve the next element, explicitly downcast from Object back to String
        String str = (String)iter.next();
        System.out.println(str);        
    }
            
  }
}
