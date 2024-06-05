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

public val Icons.Filled.Joker: ImageVector
    get() {
        if (_joker != null) {
            return _joker!!
        }
        _joker = Builder(name = "Joker", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 0.0f)
                lineTo(6.0f, 0.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                lineTo(3.0f, 24.0f)
                lineTo(21.0f, 24.0f)
                lineTo(21.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(16.5f, 12.0f)
                curveToRelative(-0.334f, 0.0f, -0.639f, -0.113f, -0.888f, -0.297f)
                curveToRelative(-0.281f, 0.577f, -0.612f, 1.432f, -0.612f, 2.297f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.864f, -0.331f, -1.719f, -0.612f, -2.297f)
                curveToRelative(-0.249f, 0.184f, -0.554f, 0.297f, -0.888f, 0.297f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                curveToRelative(0.0f, 0.3f, -0.09f, 0.578f, -0.242f, 0.812f)
                curveToRelative(0.63f, 0.306f, 1.483f, 0.844f, 1.891f, 1.674f)
                curveToRelative(0.265f, -1.078f, 0.814f, -2.339f, 1.124f, -3.009f)
                curveToRelative(-0.72f, -0.11f, -1.274f, -0.726f, -1.274f, -1.477f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                curveToRelative(0.0f, 0.751f, -0.553f, 1.367f, -1.274f, 1.477f)
                curveToRelative(0.31f, 0.669f, 0.859f, 1.931f, 1.124f, 3.009f)
                curveToRelative(0.408f, -0.83f, 1.261f, -1.369f, 1.891f, -1.674f)
                curveToRelative(-0.151f, -0.234f, -0.242f, -0.512f, -0.242f, -0.812f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _joker!!
    }

private var _joker: ImageVector? = null
