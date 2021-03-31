package za.ac.cput;
/*
 author marco thimanaga mulonday i
 219049505
 

 */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class StudentTest {
    private Student student1;
    private Student student2;
    private Student student3;

    StudentTest() {
    }

    @BeforeEach
    void setUp() {
        this.student1 = new Student();
        this.student2 = new Student();
        this.student3 = new Student();
        this.student1 = this.student2;
    }

    // this is  test for object identuty
    @Test
    public void testIdentity() {
        Assertions.assertSame(this.student1, this.student2);
    }
  //this is test for object  equality
    @Test
    public void testEquality() {
        Assertions.assertEquals(this.student1, this.student2);
    }

   //  this is the test for test fail
    @Test
    public void testFailor() {
        Assertions.assertEquals(this.student1, this.student2);
        Assertions.fail("this will faill");
    }
  //this is the  test for Disabling Tests
    @Disabled("Disabled until CustomerService is up!")
    @Test
    void testCustomerServiceGet() {
        Assertions.assertEquals(this.student1, this.student2);
    }
}