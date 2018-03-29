package com.summarize.entity;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

import java.io.*;
import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * @Author MoonLion
 * @Date Create in 2017/12/16 0016
 * @Description
 */
public class EmployeeTest {

    @Test
    public void writeTest() throws IOException {

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("employee.dat"));
        Employee aaa = new Employee(123L, "aaa", new BigDecimal(123.12), 12);
        Employee bbb = new Employee(123L, "aaa", new BigDecimal(123.12), 12);
        out.writeObject(aaa);
        out.writeObject(bbb);
    }

    @Test
    public void readTest() throws IOException, ClassNotFoundException {

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("employee.dat"));
        Employee aaa = (Employee)in.readObject();
        Employee bbb = (Employee)in.readObject();
        System.out.println(JSON.toJSONString(aaa));
        System.out.println(aaa==bbb);
        System.out.println(aaa.equals(bbb));
    }

    @Test
    public void cloneTest() throws CloneNotSupportedException {
        Employee aaa = new Employee(123L, "aaa", new BigDecimal(123.12), 12);
        Employee bbb = (Employee)aaa.clone();
        System.out.println(JSON.toJSONString(bbb));
        System.out.println(aaa==bbb);
        System.out.println(aaa.equals(bbb));
    }

}