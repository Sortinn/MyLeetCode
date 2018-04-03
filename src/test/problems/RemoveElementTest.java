package test.Problems; 

import Problems.RemoveElement;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import static junit.framework.TestCase.assertEquals;

/** 
* RemoveElement Tester. 
* 
* @author <Authors name> 
* @since <pre>四月 3, 2018</pre> 
* @version 1.0 
*/ 
public class RemoveElementTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
}

    RemoveElement test = new RemoveElement();

    @Test
    public void remove_when_array_is_null() {
        int res = test.removeElement(new int[]{}, 4);
        assertEquals(0, res);
    }

    @Test
    public void remove_when_elements_are_same() {
        int res = test.removeElement(new int[]{1, 1, 1, 1}, 1);
        assertEquals(0, res);
    }

    @Test
    public void remove_when_some_elements_are_same() {
        int res = test.removeElement(new int[]{1, 2, 2, 3}, 2);
        assertEquals(2, res);

    }


} 
