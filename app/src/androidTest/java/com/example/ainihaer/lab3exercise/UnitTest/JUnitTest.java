package com.example.ainihaer.lab3exercise.UnitTest;

import android.test.ActivityInstrumentationTestCase2;
import com.example.ainihaer.lab3exercise.MainActivity;

/**
 * Created by ainihaer on 4/13/16.
 */
public class JUnitTest extends ActivityInstrumentationTestCase2<MainActivity> {
    MainActivity mainActivity;
    public JUnitTest(){
        super(MainActivity.class);
    }

    public void test_add(){
        mainActivity = getActivity();
        int a = 3;
        int b = 6;
        int add = mainActivity.add(a, b);
        int sum = a + b;
        assertEquals(add, sum);
    }
}
