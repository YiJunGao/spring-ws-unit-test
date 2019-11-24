package com.memorynotfound.server;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.ws.test.server.MockWebServiceClient;


import static com.memorynotfound.server.SoapEnvelopeEnhancedCreator.withEnhancedSoapEnvelope;
import static org.junit.Assert.*;
import static org.springframework.ws.test.server.ResponseMatchers.noFault;
import static org.springframework.ws.test.server.ResponseMatchers.soapEnvelope;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SoapServerConfig.class)
public class BeerEndpointTest {

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


