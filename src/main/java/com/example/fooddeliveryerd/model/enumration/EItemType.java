package com.example.fooddeliveryerd.model.enumration;

public enum EItemType {

    FOOD("FOOD"),
    DRINK("DRINK");

    private final String value;

    EItemType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static EItemType fromValue(String value) {
        for (EItemType eItemType : values()) {
            if (eItemType.value.equalsIgnoreCase(value)) {
                return eItemType;
            }
        }
        throw new IllegalArgumentException("Không tồn tại giá trị: " + value);
    }
}
