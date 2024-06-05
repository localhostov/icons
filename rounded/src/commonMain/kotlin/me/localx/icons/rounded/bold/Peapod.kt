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

public val Icons.Bold.Peapod: ImageVector
    get() {
        if (_peapod != null) {
            return _peapod!!
        }
        _peapod = Builder(name = "Peapod", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.961f, 1.008f)
                curveToRelative(-0.778f, -0.769f, -1.848f, -1.124f, -2.927f, -0.976f)
                curveToRelative(-2.504f, 0.343f, -8.841f, 1.654f, -13.595f, 6.407f)
                curveTo(1.687f, 11.191f, 0.375f, 17.529f, 0.032f, 20.034f)
                curveToRelative(-0.147f, 1.082f, 0.208f, 2.148f, 0.976f, 2.927f)
                curveToRelative(0.664f, 0.672f, 1.547f, 1.04f, 2.475f, 1.04f)
                curveToRelative(0.144f, 0.0f, 0.289f, -0.009f, 0.434f, -0.027f)
                curveToRelative(2.481f, -0.307f, 8.776f, -1.545f, 13.645f, -6.413f)
                curveToRelative(4.867f, -4.866f, 6.105f, -11.163f, 6.412f, -13.644f)
                curveToRelative(0.134f, -1.081f, -0.234f, -2.141f, -1.012f, -2.908f)
                close()
                moveTo(15.44f, 15.439f)
                curveToRelative(-4.21f, 4.209f, -9.718f, 5.288f, -11.891f, 5.557f)
                curveToRelative(-0.211f, 0.029f, -0.342f, -0.079f, -0.405f, -0.143f)
                curveToRelative(-0.064f, -0.065f, -0.167f, -0.205f, -0.139f, -0.413f)
                curveToRelative(0.235f, -1.719f, 1.332f, -7.657f, 5.556f, -11.88f)
                curveToRelative(4.225f, -4.224f, 10.161f, -5.32f, 11.88f, -5.556f)
                curveToRelative(0.024f, -0.003f, 0.355f, 0.082f, 0.413f, 0.139f)
                curveToRelative(0.064f, 0.063f, 0.168f, 0.2f, 0.143f, 0.405f)
                curveToRelative(-0.269f, 2.173f, -1.349f, 7.683f, -5.557f, 11.891f)
                close()
                moveTo(14.501f, 12.0f)
                curveToRelative(0.0f, 1.381f, -1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                close()
                moveTo(9.501f, 16.5f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                close()
                moveTo(18.501f, 7.5f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _peapod!!
    }

private var _peapod: ImageVector? = null
