import static org.junit.Assert.*;
import org.junit.*;
import java.util.Arrays;
import java.util.List;

class IsMoon implements StringChecker {
  public boolean checkString(String s) {
    return s.equalsIgnoreCase("moon");
  }
}

public class TestListExamples {
  @Test(timeout = 500)
  public void testMergeRightEnd() {
    List<String> left = Arrays.asList("a", "b", "c");
    List<String> right = Arrays.asList("a", "d");
    List<String> merged = ListExamples.merge(left, right);
    List<String> expected = Arrays.asList("a", "a", "b", "c", "d");
    assertEquals(expected, merged);
  }

  @Test(timeout = 500)
  public void testMergeLeftEnd() {
    List<String> left = Arrays.asList("a", "b", "c");
    List<String> right = Arrays.asList("a", "d");
    List<String> merged = ListExamples.merge(right, left);
    List<String> expected = Arrays.asList("a", "a", "b", "c", "d");
    assertEquals(expected, merged);
  }

  @Test(timeout = 500)
  public void testFilter() {
    List<String> lst = Arrays.asList("moon", "dabloon", "moons", "moon");
    IsMoon isMoon = new IsMoon();
    List<String> filtered = ListExamples.filter(lst, isMoon);
    List<String> expected = Arrays.asList("moon", "moon");
    assertEquals(expected, filtered);
  }

  @Test(timeout = 500)
  public void testMergeEmpty() {
    List<String> arr1 = Arrays.asList();
    List<String> arr2 = Arrays.asList();
    List<String> merged = ListExamples.merge(arr1, arr2);
    List<String> expected = Arrays.asList();
    assertEquals(expected, merged);
  }

  @Test(timeout = 500)
  public void testMergeNull() {
    List<String> arr1 = null;
    List<String> arr2 = null;
    List<String> merged = ListExamples.merge(arr1, arr2);
    List<String> expected = null;
    assertEquals(expected, merged);
  }
  
}
