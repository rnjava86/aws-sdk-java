/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.servicecatalog.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.servicecatalog.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ServiceActionAssociation JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceActionAssociationJsonUnmarshaller implements Unmarshaller<ServiceActionAssociation, JsonUnmarshallerContext> {

    public ServiceActionAssociation unmarshall(JsonUnmarshallerContext context) throws Exception {
        ServiceActionAssociation serviceActionAssociation = new ServiceActionAssociation();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("ServiceActionId", targetDepth)) {
                    context.nextToken();
                    serviceActionAssociation.setServiceActionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ProductId", targetDepth)) {
                    context.nextToken();
                    serviceActionAssociation.setProductId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ProvisioningArtifactId", targetDepth)) {
                    context.nextToken();
                    serviceActionAssociation.setProvisioningArtifactId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return serviceActionAssociation;
    }

    private static ServiceActionAssociationJsonUnmarshaller instance;

    public static ServiceActionAssociationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ServiceActionAssociationJsonUnmarshaller();
        return instance;
    }
}
