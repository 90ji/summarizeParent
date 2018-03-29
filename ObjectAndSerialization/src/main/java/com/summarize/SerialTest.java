package com.summarize;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * @Author MoonLion
 * @Date Create in 2017/12/16 0016
 * @Description
 */
public class SerialTest {


    @Test
    public void serial01() throws IOException {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("employee.dat"));
        ArrayList<String> list = new ArrayList<>();


    }
}
