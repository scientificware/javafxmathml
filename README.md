# JavaFXMathML
JavaFXMathML est un projet d’éditeur de textes scientifiques écrit en Java/JavaFX ( Java Scientific Equation Editor ).
Exportation prévue aux formats MathML, LaTeX, TeXmacs.

- Une première étape vient d'être franchie.
L'affichage des expressions mathématiques est réparé. Le travail que j'ai mené fait l'objet :
  - d'un rapport sur le dépôt d'OpenJFX :  [JavaFX and MathML #71](https://github.com/javafxports/openjdk-jfx/issues/71)
  - mais aussi d'une proposition de correction [JDK-8147476 : Rendering issues with MathML token elements. #117](https://github.com/javafxports/openjdk-jfx/pull/117). Cette proposition devrait être intégrée dans OpenJFX 11 en septembre 2018.
- L'affichage est réparé mais l'éditeur n'est pas encore capable de gérer les signes mathématiques, ni le expressions mathématiques. C'est l'objet de ma deuxième étape de travail.
  - Rapport sur le dépôt d'OpenJFX [HTMLEditor and MathML. #118](https://github.com/javafxports/openjdk-jfx/issues/118).
  - Document à consulter [W3C The Editing taskforce](http://w3c.github.io/editing/).


## Maintenant :
![screenshot_20180703_125433](https://user-images.githubusercontent.com/19194678/42216096-e7b632d8-7ec0-11e8-81df-e37eb6bfd3a5.png)

(à gauche le rendu par TEX et à droite le rendu par JavaFXMathML)

![Capture d'écran de JavaFXMathML](/images/Screenshot_20180702_040429.png)

![Capture d'écran de JavaFXMathML](/images/Screenshot_20180619_191413.png)

## Avant :

![Capture d'écran de JavaFXMathML](/images/screen_shoot_javafxmathml_201801021624.png)

C'est nettement mieux, non ?

