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

public val Icons.Bold.Ufo: ImageVector
    get() {
        if (_ufo != null) {
            return _ufo!!
        }
        _ufo = Builder(name = "Ufo", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.507f, 8.956f)
                curveToRelative(-0.788f, -2.854f, -3.406f, -4.956f, -6.507f, -4.956f)
                reflectiveCurveToRelative(-5.72f, 2.102f, -6.507f, 4.956f)
                curveToRelative(-3.472f, 1.045f, -5.493f, 2.883f, -5.493f, 5.08f)
                curveToRelative(0.0f, 3.916f, 6.037f, 5.965f, 12.0f, 5.965f)
                reflectiveCurveToRelative(12.0f, -2.049f, 12.0f, -5.965f)
                curveToRelative(0.0f, -2.197f, -2.021f, -4.034f, -5.493f, -5.08f)
                close()
                moveTo(12.0f, 7.0f)
                curveToRelative(1.973f, 0.0f, 3.595f, 1.532f, 3.74f, 3.469f)
                curveToRelative(-0.591f, 0.23f, -1.746f, 0.531f, -3.74f, 0.531f)
                curveToRelative(-2.013f, 0.0f, -3.171f, -0.307f, -3.74f, -0.522f)
                curveToRelative(0.14f, -1.941f, 1.764f, -3.478f, 3.74f, -3.478f)
                close()
                moveTo(12.0f, 17.0f)
                curveToRelative(-5.583f, 0.0f, -9.0f, -1.92f, -9.0f, -2.965f)
                curveToRelative(0.0f, -0.462f, 0.786f, -1.242f, 2.441f, -1.89f)
                lineToRelative(0.248f, 0.248f)
                curveToRelative(0.377f, 0.377f, 1.945f, 1.606f, 6.311f, 1.606f)
                reflectiveCurveToRelative(5.934f, -1.229f, 6.311f, -1.606f)
                lineToRelative(0.248f, -0.248f)
                curveToRelative(1.655f, 0.648f, 2.441f, 1.428f, 2.441f, 1.89f)
                curveToRelative(0.0f, 1.045f, -3.417f, 2.965f, -9.0f, 2.965f)
                close()
            }
        }
        .build()
        return _ufo!!
    }

private var _ufo: ImageVector? = null
