package com.example.fooddeliveryerd.model.enumration;

public enum EMealFlavor {

    VEG("VEG"),
    NONVEG("NONVEG");

    private final String value;

    EMealFlavor(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static EMealFlavor fromValue(String value) {
        for (EMealFlavor eMealFlavor : values()) {
            if (eMealFlavor.value.equalsIgnoreCase(value)) {
                return eMealFlavor;
            }
        }
        throw new IllegalArgumentException("Không tồn tại giá trị: " + value);
    }
}
