package com.sg.core;

import org.springframework.data.annotation.Id;

import java.util.Objects;

public class Npc {

    @Id
    private String id;

    private String name;
    private Location location;

    public Npc() {
    }

    public Npc(String name, Location location) {
        this.name = name;
        this.location = location;
    }

    public Npc(String name, int x, int y) {
        this.name = name;
        this.location = new Location(x, y);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Npc)) return false;
        Npc npc = (Npc) o;
        return id == npc.id &&
                Objects.equals(name, npc.name) &&
                Objects.equals(location, npc.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, location);
    }

    @Override
    public String toString() {
        return "Npc{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", location=" + location +
                '}';
    }
}
