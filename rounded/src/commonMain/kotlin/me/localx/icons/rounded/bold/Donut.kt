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
                moveToRelative(23.999f, 11.896f)
                curveToRelative(-0.056f, -6.569f, -5.417f, -11.896f, -11.999f, -11.896f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                curveToRelative(1.371f, 0.0f, 2.716f, -0.229f, 4.0f, -0.684f)
                curveToRelative(0.781f, -0.275f, 1.191f, -1.133f, 0.915f, -1.914f)
                curveToRelative(-0.276f, -0.78f, -1.132f, -1.189f, -1.914f, -0.914f)
                curveToRelative(-0.962f, 0.34f, -1.971f, 0.512f, -3.0f, 0.512f)
                curveToRelative(-4.624f, 0.0f, -8.444f, -3.505f, -8.944f, -7.998f)
                curveToRelative(0.0f, -0.02f, 0.002f, -0.04f, 0.002f, -0.06f)
                curveToRelative(0.0f, -1.107f, 0.835f, -1.942f, 1.942f, -1.942f)
                curveToRelative(0.968f, 0.0f, 1.784f, 0.608f, 2.019f, 1.429f)
                curveToRelative(0.014f, 0.169f, 0.037f, 0.336f, 0.068f, 0.499f)
                curveToRelative(0.003f, 0.262f, 0.073f, 0.508f, 0.193f, 0.721f)
                curveToRelative(0.683f, 1.949f, 2.541f, 3.35f, 4.72f, 3.35f)
                curveToRelative(1.634f, 0.0f, 3.087f, -0.788f, 4.0f, -2.003f)
                verticalLineToRelative(2.503f)
                curveToRelative(0.0f, 0.828f, 0.671f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0.0f, -0.552f, 0.449f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(7.5f)
                curveToRelative(0.0f, 0.828f, 0.671f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                curveToRelative(0.0f, 0.0f, 0.0f, -7.569f, -0.001f, -7.604f)
                close()
                moveTo(12.0f, 14.0f)
                curveToRelative(-0.921f, 0.0f, -1.698f, -0.626f, -1.929f, -1.474f)
                curveToRelative(-0.014f, -0.174f, -0.038f, -0.346f, -0.07f, -0.514f)
                curveToRelative(0.0f, -0.004f, 0.0f, -0.008f, 0.0f, -0.012f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.897f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.897f, 2.0f, -2.0f, 2.0f)
                close()
                moveTo(20.0f, 8.0f)
                curveToRelative(-1.459f, 0.0f, -2.739f, 0.786f, -3.437f, 1.956f)
                curveToRelative(-0.783f, -1.741f, -2.534f, -2.956f, -4.563f, -2.956f)
                curveToRelative(-1.618f, 0.0f, -3.058f, 0.772f, -3.972f, 1.968f)
                curveToRelative(-0.846f, -0.608f, -1.894f, -0.968f, -3.028f, -0.968f)
                curveToRelative(-0.387f, 0.0f, -0.762f, 0.042f, -1.121f, 0.123f)
                curveToRelative(1.451f, -3.027f, 4.546f, -5.123f, 8.121f, -5.123f)
                curveToRelative(3.527f, 0.0f, 6.586f, 2.039f, 8.061f, 5.001f)
                curveToRelative(-0.02f, 0.0f, -0.041f, 0.0f, -0.061f, 0.0f)
                close()
            }
        }
        .build()
        return _donut!!
    }

private var _donut: ImageVector? = null
