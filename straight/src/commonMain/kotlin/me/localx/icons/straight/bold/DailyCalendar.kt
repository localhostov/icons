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

public val Icons.Bold.DailyCalendar: ImageVector
    get() {
        if (_dailyCalendar != null) {
            return _dailyCalendar!!
        }
        _dailyCalendar = Builder(name = "DailyCalendar", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.436f, 14.0f)
                horizontalLineToRelative(1.564f)
                curveToRelative(0.0f, 3.0f, -0.494f, 4.892f, -0.805f, 6.0f)
                horizontalLineToRelative(-2.086f)
                curveToRelative(0.139f, -0.45f, 0.511f, -1.721f, 0.729f, -3.127f)
                lineToRelative(-1.01f, -1.114f)
                curveToRelative(0.685f, -0.62f, 1.301f, -1.38f, 1.307f, -1.388f)
                lineToRelative(0.3f, -0.371f)
                close()
                moveTo(21.0f, 0.0f)
                horizontalLineToRelative(-12.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.614f, 0.0f, 1.179f, -0.23f, 1.63f, -0.616f)
                curveToRelative(0.598f, -0.512f, 1.476f, -0.512f, 2.074f, 0.0f)
                curveToRelative(0.451f, 0.386f, 1.016f, 0.616f, 1.63f, 0.616f)
                reflectiveCurveToRelative(1.179f, -0.23f, 1.63f, -0.616f)
                curveToRelative(0.598f, -0.512f, 1.476f, -0.512f, 2.074f, 0.0f)
                curveToRelative(0.451f, 0.386f, 1.016f, 0.616f, 1.63f, 0.616f)
                reflectiveCurveToRelative(1.179f, -0.23f, 1.63f, -0.616f)
                curveToRelative(0.598f, -0.512f, 1.476f, -0.512f, 2.074f, 0.0f)
                curveToRelative(0.19f, 0.163f, 0.404f, 0.29f, 0.63f, 0.392f)
                verticalLineToRelative(12.224f)
                horizontalLineToRelative(-1.868f)
                curveToRelative(-0.258f, 1.202f, -0.533f, 2.214f, -0.772f, 3.0f)
                horizontalLineToRelative(5.639f)
                lineTo(24.001f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(17.911f, 10.171f)
                lineToRelative(0.087f, 0.754f)
                curveToRelative(0.002f, 6.786f, -2.019f, 11.916f, -2.105f, 12.131f)
                lineToRelative(-0.377f, 0.943f)
                lineTo(0.0f, 23.999f)
                verticalLineToRelative(-2.194f)
                curveToRelative(0.506f, -0.962f, 1.924f, -5.678f, 1.997f, -10.827f)
                lineToRelative(0.01f, -0.667f)
                lineToRelative(0.645f, -0.564f)
                curveToRelative(1.17f, -1.0f, 2.862f, -1.001f, 4.028f, -0.002f)
                curveToRelative(0.136f, 0.116f, 0.359f, 0.255f, 0.654f, 0.255f)
                reflectiveCurveToRelative(0.518f, -0.139f, 0.653f, -0.255f)
                curveToRelative(1.167f, -0.999f, 2.86f, -0.999f, 4.026f, 0.0f)
                curveToRelative(0.136f, 0.116f, 0.359f, 0.255f, 0.654f, 0.255f)
                reflectiveCurveToRelative(0.518f, -0.139f, 0.654f, -0.255f)
                curveToRelative(1.166f, -0.998f, 2.859f, -0.999f, 4.025f, 0.0f)
                lineToRelative(0.565f, 0.427f)
                close()
                moveTo(14.974f, 12.256f)
                curveToRelative(-1.461f, 1.035f, -3.541f, 0.945f, -4.913f, -0.233f)
                curveToRelative(-0.036f, -0.031f, -0.085f, -0.031f, -0.123f, 0.0f)
                curveToRelative(-1.394f, 1.195f, -3.513f, 1.268f, -4.978f, 0.186f)
                curveToRelative(-0.161f, 3.531f, -0.792f, 6.726f, -1.418f, 8.791f)
                horizontalLineToRelative(9.892f)
                curveToRelative(0.491f, -1.532f, 1.377f, -4.789f, 1.54f, -8.744f)
                close()
            }
        }
        .build()
        return _dailyCalendar!!
    }

private var _dailyCalendar: ImageVector? = null
