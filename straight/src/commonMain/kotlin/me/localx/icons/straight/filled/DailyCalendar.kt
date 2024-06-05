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

public val Icons.Filled.DailyCalendar: ImageVector
    get() {
        if (_dailyCalendar != null) {
            return _dailyCalendar!!
        }
        _dailyCalendar = Builder(name = "DailyCalendar", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 0.0f)
                horizontalLineToRelative(-12.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.614f, 0.0f, 1.179f, -0.23f, 1.63f, -0.616f)
                curveToRelative(0.299f, -0.256f, 0.668f, -0.384f, 1.037f, -0.384f)
                reflectiveCurveToRelative(0.738f, 0.128f, 1.037f, 0.384f)
                curveToRelative(0.451f, 0.386f, 1.016f, 0.616f, 1.63f, 0.616f)
                reflectiveCurveToRelative(1.179f, -0.23f, 1.63f, -0.616f)
                curveToRelative(0.299f, -0.256f, 0.668f, -0.384f, 1.037f, -0.384f)
                reflectiveCurveToRelative(0.738f, 0.128f, 1.037f, 0.384f)
                curveToRelative(0.451f, 0.386f, 1.016f, 0.616f, 1.63f, 0.616f)
                reflectiveCurveToRelative(1.179f, -0.23f, 1.63f, -0.616f)
                curveToRelative(0.299f, -0.256f, 0.668f, -0.384f, 1.037f, -0.384f)
                reflectiveCurveToRelative(0.738f, 0.128f, 1.037f, 0.384f)
                curveToRelative(0.451f, 0.386f, 1.016f, 0.616f, 1.63f, 0.616f)
                verticalLineToRelative(2.0f)
                curveToRelative(-0.695f, 0.0f, -1.378f, -0.17f, -2.0f, -0.482f)
                lineToRelative(-0.003f, 1.846f)
                curveToRelative(0.002f, 4.736f, -1.174f, 9.111f, -2.01f, 11.625f)
                curveToRelative(0.0f, 0.002f, -0.001f, 0.01f, -0.002f, 0.012f)
                horizontalLineToRelative(6.015f)
                lineTo(24.002f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(17.979f, 9.965f)
                lineToRelative(-0.474f, -0.351f)
                curveToRelative(-0.99f, -0.821f, -2.428f, -0.821f, -3.418f, 0.0f)
                curveToRelative(-0.607f, 0.504f, -1.479f, 0.504f, -2.087f, 0.0f)
                curveToRelative(-0.99f, -0.821f, -2.428f, -0.821f, -3.418f, 0.0f)
                curveToRelative(-0.607f, 0.504f, -1.479f, 0.504f, -2.087f, 0.0f)
                curveToRelative(-0.989f, -0.821f, -2.427f, -0.822f, -3.418f, 0.0f)
                lineToRelative(-0.491f, 0.416f)
                lineToRelative(-0.007f, 0.454f)
                curveToRelative(-0.075f, 5.12f, -1.931f, 10.748f, -2.577f, 11.938f)
                verticalLineToRelative(1.577f)
                horizontalLineToRelative(15.078f)
                lineToRelative(0.26f, -0.604f)
                curveToRelative(0.109f, -0.253f, 2.662f, -6.266f, 2.661f, -12.949f)
                lineToRelative(-0.02f, -0.481f)
                close()
                moveTo(9.586f, 21.0f)
                horizontalLineToRelative(-2.086f)
                curveToRelative(0.139f, -0.45f, 0.937f, -2.054f, 1.275f, -4.681f)
                lineToRelative(-0.294f, 0.258f)
                lineToRelative(-1.481f, -1.077f)
                curveToRelative(1.414f, -1.279f, 2.343f, -2.5f, 2.343f, -2.5f)
                horizontalLineToRelative(1.657f)
                curveToRelative(0.0f, 4.0f, -1.103f, 6.892f, -1.414f, 8.0f)
                close()
            }
        }
        .build()
        return _dailyCalendar!!
    }

private var _dailyCalendar: ImageVector? = null
