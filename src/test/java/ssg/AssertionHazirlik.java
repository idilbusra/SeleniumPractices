package ssg;

import org.junit.Assert;
import org.junit.Test;

public class AssertionHazirlik {
    int ehliyetYasi = 18;
    int alininYasi = 15;
    int ayseninYasi = 23;

    @Test
    public void test01() {
        // Ali'nin ehliyet alabileceğini test edin.
        Assert.assertTrue("Bu kişi ehliyet alamaz!", alininYasi >= ehliyetYasi);
        //         True                     False             == FAIL
    }

    @Test
    public void test02() {
        // Ayşe'nin ehliyet alamayacağını test edin
        Assert.assertFalse("Bu kişi ehliyet alabilir!", ayseninYasi >= ehliyetYasi);
        //         False                       True            == FAIL

    }

    @Test
    public void test03() {
        // Ehliyet yaşının 18 olduğunu test edin
        Assert.assertEquals(18, ehliyetYasi);
        //           True              True          == PASS
    }

    @Test
    public void test04() {
        // Ali'nin yaşının Ayşe'nin yaşından büyük olduğunu test edin
        Assert.assertTrue(alininYasi > ayseninYasi);
        //         True                     False           == FAIL
    }

    @Test
    public void test05() {
        // Ali'nin yaşının Ayşe'nin yaşından büyük olmadığını test edin
        Assert.assertFalse(alininYasi > ayseninYasi);
        //         False                     False           == PASS
    }
}
