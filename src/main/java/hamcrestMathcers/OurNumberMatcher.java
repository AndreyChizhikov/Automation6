package hamcrestMathcers;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeDiagnosingMatcher;

public class OurNumberMatcher extends TypeSafeDiagnosingMatcher<Integer> {
    @Override
    protected boolean matchesSafely(Integer integer, Description description) {
        int i  = integer.intValue();
        description.appendText("was ")
                .appendValue(i)
                .appendText(", which is not what we need");
        return (i> 5 && i<=7 && i != 6);
    }

    @Override
    public void describeTo(Description description) {
            description.appendText("GreaterThan 5 and LessThanOrEqual to 7 and not EqualTo 6");
    }

    public static OurNumberMatcher  isOurNumber()
    {
        return new OurNumberMatcher();
    }
}
