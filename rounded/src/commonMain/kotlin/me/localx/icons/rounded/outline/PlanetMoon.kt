package me.localx.icons.rounded.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Outline.PlanetMoon: ImageVector
    get() {
        if (_planetMoon != null) {
            return _planetMoon!!
        }
        _planetMoon = Builder(name = "PlanetMoon", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.5f, 3.0f)
                curveTo(4.71f, 3.0f, 0.0f, 7.71f, 0.0f, 13.5f)
                reflectiveCurveToRelative(4.71f, 10.5f, 10.5f, 10.5f)
                reflectiveCurveToRelative(10.5f, -4.71f, 10.5f, -10.5f)
                reflectiveCurveTo(16.29f, 3.0f, 10.5f, 3.0f)
                close()
                moveTo(10.5f, 22.0f)
                curveToRelative(-4.687f, 0.0f, -8.5f, -3.813f, -8.5f, -8.5f)
                curveToRelative(0.0f, -1.328f, 0.306f, -2.586f, 0.852f, -3.707f)
                lineToRelative(0.852f, 0.896f)
                curveToRelative(0.189f, 0.198f, 0.451f, 0.311f, 0.725f, 0.311f)
                horizontalLineToRelative(2.181f)
                curveToRelative(0.25f, 0.0f, 0.489f, 0.099f, 0.666f, 0.276f)
                lineToRelative(0.448f, 0.448f)
                curveToRelative(0.177f, 0.177f, 0.276f, 0.416f, 0.276f, 0.666f)
                verticalLineToRelative(0.781f)
                curveToRelative(0.0f, 0.53f, 0.211f, 1.039f, 0.586f, 1.414f)
                lineToRelative(1.138f, 1.138f)
                curveToRelative(0.177f, 0.177f, 0.276f, 0.416f, 0.276f, 0.666f)
                verticalLineToRelative(1.482f)
                curveToRelative(0.0f, 0.623f, 0.505f, 1.128f, 1.128f, 1.128f)
                horizontalLineToRelative(0.491f)
                curveToRelative(0.413f, 0.0f, 0.793f, -0.226f, 0.99f, -0.588f)
                lineToRelative(2.254f, -4.133f)
                curveToRelative(0.239f, -0.438f, 0.095f, -0.985f, -0.328f, -1.25f)
                lineToRelative(-3.05f, -1.726f)
                curveToRelative(-0.318f, -0.199f, -0.685f, -0.304f, -1.06f, -0.304f)
                horizontalLineToRelative(-1.536f)
                curveToRelative(-0.25f, 0.0f, -0.489f, -0.099f, -0.666f, -0.276f)
                lineToRelative(-0.558f, -0.558f)
                curveToRelative(-0.368f, -0.368f, -0.368f, -0.964f, 0.0f, -1.332f)
                lineToRelative(0.354f, -0.354f)
                curveToRelative(0.287f, -0.287f, 0.725f, -0.358f, 1.087f, -0.176f)
                lineToRelative(0.786f, 0.393f)
                curveToRelative(0.363f, 0.181f, 0.801f, 0.11f, 1.087f, -0.176f)
                curveToRelative(0.306f, -0.306f, 0.364f, -0.78f, 0.142f, -1.151f)
                lineToRelative(-0.82f, -1.366f)
                curveToRelative(-0.185f, -0.308f, -0.179f, -0.693f, 0.016f, -0.995f)
                curveToRelative(0.001f, -0.002f, 0.002f, -0.004f, 0.004f, -0.006f)
                curveToRelative(0.059f, -0.001f, 0.119f, -0.002f, 0.179f, -0.002f)
                curveToRelative(4.687f, 0.0f, 8.5f, 3.813f, 8.5f, 8.5f)
                reflectiveCurveToRelative(-3.813f, 8.5f, -8.5f, 8.5f)
                close()
                moveTo(24.0f, 2.5f)
                curveToRelative(0.0f, 1.381f, -1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                close()
            }
        }
        .build()
        return _planetMoon!!
    }

private var _planetMoon: ImageVector? = null
