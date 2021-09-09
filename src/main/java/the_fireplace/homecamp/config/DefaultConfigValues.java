package the_fireplace.homecamp.config;

import dev.the_fireplace.annotateddi.api.di.Implementation;
import the_fireplace.homecamp.domain.config.ConfigValues;

@Implementation(name = "default")
public final class DefaultConfigValues implements ConfigValues {
    @Override
    public boolean isSoulCampfiresOnly() {
        return true;
    }

    @Override
    public boolean isExtinguishOnSpawn() {
        return false;
    }

    @Override
    public boolean isRequireLitCampfire() {
        return true;
    }
}