/*
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.singhpora.microservicestoolchain.samples;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.Contact;
import io.swagger.annotations.Info;
import io.swagger.annotations.License;
import io.swagger.annotations.SwaggerDefinition;

/**
 * This is the Microservice resource class.
 * See <a href="https://github.com/wso2/msf4j#getting-started">https://github.com/wso2/msf4j#getting-started</a>
 * for the usage of annotations.
 *
 * @since 1.0.0-SNAPSHOT
 */

/**
 * This service will be available at.
 * http://localhost:8082/empservice
 */

@Api(value = "empservice")
@SwaggerDefinition(
        info = @Info(
                title = "EmpMicroService Swagger Definition", version = "1.0",
                description = "Employee service",
                license = @License(name = "Apache 2.0", url = "http://www.apache.org/licenses/LICENSE-2.0"),
                contact = @Contact(
                        name = "JV Singh",
                        email = "jv@singhpora.com",
                        url = "http://www.singhpora.com"
                ))
)

@Path("/empservice")
public class EmpMicroService {

	
	/**
     * Retrieve Employee information by ID.
     * http://localhost:8082/empservice/E001
     *
     * @param empId Employee ID.
     * @return Response
     */
    @GET
    @Path("/{symbol}")
    @Produces({"application/json", "text/xml"})
    @ApiOperation(
            value = "Return Employee information corresponding to the empId",
            notes = " HTTP 500 if no matching Employee found")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Employee information found"),
            @ApiResponse(code = 500, message = "Not found")})
    public String get() {
        // TODO: Implementation for HTTP GET request
        System.out.println("GET invoked");
        return "Hello World from the EmpService";
    }

    @POST
    @Path("/")
    public void post() {
        // TODO: Implementation for HTTP POST request
        System.out.println("POST invoked");
    }

    @PUT
    @Path("/")
    public void put() {
        // TODO: Implementation for HTTP PUT request
        System.out.println("PUT invoked");
    }

    @DELETE
    @Path("/")
    public void delete() {
        // TODO: Implementation for HTTP DELETE request
        System.out.println("DELETE invoked");
    }
}
