package me.localx.icons.rounded.bold

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

public val Icons.Bold.CompassNorth: ImageVector
    get() {
        if (_compassNorth != null) {
            return _compassNorth!!
        }
        _compassNorth = Builder(name = "CompassNorth", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.308f, 14.034f)
                curveToRelative(0.395f, 0.893f, -0.006f, 1.927f, -0.888f, 2.316f)
                curveToRelative(-0.468f, 0.206f, -0.997f, 0.198f, -1.451f, -0.02f)
                curveToRelative(-0.316f, -0.187f, -2.968f, -1.549f, -2.968f, -1.549f)
                curveToRelative(0.0f, 0.0f, -2.964f, 1.516f, -3.149f, 1.61f)
                curveToRelative(-0.559f, 0.232f, -1.3f, 0.087f, -1.798f, -0.414f)
                curveToRelative(-0.52f, -0.533f, -0.654f, -1.305f, -0.359f, -1.948f)
                curveToRelative(0.001f, -0.003f, 3.734f, -7.03f, 3.734f, -7.03f)
                curveToRelative(0.653f, -1.305f, 2.51f, -1.311f, 3.171f, -0.01f)
                curveToRelative(0.0f, 0.0f, 3.032f, 5.476f, 3.71f, 7.045f)
                close()
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, 6.617f, -5.383f, 12.0f, -12.0f, 12.0f)
                reflectiveCurveTo(0.0f, 18.617f, 0.0f, 12.0f)
                reflectiveCurveTo(5.383f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.383f, 12.0f, 12.0f)
                close()
                moveTo(21.0f, 12.0f)
                curveToRelative(0.0f, -4.962f, -4.037f, -9.0f, -9.0f, -9.0f)
                reflectiveCurveTo(3.0f, 7.038f, 3.0f, 12.0f)
                reflectiveCurveToRelative(4.037f, 9.0f, 9.0f, 9.0f)
                reflectiveCurveToRelative(9.0f, -4.038f, 9.0f, -9.0f)
                close()
            }
        }
        .build()
        return _compassNorth!!
    }

private var _compassNorth: ImageVector? = null
