## Puerto 8099
En las variables de java del archivo setenv.sh/bat:
cambiar:
-Dcom.sun.management.jmxremote.port=8099
por:
-Dcom.sun.management.jmxremote.port=32099

## otros puertos a cambiar
En portal-ext.properties se puede cambiar el puerto de la consola osgi:

module.framework.properties.osgi.console=localhost:11311


y luego, hay que modificar la propiedad de la variable del sistema:

-DaQute.agent.server.port=29998