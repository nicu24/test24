package com.unifun.orm;

import javax.ws.rs.Path;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;


@Path("/Car")
public class EndPoint {

    @GET
    @Path("list")
    public String getList() {
        return Car.listAll().toString();
    }

    @GET
    @Path("list2")
    public String getList2() {
        return Person.listAll().toString();
    }

    @GET
    @Path("add")
    @Transactional
    public String add(@QueryParam("name") String name, @QueryParam("color") String color) {
        Car bmw = new Car("Red", "Niva");
        bmw.persist();
        return bmw.isPersistent() ? "persisted" : "not persisted";
    }

    @GET
    @Path("changeNameById")
    @Transactional
    public String changeNameById(@QueryParam("carId") long id, @QueryParam("name") String name) {
        Car car = Car.findById(id);
        if (car != null) {
            car.name = name;
            return "success";
        } else {
            return "no such car";
        }
    }



}
