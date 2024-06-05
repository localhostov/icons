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

public val Icons.Filled.HatWinter: ImageVector
    get() {
        if (_hatWinter != null) {
            return _hatWinter!!
        }
        _hatWinter = Builder(name = "HatWinter", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 21.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                lineTo(3.0f, 24.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(21.0f, 16.0f)
                curveToRelative(0.249f, 0.0f, 0.489f, 0.038f, 0.728f, 0.074f)
                curveToRelative(-0.852f, -5.003f, -3.737f, -10.561f, -7.957f, -11.81f)
                curveToRelative(0.45f, -0.452f, 0.729f, -1.075f, 0.729f, -1.764f)
                curveToRelative(0.0f, -1.381f, -1.119f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.119f, -2.5f, 2.5f)
                curveToRelative(0.0f, 0.689f, 0.279f, 1.312f, 0.73f, 1.765f)
                curveToRelative(-2.793f, 0.827f, -5.0f, 3.541f, -6.42f, 6.735f)
                horizontalLineToRelative(14.162f)
                curveToRelative(0.325f, 0.636f, 0.614f, 1.307f, 0.868f, 2.0f)
                lineTo(3.039f, 13.0f)
                curveToRelative(-0.334f, 1.021f, -0.594f, 2.058f, -0.767f, 3.074f)
                curveToRelative(0.24f, -0.035f, 0.479f, -0.074f, 0.728f, -0.074f)
                horizontalLineToRelative(18.0f)
                close()
            }
        }
        .build()
        return _hatWinter!!
    }

private var _hatWinter: ImageVector? = null
