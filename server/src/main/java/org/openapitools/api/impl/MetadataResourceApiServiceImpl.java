package org.openapitools.api.impl;

import org.openapitools.api.*;
import java.util.Map;

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
public class MetadataResourceApiServiceImpl implements MetadataResourceApi {
    /**
     * PUT a document to the metadata extraction resource.
     *
     * PUT a document to the metadata extraction resource.
     *
     */
    public Map<String, String> putDocumentMeta() {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * PUT a document to the metadata extraction resource and get a specific metadata key&#39;s value.
     *
     * PUT a document to the metadata extraction resource and get a specific metadata key&#39;s value.
     *
     */
    public Map<String, String> putDocumentMetaGetKeyValue(String metadataKey) {
        // TODO: Implement...
        
        return null;
    }
    
}

