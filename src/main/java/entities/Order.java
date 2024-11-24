package entities;

import ORM.anotations.Column;
import ORM.anotations.Entity;
import ORM.anotations.Id;

import java.time.LocalDate;

@Entity(name= "orders")
public class Order {
    @Id
    @Column(name="id")
    private long Id;
    @Column(name="number")
    private String number;
    @Column(name="date")
    private LocalDate date;

    public Order(){}

    public Order(String number, LocalDate date) {
        this.number = number;
        this.date = date;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
