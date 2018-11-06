package com.sg.core;

import java.util.Objects;

public class Npc {
    private String name;
    private Location location;

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
        return name.equals(((Npc) o).name);
        /*if (this == o) return true;
        if (!(o instanceof Npc)) return false;
        Npc npc = (Npc) o;
        return Objects.equals(name, npc.name) &&
                Objects.equals(location, npc.location);*/
    }

    /*@Override
    public int hashCode() {
        return  Objects.hash(name, location);
    }*/

    /*@Override
    public String toString() {
        return "Npc{" +
                "name='" + name + '\'' +
                ", location=" + location +
                '}';
    }*/
}
