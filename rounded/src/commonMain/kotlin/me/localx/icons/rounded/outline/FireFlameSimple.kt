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

public val Icons.Outline.FireFlameSimple: ImageVector
    get() {
        if (_fireFlameSimple != null) {
            return _fireFlameSimple!!
        }
        _fireFlameSimple = Builder(name = "FireFlameSimple", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.526f, 11.456f)
                lineToRelative(-1.78f, -1.734f)
                curveToRelative(-0.975f, -0.948f, -2.505f, -0.95f, -3.483f, -0.002f)
                lineToRelative(-1.798f, 1.745f)
                curveToRelative(-0.944f, 0.943f, -1.465f, 2.199f, -1.465f, 3.535f)
                reflectiveCurveToRelative(0.521f, 2.592f, 1.465f, 3.535f)
                curveToRelative(0.944f, 0.944f, 2.2f, 1.465f, 3.535f, 1.465f)
                reflectiveCurveToRelative(2.592f, -0.521f, 3.535f, -1.465f)
                curveToRelative(0.944f, -0.943f, 1.465f, -2.199f, 1.465f, -3.535f)
                reflectiveCurveToRelative(-0.521f, -2.592f, -1.465f, -3.535f)
                lineToRelative(-0.009f, -0.009f)
                close()
                moveTo(14.12f, 17.121f)
                curveToRelative(-1.13f, 1.135f, -3.107f, 1.133f, -4.241f, 0.0f)
                curveToRelative(-0.566f, -0.566f, -0.879f, -1.319f, -0.879f, -2.121f)
                reflectiveCurveToRelative(0.312f, -1.555f, 0.868f, -2.11f)
                lineToRelative(1.788f, -1.735f)
                curveToRelative(0.097f, -0.095f, 0.223f, -0.142f, 0.348f, -0.142f)
                reflectiveCurveToRelative(0.25f, 0.048f, 0.347f, 0.142f)
                lineToRelative(1.774f, 1.729f)
                curveToRelative(0.564f, 0.566f, 0.875f, 1.317f, 0.875f, 2.117f)
                reflectiveCurveToRelative(-0.313f, 1.555f, -0.88f, 2.121f)
                close()
                moveTo(19.75f, 5.194f)
                lineToRelative(-3.943f, -3.642f)
                curveToRelative(-1.023f, -1.001f, -2.375f, -1.553f, -3.807f, -1.553f)
                reflectiveCurveToRelative(-2.783f, 0.552f, -3.786f, 1.533f)
                lineToRelative(-3.992f, 3.688f)
                curveTo(-0.067f, 9.511f, -0.067f, 16.489f, 4.222f, 20.778f)
                curveToRelative(2.078f, 2.077f, 4.841f, 3.222f, 7.778f, 3.222f)
                reflectiveCurveToRelative(5.7f, -1.145f, 7.778f, -3.222f)
                curveToRelative(4.289f, -4.289f, 4.289f, -11.268f, -0.028f, -15.584f)
                close()
                moveTo(18.364f, 19.364f)
                curveToRelative(-1.701f, 1.699f, -3.961f, 2.636f, -6.364f, 2.636f)
                reflectiveCurveToRelative(-4.664f, -0.937f, -6.364f, -2.636f)
                curveToRelative(-3.509f, -3.51f, -3.509f, -9.219f, -0.028f, -12.701f)
                lineToRelative(3.984f, -3.681f)
                curveToRelative(0.647f, -0.634f, 1.503f, -0.982f, 2.408f, -0.982f)
                reflectiveCurveToRelative(1.761f, 0.349f, 2.429f, 1.002f)
                lineToRelative(3.936f, 3.634f)
                curveToRelative(3.509f, 3.51f, 3.509f, 9.219f, 0.0f, 12.729f)
                close()
            }
        }
        .build()
        return _fireFlameSimple!!
    }

private var _fireFlameSimple: ImageVector? = null
