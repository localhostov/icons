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

public val Icons.Bold.CircleY: ImageVector
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
                moveTo(12.0f, 21.0f)
                curveToRelative(-4.963f, 0.0f, -9.0f, -4.037f, -9.0f, -9.0f)
                reflectiveCurveTo(7.037f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveToRelative(9.0f, 4.037f, 9.0f, 9.0f)
                reflectiveCurveToRelative(-4.037f, 9.0f, -9.0f, 9.0f)
                close()
                moveTo(16.684f, 9.171f)
                lineToRelative(-3.184f, 4.093f)
                verticalLineToRelative(3.236f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineToRelative(-3.236f)
                lineToRelative(-3.184f, -4.093f)
                curveToRelative(-0.509f, -0.654f, -0.392f, -1.597f, 0.263f, -2.104f)
                curveToRelative(0.652f, -0.509f, 1.597f, -0.392f, 2.104f, 0.263f)
                lineToRelative(2.316f, 2.978f)
                lineToRelative(2.316f, -2.978f)
                curveToRelative(0.507f, -0.654f, 1.451f, -0.771f, 2.104f, -0.263f)
                curveToRelative(0.654f, 0.508f, 0.771f, 1.45f, 0.263f, 2.104f)
                close()
            }
        }
        .build()
        return _circleY!!
    }

private var _circleY: ImageVector? = null
