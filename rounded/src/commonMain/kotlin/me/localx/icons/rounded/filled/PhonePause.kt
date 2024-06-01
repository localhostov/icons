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

public val Icons.Filled.PhonePause: ImageVector
    get() {
        if (_phonePause != null) {
            return _phonePause!!
        }
        _phonePause = Builder(name = "PhonePause", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(19.9999f, 6.9998f)
                    verticalLineTo(0.9998f)
                    curveTo(19.9999f, 0.7346f, 20.1053f, 0.4803f, 20.2928f, 0.2927f)
                    curveTo(20.4804f, 0.1052f, 20.7347f, -2.0E-4f, 20.9999f, -2.0E-4f)
                    curveTo(21.2652f, -2.0E-4f, 21.5195f, 0.1052f, 21.7071f, 0.2927f)
                    curveTo(21.8946f, 0.4803f, 21.9999f, 0.7346f, 21.9999f, 0.9998f)
                    verticalLineTo(6.9998f)
                    curveTo(21.9999f, 7.265f, 21.8946f, 7.5194f, 21.7071f, 7.7069f)
                    curveTo(21.5195f, 7.8945f, 21.2652f, 7.9998f, 20.9999f, 7.9998f)
                    curveTo(20.7347f, 7.9998f, 20.4804f, 7.8945f, 20.2928f, 7.7069f)
                    curveTo(20.1053f, 7.5194f, 19.9999f, 7.265f, 19.9999f, 6.9998f)
                    close()
                    moveTo(16.9999f, 7.9998f)
                    curveTo(17.2652f, 7.9998f, 17.5195f, 7.8945f, 17.7071f, 7.7069f)
                    curveTo(17.8946f, 7.5194f, 17.9999f, 7.265f, 17.9999f, 6.9998f)
                    verticalLineTo(0.9998f)
                    curveTo(17.9999f, 0.7346f, 17.8946f, 0.4803f, 17.7071f, 0.2927f)
                    curveTo(17.5195f, 0.1052f, 17.2652f, -2.0E-4f, 16.9999f, -2.0E-4f)
                    curveTo(16.7347f, -2.0E-4f, 16.4804f, 0.1052f, 16.2928f, 0.2927f)
                    curveTo(16.1053f, 0.4803f, 15.9999f, 0.7346f, 15.9999f, 0.9998f)
                    verticalLineTo(6.9998f)
                    curveTo(15.9999f, 7.265f, 16.1053f, 7.5194f, 16.2928f, 7.7069f)
                    curveTo(16.4804f, 7.8945f, 16.7347f, 7.9998f, 16.9999f, 7.9998f)
                    close()
                    moveTo(23.0939f, 16.7378f)
                    curveTo(23.0639f, 16.7068f, 20.6569f, 14.8548f, 20.6569f, 14.8548f)
                    curveTo(20.0793f, 14.3047f, 19.3118f, 13.9984f, 18.514f, 13.9997f)
                    curveTo(17.7163f, 14.0011f, 16.9498f, 14.3098f, 16.3739f, 14.8618f)
                    lineTo(14.4739f, 16.4678f)
                    curveTo(12.917f, 15.8245f, 11.5026f, 14.8797f, 10.3121f, 13.6878f)
                    curveTo(9.1216f, 12.496f, 8.1785f, 11.0805f, 7.537f, 9.5228f)
                    lineTo(9.1369f, 7.6228f)
                    curveTo(9.6878f, 7.0468f, 9.9957f, 6.2808f, 9.9966f, 5.4838f)
                    curveTo(9.9975f, 4.6868f, 9.6915f, 3.9201f, 9.1419f, 3.3428f)
                    curveTo(9.1419f, 3.3428f, 7.292f, 0.9398f, 7.26f, 0.9088f)
                    curveTo(6.6898f, 0.3337f, 5.9159f, 0.0062f, 5.1061f, -0.0026f)
                    curveTo(4.2962f, -0.0114f, 3.5155f, 0.2992f, 2.933f, 0.8618f)
                    lineTo(1.7839f, 1.8618f)
                    curveTo(-5.937f, 10.0708f, 13.9839f, 30.0008f, 22.1839f, 22.1618f)
                    lineTo(23.0959f, 21.1118f)
                    curveTo(23.6737f, 20.5307f, 23.9978f, 19.7444f, 23.9974f, 18.9249f)
                    curveTo(23.997f, 18.1054f, 23.6722f, 17.3195f, 23.0939f, 16.7388f)
                    verticalLineTo(16.7378f)
                    close()
                }
            }
        }
        .build()
        return _phonePause!!
    }

private var _phonePause: ImageVector? = null
