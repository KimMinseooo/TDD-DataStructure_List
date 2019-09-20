package List;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class MyListTest {

    @Test
    public void testMyList(){
        List<String> myList = new MyList<String>();
        assertThat(myList).isInstanceOf(MyList.class);
        assertThat(myList).isInstanceOf(List.class);
    }

    @Test
    public void testMyListAdd(){
        List<String> myList = new MyList<String>();
        myList.add("Java");
        myList.add("IntelliJ");
        myList.add("LINUX");
        assertThat(myList.size()).isEqualTo(3);

        myList.add(1,"Minseo");
        assertThat(myList.get(1)).isEqualTo("Minseo");
    }

    @Test
    public void testMyListAddAll(){
        List<String> myList = new MyList<String>();
        List<String> list =new MyList<String>();

        myList.add("Java");
        myList.add("IntelliJ");
        myList.add("LINUX");
        list.addAll(myList);
        assertThat(myList.size()).isEqualTo(3);
        list.addAll(1,myList);
        assertThat(list.size()).isEqualTo(6);
        assertThat(list.get(1)).isEqualTo("Java");
    }

    @Test
    public void testMyListClear(){
    List<String> myList = new MyList<String>();
        myList.add("Java");
        myList.add("IntelliJ");
        myList.add("LINUX");
        myList.clear();
        assertThat(myList.size()).isEqualTo(0);
    }

    @Test
    public void testMyListContains(){
    List<String> myList = new MyList<String>();
        myList.add("Java");
        myList.add("IntelliJ");
        myList.add("LINUX");
        assertThat(myList.contains("Java")).isEqualTo(true);
        assertThat(myList.contains("IntelliJ")).isEqualTo(true);
        assertThat(myList.contains(null)).isEqualTo(true);
        myList.add(null);
        assertThat(myList.contains(null)).isEqualTo(true);
    }

    @Test
    public void testMyListContainsAll(){
        List<String> myList = new MyList<String>();
        myList.add("Java");
        myList.add("IntelliJ");
        myList.add("LINUX");
        List<String> list = new MyList<String>();
        list.addAll(myList);

        assertThat(list.containsAll(myList)).isEqualTo(true);
    }

    @Test
    public void testMyListIndexOf(){
        List<String> myList = new MyList<String>();
        myList.add("Java");
        myList.add("IntelliJ");
        myList.add("LINUX");
        assertThat(myList.indexOf("Java")).isEqualTo(0);
        assertThat(myList.indexOf("LINUX")).isEqualTo(2);
        assertThat(myList.lastIndexOf("Java")).isEqualTo(2);
    }

    @Test
    public void testMyListRemove(){
        List<String> myList = new MyList<String>();
        myList.add("Java");
        myList.add("IntelliJ");
        myList.add("LINUX");
        myList.remove("Java");
        assertThat(myList.size()).isEqualTo(2);

        myList.remove(1);
        assertThat(myList.size()).isEqualTo(1);
        assertThat(myList.get(0)).isEqualTo("IntelliJ");
    }

    @Test
    public void testMyListRemoveAll(){
        List<String> myList = new MyList<String>();
        myList.add("Java");
        myList.add("IntelliJ");
        myList.add("LINUX");
        myList.removeAll(myList);
        assertThat(myList.size()).isEqualTo(0);
    }
}