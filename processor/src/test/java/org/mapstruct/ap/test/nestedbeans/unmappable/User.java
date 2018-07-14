/*
 * Copyright MapStruct Authors.
 *
 * Licensed under the Apache License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package org.mapstruct.ap.test.nestedbeans.unmappable;

import java.util.List;
import java.util.Map;

public class User {

    private String name;
    //list of Wheels inside
    private Car car;
    //deep nesting inside Roof->Color
    private House house;
    //unmappable keys/values
    private Dictionary dictionary;
    //collection element's property can't be mapped
    private List<Computer> computers;
    //map value property can't be mapped
    private Map<String, Cat> catNameMap;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public Dictionary getDictionary() {
        return dictionary;
    }

    public void setDictionary(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    public List<Computer> getComputers() {
        return computers;
    }

    public void setComputers(List<Computer> computers) {
        this.computers = computers;
    }

    public Map<String, Cat> getCatNameMap() {
        return catNameMap;
    }

    public void setCatNameMap(Map<String, Cat> catNameMap) {
        this.catNameMap = catNameMap;
    }
}
