package com.emarsys.crm.export;

import org.springframework.batch.item.file.FlatFileHeaderCallback;

import java.io.IOException;
import java.io.Writer;

/**
 * Created by szantopeter on 06/11/13.
 */
public class ContactCSVHeaderWriter implements FlatFileHeaderCallback {
    @Override
    public void writeHeader(Writer writer) throws IOException {
        writer.write("email, optin");
    }
}
