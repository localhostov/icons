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

public val Icons.Filled.ZoomIn: ImageVector
    get() {
        if (_zoomIn != null) {
            return _zoomIn!!
        }
        _zoomIn = Builder(name = "ZoomIn", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(10.0002f, 19.9998f)
                    curveTo(12.3071f, 20.0026f, 14.5434f, 19.2045f, 16.3272f, 17.7418f)
                    lineTo(22.2932f, 23.7068f)
                    curveTo(22.4818f, 23.889f, 22.7344f, 23.9898f, 22.9966f, 23.9875f)
                    curveTo(23.2588f, 23.9852f, 23.5096f, 23.88f, 23.695f, 23.6946f)
                    curveTo(23.8804f, 23.5092f, 23.9856f, 23.2584f, 23.9879f, 22.9962f)
                    curveTo(23.9902f, 22.734f, 23.8894f, 22.4814f, 23.7072f, 22.2928f)
                    lineTo(17.7412f, 16.3278f)
                    curveTo(19.1781f, 14.5696f, 19.9738f, 12.3747f, 19.9975f, 10.1042f)
                    curveTo(20.0212f, 7.8337f, 19.2715f, 5.6227f, 17.8717f, 3.8349f)
                    curveTo(16.4718f, 2.0471f, 14.5052f, 0.7889f, 12.2953f, 0.2672f)
                    curveTo(10.0854f, -0.2544f, 7.7638f, -0.0084f, 5.7122f, 0.9648f)
                    curveTo(3.6607f, 1.9379f, 2.0014f, 3.5803f, 1.0073f, 5.6218f)
                    curveTo(0.0132f, 7.6633f, -0.2565f, 9.9823f, 0.2425f, 12.1974f)
                    curveTo(0.7415f, 14.4125f, 1.9795f, 16.3919f, 3.7529f, 17.81f)
                    curveTo(5.5264f, 19.228f, 7.7296f, 20.0003f, 10.0002f, 19.9998f)
                    close()
                    moveTo(7.0002f, 8.9998f)
                    horizontalLineTo(9.0002f)
                    verticalLineTo(6.9998f)
                    curveTo(9.0002f, 6.7346f, 9.1056f, 6.4802f, 9.2931f, 6.2927f)
                    curveTo(9.4806f, 6.1052f, 9.735f, 5.9998f, 10.0002f, 5.9998f)
                    curveTo(10.2654f, 5.9998f, 10.5198f, 6.1052f, 10.7073f, 6.2927f)
                    curveTo(10.8949f, 6.4802f, 11.0002f, 6.7346f, 11.0002f, 6.9998f)
                    verticalLineTo(8.9998f)
                    horizontalLineTo(13.0002f)
                    curveTo(13.2654f, 8.9998f, 13.5198f, 9.1052f, 13.7073f, 9.2927f)
                    curveTo(13.8949f, 9.4802f, 14.0002f, 9.7346f, 14.0002f, 9.9998f)
                    curveTo(14.0002f, 10.265f, 13.8949f, 10.5194f, 13.7073f, 10.7069f)
                    curveTo(13.5198f, 10.8944f, 13.2654f, 10.9998f, 13.0002f, 10.9998f)
                    horizontalLineTo(11.0002f)
                    verticalLineTo(12.9998f)
                    curveTo(11.0002f, 13.265f, 10.8949f, 13.5194f, 10.7073f, 13.7069f)
                    curveTo(10.5198f, 13.8944f, 10.2654f, 13.9998f, 10.0002f, 13.9998f)
                    curveTo(9.735f, 13.9998f, 9.4806f, 13.8944f, 9.2931f, 13.7069f)
                    curveTo(9.1056f, 13.5194f, 9.0002f, 13.265f, 9.0002f, 12.9998f)
                    verticalLineTo(10.9998f)
                    horizontalLineTo(7.0002f)
                    curveTo(6.735f, 10.9998f, 6.4806f, 10.8944f, 6.2931f, 10.7069f)
                    curveTo(6.1056f, 10.5194f, 6.0002f, 10.265f, 6.0002f, 9.9998f)
                    curveTo(6.0002f, 9.7346f, 6.1056f, 9.4802f, 6.2931f, 9.2927f)
                    curveTo(6.4806f, 9.1052f, 6.735f, 8.9998f, 7.0002f, 8.9998f)
                    close()
                }
            }
        }
        .build()
        return _zoomIn!!
    }

private var _zoomIn: ImageVector? = null
