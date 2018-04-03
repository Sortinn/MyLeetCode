package test.Problems; 

import Problems.RemoveLinkListElements;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* RemoveLinkListElements Tester. 
* 
* @author <Authors name> 
* @since <pre>四月 3, 2018</pre> 
* @version 1.0 
*/ 
public class RemoveLinkListElementsTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
}

    class ListNode{
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    RemoveLinkListElements test = new RemoveLinkListElements();

    @Test
    public void remove_general_linklist() {
    }

} 
