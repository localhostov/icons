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

public val Icons.Bold.CircleSmall: ImageVector
    get() {
        if (_circleSmall != null) {
            return _circleSmall!!
        }
        _circleSmall = Builder(name = "CircleSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 19.4999f)
                curveTo(10.5167f, 19.4999f, 9.0666f, 19.06f, 7.8333f, 18.2359f)
                curveTo(6.5999f, 17.4118f, 5.6386f, 16.2405f, 5.071f, 14.87f)
                curveTo(4.5033f, 13.4996f, 4.3548f, 11.9916f, 4.6441f, 10.5367f)
                curveTo(4.9335f, 9.0819f, 5.6479f, 7.7455f, 6.6967f, 6.6966f)
                curveTo(7.7456f, 5.6477f, 9.082f, 4.9334f, 10.5369f, 4.644f)
                curveTo(11.9917f, 4.3546f, 13.4997f, 4.5031f, 14.8702f, 5.0708f)
                curveTo(16.2406f, 5.6384f, 17.412f, 6.5997f, 18.2361f, 7.8331f)
                curveTo(19.0602f, 9.0665f, 19.5f, 10.5165f, 19.5f, 11.9999f)
                curveTo(19.4979f, 13.9884f, 18.7071f, 15.8948f, 17.301f, 17.3008f)
                curveTo(15.8949f, 18.7069f, 13.9885f, 19.4978f, 12.0f, 19.4999f)
                close()
                moveTo(12.0f, 7.4999f)
                curveTo(11.11f, 7.4999f, 10.24f, 7.7638f, 9.5f, 8.2583f)
                curveTo(8.7599f, 8.7527f, 8.1832f, 9.4555f, 7.8426f, 10.2778f)
                curveTo(7.502f, 11.1001f, 7.4129f, 12.0049f, 7.5865f, 12.8778f)
                curveTo(7.7601f, 13.7507f, 8.1887f, 14.5525f, 8.8181f, 15.1819f)
                curveTo(9.4474f, 15.8112f, 10.2492f, 16.2398f, 11.1221f, 16.4134f)
                curveTo(11.995f, 16.587f, 12.8998f, 16.4979f, 13.7221f, 16.1573f)
                curveTo(14.5444f, 15.8167f, 15.2472f, 15.24f, 15.7417f, 14.4999f)
                curveTo(16.2361f, 13.7599f, 16.5f, 12.8899f, 16.5f, 11.9999f)
                curveTo(16.4987f, 10.8068f, 16.0242f, 9.663f, 15.1806f, 8.8194f)
                curveTo(14.3369f, 7.9757f, 13.1931f, 7.5012f, 12.0f, 7.4999f)
                close()
            }
        }
        .build()
        return _circleSmall!!
    }

private var _circleSmall: ImageVector? = null
