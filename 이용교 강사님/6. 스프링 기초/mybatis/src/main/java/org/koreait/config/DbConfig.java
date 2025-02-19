package org.koreait.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("org.koreait.mapper")
public class DbConfig {

    /**
     * DB Connection Pool 설정
     *
     * @return
     */
    // DB 자원 해제를 위해 destroyMethod = close
    @Bean(destroyMethod = "close")  // Bean = Spring Container 가 관리하는 객체
    public DataSource dataSource() {

        DataSource ds = new DataSource();

        /* DB 연걸 설정 S */
        ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");

        ds.setUrl("jdbc:oracle:thin:@localhost:1521:XE");

        ds.setUsername("pokemon");

        ds.setPassword("oracle");
        /* DB 연걸 설정 E */

        /* Connection Pool 설정 S */
        // 최대 활성화 개수
        ds.setMaxActive(10);

        // 연결 개수
        ds.setInitialSize(2);

        // 연결 유효 체크
        ds.setTestWhileIdle(true);
        /* Connection Pool 설정 E */

        return ds;
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {

        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();

        factoryBean.setDataSource(dataSource());

        return factoryBean.getObject();
    }
}
