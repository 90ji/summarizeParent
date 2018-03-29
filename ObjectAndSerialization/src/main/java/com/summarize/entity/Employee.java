package com.summarize.entity;

import java.io.*;
import java.math.BigDecimal;

/**
 * @Author MoonLion
 * @Date Create in 2017/12/16 0016
 * @Description
 */
public class Employee implements Serializable,Cloneable{

    private static final long serialVersionUID = 186000861558846397L;
    private Long id;
    private String name;
    private BigDecimal balance;
    private Integer age;

    public Employee() {

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        try {
            ByteArrayOutputStream bout = new ByteArrayOutputStream();
            ObjectOutputStream out = new ObjectOutputStream(bout);
            out.writeObject(this);
            out.close();

            ByteArrayInputStream bin = new ByteArrayInputStream(bout.toByteArray());
            ObjectInputStream in = new ObjectInputStream(bin);
            Object ret = in.readObject();
            in.close();
            return ret;
        } catch (IOException | ClassNotFoundException e) {
            return null;
        }
    }

    public Employee(Long id, String name, BigDecimal balance, Integer age) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
