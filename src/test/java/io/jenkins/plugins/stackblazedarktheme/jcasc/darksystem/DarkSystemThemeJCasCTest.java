package io.jenkins.plugins.stackblazedarktheme.jcasc.darksystem;

import io.jenkins.plugins.casc.misc.junit.jupiter.WithJenkinsConfiguredWithCode;
import io.jenkins.plugins.stackblazedarktheme.DarkThemeSystemManagerFactory;
import io.jenkins.plugins.stackblazedarktheme.jcasc.AbstractThemeJCasCTest;
import io.jenkins.plugins.thememanager.ThemeManagerFactory;

@WithJenkinsConfiguredWithCode
class DarkSystemThemeJCasCTest extends AbstractThemeJCasCTest {

    @Override
    protected Class<? extends ThemeManagerFactory> getThemeManagerFactory() {
        return DarkThemeSystemManagerFactory.class;
    }
}
