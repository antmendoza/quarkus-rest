package org.my.group;

import java.io.Serializable;

class HelloResponse implements Serializable {
    public final String greeting;

    public HelloResponse(String greeting) {
        this.greeting = "Hello " + greeting;
    }

}
