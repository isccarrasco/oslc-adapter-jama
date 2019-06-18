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
@OslcSchema ({
        //@OslcNamespaceDefinition(prefix = "item", namespaceURI = Requirement.NAMESPACE),
        //@OslcNamespaceDefinition(prefix = "jama", namespaceURI = Namespace.VOCABULARY),
        //@OslcNamespaceDefinition(prefix = "oslc_rm", namespaceURI = "http://open-services.net/ns/rm#"),
        @OslcNamespaceDefinition(prefix = "rmWorkflow", namespaceURI = "http://www.ibm.com/xmlns/rdm/workflow/"),
        @OslcNamespaceDefinition(prefix = "dcterms", namespaceURI = "http://purl.org/dc/terms/"),
        @OslcNamespaceDefinition(prefix = "dc", namespaceURI = "http://purl.org/dc/elements/1.1/"),
        @OslcNamespaceDefinition(prefix = "jfs", namespaceURI = "http://jazz.net/xmlns/foundation/1.0/"),
        @OslcNamespaceDefinition(prefix = "h", namespaceURI = "http://www.w3.org/TR/REC-html40"),
        @OslcNamespaceDefinition(prefix = "xs", namespaceURI = "http://schema.w3.org/xs/"),
        @OslcNamespaceDefinition(prefix = "rm", namespaceURI = "http://www.ibm.com/xmlns/rdm/rdf/"),
        @OslcNamespaceDefinition(prefix = "jp", namespaceURI = "http://jazz.net/xmlns/prod/jazz/process/1.0/"),
        @OslcNamespaceDefinition(prefix = "rmTypes", namespaceURI = "http://www.ibm.com/xmlns/rdm/types/"),
})
package com.jama.oslc.model;

import org.eclipse.lyo.oslc4j.core.annotation.OslcNamespaceDefinition;
import org.eclipse.lyo.oslc4j.core.annotation.OslcSchema;
