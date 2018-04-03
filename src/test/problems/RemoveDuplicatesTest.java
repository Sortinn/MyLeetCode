package test.Problems;

import Problems.RemoveDuplicates;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static junit.framework.TestCase.assertEquals;

/**
 * RemoveDuplicates Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>四月 3, 2018</pre>
 */
public class RemoveDuplicatesTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }


    RemoveDuplicates test = new RemoveDuplicates();

    @Test
    public void contain_one_element() throws Exception {
        int result = test.removeDuplicates(new int[]{1});
        assertEquals(1, result);
    }

    @Test
    public void contain_duplicate_elements() throws Exception {
        int result = test.removeDuplicates(new int[]{2, 2, 2, 2});
        assertEquals(1, result);
    }

    @Test
    public void contain_some_duplicate_elements() throws Exception {
        int res = test.removeDuplicates(new int[]{1, 2, 2, 3, 4, 4});
        assertEquals(4, res);
    }

    @Test
    public void contain_no_duplicate_element() throws Exception {
        int res = test.removeDuplicates(new int[]{0, 1, 2, 3, 4, 5});
        assertEquals(6, res);
    }

    @Test
    public void contain_no_element() throws Exception {
        int res = test.removeDuplicates(new int[]{});
        assertEquals(0, res);
    }

    @Test
    public void contain_one_duplicate_element_many_times()throws Exception {
        int res = test.removeDuplicates(new int[]{1, 2, 2, 2});
        assertEquals(2, res);
    }

    @Test
    public void i_dont_know_why() {
        int res = test.removeDuplicates(new int[]{1, 1, 2});
        assertEquals(2, res);

    }

} 
