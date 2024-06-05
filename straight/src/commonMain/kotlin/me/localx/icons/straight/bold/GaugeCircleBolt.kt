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

public val Icons.Bold.GaugeCircleBolt: ImageVector
    get() {
        if (_gaugeCircleBolt != null) {
            return _gaugeCircleBolt!!
        }
        _gaugeCircleBolt = Builder(name = "GaugeCircleBolt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.565f, 16.327f)
                lineToRelative(1.869f, 2.347f)
                lineToRelative(-3.617f, 2.881f)
                lineToRelative(-0.918f, -0.646f)
                curveTo(1.832f, 18.753f, 0.0f, 15.236f, 0.0f, 11.5f)
                curveTo(0.0f, 5.159f, 5.159f, 0.0f, 11.5f, 0.0f)
                reflectiveCurveToRelative(11.5f, 5.159f, 11.5f, 11.5f)
                curveToRelative(0.0f, 0.085f, -0.014f, 0.168f, -0.015f, 0.253f)
                curveToRelative(-0.894f, -0.715f, -1.944f, -1.237f, -3.089f, -1.517f)
                curveToRelative(-0.614f, -4.088f, -4.139f, -7.236f, -8.396f, -7.236f)
                curveTo(6.813f, 3.0f, 3.0f, 6.813f, 3.0f, 11.5f)
                curveToRelative(0.0f, 2.391f, 1.017f, 4.661f, 2.763f, 6.262f)
                lineToRelative(1.802f, -1.436f)
                close()
                moveTo(13.5f, 11.5f)
                curveToRelative(0.0f, -0.504f, -0.193f, -0.959f, -0.5f, -1.31f)
                verticalLineToRelative(-5.19f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(5.19f)
                curveToRelative(-0.307f, 0.352f, -0.5f, 0.806f, -0.5f, 1.31f)
                curveToRelative(0.0f, 1.105f, 0.895f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.895f, 2.0f, -2.0f)
                close()
                moveTo(24.0f, 18.0f)
                curveToRelative(0.0f, 3.314f, -2.686f, 6.0f, -6.0f, 6.0f)
                reflectiveCurveToRelative(-6.0f, -2.686f, -6.0f, -6.0f)
                reflectiveCurveToRelative(2.686f, -6.0f, 6.0f, -6.0f)
                reflectiveCurveToRelative(6.0f, 2.686f, 6.0f, 6.0f)
                close()
                moveTo(20.809f, 17.847f)
                curveToRelative(-0.28f, -0.521f, -0.821f, -0.846f, -1.413f, -0.846f)
                horizontalLineToRelative(-2.029f)
                lineToRelative(1.845f, -2.828f)
                lineToRelative(-1.664f, -1.109f)
                lineToRelative(-2.478f, 3.854f)
                curveToRelative(-0.147f, 0.487f, -0.055f, 1.022f, 0.249f, 1.431f)
                curveToRelative(0.303f, 0.408f, 0.788f, 0.652f, 1.297f, 0.652f)
                horizontalLineToRelative(2.035f)
                lineToRelative(-1.963f, 2.824f)
                lineToRelative(1.659f, 1.117f)
                lineToRelative(2.385f, -3.451f)
                curveToRelative(0.327f, -0.493f, 0.357f, -1.123f, 0.077f, -1.645f)
                close()
            }
        }
        .build()
        return _gaugeCircleBolt!!
    }

private var _gaugeCircleBolt: ImageVector? = null
