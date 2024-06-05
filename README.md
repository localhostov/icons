<p align="middle">
    <img src="./images/banner.png" width="99%" />
</p>

# Icons
![Maven Central Version](https://img.shields.io/maven-central/v/lol.hostov.icons/rounded?style=flat-square&logoColor=634080&labelColor=%23542080&color=%2320802A)
![GitHub License](https://img.shields.io/github/license/localhostov/icons?style=flat-square)

This is a Jetpack Multiplatform icons pack with more than 3000 straight and rounded icons.

### Install:

```
# for rounded icons pack
icons = { module = "lol.hostov.icons:rounded", version = "1.1.0" }

# for straight icons pack
icons = { module = "lol.hostov.icons:straight", version = "1.1.0" }
```

### Usage example:
```
// import me.localx.icons.rounded.Icons
// import me.localx.icons.rounded.Icons.Check

Icon(
    painter = rememberVectorPainter(Icons.Outline.Check) 
    contentDescription = null,
    modifier = Modifier.size(56.dp),
    tint = Color.Red
)
```

For more icon examples see the <a href="https://localhostov.github.io/icons/">website</a>

### Source
Uicons by <a href="https://flaticon.com/uicons">Flaticon</a>

Figma: https://www.figma.com/community/file/1380005566074048103