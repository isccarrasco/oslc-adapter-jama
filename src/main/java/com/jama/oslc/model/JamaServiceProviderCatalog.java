package com.jama.oslc.model;


import org.eclipse.lyo.oslc4j.core.annotation.OslcName;
import org.eclipse.lyo.oslc4j.core.annotation.OslcNamespace;
import org.eclipse.lyo.oslc4j.core.annotation.OslcResourceShape;
import org.eclipse.lyo.oslc4j.core.model.OslcConstants;
import org.eclipse.lyo.oslc4j.core.model.ServiceProviderCatalog;

@OslcName("ServiceProviderCatalog")
@OslcNamespace(OslcConstants.OSLC_CORE_NAMESPACE)
@OslcResourceShape(title = "OSLC Service Provider Catalog Resource Shape", describes = OslcConstants.TYPE_SERVICE_PROVIDER_CATALOG)
public class JamaServiceProviderCatalog extends ServiceProviderCatalog {

    public JamaServiceProviderCatalog() {
        super();
    }

}
