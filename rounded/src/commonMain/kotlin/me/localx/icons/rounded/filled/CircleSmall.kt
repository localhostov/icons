package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.CircleSmall: ImageVector
    get() {
        if (_circleSmall != null) {
            return _circleSmall!!
        }
        _circleSmall = Builder(name = "CircleSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.5f)
                curveTo(10.5166f, 4.5f, 9.0666f, 4.9399f, 7.8332f, 5.764f)
                curveTo(6.5999f, 6.5881f, 5.6386f, 7.7594f, 5.0709f, 9.1299f)
                curveTo(4.5033f, 10.5003f, 4.3547f, 12.0083f, 4.6441f, 13.4632f)
                curveTo(4.9335f, 14.918f, 5.6478f, 16.2544f, 6.6967f, 17.3033f)
                curveTo(7.7456f, 18.3522f, 9.082f, 19.0665f, 10.5368f, 19.3559f)
                curveTo(11.9917f, 19.6453f, 13.4997f, 19.4968f, 14.8701f, 18.9291f)
                curveTo(16.2406f, 18.3614f, 17.4119f, 17.4001f, 18.236f, 16.1668f)
                curveTo(19.0601f, 14.9334f, 19.5f, 13.4834f, 19.5f, 12.0f)
                curveTo(19.4979f, 10.0115f, 18.707f, 8.1051f, 17.301f, 6.699f)
                curveTo(15.8949f, 5.293f, 13.9885f, 4.5021f, 12.0f, 4.5f)
                close()
                moveTo(12.0f, 16.5f)
                curveTo(11.11f, 16.5f, 10.24f, 16.2361f, 9.4999f, 15.7416f)
                curveTo(8.7599f, 15.2471f, 8.1831f, 14.5443f, 7.8425f, 13.7221f)
                curveTo(7.5019f, 12.8998f, 7.4128f, 11.995f, 7.5865f, 11.1221f)
                curveTo(7.7601f, 10.2492f, 8.1887f, 9.4474f, 8.818f, 8.818f)
                curveTo(9.4474f, 8.1887f, 10.2492f, 7.7601f, 11.1221f, 7.5865f)
                curveTo(11.995f, 7.4128f, 12.8998f, 7.5019f, 13.7221f, 7.8425f)
                curveTo(14.5443f, 8.1831f, 15.2472f, 8.7599f, 15.7416f, 9.4999f)
                curveTo(16.2361f, 10.24f, 16.5f, 11.11f, 16.5f, 12.0f)
                curveTo(16.4987f, 13.1931f, 16.0241f, 14.3369f, 15.1805f, 15.1805f)
                curveTo(14.3369f, 16.0241f, 13.1931f, 16.4987f, 12.0f, 16.5f)
                close()
            }
        }
        .build()
        return _circleSmall!!
    }

private var _circleSmall: ImageVector? = null
