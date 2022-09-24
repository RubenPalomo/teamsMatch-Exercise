# teamsMatch Exercise

**SPA** - Ejercicio para calcular el mínimo de equipos que se podrían hacer dividiendo un número de partipantes *p* entre dos modalidades de grupos, cada uno con un número de participantes diferente. De esta manera, se deberá de tener en cuenta el tipo de grupo más numeroso y priorizarlo, pero siempre se debe tratar de repartir los participantes sin que sobre ninguno. En caso de sobrar algún participante sin grupo la función devolverá -1.

SOLUCIÓN:
1. Primero creamos un bucle que se ejecutará hasta que los participantes (*p*) sean 0.
2. En el momento en que el resultado de restar *p* al número de miembros de cualquiera de los dos grupos sea inferior a 0 la función retornará -1, ya que eso indicará que quedarían participantes sin grupo asignado.
3. Comparamos el número de miembros de cada modalidad de grupo y priorizaremos al que requiera de más participantes. De esta manera nos aseguraremos de que el número de equipos creado será el menor posible.
4. Verificamos (usando la función auxiliar *verification*) que el número de participantes que queda al restar el número de miembros del equipo más numeroso sea mayor o igual que 0. Además comprobamos que, al restarlo, el número resultante sea divisible entre los miembros de cualquiera de las dos modalidades de grupos. En caso de que cualquiera de estas indicaciones no se cumpla se restará en su lugar el número de participantes del tipo de equipo menos numeroso.
5. Seguimos repitiendo hasta que llegue un punto en el que los participantes no se puedan asignar a ninguna modalidad de equipo, lo que devolvería -1; o hasta que todos los participantes estén en uno u otro equipo, lo que retornaría el número total de equipos creados (pero no el número de cada uno).
<br><br>

**EN** - Exercise to calculate the minimum number of teams that could be made by dividing a number of participants *p* between two group modalities, each with a different number of participants. In this way, the largest type of group should be taken into account and prioritized, but you should always try to distribute the participants without leaving any. If there are any participants left over without a group, the function will return -1.

SOLUTION:
1. First we create a loop that will run until the participants (*p*) are 0.
2. As soon as the result of subtracting *p* from the number of members of any of the two groups is less than 0, the function will return -1, because this will indicate that there would be participants without an assigned group.
3. We compare the number of members of each group modality and we will prioritize the one that requires more participants. In this way we will ensure that the number of teams created will be as few as possible.
4. We verify (using the auxiliary function *verification*) that the number of participants left by subtracting the number of members of the largest team is greater than or equal to 0. We also verify that, when subtracting it, the resulting number is divisible by the members of either of the two types of groups. In the event that any of these indications are not met, the number of participants of the less numerous team type will be subtracted instead.
5. We keep repeating until the participants cannot be assigned to any team mode, which would return -1; or until all participants are in either of these team, which would return the total number of teams created (but not the number of each).
