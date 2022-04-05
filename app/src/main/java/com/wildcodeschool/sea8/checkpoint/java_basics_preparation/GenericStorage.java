package com.wildcodeschool.sea8.checkpoint.java_basics_preparation;

import java.util.ArrayList;
import java.util.List;

public class GenericStorage<T> {
    List<ITPerson> itcrowd = new ArrayList<>();

    public boolean storePerson(ITPerson person) {
        return itcrowd.add(person);
    }

    public ITPerson getLastStoredPerson() {
        return itcrowd.get(itcrowd.size()-1);
    }

    public ITPerson getFirstStoredPerson() {
        return itcrowd.get(0);
    }
}