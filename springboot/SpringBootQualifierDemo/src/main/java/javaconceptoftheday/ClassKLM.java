
package javaconceptoftheday;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ClassKLM {

    @Autowired
    @Qualifier("classABC")  // Change to "classXYZ" if you want to use that instead
    InterfacePQR pqr;

    public void show() {
        pqr.display();
    }
}
