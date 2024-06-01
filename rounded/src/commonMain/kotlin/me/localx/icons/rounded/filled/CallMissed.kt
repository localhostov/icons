package me.localx.icons.rounded.filled

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

public val Icons.Filled.CallMissed: ImageVector
    get() {
        if (_callMissed != null) {
            return _callMissed!!
        }
        _callMissed = Builder(name = "CallMissed", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(3.0001f, 6.255f)
                    verticalLineTo(2.089f)
                    curveTo(2.9767f, 0.9603f, 3.8714f, 0.0257f, 5.0001f, 0.0f)
                    horizontalLineTo(9.0001f)
                    curveTo(9.5769f, 0.0f, 10.0446f, 0.4676f, 10.0446f, 1.0445f)
                    curveTo(10.0446f, 1.6214f, 9.577f, 2.089f, 9.0001f, 2.089f)
                    horizontalLineTo(6.4391f)
                    lineTo(12.3451f, 8.267f)
                    curveTo(12.3856f, 8.3106f, 12.4426f, 8.3353f, 12.5021f, 8.335f)
                    curveTo(12.5612f, 8.3358f, 12.6179f, 8.3115f, 12.6581f, 8.2681f)
                    lineTo(19.5441f, 1.089f)
                    curveTo(20.5061f, 0.119f, 21.8681f, 1.631f, 20.9581f, 2.564f)
                    lineTo(14.0731f, 9.74f)
                    curveTo(13.6652f, 10.1722f, 13.0974f, 10.4174f, 12.5031f, 10.418f)
                    curveTo(11.9078f, 10.4168f, 11.3392f, 10.1705f, 10.9311f, 9.737f)
                    lineTo(5.0001f, 3.533f)
                    verticalLineTo(6.255f)
                    curveTo(5.0001f, 6.8073f, 4.5524f, 7.255f, 4.0001f, 7.255f)
                    curveTo(3.4478f, 7.255f, 3.0001f, 6.8073f, 3.0001f, 6.255f)
                    close()
                    moveTo(22.4451f, 16.055f)
                    curveTo(17.9561f, 11.377f, 6.0451f, 11.376f, 1.5561f, 16.055f)
                    curveTo(0.5419f, 17.1117f, -0.0169f, 18.5244f, 1.0E-4f, 19.989f)
                    lineTo(0.0811f, 21.163f)
                    curveTo(0.0515f, 22.6961f, 1.2671f, 23.9645f, 2.8001f, 24.0f)
                    curveTo(2.8441f, 24.0f, 5.3231f, 23.664f, 5.3231f, 23.664f)
                    curveTo(6.8007f, 23.5918f, 7.9638f, 22.3764f, 7.9711f, 20.897f)
                    lineTo(8.1291f, 19.019f)
                    curveTo(9.3573f, 18.5131f, 10.6718f, 18.2497f, 12.0001f, 18.243f)
                    curveTo(13.3293f, 18.2622f, 14.6434f, 18.5287f, 15.8751f, 19.029f)
                    lineTo(16.0311f, 20.897f)
                    curveTo(16.0384f, 22.3764f, 17.2014f, 23.5918f, 18.6791f, 23.664f)
                    curveTo(18.6791f, 23.664f, 21.1581f, 24.0f, 21.2021f, 24.0f)
                    curveTo(22.711f, 23.9754f, 23.9214f, 22.7451f, 23.9211f, 21.236f)
                    lineTo(24.0001f, 19.919f)
                    curveTo(24.002f, 18.4789f, 23.4441f, 17.0944f, 22.4441f, 16.058f)
                    lineTo(22.4451f, 16.055f)
                    close()
                }
            }
        }
        .build()
        return _callMissed!!
    }

private var _callMissed: ImageVector? = null
