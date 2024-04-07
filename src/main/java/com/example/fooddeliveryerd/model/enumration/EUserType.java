package com.example.fooddeliveryerd.model.enumration;

public enum EUserType {
    CUSTOMER("CUSTOMER"),
    RESTAURANT("RESTAURANT");

    private final String value;

    EUserType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static EUserType fromValue(String value) {
        for (EUserType eUserType : values()) {
            if (eUserType.value.equalsIgnoreCase(value)) {
                return eUserType;
            }
        }
        throw new IllegalArgumentException("Không tồn tại giá trị: " + value);
    }
}
