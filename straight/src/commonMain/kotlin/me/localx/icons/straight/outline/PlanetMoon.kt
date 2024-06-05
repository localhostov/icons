package me.localx.icons.straight.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

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
                lineToRelative(1.148f, 1.207f)
                horizontalLineToRelative(3.0f)
                lineToRelative(1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                lineToRelative(2.0f, 2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                lineToRelative(3.0f, -5.5f)
                lineToRelative(-4.0f, -2.5f)
                horizontalLineToRelative(-2.5f)
                lineToRelative(-1.5f, -1.5f)
                lineToRelative(1.5f, -1.5f)
                lineToRelative(2.0f, 1.0f)
                lineToRelative(1.0f, -1.0f)
                lineToRelative(-1.5f, -2.5f)
                reflectiveCurveToRelative(0.121f, -0.188f, 0.321f, -0.498f)
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
