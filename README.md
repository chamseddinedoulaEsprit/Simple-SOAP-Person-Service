# Simple SOAP Person Service

This small Java project defines a simple in-memory SOAP web service that manages Person objects, plus a client that calls the service.

Structure
- `src/` : Java source files
  - `com.info.model.Person` : simple POJO
  - `com.info.service.PersonService` : service interface
  - `com.info.service.PersonServiceImpl` : in-memory implementation and endpoint
  - `com.info.service.SOAPPublisher` : publishes the service on localhost:8888
  - `com.info.service.SOAPPublisherClient` : simple client that calls the published service
  - `javax.jws` and `javax.jws.soap` : small local annotation stubs used so this project can compile without external JAX-WS libraries (for learning/demo purposes)

Notes
- These `javax.jws` stubs are minimal and only intended for local compilation and testing. For a production SOAP service, prefer a proper JAX-WS implementation (Metro, CXF) and remove the stub packages.

Compile and run (Windows PowerShell)

1) Compile

```powershell
cd 'c:\Users\chams\OneDrive\Bureau\projetPIDEV\SOA5'
javac -d bin -sourcepath src (Get-ChildItem -Recurse -Filter "*.java" -Path src | ForEach-Object { $_.FullName }) -encoding UTF-8
```

2) Start the SOAP server

```powershell
java -cp bin com.info.service.SOAPPublisher
```

The server will publish the service at: http://localhost:8888/ws/person

3) Run the client (in another PowerShell window)

```powershell
java -cp bin com.info.service.SOAPPublisherClient
```

What I changed
- Implemented missing methods in `PersonServiceImpl` and corrected the `endpointInterface` reference.
- Added lightweight annotation stubs in `javax.jws` and `javax.jws.soap` so the project can be compiled without adding Maven/Gradle dependencies.
- Converted `WebMethod` to an annotation.
- Added this `README.md` with build/run instructions for Windows PowerShell.

Next suggestions
- Replace the annotation stubs with a proper JAX-WS implementation (add Maven and use Metro or CXF) if you want full SOAP features.
- Add unit tests for the service implementation.
