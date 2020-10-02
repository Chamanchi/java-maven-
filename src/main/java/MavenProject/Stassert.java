package MavenProject;

import org.junit.Assert;
import org.junit.Test;

public class Stassert {
    import org.testng.Assert;
import org.testng.annotations.Test;

    public class HardAssertion {

        String className = "HardAssertion";
        SoftAssert softAssert = new SoftAssert();
        String className = "SoftAssertion";

        @Test
        public void test_UsingHardAssertion() {
            Assert.assertTrue(true == true);
            Assert.assertEquals("HardAssertion", "HardAssertion");
            Assert.assertEquals(className, "HardAssertion");
            System.out.println("Successfully passed!");
        }


        @Test
        public void test_UsingSoftAssertion() {
            softAssert.assertTrue(true == true);
            softAssert.assertEquals("SoftAssert", "SoftAssertion");
            softAssert.assertEquals(className, "SoftAssertion");
            System.out.println("Last statement gets executed!");
            softAssert.assertAll();
        }
    }
}
