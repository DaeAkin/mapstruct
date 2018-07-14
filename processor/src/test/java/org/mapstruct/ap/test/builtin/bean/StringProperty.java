/*
 * Copyright MapStruct Authors.
 *
 * Licensed under the Apache License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package org.mapstruct.ap.test.builtin.bean;

public class StringProperty {

    // CHECKSTYLE:OFF
    public String publicProp;
    // CHECKSTYLE:ON

    private String prop;

    public String getProp() {
        return prop;
    }

    public void setProp( String prop ) {
        this.prop = prop;
    }
}
