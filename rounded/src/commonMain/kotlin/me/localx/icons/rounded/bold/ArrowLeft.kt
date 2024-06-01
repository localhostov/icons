package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.ArrowLeft: ImageVector
    get() {
        if (_arrowLeft != null) {
            return _arrowLeft!!
        }
        _arrowLeft = Builder(name = "ArrowLeft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(4.943f, 5.606f)
                    lineTo(1.024f, 9.525f)
                    curveTo(0.3876f, 10.1919f, 0.0325f, 11.0782f, 0.0325f, 12.0f)
                    curveTo(0.0325f, 12.9218f, 0.3876f, 13.8081f, 1.024f, 14.475f)
                    lineTo(4.943f, 18.394f)
                    curveTo(5.0813f, 18.5373f, 5.2469f, 18.6516f, 5.4299f, 18.7302f)
                    curveTo(5.6129f, 18.8088f, 5.8097f, 18.8502f, 6.0089f, 18.8519f)
                    curveTo(6.208f, 18.8536f, 6.4056f, 18.8157f, 6.5899f, 18.7402f)
                    curveTo(6.7742f, 18.6648f, 6.9417f, 18.5534f, 7.0826f, 18.4126f)
                    curveTo(7.2234f, 18.2718f, 7.3348f, 18.1043f, 7.4102f, 17.9199f)
                    curveTo(7.4856f, 17.7356f, 7.5236f, 17.5381f, 7.5218f, 17.3389f)
                    curveTo(7.5201f, 17.1397f, 7.4787f, 16.9429f, 7.4001f, 16.7599f)
                    curveTo(7.3215f, 16.5769f, 7.2072f, 16.4114f, 7.064f, 16.273f)
                    lineTo(4.285f, 13.492f)
                    lineTo(22.535f, 13.469f)
                    curveTo(22.9328f, 13.469f, 23.3143f, 13.311f, 23.5956f, 13.0297f)
                    curveTo(23.8769f, 12.7484f, 24.035f, 12.3668f, 24.035f, 11.969f)
                    curveTo(24.035f, 11.5712f, 23.8769f, 11.1897f, 23.5956f, 10.9083f)
                    curveTo(23.3143f, 10.627f, 22.9328f, 10.469f, 22.535f, 10.469f)
                    lineTo(4.3f, 10.492f)
                    lineTo(7.064f, 7.727f)
                    curveTo(7.3372f, 7.4441f, 7.4884f, 7.0652f, 7.485f, 6.6719f)
                    curveTo(7.4816f, 6.2786f, 7.3238f, 5.9024f, 7.0457f, 5.6243f)
                    curveTo(6.7676f, 5.3462f, 6.3914f, 5.1884f, 5.9981f, 5.185f)
                    curveTo(5.6048f, 5.1816f, 5.2259f, 5.3328f, 4.943f, 5.606f)
                    close()
                }
            }
        }
        .build()
        return _arrowLeft!!
    }

private var _arrowLeft: ImageVector? = null
