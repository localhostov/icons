package me.localx.icons.straight.bold

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
import me.localx.icons.straight.Icons

public val Icons.Bold.Plane: ImageVector
    get() {
        if (_plane != null) {
            return _plane!!
        }
        _plane = Builder(name = "Plane", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(20.5f, 9.0f)
                    horizontalLineTo(18.134f)
                    lineTo(14.309f, 1.823f)
                    curveTo(14.0078f, 1.2711f, 13.5634f, 0.8106f, 13.0227f, 0.4898f)
                    curveTo(12.482f, 0.169f, 11.8648f, -2.0E-4f, 11.236f, 0.0f)
                    horizontalLineTo(6.436f)
                    lineTo(9.181f, 9.0f)
                    horizontalLineTo(7.017f)
                    lineTo(4.892f, 7.285f)
                    curveTo(4.5736f, 6.985f, 4.1913f, 6.761f, 3.774f, 6.6296f)
                    curveTo(3.3566f, 6.4983f, 2.915f, 6.4631f, 2.4821f, 6.5267f)
                    curveTo(2.0492f, 6.5903f, 1.6364f, 6.751f, 1.2744f, 6.9968f)
                    curveTo(0.9124f, 7.2426f, 0.6108f, 7.5671f, 0.392f, 7.946f)
                    curveTo(0.1372f, 8.3752f, -4.0E-4f, 8.8639f, -0.0069f, 9.3631f)
                    curveTo(-0.0134f, 9.8622f, 0.1114f, 10.3543f, 0.355f, 10.79f)
                    lineTo(3.575f, 17.0f)
                    horizontalLineTo(9.187f)
                    lineTo(6.187f, 24.0f)
                    horizontalLineTo(11.236f)
                    curveTo(11.846f, 24.0001f, 12.4453f, 23.8407f, 12.9747f, 23.5378f)
                    curveTo(13.5041f, 23.2349f, 13.9451f, 22.7989f, 14.254f, 22.273f)
                    lineTo(18.1f, 17.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(12.5f)
                    curveTo(24.0f, 11.5717f, 23.6313f, 10.6815f, 22.9749f, 10.0251f)
                    curveTo(22.3185f, 9.3687f, 21.4283f, 9.0f, 20.5f, 9.0f)
                    close()
                    moveTo(10.487f, 3.0f)
                    horizontalLineTo(11.236f)
                    curveTo(11.3233f, 2.9999f, 11.4092f, 3.0226f, 11.485f, 3.0659f)
                    curveTo(11.5607f, 3.1093f, 11.6239f, 3.1717f, 11.668f, 3.247f)
                    lineTo(14.734f, 9.0f)
                    horizontalLineTo(12.317f)
                    lineTo(10.487f, 3.0f)
                    close()
                    moveTo(21.0f, 14.0f)
                    horizontalLineTo(16.569f)
                    lineTo(11.779f, 20.575f)
                    lineTo(11.679f, 20.739f)
                    curveTo(11.6361f, 20.8179f, 11.5726f, 20.8838f, 11.4954f, 20.9298f)
                    curveTo(11.4181f, 20.9757f, 11.3299f, 21.0f, 11.24f, 21.0f)
                    horizontalLineTo(10.74f)
                    lineTo(13.74f, 14.0f)
                    horizontalLineTo(5.391f)
                    lineTo(3.13f, 9.719f)
                    lineTo(5.957f, 12.0f)
                    horizontalLineTo(20.5f)
                    curveTo(20.6327f, 12.0f, 20.7598f, 12.0527f, 20.8536f, 12.1464f)
                    curveTo(20.9474f, 12.2402f, 21.0f, 12.3674f, 21.0f, 12.5f)
                    verticalLineTo(14.0f)
                    close()
                }
            }
        }
        .build()
        return _plane!!
    }

private var _plane: ImageVector? = null
