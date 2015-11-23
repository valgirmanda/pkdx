<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<%
	session.setAttribute("page", "Home");
%>

<%@include file="head.jsp"%>
<body role="document">
	<%@include file="nav.jsp"%>
	<div class="container theme-showcase" role="main">
		<div class="page-header">Pokémon <img src="imagenes/pokeballs.png" width="80" height="100"/></div>

		<p>Pokémon (también abreviado PKMN; ポケットモンスター Pocket Monsters en
			japonés) es una franquicia de videojuegos que comenzó siendo de tipo
			RPG para las consolas de Nintendo creada por Satoshi Tajiri en 1995.
			Su éxito fue tal que abarcó otros géneros de videojuegos y campos del
			entretenimiento tales como una serie de anime, manga y una gran
			variedad de artículos de colección, como cartas del TCG, muñecos,
			etc.</p>

		<div class="page-header">Etimología</div>

		<p>La palabra Pokémon es la escritura con letras latinas de las
			japonesas: "ポケモン", que son una abreviatura de Poketto Monsutaa
			(escrito en katakana como ポケットモンスター), que a su vez proviene del
			inglés 'Pocket Monsters', que quiere decir "monstruos de bolsillo".
			Esto viene del hecho de que los Pokémon se guardan en <a href="Pokeball.jsp">Poké Balls</a>, las
			cuales se pueden encoger con lo que se pueden meter en el bolsillo.
			Además, originalmente, Pokémon fue lanzado para Game Boy, consola que
			cabe perfectamente en un bolsillo, que casualmente de preferencia al
			nombre de la serie, videojuego, juego de mesa, etc.</p>

		<p>En inglés, la palabra se escribe Pokémon con tilde en acento
			agudo, a pesar de que este signo no existe en el uso habitual de este
			idioma. Esto se debe a que al unir las palabras Pocket Monster se
			obtuvo Poke-Mon. El problema es que según las normas del inglés, esto
			se pronunciaría como /pəʊk'mɑ:n/ (pouk mon). En muy pocos otros casos
			(como maté que se pronuncia /mátei/ y quiere decir mate) se puede
			poner en inglés un acento en la "e" para que esta se pronuncie,
			resultando así el nombre "Pokémon". En español se puede usar la
			transcripción rōmaji que prescinde del acento por razones
			ortográficas, si bien en el uso comercial habitualmente aparece
			usando la tilde.</p>

		<div class="page-header">¿Qué son los pokémon?</div>

		<p>Los Pokémon (ポケモン Pokémon en japonés) son criaturas ficticias,
			que dependiendo de la especie o el tipo, pueden tener rasgos físicos
			parecidos a animales, plantas, rocas, fantasmas, o incluso humanos
			(aunque de tamaño en muchos casos muy superior a lo que mediría la
			especie a la que se parece). Poseen poderes fantásticos que pueden
			utilizar llevando a cabo movimientos o habilidades para atacar,
			defenderse o cumplir sus necesidades. Generalmente pueden vivir en
			todo tipo de entornos, subsistiendo en la libertad de la naturaleza o
			conviviendo con humanos y ayudándolos.</p>

		<div class="page-header">Generaciones de los videojuegos</div>


		<div class="panel panel-success">
			<div class="panel-heading">
				<h3 class="panel-title">Primera Generación</h3>
			</div>
			<div class="panel-body">
				<p>Los videojuegos de Pokémon originalmente fueron de estilo RPG
					para la consola portátil Game Boy que consistía en ayudar al
					profesor Oak en su investigación atrapando a todos los Pokémon
					existentes (151), y luchar contra entrenadores de toda la región
					para convertirse en el mejor entrenador Pokémon de la región Kanto.
					Salieron dos versiones con Pokémon exclusivos de cada una, Pokémon
					Rojo y Pokémon Azul, para tener así que intercambiar entre ambas
					versiones para conseguirlos a todos. Además, se podía pelear entre
					amigos con dos consolas conectadas con el Cable Link. Con el éxito
					de estos primeros videojuegos salió una nueva versión, Pokémon
					Amarillo, un poco más cercana a la serie animada de televisión.
					Estos juegos entrarían en lo que se conoce como primera generación.
				</p>

				<p>Más adelante empezaron a salir algunos otros videojuegos de
					temática Pokémon pero con distinto enfoque, como los Pokémon
					Stadium para la consola de sobremesa Nintendo 64 que se centraba en
					las batallas Pokémon de entrenadores. También salieron juegos de
					Pinball como Pokémon Pinball o de Puzzles como Pokémon Puzzle
					Challenge. También uno de fotografiar Pokémon, Pokémon Snap.
					También salió un juego llamado Hey You, Pikachu! en donde
					interactúas y le hablas a un Pikachu.</p>

				<p>Fuera de las videoconsolas salió un juego de cartas
					intercambiables, Pokémon Trading Card Game, que también salió como
					videojuego para la consola portátil Game Boy Color.</p>
			</div>
		</div>

		<div class="panel panel-info">
			<div class="panel-heading">
				<h3 class="panel-title">Segunda Generación</h3>
			</div>
			<div class="panel-body">
				<p>Con el éxito de ventas, aparecieron juegos de lo que se
					conoce como segunda generación, Pokémon Oro, Pokémon Plata y
					Pokémon Cristal para la nueva consola Game Boy Color en los que se
					agregaron 100 nuevas especies Pokémon a las 151 existentes. Los
					videojuegos se desarrollaron en una nueva región, Johto, en la que
					se podía visitar la región Kanto habiendo compatibilidad con los
					videojuegos anteriores. El mismo objetivo pero una historia
					diferente, con nuevos protagonistas y personajes.</p>

				<p>Además también se lanzaron muchas secuelas de los juegos
					derivados de Pokémon, como Pokémon Stadium 2 y Pokémon Trading Card
					Game 2 (este último sólo en Japón).</p>
			</div>
		</div>

		<div class="panel panel-default">
			<div class="panel-heading">
				<h3 class="panel-title">Tercera Generación</h3>
			</div>
			<div class="panel-body">
				<p>En la tercera generación se dio el salto a la consola Game
					Boy Advance. Con las ediciones Pokémon Rubí y Pokémon Zafiro y
					posteriormente con Pokémon Esmeralda y con una nueva tecnología que
					permitía mejores gráficos, y una nueva sensación al jugar. Sin
					embargo, se perdió completamente la compatibilidad con versiones
					anteriores, por lo que los videojuegos de primera y segunda
					generación quedaron aislados para siempre. Se agregaron 135 nuevas
					especies resultando en una suma de 386 Pokémon que capturar y una
					nueva región por explorar, Hoenn.</p>

				<p>Sin embargo, la gran mayoría de especies que aparecieron en
					generaciones anteriores no aparecían en estos juegos, hasta que
					salió una reedición de los primeros juegos, Pokémon Rojo Fuego y
					Pokémon Verde Hoja que añadió la posibilidad de conseguirlos.</p>

				<p>En esta época aparecieron también otros juegos de géneros
					distintos: Pokémon Dash, un juego de carreras; Pokémon Link!, un
					juego de puzzle; Pokémon Colosseum, un juego de batallas; Pokémon
					XD: Tempestad Oscura, un juego en el que puedes luchar contra
					Pokémon oscuros, como el Lugia oscuro; Pokémon Mundo Misterioso:
					Equipo de rescate Rojo y Equipo de rescate Azul, en los que el
					protagonista se convierte en un Pokémon y debe explorar mazmorras;
					y Pokémon Ranger, en el que el protagonista es un guardabosques y
					se captura a los Pokémon trazando círculos con el lápiz táctil del
					Nintendo DS.</p>
			</div>
		</div>

		<div class="panel panel-primary">
			<div class="panel-heading">
				<h3 class="panel-title">Cuarta Generación</h3>
			</div>
			<div class="panel-body">
				<p>En el año 2006 llegó la cuarta generación, donde los
					videojuegos Pokémon Diamante y Pokémon Perla, y posteriormente
					Pokémon Platino son para Nintendo DS, con el mismo objetivo pero
					con 107 nuevas criaturas, dando un total de 493 Pokémon existentes
					y la nueva región, Sinnoh.</p>

				<p>También forman parte de esta generación Pokémon Battle
					Revolution para Wii, parecido a Pokémon Colosseum pero compatible
					con los anteriores; PokéPark un juego para Wii en el que únicamente
					podrás manejar a Pikachu; Pokémon Mundo Misterioso: Exploradores
					del Tiempo y Exploradores de la Oscuridad y Pokémon Mundo
					Misterioso: Exploradores del Cielo en el que viajarás por nuevas
					mazmorras; Pokémon Ranger: Sombras de Almia en el que podrás
					capturar nuevos Pokémon y viajarás por la nueva región de Almia y
					también Pokémon Ranger: Trazos de Luz en el que viajarás por la
					región de Oblivia y podrás capturar más Pokémon que no habían
					aparecido.</p>

				<p>Al final de esta generación, en el 2009, aparecen Pokémon Oro
					HeartGold y Pokémon Plata SoulSilver, reediciones de los juegos
					Pokémon Oro y Pokémon Plata de la segunda generación, actualizados
					a la época y con la posibilidad de capturar Pokémon de las regiones
					Hoenn y Sinnoh.</p>
			</div>
		</div>

		<div class="panel panel-warning">
			<div class="panel-heading">
				<h3 class="panel-title">Quinta Generación</h3>
			</div>
			<div class="panel-body">
				<p>En el año 2010, se anunció la quinta generación con dos
					nuevos juegos, Pokémon Negro y Pokémon Blanco, dando lugar a la
					nueva región Teselia en la cual se implementaron 156 nuevos
					Pokémon, sumando un total de 649 especies diferentes. El objetivo
					de estos juegos no es otro más que atraparlos a todos y ser el
					mejor. Esta vez muchos fanáticos afirmaban que los Pokémon de ahora
					eran demasiado originales y que ya no parecía el Pokémon de antes;
					pero aún así han habido récords de ventas.</p>

				<p>Poco después de la salida de Pokémon Negro y Pokémon Blanco,
					se anuncia Aprende con Pokémon: Aventura entre las teclas, un juego
					de la quinta generación orientado a un público infantil; y también
					Pokémon Card Game: How to Play DS, un juego parecido al Pokémon
					Trading Card Game pero educativo; más tarde salió Pokémon Conquest,
					un juego ambientado en el Japón feudal (que no llegó a Europa);
					también anunciaron en septiembre la nueva edición de Pokémon Mundo
					Misterioso: Portales al infinito, que fue para Nintendo 3DS.
					También han salido aplicaciones para la Nintendo 3DS como la
					Pokédex 3D, el RAdar Pokémon, y la Pokédex 3D Pro, una versión
					nueva en la que salen las nuevas formas y todos los Pokémon de
					otras regiones. Además, se estrena la decimocuarta película de
					Pokémon en los cines japoneses en junio y julio del 2011, que
					además es dual: son 2 películas con el mismo argumento en la que en
					una el protagonista es Reshiram y en la otra es Zekrom.</p>

				<p>A finales de febrero de 2012, en el programa de Pokémon Smash
					se anunciaron dos nuevos juegos de la quinta generación: Pokémon
					Negro 2 y Pokémon Blanco 2, los cuales se desarrollan también en la
					región Teselia, pero dos años después en el tiempo de Pokémon Negro
					y Pokémon Blanco, con cambios en la historia, personajes y lugares,
					también se pueden encontrar Pokémon de otras regiones antes de
					pasar la Liga Pokémon. No se introducen nuevos Pokémon, pero sí
					nuevas formas de los Pokémon legendarios del Trío de las nubes,
					Kyurem y Keldeo.</p>
			</div>
		</div>


		<div class="panel panel-danger">
			<div class="panel-heading">
				<h3 class="panel-title">Sexta Generación</h3>
			</div>
			<div class="panel-body">
				<p>Fue anunciada oficialmente durante el Pokémon Direct, en
					simultáneo en todo el mundo y en diferentes idiomas, el día 8 de
					enero de 2013 por el mismísimo Satoru Iwata, presidente de
					Nintendo. Días atrás, se reveló al final de un comercial de Pokémon
					Negro 2 y Pokémon Blanco 2 que el 8 de enero, en el evento Pokémon
					Direct, se haría un anuncio importante que revolucionaría la
					franquicia.</p>

				<p>Esta generación debuta con los videojuegos en 3D Pokémon X y
					Pokémon Y y Pokémon Rubí Omega y Pokémon Zafiro Alfa para Nintendo
					3DS. Unas de sus novedades son los gráficos en 3D totalmente
					renovados y diferentes a cualquier juego anterior de la franquicia.
					Se añaden los patines como nueva forma de desplazamiento, las
					megaevoluciones, la región de Kalos y se introducieron 70 nuevos
					Pokémon sumando un total de 719 de especies diferentes, siendo así
					la generación en la que menos Pokémon se introudujeron por el
					momento. Otra gran novedad es el la introducción de un nuevo tipo,
					el tipo hada.</p>
			</div>
		</div>

	</div>
</body>
</html>