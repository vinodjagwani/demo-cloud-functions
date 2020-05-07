package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.AbstractReactiveCassandraConfiguration;
import org.springframework.data.cassandra.config.SchemaAction;
import org.springframework.data.cassandra.repository.config.EnableReactiveCassandraRepositories;

@Configuration
@EnableReactiveCassandraRepositories
public class CassandraReactiveConfig extends AbstractReactiveCassandraConfiguration {

    @Override
    protected String getKeyspaceName() {
        return "cassandrakeyspace";
    }

    @Override
    public SchemaAction getSchemaAction() {
        return SchemaAction.RECREATE;
    }
}
