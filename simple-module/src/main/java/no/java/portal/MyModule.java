package no.java.portal;

/**
 * This is the configuration bean of your Magnolia module. It has to be registered in the module descriptor file 
 * under src/main/resources/META-INF/magnolia/mymodule.xml.
 * 
 * The bean properties used in this class will be initialized by Content2Bean which means that properties of in the 
 * node config:/modules/mymodule/config/* are populated to this bean when the module is initialized.
 */
public class MyModule {
    private static org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(MyModule.class);
    
    private String someProperty;

    /*
     * Required default constructor
     */
    public MyModule() {
        // TODO: insert your initialization stuff here
    }
    
    public String getSomeProperty() {
        return this.someProperty;
    }
    
    public void setSomeProperty(String value) {
        this.someProperty = value;
    }
}
