package org.acme;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/calculation/add")
public class CalculationResource {
    @Path("{num}/{num2}")
    @GET
    public String Calculator(double num, double num2) {
        double result = num + num2;
        return "The result is " + result;
    }
}
