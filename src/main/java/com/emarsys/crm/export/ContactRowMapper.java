package com.emarsys.crm.export;

import com.emarsys.crm.export.Domain.Contact;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by szantopeter on 05/11/13.
 */
public class ContactRowMapper implements RowMapper<Contact> {

    @Override
    public Contact mapRow(ResultSet rs, int rowNum) throws SQLException {
        Contact c = new Contact();

        c.setEmail(rs.getString("email"));
        c.setOptIn(toBoolean(rs.getString("opt_in")));
        c.setFirstName(rs.getString("first_name"));
        c.setLastName(rs.getString("last_name"));

        return c;
    }

    private Boolean toBoolean(String s) {
        if ("1".equals(s)) {
            return Boolean.TRUE;
        }
        if ("0".equals(s)) {
            return Boolean.FALSE;
        }

        return null;
    }
}
