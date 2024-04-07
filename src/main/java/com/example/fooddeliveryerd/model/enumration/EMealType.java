package com.example.fooddeliveryerd.model.enumration;

public enum EMealType {

    BREAKFAST("BREAKFAST"),
    LUNCH("LUNCH"),
    DINNER("DINNER");

    private final String value;

    EMealType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static EMealType fromValue(String value) {
        for (EMealType eMealType : values()) {
            if (eMealType.value.equalsIgnoreCase(value)) {
                return eMealType;
            }
        }
        throw new IllegalArgumentException("Không tồn tại giá trị: " + value);
    }
}
