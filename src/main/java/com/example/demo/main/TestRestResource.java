package com.example.demo.main;


import com.example.demo.bean.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Api("resource")
@Path("/resource")
public class TestRestResource {

    @GET
    @Path("/getUser")
    @Produces(MediaType.APPLICATION_JSON)
    @ApiOperation("get user")
    public User getUser() {
        User user = new User();
        user.setUserName("popo");
        user.setAge(29);
        user.setWeight(150);
        return user;
    }

}