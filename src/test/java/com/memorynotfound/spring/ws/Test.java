package com.memorynotfound.spring.ws;

import com.memorynotfound.server.SoapServerConfig;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.ws.test.server.MockWebServiceClient;
import org.springframework.xml.transform.StringSource;

import javax.xml.transform.Source;
import java.io.IOException;

import static com.memorynotfound.spring.ws.SoapEnvelopeEnhancedCreator.withEnhancedSoapEnvelope;
import static org.springframework.ws.test.server.RequestCreators.withPayload;
import static org.springframework.ws.test.server.ResponseMatchers.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SoapServerConfig.class)
public class Test {

    @Autowired
    private ApplicationContext applicationContext;

    private MockWebServiceClient mockClient;
    /*private Resource xsdSchema = new ClassPathResource("xsd/beers.xsd");*/

    @Before
    public void init(){
        mockClient = MockWebServiceClient.createClient(applicationContext);
    }


    @org.junit.Test
    public void enhancedTest() throws Exception {
        mockClient.sendRequest(withEnhancedSoapEnvelope(applicationContext.getResource("classpath:xml/Request.xml")))
                .andExpect(noFault())
                .andExpect(soapEnvelope(applicationContext.getResource("classpath:xml/Response.xml")));
    }


}
