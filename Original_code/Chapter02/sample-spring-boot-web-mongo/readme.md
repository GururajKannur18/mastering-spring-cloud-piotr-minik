# Actuator EndPoint

- health

http://localhost:2222/health

```
{"status":"UP","diskSpace":{"status":"UP","total":156710727680,"free":59094876160,"threshold":10485760},"mongo":{"status":"UP","version":"3.2.2"}}
```

- Metrics

http://localhost:2222/metrics

```
{"mem":429609,"mem.free":126032,"processors":4,"instance.uptime":124456,"uptime":132393,"systemload.average":-1.0,"heap.committed":374272,"heap.init":131072,"heap.used":248239,"heap":1837056,"nonheap.committed":56512,"nonheap.init":2496,"nonheap.used":55338,"nonheap":0,"threads.peak":44,"threads.daemon":32,"threads.totalStarted":52,"threads":34,"classes":8544,"classes.loaded":8544,"classes.unloaded":0,"gc.ps_scavenge.count":9,"gc.ps_scavenge.time":94,"gc.ps_marksweep.count":2,"gc.ps_marksweep.time":157,"httpsessions.max":-1,"httpsessions.active":0,"gauge.response.health":111.0,"gauge.response.star-star.favicon.ico":19.0,"counter.status.200.star-star.favicon.ico":1,"counter.status.200.health":1}
```

pc@DESKTOP-NQ639DU MINGW64 /c/Program Files/Docker Toolbox
$ docker pull mongo
Using default tag: latest
latest: Pulling from library/mongo
7b8b6451c85f: Pull complete
ab4d1096d9ba: Pull complete
e6797d1788ac: Pull complete
e25c5c290bde: Pull complete
45aa1a4d5e06: Pull complete
b7e29f184242: Pull complete
ad78e42605af: Pull complete
1f4ac0b92a65: Pull complete
55880275f9fb: Pull complete
bd0396c9dcef: Pull complete
28bf9db38c03: Pull complete
3e954d14ae9b: Pull complete
cd245aa9c426: Pull complete
Digest: sha256:0823cc2000223420f88b20d5e19e6bc252fa328c30d8261070e4645b02183c6a
Status: Downloaded newer image for mongo:latest

pc@DESKTOP-NQ639DU MINGW64 /c/Program Files/Docker Toolbox
$ docker run -d --name mongo -p 27017:27017 mongo
2ca2d416f76d42e128bed3d49b85f08a726908e7e6d67477936a3cfc1a51668f

pc@DESKTOP-NQ639DU MINGW64 /c/Program Files/Docker Toolbox

#Swagger

```
http://localhost:2222/swagger-ui.html#/
```

# Create User

```
curl -X POST "http://localhost:2222/person" -H "accept: */*" -H "Content-Type: application/json" -d "{ \"age\": 20, \"firstName\": \"John\", \"gender\": \"MALE\", \"lastName\": \"Kerr\"}"
```

```
curl -X POST "http://localhost:2222/person" -H "accept: */*" -H "Content-Type: application/json" -d "{ \"age\": 30, \"firstName\": \"Sally\", \"gender\": \"FEMALE\", \"lastName\": \"Cox\"}"
```

