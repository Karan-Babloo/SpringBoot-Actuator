# SpringBoot-Actuator
A Basic Restfull Webservice With SpringBoot Actuator


Make sure You add the following K/V pair to the **applpication.properties** file in order to expose all the endpoints given by the Spring actuator

```
management.endpoints.web.exposure.include=*
```

By default we can only access the "actuator/health" & "actuator/info"

So basically with the help of actuator we can measure diferrent aspects of our rest endpoints like health, info, trace, beans

we can also make sure to open up these endpoints on different ports so that normal users won't be able access them by default
