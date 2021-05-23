import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DateTest{

  @Test
  void nextDate_sample() {
    Date d = new Date(2020,5,3);
    assertEquals(new Date(2020,5,4), d.nextDate());
  }

  @Test
  void nextDate_test1() {
    Date d = new Date(1700,6,20);
    assertEquals(new Date(1700,6,21), d.nextDate());
  }

  @Test
  void nextDate_test2() {
    Date d = new Date(2005,4,15);
    assertEquals(new Date(2005,4,16), d.nextDate());
  }

  @Test
  void nextDate_test3() {
    Date d = new Date(1901,7,20);
    assertEquals(new Date(1901,7,21), d.nextDate());
  }

  @Test
  void nextDate_test4() {
    Date d = new Date(3456,3,27);
    assertEquals(new Date(3456,3,28), d.nextDate());
  }

  @Test
  void nextDate_test5() {
    Date d = new Date(1500,2,17);
    assertEquals(new Date(1500,2,18), d.nextDate());
  }

  @Test
  void nextDate_test6() {
    Date d = new Date(1700,6,29);
    assertEquals(new Date(1700,6,30), d.nextDate());
  }

  @Test
  void nextDate_test7() {
    Date d = new Date(1800,11,29);
    assertEquals(new Date(1800,11,30), d.nextDate());
  }

  @Test
  void nextDate_test8() {
    Date d = new Date(3453,1,29);
    assertEquals(new Date(3453,1,30), d.nextDate());
  }

  @Test
  void nextDate_test9() {
    Date d = new Date(444,2,29);
    assertEquals(new Date(444,3,1), d.nextDate());
  }

  @Test
  void nextDate_test10() {
    Date d = new Date(2005,4,30);
    assertEquals(new Date(2005,5,1), d.nextDate());
  }

  @Test
  void nextDate_test11() {
    Date d = new Date(3453,1,30);
    assertEquals(new Date(3453,1,31), d.nextDate());
  }

  @Test
  void nextDate_test12() {
    Date d = new Date(3456,3,30);
    assertEquals(new Date(3456,03,31), d.nextDate());
  }

  @Test
  void nextDate_test13() {
    Date d = new Date(1901,7,31);
    assertEquals(new Date(1901,8,1), d.nextDate());
  }

  @Test
  void nextDate_test14() {
    Date d = new Date(3453,1,31);
    assertEquals(new Date(3453,2,1), d.nextDate());
  }

  @Test
  void nextDate_test15() {
    Date d = new Date(3456,12,31);
    assertEquals(new Date(3457,01,01), d.nextDate());
  }

  @Test
  void nextDate_test16() {
  	assertThrows(IllegalArgumentException.class, () -> new Date(1500,2,31));
  }

  @Test
  void nextDate_test17() {
    assertThrows(IllegalArgumentException.class, () -> new Date(1500,2,29));
  }

  @Test
  void nextDate_test18() {
    assertThrows(IllegalArgumentException.class, () -> new Date(-1,10,20));
  }

  @Test
  void nextDate_test19() {
    assertThrows(IllegalArgumentException.class, () -> new Date(1458,15,12));
  }

  @Test
  void nextDate_test20() {
    assertThrows(IllegalArgumentException.class, () -> new Date(1975,6,-50));
  }

}