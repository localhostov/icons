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

public val Icons.Bold.CircleXmark: ImageVector
    get() {
        if (_circleXmark != null) {
            return _circleXmark!!
        }
        _circleXmark = Builder(name = "CircleXmark", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.561f, 9.561f)
                lineToRelative(-2.439f, 2.439f)
                lineToRelative(2.439f, 2.439f)
                lineToRelative(-2.121f, 2.121f)
                lineToRelative(-2.439f, -2.439f)
                lineToRelative(-2.439f, 2.439f)
                lineToRelative(-2.121f, -2.121f)
                lineToRelative(2.439f, -2.439f)
                lineToRelative(-2.439f, -2.439f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(2.439f, 2.439f)
                lineToRelative(2.439f, -2.439f)
                lineToRelative(2.121f, 2.121f)
                close()
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, 6.617f, -5.383f, 12.0f, -12.0f, 12.0f)
                reflectiveCurveTo(0.0f, 18.617f, 0.0f, 12.0f)
                reflectiveCurveTo(5.383f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.383f, 12.0f, 12.0f)
                close()
                moveTo(21.0f, 12.0f)
                curveToRelative(0.0f, -4.963f, -4.037f, -9.0f, -9.0f, -9.0f)
                reflectiveCurveTo(3.0f, 7.037f, 3.0f, 12.0f)
                reflectiveCurveToRelative(4.038f, 9.0f, 9.0f, 9.0f)
                reflectiveCurveToRelative(9.0f, -4.037f, 9.0f, -9.0f)
                close()
            }
        }
        .build()
        return _circleXmark!!
    }

private var _circleXmark: ImageVector? = null
