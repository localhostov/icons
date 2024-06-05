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
                curveToRelative(0.586f, -0.588f, 0.881f, -1.467f, 0.65f, -2.402f)
                curveToRelative(-0.211f, -0.854f, -0.904f, -1.557f, -1.756f, -1.776f)
                curveToRelative(-1.668f, -0.43f, -3.165f, 0.817f, -3.165f, 2.414f)
                curveToRelative(0.0f, 0.689f, 0.279f, 1.312f, 0.73f, 1.765f)
                curveToRelative(-2.793f, 0.827f, -5.0f, 3.541f, -6.42f, 6.735f)
                horizontalLineToRelative(13.534f)
                curveToRelative(0.384f, 0.0f, 0.741f, 0.215f, 0.902f, 0.563f)
                curveToRelative(0.003f, 0.007f, 0.006f, 0.013f, 0.009f, 0.02f)
                curveToRelative(0.305f, 0.659f, -0.177f, 1.418f, -0.902f, 1.418f)
                lineTo(3.039f, 13.001f)
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
