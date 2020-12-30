// dataSource {
//     pooled = true
//     jmxExport = true
//     driverClassName = "org.h2.Driver"
//     username = "sa"
//     password = ""
// }
// hibernate {
//     cache.use_second_level_cache = true
//     cache.use_query_cache = false
// //    cache.region.factory_class = 'org.hibernate.cache.SingletonEhCacheRegionFactory' // Hibernate 3
//     cache.region.factory_class = 'org.hibernate.cache.ehcache.SingletonEhCacheRegionFactory' // Hibernate 4
//     singleSession = true // configure OSIV singleSession mode
//     flush.mode = 'manual' // OSIV session flush mode outside of transactional context
// }

// // environment specific settings
// environments {
//     development {
//         dataSource {
//             dbCreate = "create-drop" // one of 'create', 'create-drop', 'update', 'validate', ''
//             url = "jdbc:h2:mem:devDb;MVCC=TRUE;LOCK_TIMEOUT=10000;DB_CLOSE_ON_EXIT=FALSE"
//         }
//     }
//     test {
//         dataSource {
//             dbCreate = "update"
//             url = "jdbc:h2:mem:testDb;MVCC=TRUE;LOCK_TIMEOUT=10000;DB_CLOSE_ON_EXIT=FALSE"
//         }
//     }
//     production {
//         dataSource {
//             dbCreate = "update"
//             url = "jdbc:h2:prodDb;MVCC=TRUE;LOCK_TIMEOUT=10000;DB_CLOSE_ON_EXIT=FALSE"
//             properties {
//                // See http://grails.org/doc/latest/guide/conf.html#dataSource for documentation
//                jmxEnabled = true
//                initialSize = 5
//                maxActive = 50
//                minIdle = 5
//                maxIdle = 25
//                maxWait = 10000
//                maxAge = 10 * 60000
//                timeBetweenEvictionRunsMillis = 5000
//                minEvictableIdleTimeMillis = 60000
//                validationQuery = "SELECT 1"
//                validationQueryTimeout = 3
//                validationInterval = 15000
//                testOnBorrow = true
//                testWhileIdle = true
//                testOnReturn = false
//                jdbcInterceptors = "ConnectionState"
//                defaultTransactionIsolation = java.sql.Connection.TRANSACTION_READ_COMMITTED
//             }
//         }
//     }
// }



environments {
development{
grails {
mongodb {
//host="192.168.9.101"
host="127.0.0.1"
port=27017
//username= "ledgerAdmin"
//password= "password"
databaseName = "testJenkins"
//replicaSet = [ "192.168.9.101:27017", "192.168.9.102:26017", "192.168.9.103:25017"]
options {
autoConnectRetry = true // Whether or not the system retries automatically on a failed connect
connectTimeout = 35000 // The connect timeout in milliseconds. 0 == infinite
socketTimeout = 60000 // The socket timeout. 0 == infinite
socketKeepAlive = true
maxWaitTime = 15000
connectionsPerHost = 100
threadsAllowedToBlockForConnectionMultiplier = 10
}
}
}
println "Loading dev configuration"
}
production{
grails {
mongodb {
//host="192.168.9.101"
host="127.0.0.1"
port=27017
//username= "ledgerAdmin"
//password= "password"
databaseName = "testJenkins"
//replicaSet = [ "192.168.9.101:27017", "192.168.9.102:26017", "192.168.9.103:25017"]
options {
autoConnectRetry = true // Whether or not the system retries automatically on a failed connect
connectTimeout = 35000 // The connect timeout in milliseconds. 0 == infinite
socketTimeout = 60000 // The socket timeout. 0 == infinite
socketKeepAlive = true
maxWaitTime = 15000
connectionsPerHost = 100
threadsAllowedToBlockForConnectionMultiplier = 10
}
}
}
println "Loading production configuration"
}
}
