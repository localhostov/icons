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

public val Icons.Bold.GaugeCircleMinus: ImageVector
    get() {
        if (_gaugeCircleMinus != null) {
            return _gaugeCircleMinus!!
        }
        _gaugeCircleMinus = Builder(name = "GaugeCircleMinus", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.0f, 12.0f)
                curveToRelative(-3.314f, 0.0f, -6.0f, 2.686f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.686f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.686f, 6.0f, -6.0f)
                reflectiveCurveToRelative(-2.686f, -6.0f, -6.0f, -6.0f)
                close()
                moveTo(22.0f, 19.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(7.565f, 16.327f)
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
                moveTo(11.5f, 13.5f)
                curveToRelative(-1.105f, 0.0f, -2.0f, -0.895f, -2.0f, -2.0f)
                curveToRelative(0.0f, -0.504f, 0.193f, -0.959f, 0.5f, -1.31f)
                verticalLineToRelative(-5.19f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(5.19f)
                curveToRelative(0.307f, 0.352f, 0.5f, 0.806f, 0.5f, 1.31f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _gaugeCircleMinus!!
    }

private var _gaugeCircleMinus: ImageVector? = null
