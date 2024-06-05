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

public val Icons.Filled.CircleY: ImageVector
    get() {
        if (_circleY != null) {
            return _circleY!!
        }
        _circleY = Builder(name = "CircleY", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
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
                moveTo(16.781f, 7.875f)
                lineToRelative(-3.781f, 4.727f)
                verticalLineToRelative(4.398f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-4.398f)
                lineToRelative(-3.781f, -4.727f)
                curveToRelative(-0.345f, -0.432f, -0.274f, -1.061f, 0.156f, -1.406f)
                curveToRelative(0.433f, -0.346f, 1.061f, -0.274f, 1.406f, 0.156f)
                lineToRelative(3.219f, 4.024f)
                lineToRelative(3.219f, -4.024f)
                curveToRelative(0.347f, -0.429f, 0.975f, -0.502f, 1.406f, -0.156f)
                curveToRelative(0.431f, 0.346f, 0.501f, 0.975f, 0.156f, 1.406f)
                close()
            }
        }
        .build()
        return _circleY!!
    }

private var _circleY: ImageVector? = null
