package com.jama.oslc.model;

import org.eclipse.lyo.oslc4j.core.annotation.OslcDescription;
import org.eclipse.lyo.oslc4j.core.annotation.OslcName;
import org.eclipse.lyo.oslc4j.core.annotation.OslcNamespace;
import org.eclipse.lyo.oslc4j.core.annotation.OslcPropertyDefinition;
import org.eclipse.lyo.oslc4j.core.annotation.OslcReadOnly;
import org.eclipse.lyo.oslc4j.core.annotation.OslcResourceShape;
import org.eclipse.lyo.oslc4j.core.annotation.OslcTitle;
import org.eclipse.lyo.oslc4j.core.model.OslcConstants;
import org.eclipse.lyo.oslc4j.core.model.ServiceProvider;

import java.net.URI;
import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

@OslcName("ServiceProvider")
@OslcNamespace(OslcConstants.OSLC_CORE_NAMESPACE)
@OslcResourceShape(title = "OSLC Service Provider Resource Shape", describes = OslcConstants.TYPE_SERVICE_PROVIDER)
public class JamaServiceProvider extends ServiceProvider {

    private final SortedSet<URI> consumerRegistry = new TreeSet<URI>();

    public JamaServiceProvider() {
        super();
    }

    @OslcDescription("new new")
    @OslcPropertyDefinition("http://jazz.net/xmlns/prod/jazz/process/1.0/" + "consumerRegistry")
    @OslcReadOnly
    @OslcTitle("Consumer Registry")
    public URI[] getConsumerRegistry() {
        return consumerRegistry.toArray(new URI[consumerRegistry.size()]);
    }

    public void setConsumerRegistry(final URI[] consumerRegistry) {
        this.consumerRegistry.clear();
        if (consumerRegistry != null) {
            this.consumerRegistry.addAll(Arrays.asList(consumerRegistry));
        }
    }
}
