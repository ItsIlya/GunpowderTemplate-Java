package io.github.gunpowder;

import io.github.gunpowder.api.GunpowderMod;
import io.github.gunpowder.api.GunpowderModule;
import org.jetbrains.annotations.NotNull;

public abstract class GunpowderTemplateModule implements GunpowderModule {
    private static final GunpowderMod gunpowder = GunpowderMod.getInstance();

    @NotNull
    @Override
    public String getName() {
        return "template";
    }

    @Override
    public boolean getToggleable() {
        return true;
    }

    @Override
    public void onInitialize() {
        System.out.println("Hello Gunpowder world!");
    }
}
