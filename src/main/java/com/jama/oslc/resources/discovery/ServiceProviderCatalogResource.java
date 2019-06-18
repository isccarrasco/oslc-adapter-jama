/*
 * MIT License
 * 
 * Copyright 2018 Koneksys
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 * 
 * */

package com.jama.oslc.resources.discovery;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.jama.oslc.model.Constants;
import com.jama.oslc.model.JamaServiceProvider;
import com.jama.oslc.model.JamaServiceProviderCatalog;
import org.eclipse.lyo.oslc4j.core.annotation.OslcService;
import org.eclipse.lyo.oslc4j.core.model.OslcConstants;
import org.eclipse.lyo.oslc4j.core.model.OslcMediaType;
import org.eclipse.lyo.oslc4j.core.model.ServiceProvider;
import org.eclipse.lyo.oslc4j.core.model.ServiceProviderCatalog;
import org.jboss.resteasy.spi.ResteasyProviderFactory;

import java.net.URI;
import java.net.URISyntaxException;


@Path(OslcConstants.PATH_SERVICE_PROVIDER_CATALOG)
@OslcService(OslcConstants.OSLC_CORE_DOMAIN)
public class ServiceProviderCatalogResource {

    @GET
    @Produces({OslcMediaType.APPLICATION_RDF_XML, OslcMediaType.APPLICATION_XML})
    // public JamaServiceProviderCatalog getServiceProviderCatalog(@Context ServletContext context) throws URISyntaxException {
    // public ServiceProviderCatalog getServiceProviderCatalog(@Context ServletContext context) throws URISyntaxException {
    public Response getServiceProviderCatalog(@Context ServletContext context) {

        StringBuilder builder = new StringBuilder();

        builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<rdf:RDF\n" +
                "    xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n" +
                "    xmlns:rmWorkflow=\"http://www.ibm.com/xmlns/rdm/workflow/\"\n" +
                "    xmlns:dcterms=\"http://purl.org/dc/terms/\"\n" +
                "    xmlns:dc=\"http://purl.org/dc/elements/1.1/\"\n" +
                "    xmlns:jfs=\"http://jazz.net/xmlns/foundation/1.0/\"\n" +
                "    xmlns:h=\"http://www.w3.org/TR/REC-html40\"\n" +
                "    xmlns:xs=\"http://schema.w3.org/xs/\"\n" +
                "    xmlns:oslc=\"http://open-services.net/ns/core#\"\n" +
                "    xmlns:rm=\"http://www.ibm.com/xmlns/rdm/rdf/\"\n" +
                "    xmlns:jp=\"http://jazz.net/xmlns/prod/jazz/process/1.0/\"\n" +
                "    xmlns:rmTypes=\"http://www.ibm.com/xmlns/rdm/types/\">\n" +
                "  <oslc:ServiceProviderCatalog rdf:about=\"http://192.168.1.91:8080/jama-oslc-adapter/services/serviceProviderCatalog\">\n" +
                "    <dcterms:title rdf:parseType=\"Literal\">Jama OSLC Adapter Service Provider Catalog</dcterms:title>\n" +
                "    <oslc:serviceProvider>\n" +
                "      <oslc:ServiceProvider rdf:about=\"http://192.168.1.91:8080/jama-oslc-adapter/services/serviceProvider/Semiconductor_Sample_Set\">\n" +
                "        <oslc:details rdf:resource=\"http://192.168.1.91:8080/jama-oslc-adapter/services/serviceProvider/Semiconductor_Sample_Set/details\"/>\n" +
                "        <jp:consumerRegistry rdf:resource=\"http://192.168.1.91:8080/jama-oslc-adapter/services/Semiconductor_Sample_Set/requirement\"/>\n" +
                "        <dcterms:title rdf:parseType=\"Literal\">Semiconductor_Sample_Set</dcterms:title>\n" +
                "      </oslc:ServiceProvider>\n" +
                "    </oslc:serviceProvider>\n" +
                "    <oslc:domain rdf:resource=\"http://open-services.net/ns/rm#\"/>\n" +
                "    <dcterms:publisher rdf:resource=\"http://192.168.1.91:8080/jama-oslc-adapter/services\"/>\n" +
                "    <dcterms:title rdf:parseType=\"Literal\">RMCatalog</dcterms:title>\n" +
                "  </oslc:ServiceProviderCatalog>\n" +
                "</rdf:RDF>");

        String responseBody = builder.toString();

        return Response.ok().entity(responseBody).header("max-age", 0).header("pragma", "no-cache")
                .header("Cache-Control", "no-cache").header("OSLC-Core-Version", 2.0)
                .header("Content-Length", responseBody.getBytes().length).type(OslcMediaType.APPLICATION_RDF_XML)
                .build();




        /*JamaServiceProvider jsp = new JamaServiceProvider();
        jsp.setAbout(new URI("http://192.168.1.91:8080/jama-oslc-adapter/services/serviceProvider/Semiconductor_Sample_Set"));
        jsp.setDetails(new URI[]{new URI("http://192.168.1.91:8080/jama-oslc-adapter/services/serviceProvider/Semiconductor_Sample_Set/details")});
        jsp.setTitle("sp");
        jsp.setConsumerRegistry(new URI[]{new URI("http://192.168.1.91:8080/jama-oslc-adapter/services/Semiconductor_Sample_Set/requirement")});

        String path = Constants.RESOURCES + OslcConstants.PATH_SERVICE_PROVIDER_CATALOG;
        JamaServiceProviderCatalog catalog = new JamaServiceProviderCatalog();
        catalog.setAbout(new URI(path));
        catalog.setTitle("Jama OSLC Adapter Service Provider Catalog");
        // catalog.setDescription("Jama OSLC Adapter Service Provider Catalog");
        catalog.setDomains(new URI[]{new URI("http://open-services.net/ns/rm#")});
        catalog.addServiceProvider(jsp);
        //catalog.addServiceProvider(new JamaServiceProvider());

        return catalog; // (JamaServiceProviderCatalog) context.getAttribute("OSLC_CATALOG");
        */

        //return (ServiceProviderCatalog) context.getAttribute("OSLC_CATALOG");
    }

    @GET
    @Produces(value = {MediaType.TEXT_HTML})
    public void renderResource(@Context ServletContext context, @QueryParam("oslc.where") String where,
                               @QueryParam("oslc.select") String select) {
        HttpServletRequest request = ResteasyProviderFactory.getContextData(HttpServletRequest.class);
        HttpServletResponse response = ResteasyProviderFactory.getContextData(HttpServletResponse.class);
        
       
        ServiceProviderCatalog serviceProviderCatalog = (ServiceProviderCatalog) context.getAttribute("OSLC_CATALOG");
        request.setAttribute("catalog", serviceProviderCatalog);
        System.out.println(serviceProviderCatalog.getTitle());
        for (ServiceProvider serviceProvider : serviceProviderCatalog.getServiceProviders()) {
        	System.out.println(serviceProvider.getTitle());
		}
        try {
//            Collection<Requirement> results = filterResources(requirements.values(), where);
//            request.setAttribute("elements", results);
            request.getRequestDispatcher("/jama/serviceprovidercatalog_html.jsp").forward(request, response);
//            request.getRequestDispatcher("/WEB-INF/serviceprovidercatalog_html.jsp").forward(request, response);
        } catch(Exception e) {
            e.printStackTrace();
            throw new WebApplicationException(e);
        }
    }

}