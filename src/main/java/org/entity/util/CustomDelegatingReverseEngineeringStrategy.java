package org.entity.util;

import org.hibernate.cfg.reveng.DelegatingReverseEngineeringStrategy;
import org.hibernate.cfg.reveng.ReverseEngineeringStrategy;
import org.hibernate.cfg.reveng.TableIdentifier;
import org.hibernate.mapping.MetaAttribute;

import java.util.Map;

public class CustomDelegatingReverseEngineeringStrategy extends DelegatingReverseEngineeringStrategy {

    private final Inflector inflector = new Inflector();

    public CustomDelegatingReverseEngineeringStrategy(ReverseEngineeringStrategy delegate) {
        super(delegate);
    }

    @Override
    public String tableToClassName(TableIdentifier tableIdentifier) {
        String className = super.tableToClassName(tableIdentifier);
        return inflector.singularize(className);
    }

    @Override
    public Map<String, MetaAttribute> tableToMetaAttributes(TableIdentifier tableIdentifier) {
        Map<String, MetaAttribute> tableToMetaAttributes = super.tableToMetaAttributes(tableIdentifier);
        //System.out.println(tableToMetaAttributes);
        return tableToMetaAttributes;
    }

}
