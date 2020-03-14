package model;

import java.util.Set;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;

public class Cart {

private long id;
private double total;
private String name;
private Set<Items> item;
public long getId() {
return id;
}
public void setId(long id) {
this.id = id;
}
public double getTotal() {
return total;
}
public void setTotal(double total) {
this.total = total;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public Set<Items> getItem() {
return item;
}
public void setItem(Set<Items> item) {
this.item = item;
}

}
