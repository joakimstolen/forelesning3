package com.example.forelesning3;

import org.springframework.web.context.annotation.ApplicationScope;
import org.togglz.core.Feature;
import org.togglz.core.manager.TogglzConfig;
import org.togglz.core.repository.StateRepository;
import org.togglz.core.repository.file.FileBasedStateRepository;
import org.togglz.core.user.UserProvider;
import org.togglz.servlet.user.ServletUserProvider;

import java.io.File;

@ApplicationScope
public class DemoTogglzConfiguration implements TogglzConfig {

    public Class<? extends Feature> getFeatureClass(){
        return MyTogglzFeatures.class;
    }

    public StateRepository getStateRepository(){
        return new FileBasedStateRepository(new File("/tmp/features.properties"));
    }

    public UserProvider getUserProvider(){
        return new ServletUserProvider("admin");
    }
}
