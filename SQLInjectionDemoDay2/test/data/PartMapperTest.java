package data;

import model.Part;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class PartMapperTest {
    
    PartMapper pm;    
       
    @Before
    public void setUp() {
         pm = new PartMapper();
    }
    

     @Test
     public void getPartbyPno() {
         Part p = pm.getPart(10506);
         String pname = p.getPname();
         String exp = "Land Before Time I";
         assertEquals(exp, pname);
     }
             
     @Test
     public void getPartInjection() {
        String goodSearch = "Land Before Time II";
        String injection =  "Land Before Time II' or '1'='1";
        Part p = pm.getPartByName(goodSearch);
        String pname = p.getPname();
        String exp = "Land Before Time II";
        assertEquals(exp, pname);
     }
     
}
