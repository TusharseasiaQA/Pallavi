import org.testng.annotations.*;

public class Sample {
    @Test
    void S1() {
        System.out.println("FIRST SAMPLE");
    }

    @Test
    void S2() {
        System.out.println("SECOND SAMPLE");
    }

    @BeforeMethod
    void  s3() {
        System.out.println("THIS WILL PRINT BEFORE EACH TEST");
    }

    @AfterMethod
    void s4(){
        System.out.println("THIS WILL PRINT AFTER EACH TEST");
    }
  @BeforeClass
        void s5(){
            System.out.println("THIS WILL EXECUTE BEFORE CLASS");
      }

      @AfterClass
           public    void s6(){
        System.out.println("THIS WILL EXECUTE AFTER THE CLASS");
    }

        @BeforeTest
                void s7() {
              System.out.println("THIS WILL RUN BEFORE  ALL TEST");
          }

          @AfterTest
    void s8(){
        System.out.println("THIS WILL RUN AFTER ALL TEST");

          }
@BeforeSuite
    void s9(){
        System.out.println("THIS WILL RUN BEFORE SUITE");
}
@AfterSuite
    void s10(){
        System.out.println("THIS WILL RUN AFTER SUITE");
}

  }


