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

public val Icons.Bold.ParkingCircleSlash: ImageVector
    get() {
        if (_parkingCircleSlash != null) {
            return _parkingCircleSlash!!
        }
        _parkingCircleSlash = Builder(name = "ParkingCircleSlash", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 14.5f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.829f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.671f, -1.5f, -1.5f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.829f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.671f, 1.5f, 1.5f)
                close()
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, 6.617f, -5.383f, 12.0f, -12.0f, 12.0f)
                reflectiveCurveTo(0.0f, 18.617f, 0.0f, 12.0f)
                reflectiveCurveTo(5.383f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.383f, 12.0f, 12.0f)
                close()
                moveTo(12.0f, 3.0f)
                curveToRelative(-1.941f, 0.0f, -3.74f, 0.618f, -5.212f, 1.667f)
                lineToRelative(1.592f, 1.592f)
                curveToRelative(0.821f, -0.789f, 1.932f, -1.259f, 3.12f, -1.259f)
                horizontalLineToRelative(1.5f)
                curveToRelative(2.757f, 0.0f, 5.0f, 2.243f, 5.0f, 5.0f)
                curveToRelative(0.0f, 1.58f, -0.753f, 3.02f, -1.935f, 3.944f)
                lineToRelative(3.268f, 3.268f)
                curveToRelative(1.049f, -1.472f, 1.667f, -3.271f, 1.667f, -5.212f)
                curveToRelative(0.0f, -4.962f, -4.037f, -9.0f, -9.0f, -9.0f)
                close()
                moveTo(15.0f, 10.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.376f, 0.0f, -0.729f, 0.141f, -0.998f, 0.381f)
                lineToRelative(3.403f, 3.403f)
                curveToRelative(0.653f, -0.334f, 1.096f, -1.017f, 1.096f, -1.783f)
                close()
                moveTo(12.0f, 21.0f)
                curveToRelative(1.941f, 0.0f, 3.74f, -0.618f, 5.212f, -1.667f)
                lineTo(4.667f, 6.788f)
                curveToRelative(-1.049f, 1.472f, -1.667f, 3.271f, -1.667f, 5.212f)
                curveToRelative(0.0f, 4.962f, 4.037f, 9.0f, 9.0f, 9.0f)
                close()
            }
        }
        .build()
        return _parkingCircleSlash!!
    }

private var _parkingCircleSlash: ImageVector? = null
