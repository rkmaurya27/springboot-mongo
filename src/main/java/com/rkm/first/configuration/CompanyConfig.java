/*
package com.rkm.first.configuration;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        entityManagerFactoryRef = "companyEntityManagerFactory",
        transactionManagerRef = "companyTransactionManager",
        basePackages = { "com.rkm.first.configuration" }
)
public class CompanyConfig {
    @Bean(name = "companyDataSource")
    @ConfigurationProperties(prefix = "company.datasource")
    public DataSource dataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "companyEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean
    companyEntityManagerFactory(
            EntityManagerFactoryBuilder builder,
            @Qualifier("companyDataSource") DataSource dataSource
    ) {
        return builder
                .dataSource(dataSource)
                .packages("com.rkm.first.model")
                .persistenceUnit("company")
                .build();
    }

    @Bean(name = "companyTransactionManager")
    public PlatformTransactionManager companyTransactionManager(
            @Qualifier("companyEntityManagerFactory") EntityManagerFactory
                    entityManagerFactory
    ) {
        return new JpaTransactionManager(entityManagerFactory);
    }
}
*/
