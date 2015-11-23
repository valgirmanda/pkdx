package entities;

import java.util.ArrayList;

public class ListaDePokemon {
	public static ArrayList<Pokemon> lista;
	
	public static void generaLista(){
		lista=new ArrayList<Pokemon>();
		//primera
		Pokemon p = new Pokemon("Articuno","hielo","volador");
		p.setDescripcion("Articuno es un enorme pájaro de color azulado, con una cresta más oscura en la cabeza, del mismo color que su larga cola en forma de cinta brillante. De su cuerpo despide una serie de cristales helados que destellan con un hermoso brillo azulado. Aparentemente está basado en un Quetzal, ave muy común y preciosa procedente de América Central y el sur de México, aunque al ser de tipo hielo, su plumaje varía con respecto a los colores originales del quetzal. La temperatura corporal de este Pokémon ronda el punto de congelación del agua (0 °C), lo que le da el tono azulado de su cuerpo; parece ser que odia el calor, se siente más a gusto cuanto más frío hace. Este Pokémon suele pasear de nevada en nevada. Muchas veces ayuda a escaladores de montañas nevadas en problemas.Notablemente muy poderoso, es capaz de congelar la humedad del aire con el batir de sus enormes alas, provocando enormes ventiscas sin esfuerzo.");
		lista.add(p);
		p = new Pokemon("Zapdos","electrico","volador");
		p.setDescripcion("Zapdos es unos de los tres pájaros legendarios de Kanto. Se trata de una enorme ave con un pico largo y puntiagudo con un plumaje amarillo y erizado debido a los cúmulos de electricidad que almacena en él.Zapdos es un Pokémon solitario. Le encanta surcar las tormentas eléctricas para recargar su cuerpo de electricidad porque es uno de los Pokémon eléctricos con mayor capacidad de absorción de electricidad: puede almacenar en el interior de su cuerpo y entre su plumaje enormes cargas eléctricas capaces de provocar desastres naturales si son liberadas de forma violenta.Zapdos es el más irascible y orgulloso de los tres pájaros legendarios. Sólo permite a los entrenadores más avanzados el honor de combatir contra él. Las descargas eléctricas de Zapdos pueden llegar a explotar una central eléctrica y destruir grandes cosas. En los videojuegos Zapdos es muy difícil de derrotar ya que la tierra no le afecta gracias a que es un Pokémon volador.");
		lista.add(p);
		p = new Pokemon("Moltres","fuego","volador");
		p.setDescripcion("Moltres es un enorme pájaro de color amarillento, con una cresta llameante en la cabeza y unas patas de color marrón rojizo. Sus alas y su cola están envueltas en llamas (Se asemeja mucho a un Fénix).Es una de las 3 aves legendarias. Fue creado, al igual que Articuno y Zapdos, para mantener el balance del clima por el calor que provoca, de ahí viene que Articuno y Moltres se tengan un odio especial.Se dice que Moltres vive en las cimas de los volcanes, de los que apenas sale, pues, con el fuego de sus alas, es capaz de incendiar bosques enteros. Las leyendas dicen que cuando el cielo está rojo, es que Moltres está de caza. Otra leyenda dice que sus alas tienen poderes hipnóticos, y el que las mira de cerca se queda embobado. Su temperatura corporal supera los 4000 °C.Moltres parece haber sido inspirado en una grulla, aunque al ser un pájaro de fuego parece un ave fénix con sus preciosas alas llameantes.Se dice en el anime que Moltres no puede ser capturado y tenerlo en una Poké Ball, ya que si esto ocurriera el mundo entraría en una era glacial, ya que Moltres controla el clima cálido del planeta.Siempre se guarda la llama de este Pokémon para inaugurar la Liga Pokémon.");
		lista.add(p);
		p = new Pokemon("Mewtwo","psiquico",null);
		p.setDescripcion("Mewtwo es una criatura con una postura humanoide pero con muchos rasgos físicos felinos. El cuerpo de Mewtwo es grisáceo con el vientre púrpura, que se extiende hasta su larga cola, también púrpura. Mewtwo tiene tres dedos en cada mano con una especie de almohadillas, como las de los animales cuadrúpedos. Tiene ojos púrpuras y dos protuberancias cortas en la cabeza que pudieran ser sus oídos.Uno de los rasgos más notables de Mewtwo es el tubo que se extiende desde el hueso occipital de su cráneo hasta su espina dorsal. Esto es, probablemente, una médula espinal secundaria, una pequeña expansión del sistema nervioso, o un conducto de irrigación sanguínea alternativo, teniendo así una cantidad aumentada de sangre y transmisión sensorial al cerebro, aumentando sus poderes psíquicos.");
		lista.add(p);
		p = new Pokemon("Mew","psiquico",null);
		p.setDescripcion("La forma de Mew es derivada del gato esfinge, ya que es de aspecto felino, color rosado, además, se dice que este Pokémon sí tiene pelo, solo que a tamaño microscópico, igual que el verdadero animal. Mew tiene grandes poderes psíquicos y los usa para esconderse o se oculta transformándose en otro Pokémon.Se cree que Mew tiene el ADN de todos los Pokémon existentes y por ello ostenta el título de el Pokémon más raro. En el anime, un grupo de científicos encontraron en una zona de Sudamérica un templo dedicado a él junto con el fósil de una de la pestañas de Mew. De éste extraen ADN y, luego de varios fallos en el experimento, logran finalmente crear un clon de Mew, pero alterado genéticamente para ser más fuerte que el original; la creación es bautizada como Mewtwo. La razón más probable de que nadie lo haya visto tal vez se deba a que conoce el movimiento transformación, permitiéndole cambiar su forma a cualquier Pokémon u objeto (al igual que lo hace Ditto), posiblemente utilizaba este movimiento con frecuencia para pasar inadvertido.A pesar de su apariencia adorable, Mew es uno de los Pokémon más poderosos. También es uno de los más inteligentes. Puede hacerse invisible cuando quiera; intenta no hacerse notar cuando se acerca a la gente. Se cree que contiene la composición genética de todos los otros Pokémon y que puede realizar cualquier movimiento que puedan hacer éstos. Su color es rosado, tiene unas extremidades delanteras pequeñas y unas patas posteriores alargadas. Su cola es larga y fina para su pequeño tamaño. Es un Pokémon muy tranquilo y pacífico, aunque también juguetón y travieso por naturaleza. Mew tiene la capacidad de transformarse en otros Pokémon, lo que lo hace muy difícil de ver.Su forma física es similar al embrión de un animal, esto puede ser debido a que supuestamente Mew es el antecesor de todos los Pokémon. Los embriones de los Pokémon, siguen la teoría de la recapitulación, según la cual los animales comparten una misma forma física en el embrión, repitiendo todas sus etapas evolutivas anteriores antes de nacer.");
		lista.add(p);
		//segunda
		p = new Pokemon("Raikou","electrico",null);
		p.setDescripcion("Raikou parece estar basado en un tigre, por sus rayas, o un Smilodon, por sus largos dientes, haciendo juego con su apariencia y nombre: Tigre dientes de Sable. También podría estar basado en Byakko uno de los monstruos divinos que representan los puntos cardinales, por su relación con el viento y el trueno.El rugido que emite se parece mucho al sonido de un trueno, sus rugidos mandan ondas de descarga estremeciéndose a través del aire y sacudiendo el suelo como si cayera un rayo. Las nubes de lluvia que lleva le permiten lanzar rayos a voluntad. Dicen que apareció con un rayo. Raikou también es considerado en muchas regiones como el tigre del trueno. Se dice también que es el protector de todos los Pokémon eléctricos. También se considera protector de los que considera sus amigos.Raikou está basado tanto en un tigre de bengala, por sus rayas, como en un tigre dientes de sable, por sus grandes dientes y la nube simboliza su control sobre el trueno, como el color de su cuerpo.La melena de su lomo representa una nube de tormenta. Los dos bigotes de color blanco y esa especie de casco con dos relámpagos cristalinos que lleva en la cabeza le tapan la cara dejando ver solo los ojos y la parte inferior de la mandíbula.Según la historia de Ciudad Iris, Raikou fue uno de los tres Pokémon en los que se reencarnaron los tres Pokémon que perecieron al quemarse la Torre Latón.");
		lista.add(p);
		p = new Pokemon("Entei","fuego",null);
		p.setDescripcion("Entei es un Pokémon de tipo fuego muy enigmático, se rumorea que cada vez que un nuevo volcán aparece en la Tierra a su vez nace un nuevo Entei. Cuando ruge, los volcanes entran en erupción, y como es incapaz de contener sus tremendos poderes, siempre está en constante movimiento.En apariencia es similar a un león de pelaje marrón. Las estructuras de su lomo simularían la presencia de un volcán humeante en su espalda. Posee patas blancas y en cada una de ellas tiene una estructura que recuerdan grilletes negros. En la cara posee placas de colores las cuales asemejarían bigotes (blancas), una especie de máscara (rojas) y una ligera cresta que le ayuda a marcar el ceño (amarillas).Según la historia de Ciudad Iris Entei fue uno de los Pokémon que murieron al quemarse la Torre Latón, y luego fue revivido por Ho-Oh al igual que Raikou y Suicune. Al ser un Pokémon legendario es difícil de predecir. Suele vivir en los volcanes o en lugares cálidos.");
		lista.add(p);
		p = new Pokemon("Suicune","agua",null);
		p.setDescripcion("Suicune puede estar basado en una pantera negra, o tal vez en una onza, mejor conocido como leopardo de las nieves, aunque su estilizado cuerpo y velocidad hacen pensar que tal vez esté basado en un guepardo. O quizás en un lobo ártico.Este Pokémon puede respirar bajo el agua y purificarla cuando la toca. Va normalmente en la dirección de los vientos del norte, tiene un gran sentido del honor y la responsabilidad, aunque es un poco solitario. Posee también la particularidad de controlar el viento que le rodea, razón por la cual sus colas ondean siempre hacia el frente sin importar si está corriendo a increíbles velocidades.Aunque su tipo es agua, lanza un agua tan fría que muchas veces en la antigüedad se pensaba que dominaba el hielo. Físicamente muestra un aspecto helado, ya que su cornamenta parece estar hecha de hielo y su melena representar la corriente del agua (mejor apreciada en su estado variocolor). Por eso, se cree que no le molesta la compañía de Pokémon como Vaporeon o Glaceon.Suicune es un Pokémon muy místico y bello, en la mitología se le adoraba por su nobleza, sabiduría, siendo además símbolo de la pureza. Se le conoce también como \"El Viento del Norte\". Solo se aparece ante los entrenadores Pokémon de corazón noble y buenos con sus Pokémon en las batallas.Según la historia de Ciudad Iris Suicune fue uno de los tres Pokémon que reencarnaron tras perecer quemados en la Torre Latón.");
		lista.add(p);
		p = new Pokemon("Lugia","psiquico","volador");
		p.setDescripcion("Lugia es parecido a un dragón. Tiene la forma de un ave color blanco con el vientre azul claro, y las placas en su lomo y cola de color azul oscuro, con una envergadura superior a los 5 metros. A pesar de su enorme poder no llega a ser un Pokémon único. Sin embargo, vive en soledad por la rareza de encontrar a otro de su misma especie. Caza Pokémon acuáticos de la zona en la que reside. Casi nunca se deja ver. Rara vez aparece en tormentas y sus plumas son tan duras como un diamante. Puede comunicarse telepáticamente y entender el lenguaje humano. Aparecerá cuando Articuno, Zapdos y Moltres entren en duelo, para luego calmarlos con su canción mística. Este Pokémon, además tiene la capacidad de volar, levantando las placas de su espalda (ya que bajo el agua las tiene cerradas) y curarse de las heridas cuando oye su propia canción. Su ataque característico es aerochorro.");
		lista.add(p);
		p = new Pokemon("Ho-Oh","fuego","volador");
		p.setDescripcion("Ho-Oh es una criatura basada en el legendario pájaro Fenghuang que es el fénix de oriente, por lo cual se asemeja a un pavo real, aunque por la descripción de un hombre de ciudad Iris: \"Un ave tan grande que oscureció el Sol\", se parece al Roc. Posee unas hermosas alas de siete colores y una cresta en su cabeza similar a la de un gallo.Vuela continuamente por los cielos con sus magníficas alas de siete colores. Su aparición significa el comienzo de una era de paz entre los humanos y los Pokémon. Él se revela a los entrenadores que son puros de corazón y se dice también que vive al pie del arco iris. Tiene la capacidad de ver todo lo que ocurre en el mundo.Después del incendio en la torre de Ciudad Iris, Ho-Oh revive a tres Pokémon que no sobrevivieron al incendio de la torre, dándoles nuevas apariencias y personalidades. Estos Pokémon son conocidos como Raikou, Entei y Suicune.Si alguna vez Raikou, Entei y Suicune se reúnen en Ciudad Iris, Ho-Oh aparecerá y se quedará, pero solo pasará esto si Lugia despierta. Este Pokémon guarda la esperanza de que Pokémon y humanos vivan en perfecta armonía los unos con los otros. Se dice que cuando el arco iris aparece después de una tormenta es que Ho-Oh vuela a baja altitud.Según las leyendas, este Pokémon vuela por los cielos de todo el mundo, agitando constantemente sus alas de siete colores. Se dice que cuando atraviesa los cielos particularmente cristalinos, detrás de él se forma un arco iris.");
		lista.add(p);
		p = new Pokemon("Celebi","psiquico","planta");
		p.setDescripcion("Celebi es un pequeño Pokémon singular que habita en bosques y encinares. Está basado en los espíritus míticos del Japón, llamados Kodamas (habitantes de los bosques espesos). Su forma corporal es muy similar a un hada. Tiene una cabeza muy peculiar, la cual recuerda a una flor de azucena sin abrir, tanto en tonalidades como en forma. Posee unas antenas muy sensibles al movimiento del aire, con forma puntiaguda y con una tonalidad azul en su extremo. Sus ojos son grandes, de color azul y rodeados de una gruesa linea negra. Su cuerpo es de dos tonalidades de color verde, sus pies son ovalados y grandes, y sus manos terminan en 3 puntas. Todo su cuerpo recuerda a una planta de azucena, especie en la que está basado.Se dice de Celebi tiene la habilidad de viajar por el tiempo para solucionar problemas ambientales o para ayudar a personas. También se rumorea que su aparición ante las personas indica la víspera de buenos tiempos. A pesar de tener un carácter tímido con los desconocidos, también es de buen carácter, simpático, alegre, generoso y bastante juguetón. No es depredador, su alimentación está basada en pequeñas bayas que crecen en los bosques. No acostumbra a pelear ni es agresivo, solo se protege y defiende, aunque si se usa en batallas o se enfurece es tan fuerte y poderoso como para hacer volar un bosque completo.");
		lista.add(p);
		//tercera
		p = new Pokemon("Regirock","roca",null);
		p.setDescripcion("Poca gente ha visto a Regirock, no se alimenta y no bebe, hay hallazgos de que se encuentra en las Ruinas, puede ejecutar ataques de muchos tipos, como ataques eléctricos por ejemplo. Este Pokémon es verdaderamente raro, vive en viejas ruinas, no tiene órganos internos y es prácticamente indestructible. A pesar de ser un Pokémon legendario, aparentemente Regirock no es un Pokémon único. Su aspecto es parecido al de un robot rocoso, igual que los otros dos Regis de Hoenn.");
		lista.add(p);
		p = new Pokemon("Regice","hielo",null);
		p.setDescripcion("Este Pokémon esta hecho de hielo inderretible formado en la era de hielo. Las marcas en su cabeza parecen ser sus ojos, cuando esta dormido se le apagan. Todo lo que rodea a este Pokémon se congela al instante. Al parecer el hielo que lo forma es el mismo del Polo Sur, y ronda los -200 °C. Posee unos picos de hielo en la espalda. Se descubrió en un glacial transparente. Tiene la capacidad de soportar temperaturas muy extremas tanto frías como cálidas, esta capacidad le permite soportar incluso lava volcánica.Algo curioso de Regice, es que parece que puede sentir emociones como el enojo y la felicidad ya que cuando está feliz su voz es aguda y tranquila mientras que cuando está enojado su voz es baja y grave.");
		lista.add(p);
		p = new Pokemon("Registeel","acero",null);
		p.setDescripcion("En el pasado fue encarcelado por los seres humanos que le temían. El metal que compone su cuerpo no es del planeta Tierra. Después de haber pasado un millón de años atrás, el duro cuerpo de este Pokémon no puede ser dañado. El cuerpo de Registeel está hecho del metal más fuerte, que le permite resistir hasta el más brutal ataque, es decir, cuenta con una gran defensa. Los puntos de Registeel se desplazan en batalla para buscar a su oponente.A pesar del duro armazón que tiene en el cuerpo, Registeel es flexible y se desplaza rápidamente y lanza sus ataques de una manera verdaderamente sorprendente. El punto más alto de esta flexibilidad es su habilidad para levantarse del suelo al mover los brazos.");
		lista.add(p);
		p = new Pokemon("Kyogre","agua",null);
		p.setDescripcion("Kyogre tiene forma de cetáceo de proporciones colosales, ya que mide 4,5 metros y pesa 352 kilos. Biológicamente está basado en una mezcla entre el cuerpo de un Glaucus atlanticus, y las manchas blancas junto a la cabeza de una Orca. Es el némesis de Groudon y comparte con él un rasgo fisiológico, que son las marcas en color rojo de su cuerpo, marcas que Groudon tiene en color negro, estas marcas parecen ser que tienen una relación con los Pokémon que dominan el agua, la tierra y el cielo: Kyogre, Groudon y Rayquaza, pero este último tiene estas marcas de distinta forma y de color amarillo. Kyogre y Groudon son enemigos acérrimos y solo Rayquaza los puede parar.Kyogre controla y domina todos los océanos y mares del mundo, pudiendo provocar potentes marejadas y/o maremotos de decenas de metros tan solo moviendo una aleta. Este Pokémon es casi imparable cuando se pone furioso ya que puede provocar un maremoto tan gigantesco como un edificio de 120 pisos. Se cree que si lo quisiera, este Pokémon podría hacer que el planeta entero se inundara. Aún así, Kyogre es bastante pacífico, excepto cuando pelea con su gran enemigo, Groudon.Kyogre es capaz de crear potentes nubes cargadas de lluvia, cubrir el cielo y desatar lluvias torrenciales e inundaciones. Este Pokémon ha salvado de la sequía a mucha gente, gracias a su habilidad llovizna. Kyogre podría estar basado en el Leviatán, una criatura mítica del mar.");
		lista.add(p);
		p = new Pokemon("Groudon","tierra",null);
		p.setDescripcion("Groudon es el Pokémon legendario que creó los continentes hace miles de millones de años, y los elevó por encima del nivel del mar; por lo que es el enemigo mortal de Kyogre. Mitológicamente estos dos Pokémon están a la par: Groudon podría acabar con Kyogre con un rayo solar, o una fisura, mientras que Kyogre podría hacer lo mismo con una hidrobomba o un frío polar. Y sería así de no ser por Rayquaza que baja de los cielos a calmarlos.Gracias a la lava volcánica solidificada creó los continentes. Se dice que tiene tal poder que podría destruir una isla entera de un golpe, o incluso, arrastrar poco a poco las placas tectónicas, originando todo el vulcanismo y la sismicidad del mundo. Además, es el Pokémon más pesado; aunque no el más grande. Su habilidad especial, sequía, hace que los rayos del sol sean tan intensos que evaporan el agua y nutren la tierra. Por ello se dice que fue el salvador de aquellos que sufrían de terribles inundaciones. Puede crear ríos de lava, volcanes, provocar terremotos o erupciones de todo tipo e intensidad con un solo puñetazo o ataque de rabia.En la sexta generación se confirma también una forma \"Primigenia\".Desde la sexta generación su movimiento característico es Filo del abismo.");
		lista.add(p);
		p = new Pokemon("Rayquaza","dragon","volador");
		p.setDescripcion("Rayquaza es un dragón serpentiforme con dos extremidades superiores, nueve pares de alas aparentemente rígidas (dos en la cabeza: las superiores mayores que las inferiores; cuatro repartidas en dos gruesos anillos que rodean su cuerpo; uno en su abdomen y dos en el extremo final de su cola) que según parece le sirven para dirigir el aire alrededor suyo y cambiar de dirección mientras vuela (el mismo sistema utilizado por los aviones, algo lógico pues ambos operan a grandes alturas). Su cuerpo es verde salvo ciertos retoques rojizos y una serie de líneas amarillas que adornan su figura verde.Es un Pokémon muy territorial, no dudará atacar a cualquier intruso en su territorio, como se demuestra en la película Destino de Deoxys, ya que, cuando cae el meteorito donde estaba Deoxys va rápido a atacarlo cuando salió de su meteorito. A pesar de esto es muy tranquilo y poderoso, tanto que es capaz de detener a Groudon y Kyogre cuando están combatiendo. Vive en la estratosfera y a menudo baja al Pilar Celeste. Se siente muy cómodo en presencia de ozono. Se alimenta de las partículas de agua que se encuentran suspendidas en el aire, y cuando necesita megaevolucionar, se alimenta de energía de meteoritos.");
		lista.add(p);
		p = new Pokemon("Latias","dragon","psiquico");
		p.setDescripcion("Latias es un Pokémon legendario que surca los cielos. A pesar de ser un Pokémon legendario no es único, pero verlo es casi imposible ya que tiene un plumón especial que le permite adoptar forma humana para pasar desapercibida, también puede hacerse invisible (ya que su plumón refracta la luz).Latias se encuentra levitando (excepto cuando duerme) por lo que este poder permite que pueda volar sin necesidad de mover sus alas continuamente. Además Latias es capaz de respirar bajo el agua y bucear a gran velocidad, por lo que esto le da una forma más para pasar desapercibido ante la visión de los humanos y Pokémon terrestres. Latias es capaz de percibir las emociones y los pensamientos de los humanos y comprenderlos.Es de carácter gentil pero es muy tímido, se aleja de las personas con malos sentimientos. Al ser del subtipo psíquico puede entender el lenguaje humano e incluso hablarlo por telepatía, su coeficiente intelectual es muy alto. También es capaz de formar poderosos lazos de amor con humanos como se vio en la película, estos lazos pueden llevar a que un Latias viva como un humano más acompañando a la persona que eligió. Otra de sus habilidades es Visión compartida con la cual puede ver lo que Latios ve. Latias es uno de los Pokémon más rápidos pudiendo llegar a alcanzar una velocidad en picado de 300 km/h.A pesar de su apariencia frágil y tierna, Latias es un Pokémon dragón tan poderoso como cualquier otro dragón. Su ataque característico es bola neblina.En la ciudad Altomare este Pokémon junto con su hermano Latios son considerados héroes ya que según cuenta la leyenda hace mucho tiempo evitaron que la ciudad fuera destruida por un Aerodactyl y un Kabutops enviados por un ser malvado. Con su gran poder los héroes Pokémon llenaron las calles de Altomare con agua, formándose así los característicos canales de la ciudad (muy parecidos a los de Venecia). Hay estatuas en varios lugares homenajeando a dichos Pokémon. Se dice que Latios y Latias son los guardianes de Altomare y que aparecerán cuando ésta se encuentre en grave peligro.");
		lista.add(p);
		p = new Pokemon("Latios","dragon","psiquico");
		p.setDescripcion("");
		lista.add(p);
		p = new Pokemon("Jirachi","acero","psiquico");
		p.setDescripcion("");
		lista.add(p);
		p = new Pokemon("Deoxys","psiquico",null);
		p.setDescripcion("");
		lista.add(p);
		//cuarta
		p = new Pokemon("Uxie","psiquico",null);
		p.setDescripcion("");
		lista.add(p);
		p = new Pokemon("Mesprit","psiquico",null);
		p.setDescripcion("");
		lista.add(p);
		p = new Pokemon("Azelf","psiquico",null);
		p.setDescripcion("");
		lista.add(p);
		p = new Pokemon("Dialga","acero","dragon");
		p.setDescripcion("");
		lista.add(p);
		p = new Pokemon("Palkia","agua","dragon");
		p.setDescripcion("");
		lista.add(p);
		p = new Pokemon("Giratina","fantasma","dragon");
		p.setDescripcion("");
		lista.add(p);
		p = new Pokemon("Regigigas","normal",null);
		p.setDescripcion("");
		lista.add(p);
		p = new Pokemon("Heatran","fuego","acero");
		p.setDescripcion("");
		lista.add(p);
		p = new Pokemon("Cresselia","psiquico",null);
		p.setDescripcion("");
		lista.add(p);
		p = new Pokemon("Phione","agua",null);
		p.setDescripcion("");
		lista.add(p);
		p = new Pokemon("Manaphy","agua",null);
		p.setDescripcion("");
		lista.add(p);
		p = new Pokemon("Shaymin","planta","volador");
		p.setDescripcion("");
		lista.add(p);
		p = new Pokemon("Darkrai","siniestro",null);
		p.setDescripcion("");
		lista.add(p);
		p = new Pokemon("Arceus","normal",null);
		p.setDescripcion("");
		lista.add(p);
		//quinta
		p = new Pokemon("Virizion","planta","lucha");
		p.setDescripcion("");
		lista.add(p);
		p = new Pokemon("Cobalion","acero","lucha");
		p.setDescripcion("");
		lista.add(p);
		p = new Pokemon("Terrakion","roca","lucha");
		p.setDescripcion("");
		lista.add(p);
		p = new Pokemon("Reshiram","dragon","fuego");
		p.setDescripcion("");
		lista.add(p);
		p = new Pokemon("Zekrom","dragon","electrico");
		p.setDescripcion("");
		lista.add(p);
		p = new Pokemon("Kyurem","dragon","hielo");
		p.setDescripcion("");
		lista.add(p);
		p = new Pokemon("Tornadus","volador",null);
		p.setDescripcion("");
		lista.add(p);
		p = new Pokemon("Thundurus","electrico","volador");
		p.setDescripcion("");
		lista.add(p);
		p = new Pokemon("Landorus","tierra","volador");
		p.setDescripcion("");
		lista.add(p);
		p = new Pokemon("Victini","psiquico","fuego");
		p.setDescripcion("");
		lista.add(p);
		p = new Pokemon("Keldeo","agua","lucha");
		p.setDescripcion("");
		lista.add(p);
		p = new Pokemon("Meloetta","normal","psiquico");
		p.setDescripcion("");
		lista.add(p);
		p = new Pokemon("Genesect","bicho","acero");
		p.setDescripcion("");
		lista.add(p);
		//sexta
		p = new Pokemon("Xerneas","hada",null);
		p.setDescripcion("");
		lista.add(p);
		p = new Pokemon("Yveltal","siniestro","volador");
		p.setDescripcion("");
		lista.add(p);
		p = new Pokemon("Zygarde","dragon","tierra");
		p.setDescripcion("");
		lista.add(p);
		p = new Pokemon("Diancie","roca","hada");
		p.setDescripcion("");
		lista.add(p);
		p = new Pokemon("Hoopa","psiquico","fantasma");
		p.setDescripcion("");
		lista.add(p);
		p = new Pokemon("Volcanion","fuego","agua");
		p.setDescripcion("");
		lista.add(p);
	}
}