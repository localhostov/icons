package me.localx.icons.straight.filled

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

public val Icons.Filled.HatCowboy: ImageVector
    get() {
        if (_hatCowboy != null) {
            return _hatCowboy!!
        }
        _hatCowboy = Builder(name = "HatCowboy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, -0.003f)
                reflectiveCurveToRelative(-0.009f, 3.069f, -0.009f, 4.603f)
                curveToRelative(0.0f, 1.473f, -0.145f, 2.85f, -0.407f, 4.155f)
                curveTo(17.034f, 5.162f, 10.153f, 0.413f, 7.966f, 2.601f)
                curveToRelative(-0.979f, 0.979f, -0.979f, 2.305f, -0.978f, 3.274f)
                curveToRelative(0.0f, 0.346f, 0.0f, 0.925f, -0.069f, 1.044f)
                curveToRelative(-0.136f, 0.086f, -0.702f, 0.082f, -1.041f, 0.081f)
                curveToRelative(-0.96f, -0.004f, -2.276f, -0.015f, -3.258f, 0.967f)
                curveToRelative(-1.654f, 1.654f, 0.654f, 5.992f, 3.428f, 9.977f)
                curveToRelative(3.306f, -0.268f, 6.002f, -1.481f, 8.208f, -3.687f)
                curveToRelative(1.181f, -1.181f, 2.066f, -2.509f, 2.685f, -3.989f)
                curveToRelative(0.528f, 0.382f, 1.072f, 0.788f, 1.632f, 1.219f)
                curveToRelative(-0.709f, 1.544f, -1.666f, 2.948f, -2.903f, 4.184f)
                curveToRelative(-2.255f, 2.255f, -5.041f, 3.623f, -8.294f, 4.114f)
                curveToRelative(0.468f, 0.627f, 0.934f, 1.232f, 1.381f, 1.8f)
                curveToRelative(-1.306f, 0.262f, -2.684f, 0.407f, -4.157f, 0.407f)
                curveToRelative(-1.534f, 0.0f, -4.603f, 0.009f, -4.603f, 0.009f)
                lineToRelative(0.006f, 2.0f)
                reflectiveCurveToRelative(3.065f, -0.009f, 4.597f, -0.009f)
                curveToRelative(5.635f, 0.0f, 10.326f, -1.833f, 13.942f, -5.449f)
                reflectiveCurveToRelative(5.449f, -8.307f, 5.449f, -13.942f)
                curveToRelative(0.0f, -1.532f, 0.009f, -4.597f, 0.009f, -4.597f)
                lineToRelative(-2.0f, -0.006f)
                close()
            }
        }
        .build()
        return _hatCowboy!!
    }

private var _hatCowboy: ImageVector? = null
