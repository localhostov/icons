package me.localx.icons.rounded.filled

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

public val Icons.Filled.FireFlameSimple: ImageVector
    get() {
        if (_fireFlameSimple != null) {
            return _fireFlameSimple!!
        }
        _fireFlameSimple = Builder(name = "FireFlameSimple", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.125f, 12.883f)
                curveToRelative(0.564f, 0.566f, 0.875f, 1.317f, 0.875f, 2.117f)
                reflectiveCurveToRelative(-0.313f, 1.555f, -0.88f, 2.121f)
                curveToRelative(-1.13f, 1.135f, -3.107f, 1.133f, -4.241f, 0.0f)
                curveToRelative(-0.566f, -0.566f, -0.879f, -1.319f, -0.879f, -2.121f)
                reflectiveCurveToRelative(0.312f, -1.555f, 0.868f, -2.11f)
                lineToRelative(1.788f, -1.735f)
                curveToRelative(0.097f, -0.095f, 0.223f, -0.142f, 0.348f, -0.142f)
                reflectiveCurveToRelative(0.25f, 0.048f, 0.347f, 0.142f)
                lineToRelative(1.774f, 1.729f)
                close()
                moveTo(19.778f, 20.779f)
                curveToRelative(-2.078f, 2.077f, -4.841f, 3.222f, -7.778f, 3.222f)
                reflectiveCurveToRelative(-5.7f, -1.145f, -7.778f, -3.222f)
                curveTo(-0.067f, 16.489f, -0.067f, 9.511f, 4.222f, 5.222f)
                lineToRelative(3.992f, -3.688f)
                curveToRelative(1.003f, -0.981f, 2.354f, -1.533f, 3.786f, -1.533f)
                reflectiveCurveToRelative(2.783f, 0.552f, 3.807f, 1.553f)
                lineToRelative(3.943f, 3.642f)
                curveToRelative(4.317f, 4.316f, 4.317f, 11.295f, 0.028f, 15.584f)
                close()
                moveTo(17.0f, 15.001f)
                curveToRelative(0.0f, -1.336f, -0.521f, -2.592f, -1.465f, -3.535f)
                lineToRelative(-0.009f, -0.009f)
                lineToRelative(-1.78f, -1.734f)
                curveToRelative(-0.975f, -0.948f, -2.505f, -0.95f, -3.483f, -0.002f)
                lineToRelative(-1.798f, 1.745f)
                curveToRelative(-0.944f, 0.943f, -1.465f, 2.199f, -1.465f, 3.535f)
                reflectiveCurveToRelative(0.521f, 2.592f, 1.465f, 3.535f)
                curveToRelative(0.944f, 0.944f, 2.2f, 1.465f, 3.535f, 1.465f)
                reflectiveCurveToRelative(2.592f, -0.521f, 3.535f, -1.465f)
                curveToRelative(0.944f, -0.943f, 1.465f, -2.199f, 1.465f, -3.535f)
                close()
            }
        }
        .build()
        return _fireFlameSimple!!
    }

private var _fireFlameSimple: ImageVector? = null
