package me.localx.icons.straight.bold

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

public val Icons.Bold.Donut: ImageVector
    get() {
        if (_donut != null) {
            return _donut!!
        }
        _donut = Builder(name = "Donut", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 20.0f)
                reflectiveCurveToRelative(0.0f, -8.069f, -0.001f, -8.104f)
                curveToRelative(-0.056f, -6.569f, -5.417f, -11.896f, -11.999f, -11.896f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                curveToRelative(0.0f, 7.346f, 5.72f, 12.0f, 12.0f, 12.0f)
                curveToRelative(2.615f, 0.0f, 5.029f, -0.85f, 7.0f, -2.278f)
                verticalLineToRelative(-1.722f)
                horizontalLineToRelative(-2.896f)
                curveToRelative(-1.232f, 0.635f, -2.625f, 1.0f, -4.104f, 1.0f)
                curveToRelative(-4.733f, 0.0f, -8.625f, -3.673f, -8.974f, -8.319f)
                curveToRelative(0.153f, -0.952f, 0.98f, -1.681f, 1.974f, -1.681f)
                curveToRelative(1.103f, 0.0f, 2.101f, 0.897f, 2.101f, 2.0f)
                curveToRelative(0.465f, 2.279f, 2.485f, 4.0f, 4.899f, 4.0f)
                curveToRelative(1.634f, 0.0f, 3.087f, -0.788f, 4.0f, -2.003f)
                verticalLineToRelative(3.003f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -0.552f, 0.449f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(12.0f, 14.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.897f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.897f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.897f, 2.0f, -2.0f, 2.0f)
                close()
                moveTo(20.0f, 8.0f)
                curveToRelative(-1.459f, 0.0f, -2.739f, 0.786f, -3.437f, 1.956f)
                curveToRelative(-0.783f, -1.741f, -2.534f, -2.956f, -4.563f, -2.956f)
                curveToRelative(-1.634f, 0.0f, -3.087f, 0.788f, -4.0f, 2.003f)
                curveToRelative(-0.836f, -0.629f, -1.876f, -1.003f, -3.0f, -1.003f)
                curveToRelative(-0.386f, 0.0f, -0.762f, 0.044f, -1.123f, 0.127f)
                curveToRelative(1.45f, -3.03f, 4.546f, -5.127f, 8.123f, -5.127f)
                curveToRelative(3.527f, 0.0f, 6.586f, 2.039f, 8.061f, 5.001f)
                curveToRelative(-0.02f, 0.0f, -0.041f, 0.0f, -0.061f, 0.0f)
                close()
            }
        }
        .build()
        return _donut!!
    }

private var _donut: ImageVector? = null
