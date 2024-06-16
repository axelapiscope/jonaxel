# jonaxel
probando git
se le añadieron las dependencias de Json y Gson para poder cargar y guardar el juego.
para facilitar su descarga a continuacion les dejare los links
Gson: https://search.maven.org/artifact/com.google.code.gson/gson/2.11.0/jar?eh=
Json: https://code.google.com/archive/p/json-simple/downloads

Para agregar la biblioteca Gson Y Json a su classpath en un proyecto de IntelliJ IDEA, puede seguir estos pasos:

1. Descargue el archivo JAR de Gson. Puede encontrarlo en el repositorio de Maven Central. La versión más reciente en el momento de escribir esto es 2.8.9.

2. Una vez que haya descargado el archivo JAR, abra su proyecto en IntelliJ IDEA.

3. Vaya a `File` > `Project Structure` en la barra de menú.

4. En la ventana que se abre, seleccione `Modules` en el panel izquierdo.

5. En el panel central, seleccione la pestaña `Dependencies`.

6. Haga clic en el signo más (`+`) en la parte inferior del panel y seleccione `JARs or directories...`.

7. Navegue hasta donde guardó el archivo JAR de Gson, selecciónelo y haga clic en `OK`.

8. Haga clic en `Apply` y luego en `OK` para cerrar la ventana.

Ahora, la biblioteca Gson debería estar en su classpath y ya no debería ver el error "package com.google.gson does not exist".