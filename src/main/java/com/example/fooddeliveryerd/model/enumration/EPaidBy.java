package com.example.fooddeliveryerd.model.enumration;

public enum EPaidBy {

    CASH("CASH"),
    CARD("CARD");

    private final String value;

    EPaidBy(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static EPaidBy fromValue(String value) {
        for (EPaidBy ePaidBy : values()) {
            if (ePaidBy.value.equalsIgnoreCase(value)) {
                return ePaidBy;
            }
        }
        throw new IllegalArgumentException("Không tồn tại giá trị: " + value);
    }
}
