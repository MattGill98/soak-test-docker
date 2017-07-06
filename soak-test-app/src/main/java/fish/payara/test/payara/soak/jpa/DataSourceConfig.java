package fish.payara.test.payara.soak.jpa;

import javax.annotation.sql.DataSourceDefinition;

/**
 * @author Matt Gill
 */
@DataSourceDefinition(
        name = "java:app/SoakTestApp/SoakTestDS",
        className = "com.mysql.jdbc.jdbc2.optional.MysqlDataSource",
        url = "jdbc:mysql://mariadb:3306/test",
        user = "root",
        password = "password"
)
public class DataSourceConfig {

}
