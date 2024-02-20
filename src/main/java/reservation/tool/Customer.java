package reservation.tool;

import java.util.UUID;

import clojure.uuid__init;

public class Customer {
    private String name;
    private UUID uuid;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

