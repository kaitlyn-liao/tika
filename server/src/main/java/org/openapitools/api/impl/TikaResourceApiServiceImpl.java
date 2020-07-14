package org.openapitools.api.impl;

import org.openapitools.api.*;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;

/**
 * Tika JAX-RS Server
 *
 * <p>The Tika server implements [JAX-RS](http://en.wikipedia.org/wiki/JAX-RS) (Java API for RESTful Web Services) to provide web services according to the Representational State Transfer (REST) architectural style. This facilitates a wide varity oif operations and flexibility with regards to both client and server implementations. The officially supported Tika server implementation is packaged using the OpenAPI [jaxrs-cxf generator](https://openapi-generator.tech/docs/generators/jaxrs-cxf]. This work was tracked through [TIKA-3082](https://issues.apache.org/jira/browse/TIKA-3082). <b>N.B.</b> the OpenAPI version always tracks the underlying Tika version to remove uncertainty about which version of Tika is running within the server.
 *
 */
public class TikaResourceApiServiceImpl implements TikaResourceApi {
    /**
     * GET returns a greeting stating the server is up.
     *
     * HTTP GET returns a greeting stating the server is up. Followed by a PUT request to extract text.
     *
     */
    public String getTika() {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * GET returns a greeting stating the server is up.
     *
     * HTTP PUTs a document to the /tika service and you get back the extracted text.
     *
     */
    public String putTika() {
        // TODO: Implement...
        
        return null;
    }
    
}

