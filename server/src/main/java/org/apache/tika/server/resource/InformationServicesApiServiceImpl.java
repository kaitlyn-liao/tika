package org.apache.tika.server.resource;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;
import org.apache.tika.detect.DefaultDetector;
import org.apache.tika.server.InformationServicesApi;
import org.openapitools.model.ParsersORParsersDetails;

import io.swagger.annotations.Api;

/**
 * Tika JAX-RS Server
 *
 * <p>The Tika server implements [JAX-RS](http://en.wikipedia.org/wiki/JAX-RS) (Java API for RESTful Web Services) to provide web services according to the Representational State Transfer (REST) architectural style. This facilitates a wide varity oif operations and flexibility with regards to both client and server implementations. The officially supported Tika server implementation is packaged using the OpenAPI [jaxrs-cxf generator](https://openapi-generator.tech/docs/generators/jaxrs-cxf]. This work was tracked through [TIKA-3082](https://issues.apache.org/jira/browse/TIKA-3082). <b>N.B.</b> the OpenAPI version always tracks the underlying Tika version to remove uncertainty about which version of Tika is running within the server.
 *
 */
public class InformationServicesApiServiceImpl implements InformationServicesApi {
    /**
     * GET information about the top level detector to be used, and any child detectors within it.
     *
     * The top level detector to be used, and any child detectors within it. Available as plain text, json or human readable HTML
     *
     */
    public DefaultDetector getDetectors() {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * GET a list of all server endpoints
     *
     * Hitting the route of the server will give a basic report of all the endpoints defined in the server, what URL they have etc.
     *
     */
    public List<Object> getEndpoints() {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * GET all mime types, their aliases, their supertype, and the parser.
     *
     * Mime types, their aliases, their supertype, and the parser. Available as plain text, json or human readable HTML.
     *
     */
    public List<Object> getMimetypes() {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * GET all of the parsers currently available.
     *
     * Lists all of the parsers currently available.
     *
     */
    public ParsersORParsersDetails getParsers() {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * GET all the available parsers, along with what mimetypes they support.
     *
     * List all the available parsers, along with what mimetypes they support.
     *
     */
    public ParsersORParsersDetails getParsersDetails() {
        // TODO: Implement...
        
        return null;
    }
    
}

