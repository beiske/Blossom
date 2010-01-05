package no.java.portal;

import info.magnolia.cms.beans.config.ContentRepository;
import info.magnolia.cms.core.ItemType;
import info.magnolia.module.DefaultModuleVersionHandler;
import info.magnolia.module.InstallContext;
import info.magnolia.module.delta.CreateNodeTask;
import info.magnolia.module.delta.Delta;
import info.magnolia.module.delta.DeltaBuilder;
import info.magnolia.module.delta.SetPropertyTask;

import java.util.ArrayList;
import java.util.List;

/*
 * This class is used to handle installation and updates of your module.
 */
public class MyModuleVersionHandler extends DefaultModuleVersionHandler {

    public MyModuleVersionHandler() {
        final Delta updateDelta = DeltaBuilder.update("1.0-SNAPSHOT", "This delta will be applied if your module is asked to be updated to version 1.0-SNAPSHOT")
            .addTask(new SetPropertyTask(ContentRepository.CONFIG, "/modules/mymodule/config", "someProperty", "someValue"));
        
        register(updateDelta);
    }
    
    protected List getExtraInstallTasks(InstallContext installContext) {
        final List installTasks = new ArrayList();
        installTasks.add(new CreateNodeTask("Install module configuration", "Adds the config node to your module", ContentRepository.CONFIG, "/modules/mymodule/config", "someNode", ItemType.CONTENTNODE.getSystemName()));
        
        return installTasks;
    }
}
