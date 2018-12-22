# Example-1

#Eureka Dashboard

```
http://localhost:8761
```

#Apps Details

```
http://localhost:8761/eureka/apps
```

```
<applications>
<versions__delta>1</versions__delta>
<apps__hashcode>UP_1_</apps__hashcode>
<application>
<name>CLIENT-SERVICE</name>
<instance>
<instanceId>localhost:client-service:8081</instanceId>
<hostName>localhost</hostName>
<app>CLIENT-SERVICE</app>
<ipAddr>192.168.56.1</ipAddr>
<status>UP</status>
<overriddenstatus>UNKNOWN</overriddenstatus>
<port enabled="true">8081</port>
<securePort enabled="false">443</securePort>
<countryId>1</countryId>
<dataCenterInfo class="com.netflix.appinfo.InstanceInfo$DefaultDataCenterInfo">
<name>MyOwn</name>
</dataCenterInfo>
<leaseInfo>
<renewalIntervalInSecs>30</renewalIntervalInSecs>
<durationInSecs>90</durationInSecs>
<registrationTimestamp>1545483825772</registrationTimestamp>
<lastRenewalTimestamp>1545483945594</lastRenewalTimestamp>
<evictionTimestamp>0</evictionTimestamp>
<serviceUpTimestamp>1545483825773</serviceUpTimestamp>
</leaseInfo>
<metadata class="java.util.Collections$EmptyMap"/>
<homePageUrl>http://localhost:8081/</homePageUrl>
<statusPageUrl>http://localhost:8081/info</statusPageUrl>
<healthCheckUrl>http://localhost:8081/health</healthCheckUrl>
<vipAddress>client-service</vipAddress>
<secureVipAddress>client-service</secureVipAddress>
<isCoordinatingDiscoveryServer>false</isCoordinatingDiscoveryServer>
<lastUpdatedTimestamp>1545483825773</lastUpdatedTimestamp>
<lastDirtyTimestamp>1545483825595</lastDirtyTimestamp>
<actionType>ADDED</actionType>
</instance>
</application>
</applications>
```

Perform POST method on

```
http://localhost:8081/shutdown
```

```
{
    "message": "Shutting down, bye..."
}
```