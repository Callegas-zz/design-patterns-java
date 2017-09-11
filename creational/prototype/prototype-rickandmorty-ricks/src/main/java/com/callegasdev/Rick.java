package com.callegasdev;

public abstract class Rick implements Cloneable {
    private String id;
    protected String whoRick;

    abstract void sayHello();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWhoRick() {
        return whoRick;
    }

    public Object clone() {
        Object clone = null;

        try{
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }

}
