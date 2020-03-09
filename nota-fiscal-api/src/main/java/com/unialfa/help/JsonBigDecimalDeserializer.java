package com.unialfa.help;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;
import java.math.BigDecimal;

public class JsonBigDecimalDeserializer extends JsonDeserializer<BigDecimal> {

    @Override
    public BigDecimal deserialize(JsonParser parser, DeserializationContext context) throws IOException {
        String value = parser.getText();

        if (value.contains("."))
            value = value.replace(".", "");

        if (value.contains(","))
            value = value.replace(",", ".");

        return new BigDecimal(value);
    }
}
