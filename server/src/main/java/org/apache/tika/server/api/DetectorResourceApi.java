/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.tika.server.api;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
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
public interface DetectorResourceApi  {

    /**
     * PUT a document and use the default detector to identify the MIME/media type.
     *
     * PUT a document and use the default detector to identify the MIME/media type. The caveat here is that providing a hint for the filename can increase the quality of detection. Default return is a string of the Media type name.
     *
     */
    @PUT
    @Path("/detect/stream")
    @Consumes("*/*")
    @Produces({ "text/plain" })
    @ApiOperation(value = "PUT a document and use the default detector to identify the MIME/media type.", tags={ "Detector Resource" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "If successful, this operation returns HTTP status code 200, with the body being a string for the detected mime type.", response = String.class),
        @ApiResponse(code = 500, message = "An error occurred processing the call.") })
    public String putStream(final InputStream is,
            @Context HttpHeaders httpHeaders, @Context final UriInfo info);
}

