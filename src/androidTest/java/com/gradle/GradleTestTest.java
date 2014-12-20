package com.gradle;

import android.test.ActivityInstrumentationTestCase2;

/**
 * This is a simple framework for a test of an Application.  See
 * {@link android.test.ApplicationTestCase ApplicationTestCase} for more information on
 * how to write and extend Application tests.
 * <p/>
 * To run this test, you can type:
 * adb shell am instrument -w \
 * -e class com.gradle.GradleTestTest \
 * com.gradle.tests/android.test.InstrumentationTestRunner
 */
public class GradleTestTest extends ActivityInstrumentationTestCase2<GradleTest> {

    public GradleTestTest() {
        super("com.gradle", GradleTest.class);
    }

}
