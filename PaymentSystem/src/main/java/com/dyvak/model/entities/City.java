package com.dyvak.model.entities;

/**
 * Created by Dyvak on 15.12.2016.
 */
public class City {
    private int id;
    private String name;

    public City(int id, String name){
        this.id = id;
        this.name = name;
    }

    public City(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        City city = (City) o;

        if (id != city.id) return false;
        if (name != null ? !name.equals(city.name) : city.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    public static class Builder{
        City instance = new City();

        public Builder setName(String name){
            instance.name = name;
            return this;
        }

        public Builder setName(String name, boolean isNull){
            if(!isNull){
                instance.name = name;
            }else{
                instance.name = null;
            }
            return this;
        }

        public Builder setId(int id){
            instance.id = id;
            return this;
        }

        public City build(){
            return instance;
        }
    }
}
