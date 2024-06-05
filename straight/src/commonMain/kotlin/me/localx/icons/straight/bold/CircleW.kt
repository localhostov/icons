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

public val Icons.Bold.CircleW: ImageVector
    get() {
        if (_circleW != null) {
            return _circleW!!
        }
        _circleW = Builder(name = "CircleW", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 21.0f)
                curveToRelative(-4.962f, 0.0f, -9.0f, -4.037f, -9.0f, -9.0f)
                reflectiveCurveTo(7.038f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveToRelative(9.0f, 4.037f, 9.0f, 9.0f)
                reflectiveCurveToRelative(-4.037f, 9.0f, -9.0f, 9.0f)
                close()
                moveTo(18.5f, 7.0f)
                lineToRelative(-1.636f, 9.421f)
                curveToRelative(-0.156f, 0.815f, -0.786f, 1.425f, -1.606f, 1.554f)
                curveToRelative(-0.102f, 0.016f, -0.204f, 0.024f, -0.305f, 0.024f)
                curveToRelative(-0.702f, 0.0f, -1.358f, -0.385f, -1.7f, -1.01f)
                lineToRelative(-1.253f, -3.49f)
                lineToRelative(-1.215f, 3.413f)
                curveToRelative(-0.377f, 0.696f, -1.018f, 1.087f, -1.729f, 1.087f)
                horizontalLineToRelative(-0.011f)
                curveToRelative(-0.1f, 0.0f, -0.202f, -0.009f, -0.304f, -0.025f)
                curveToRelative(-0.82f, -0.129f, -1.45f, -0.739f, -1.606f, -1.555f)
                lineToRelative(-1.636f, -9.421f)
                horizontalLineToRelative(3.045f)
                lineToRelative(0.939f, 5.407f)
                lineToRelative(2.515f, -5.407f)
                lineToRelative(2.518f, 5.405f)
                lineToRelative(0.938f, -5.405f)
                horizontalLineToRelative(3.045f)
                close()
            }
        }
        .build()
        return _circleW!!
    }

private var _circleW: ImageVector? = null
