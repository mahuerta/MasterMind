<h1 align="center">Solucion mvp.pm.withComposite Mastermind   👨🏻‍💻   </h1>

Esta versión está realizada a partir de la solución entregada de la práctica en la rama [mvp.pm.withDoubleDispatching](https://github.com/mahuerta/MasterMind/tree/mvp.pm.withDoubleDispatching).

Hemos utilizado diferentes patrones:
- Memento: Registramos 'fotos' tras cada movimiento permitiendo volver a estados anteriores y regresar a estados futuros.
- Command: Gestión del menú y de sus operaciones.
- Composite: Con operaciones realizadas al Jugar (PlayController). Ahora se puede realizar una operación de Undo, otra de Redo y una última de añadir combinación.
- Facade: La sesión actúa como fachada, ocultando subsistemas.


## Authors

👤 **JuanCBM**
* Github: [@JuanCBM](https://github.com/JuanCBM)

👤 **mahuerta**
* Github: [@mahuerta](https://github.com/mahuerta)
