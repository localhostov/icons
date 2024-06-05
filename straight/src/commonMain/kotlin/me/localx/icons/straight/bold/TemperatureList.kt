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

public val Icons.Bold.TemperatureList: ImageVector
    get() {
        if (_temperatureList != null) {
            return _temperatureList!!
        }
        _temperatureList = Builder(name = "TemperatureList", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.0f, 16.018f)
                curveToRelative(0.0f, 1.657f, -1.343f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.343f, -3.0f, -3.0f)
                curveToRelative(0.0f, -1.11f, 0.604f, -2.079f, 1.5f, -2.598f)
                verticalLineToRelative(-6.421f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(6.421f)
                curveToRelative(0.896f, 0.519f, 1.5f, 1.487f, 1.5f, 2.598f)
                close()
                moveTo(14.0f, 10.711f)
                curveToRelative(1.294f, 1.464f, 2.0f, 3.312f, 2.0f, 5.271f)
                curveToRelative(0.0f, 4.411f, -3.589f, 8.0f, -8.0f, 8.0f)
                reflectiveCurveTo(0.0f, 20.393f, 0.0f, 15.981f)
                curveToRelative(0.0f, -1.959f, 0.706f, -3.807f, 2.0f, -5.271f)
                verticalLineToRelative(-4.692f)
                curveTo(2.0f, 2.71f, 4.691f, 0.019f, 8.0f, 0.019f)
                reflectiveCurveToRelative(6.0f, 2.691f, 6.0f, 6.0f)
                verticalLineToRelative(4.692f)
                close()
                moveTo(13.0f, 15.982f)
                curveToRelative(0.0f, -1.356f, -0.547f, -2.632f, -1.541f, -3.59f)
                lineToRelative(-0.459f, -0.442f)
                verticalLineToRelative(-5.931f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(5.931f)
                lineToRelative(-0.459f, 0.442f)
                curveToRelative(-0.994f, 0.958f, -1.541f, 2.233f, -1.541f, 3.59f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                reflectiveCurveToRelative(5.0f, -2.243f, 5.0f, -5.0f)
                close()
                moveTo(16.0f, 0.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(8.0f)
                lineTo(24.0f, 0.0f)
                horizontalLineToRelative(-8.0f)
                close()
                moveTo(16.0f, 8.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(18.0f, 13.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _temperatureList!!
    }

private var _temperatureList: ImageVector? = null
