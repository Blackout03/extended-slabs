package com.blackout.extendedslabs.blocks.shapes;

import net.minecraft.util.IStringSerializable;

public enum VerticalSlabShape implements IStringSerializable {
    STRAIGHT("straight"),
    INNER_LEFT("inner_left"),
    INNER_RIGHT("inner_right"),
    OUTER_LEFT("outer_left"),
    OUTER_RIGHT("outer_right");

    private final String name;

    VerticalSlabShape(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String getString() {
        return this.name;
    }
}