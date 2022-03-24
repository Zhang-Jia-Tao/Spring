package com.bjpowernode.domain;

public class goods {
    private Integer id;
    private String name;
    private Integer amount;
    private Float privace;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Float getPrivace() {
        return privace;
    }

    public void setPrivace(Float privace) {
        this.privace = privace;
    }

    @Override
    public String toString() {
        return "goods{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                ", privace=" + privace +
                '}';
    }
}
