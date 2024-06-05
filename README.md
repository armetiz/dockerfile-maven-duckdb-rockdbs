Inspired from Mause [duckdb_rocksdb_crash](https://github.com/Mause/duckdb_rocksdb_crash).

```bash
# build application
docker build -t demo:latest .
```


```bash
# run application
docker run --rm -it demo:latest
```


# Output

```
➜  maven-duckdb-rocksdb docker run --rm -it demo:latest

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.2.4.RELEASE)

2024-06-05 12:58:51.076  INFO 1 --- [           main] com.example.demo.DemoApplication         : Starting DemoApplication v0.0.1-SNAPSHOT on 86b6864e8014 with PID 1 (/usr/app/demo-0.0.1-SNAPSHOT.jar started by root in /)
2024-06-05 12:58:51.077  INFO 1 --- [           main] com.example.demo.DemoApplication         : No active profile set, falling back to default profiles: default
2024-06-05 12:58:51.248  INFO 1 --- [           main] com.example.demo.DemoApplication         : Started DemoApplication in 0.3 seconds (JVM running for 0.472)
Hello world
org.duckdb.DuckDBConnection@1bd4fdd
```
