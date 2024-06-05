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
                moveToRelative(19.062f, 6.921f)
                lineTo(12.0f, 0.014f)
                lineToRelative(-7.071f, 6.915f)
                curveToRelative(-3.899f, 3.899f, -3.899f, 10.243f, 0.0f, 14.143f)
                curveToRelative(1.89f, 1.889f, 4.4f, 2.929f, 7.071f, 2.929f)
                reflectiveCurveToRelative(5.182f, -1.04f, 7.07f, -2.929f)
                reflectiveCurveToRelative(2.93f, -4.4f, 2.93f, -7.071f)
                reflectiveCurveToRelative(-1.04f, -5.183f, -2.938f, -7.079f)
                close()
                moveTo(17.656f, 19.657f)
                curveToRelative(-1.511f, 1.511f, -3.52f, 2.343f, -5.656f, 2.343f)
                reflectiveCurveToRelative(-4.146f, -0.832f, -5.657f, -2.343f)
                curveToRelative(-3.119f, -3.119f, -3.119f, -8.195f, -0.008f, -11.307f)
                lineToRelative(5.665f, -5.54f)
                lineToRelative(5.656f, 5.532f)
                curveToRelative(1.512f, 1.511f, 2.344f, 3.521f, 2.344f, 5.657f)
                reflectiveCurveToRelative(-0.832f, 4.146f, -2.344f, 5.657f)
                close()
                moveTo(12.0f, 8.007f)
                lineToRelative(-3.535f, 3.458f)
                curveToRelative(-0.944f, 0.943f, -1.465f, 2.199f, -1.465f, 3.535f)
                reflectiveCurveToRelative(0.521f, 2.592f, 1.464f, 3.535f)
                reflectiveCurveToRelative(2.2f, 1.465f, 3.536f, 1.465f)
                reflectiveCurveToRelative(2.591f, -0.521f, 3.535f, -1.465f)
                reflectiveCurveToRelative(1.465f, -2.199f, 1.465f, -3.535f)
                reflectiveCurveToRelative(-0.521f, -2.592f, -1.473f, -3.543f)
                lineToRelative(-3.527f, -3.45f)
                close()
                moveTo(14.121f, 17.121f)
                curveToRelative(-1.134f, 1.133f, -3.11f, 1.135f, -4.242f, 0.0f)
                curveToRelative(-0.566f, -0.566f, -0.879f, -1.319f, -0.879f, -2.121f)
                reflectiveCurveToRelative(0.312f, -1.555f, 0.871f, -2.113f)
                lineToRelative(2.129f, -2.083f)
                lineToRelative(2.121f, 2.075f)
                curveToRelative(0.566f, 0.566f, 0.879f, 1.319f, 0.879f, 2.121f)
                reflectiveCurveToRelative(-0.313f, 1.555f, -0.879f, 2.121f)
                close()
            }
        }
        .build()
        return _fireFlameSimple!!
    }

private var _fireFlameSimple: ImageVector? = null
