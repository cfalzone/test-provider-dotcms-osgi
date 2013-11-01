package com.aquent.testobjects;

import com.dotmarketing.osgi.GenericBundleActivator;
import org.osgi.framework.BundleContext;

public class Activator extends GenericBundleActivator {

    @Override
    public void start ( BundleContext bundleContext ) throws Exception {
        //Initializing services...
        initializeServices( bundleContext );
    }

    @Override
    public void stop ( BundleContext bundleContext ) throws Exception {
        
    }

}
