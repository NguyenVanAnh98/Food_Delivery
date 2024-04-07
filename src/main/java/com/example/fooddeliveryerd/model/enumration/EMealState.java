package com.example.fooddeliveryerd.model.enumration;

public enum EMealState {

    FOOD("FOOD"),
    DRINK("DRINK");

    private final String value;

    EMealState(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static EMealState fromValue(String value) {
        for (EMealState eMealState : values()) {
            if (eMealState.value.equalsIgnoreCase(value)) {
                return eMealState;
            }
        }
        throw new IllegalArgumentException("Không tồn tại giá trị: " + value);
    }
}
