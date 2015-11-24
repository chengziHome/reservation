package com.chengzi.reservation.bean;

/**
 * Created by 橙子 on 2015/11/24.
 */
public class Order {
    private int id;
    private Customer customer;
    private Meal meal;
    private String date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Meal getMeal() {
        return meal;
    }

    public void setMeal(Meal meal) {
        this.meal = meal;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (id != order.id) return false;
        if (customer != null ? !customer.equals(order.customer) : order.customer != null) return false;
        if (meal != null ? !meal.equals(order.meal) : order.meal != null) return false;
        if (date != null ? !date.equals(order.date) : order.date != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (customer != null ? customer.hashCode() : 0);
        result = 31 * result + (meal != null ? meal.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", customer=" + customer +
                ", meal=" + meal +
                ", date='" + date + '\'' +
                '}';
    }
}
