package org.openapitools.api;


import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Tika JAX-RS Server
 *
 * <p>The Tika server implements [JAX-RS](http://en.wikipedia.org/wiki/JAX-RS) (Java API for RESTful Web Services) to provide web services according to the Representational State Transfer (REST) architectural style. This facilitates a wide varity oif operations and flexibility with regards to both client and server implementations. The officially supported Tika server implementation is packaged using the OpenAPI [jaxrs-cxf generator](https://openapi-generator.tech/docs/generators/jaxrs-cxf]. This work was tracked through [TIKA-3082](https://issues.apache.org/jira/browse/TIKA-3082). <b>N.B.</b> the OpenAPI version always tracks the underlying Tika version to remove uncertainty about which version of Tika is running within the server.
 *
 */
@Path("/")
@Api(value = "/", description = "")
public interface TikaResourceApi  {

    /**
     * GET returns a greeting stating the server is up.
     *
     * HTTP GET returns a greeting stating the server is up. Followed by a PUT request to extract text.
     *
     */
    @GET
    @Path("/tika")
    @Produces({ "text/plain" })
    @ApiOperation(value = "GET returns a greeting stating the server is up.", tags={ "Tika Resource",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "If successful, this operation returns HTTP status code 200, with a greeting to indicate the server is up and you may PUT a file.", response = String.class),
        @ApiResponse(code = 500, message = "An error occurred processing the call.") })
    public String getTika();

    /**
     * GET returns a greeting stating the server is up.
     *
     * HTTP PUTs a document to the /tika service and you get back the extracted text.
     *
     */
    @PUT
    @Path("/tika")
    @Produces({ "text/plain" })
    @ApiOperation(value = "GET returns a greeting stating the server is up.", tags={ "Tika Resource" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "If successful, this operation returns HTTP status code 200, with the extraacted text.", response = String.class),
        @ApiResponse(code = 500, message = "An error occurred processing the call.") })
    public String putTika();
}

