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

public val Icons.Filled.CirclePhone: ImageVector
    get() {
        if (_circlePhone != null) {
            return _circlePhone!!
        }
        _circlePhone = Builder(name = "CirclePhone", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 12.0f)
                curveToRelative(0.0f, 6.617f, 5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                curveTo(24.0f, 5.383f, 18.617f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(0.0f, 5.383f, 0.0f, 12.0f)
                close()
                moveTo(5.0f, 8.89f)
                curveToRelative(0.0f, -0.826f, 0.298f, -1.654f, 0.928f, -2.283f)
                lineToRelative(1.607f, -1.607f)
                lineToRelative(3.164f, 3.164f)
                lineToRelative(-2.071f, 2.071f)
                curveToRelative(1.029f, 2.561f, 2.772f, 4.234f, 5.137f, 5.137f)
                lineToRelative(2.071f, -2.071f)
                lineToRelative(3.164f, 3.164f)
                lineToRelative(-1.607f, 1.607f)
                curveToRelative(-0.629f, 0.63f, -1.457f, 0.928f, -2.283f, 0.928f)
                curveToRelative(-4.24f, 0.0f, -10.11f, -5.544f, -10.11f, -10.11f)
                close()
            }
        }
        .build()
        return _circlePhone!!
    }

private var _circlePhone: ImageVector? = null
