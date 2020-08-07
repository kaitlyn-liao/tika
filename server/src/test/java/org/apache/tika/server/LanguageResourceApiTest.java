/**
 * Tika JAX-RS Server
 * The Tika server implements [JAX-RS](http://en.wikipedia.org/wiki/JAX-RS) (Java API for RESTful Web Services) to provide web services according to the Representational State Transfer (REST) architectural style. This facilitates a wide varity oif operations and flexibility with regards to both client and server implementations. The officially supported Tika server implementation is packaged using the OpenAPI [jaxrs-cxf generator](https://openapi-generator.tech/docs/generators/jaxrs-cxf]. This work was tracked through [TIKA-3082](https://issues.apache.org/jira/browse/TIKA-3082). <b>N.B.</b> the OpenAPI version always tracks the underlying Tika version to remove uncertainty about which version of Tika is running within the server.
 *
 * The version of the OpenAPI document: 2.0.0-SNAPSHOT
 * Contact: dev@tika.apache.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.tika.server;
package org.openapitools.api;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.apache.cxf.jaxrs.client.ClientConfiguration;
import org.apache.cxf.jaxrs.client.WebClient;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.apache.cxf.jaxrs.lifecycle.SingletonResourceProvider;
import org.apache.tika.server.resource.LanguageResource;
import org.apache.tika.server.writer.TarWriter;
import org.apache.tika.server.writer.ZipWriter;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Tika JAX-RS Server
 *
 * <p>The Tika server implements [JAX-RS](http://en.wikipedia.org/wiki/JAX-RS) (Java API for RESTful Web Services) to provide web services according to the Representational State Transfer (REST) architectural style. This facilitates a wide varity oif operations and flexibility with regards to both client and server implementations. The officially supported Tika server implementation is packaged using the OpenAPI [jaxrs-cxf generator](https://openapi-generator.tech/docs/generators/jaxrs-cxf]. This work was tracked through [TIKA-3082](https://issues.apache.org/jira/browse/TIKA-3082). <b>N.B.</b> the OpenAPI version always tracks the underlying Tika version to remove uncertainty about which version of Tika is running within the server.
 *
 * API tests for LanguageResourceApi
 */
public class LanguageResourceApiTest extends CXFTestBase{


    private LanguageResourceApi api;
    private static final String LANG_PATH = "/language";
  	private static final String LANG_STREAM_PATH = LANG_PATH + "/stream";
  	private static final String LANG_STRING_PATH = LANG_PATH + "/string";
  	private static final String ENGLISH_STRING = "This is English!";
  	private static final String FRENCH_STRING = "c’est comme ci comme ça";

    @Before
    public void setup() {
        JacksonJsonProvider provider = new JacksonJsonProvider();
        List providers = new ArrayList();
        providers.add(provider);

        api = JAXRSClientFactory.create("https://localhost:9998", LanguageResourceApi.class, providers);
        org.apache.cxf.jaxrs.client.Client client = WebClient.client(api);

        ClientConfiguration config = WebClient.getConfig(client);
    }

    @Override
  	protected void setUpResources(JAXRSServerFactoryBean sf) {
  		sf.setResourceClasses(LanguageResource.class);
  		sf.setResourceProvider(LanguageResource.class,
  				new SingletonResourceProvider(new LanguageResource()));
  	}

  	@Override
  	protected void setUpProviders(JAXRSServerFactoryBean sf) {
  		List<Object> providers = new ArrayList<Object>();
  		providers.add(new TarWriter());
  		providers.add(new ZipWriter());
  		providers.add(new TikaServerParseExceptionMapper(false));
  		sf.setProviders(providers);
  	}

  	@Test
  	public void testDetectEnglishString() throws Exception {
  		String url = endPoint + LANG_STRING_PATH;
  		Response response = WebClient.create(url).type("text/plain")
  				.accept("text/plain").put(ENGLISH_STRING);
  		assertNotNull(response);
  		String readLang = getStringFromInputStream((InputStream) response
  				.getEntity());
  		assertEquals("en", readLang);
  	}

  	@Test
  	public void testDetectFrenchString() throws Exception {
  		String url = endPoint + LANG_STRING_PATH;
  		Response response = WebClient.create(url).type("text/plain")
  				.accept("text/plain").put(FRENCH_STRING);
  		assertNotNull(response);
  		String readLang = getStringFromInputStream((InputStream) response
  				.getEntity());
  		assertEquals("fr", readLang);
  	}

  	@Test
  	public void testDetectEnglishFile() throws Exception {
  		String url = endPoint + LANG_STREAM_PATH;
  		Response response = WebClient.create(url).type("text/plain")
  				.accept("text/plain")
  				.put(ClassLoader.getSystemResourceAsStream("english.txt"));
  		assertNotNull(response);
  		String readLang = getStringFromInputStream((InputStream) response
  				.getEntity());
  		assertEquals("en", readLang);
  	}

  	@Test
  	public void testDetectFrenchFile() throws Exception {
  		String url = endPoint + LANG_STREAM_PATH;
  		Response response = WebClient.create(url).type("text/plain")
  				.accept("text/plain")
  				.put(ClassLoader.getSystemResourceAsStream("french.txt"));
  		assertNotNull(response);
  		String readLang = getStringFromInputStream((InputStream) response
  				.getEntity());
  		assertEquals("fr", readLang);
  	}

    /**
     * POST a UTF-8 text file to the LanguageIdentifier to identify its language.
     *
     * POST a UTF-8 text file to the LanguageIdentifier to identify its language. &lt;b&gt;NOTE&lt;/b&gt;: This endpoint does not parse files.  It runs detection on a UTF-8 string.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postLanguageStreamTest() {
        //String response = api.postLanguageStream();
        //assertNotNull(response);
        // TODO: test validations


    }

    /**
     * POST a text string to the LanguageIdentifier to identify its language.
     *
     * POST a text string to the LanguageIdentifier to identify its language.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postLanguageStringTest() {
        //String response = api.postLanguageString();
        //assertNotNull(response);
        // TODO: test validations


    }

    /**
     * PUT a UTF-8 text file to the LanguageIdentifier to identify its language.
     *
     * POST a UTF-8 text file to the LanguageIdentifier to identify its language. &lt;b&gt;NOTE&lt;/b&gt;: This endpoint does not parse files.  It runs detection on a UTF-8 string.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putLanguageStreamTest() {
        //String response = api.putLanguageStream();
        //assertNotNull(response);
        // TODO: test validations


    }

    /**
     * PUT a text string to the LanguageIdentifier to identify its language.
     *
     * PUT a text string to the LanguageIdentifier to identify its language.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putLanguageStringTest() {
        //String response = api.putLanguageString();
        //assertNotNull(response);
        // TODO: test validations


    }

}
