// JdbcTemplate

package org.koreait.global.configs;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jdbc.repository.config.AbstractJdbcConfiguration;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement // 트랜잭션 설정 자동
@EnableJdbcRepositories("org.koreait")
public class DBConfig extends AbstractJdbcConfiguration {

    @Bean(destroyMethod = "close") // 자원 해제
    public DataSource dataSource() {

        DataSource ds = new DataSource();

        ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        ds.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
        ds.setUsername("spring6");
        ds.setPassword("oracle");

        // true해야 테스트 진행
        ds.setTestWhileIdle(true);

        // 체크 주기 3초
        ds.setTimeBetweenEvictionRunsMillis(3 * 1000);

        // 삭제 기준
        ds.setMinEvictableIdleTimeMillis(50 * 1000);

        return ds;
    }

    @Bean
    public JdbcTemplate jdbcTemplate() {
        return new JdbcTemplate(dataSource());
    }

    @Bean
    public PlatformTransactionManager transactionManager() {
        
        // DateSource를 여기서 생성자 매개변수에 넣어도 되고 아래에서 setter도 가능
        DataSourceTransactionManager tm = new DataSourceTransactionManager();
        
        tm.setDataSource(dataSource());
        
        return tm;
    }


    // 고정
    @Bean
    public NamedParameterJdbcOperations namedParameterJdbcOperations(DataSource dataSource) {
        return new NamedParameterJdbcTemplate(dataSource);
    }
}