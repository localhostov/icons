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

public val Icons.Bold.Triangle: ImageVector
    get() {
        if (_triangle != null) {
            return _triangle!!
        }
        _triangle = Builder(name = "Triangle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(19.5861f, 23.0459f)
                    horizontalLineTo(4.4141f)
                    curveTo(3.6616f, 23.0499f, 2.9206f, 22.8604f, 2.2624f, 22.4957f)
                    curveTo(1.6041f, 22.1309f, 1.0507f, 21.6031f, 0.6551f, 20.9629f)
                    curveTo(0.2632f, 20.3362f, 0.0389f, 19.6193f, 0.0039f, 18.881f)
                    curveTo(-0.0312f, 18.1427f, 0.1242f, 17.4078f, 0.4551f, 16.7469f)
                    lineTo(8.0641f, 3.3539f)
                    curveTo(8.4384f, 2.6276f, 9.0063f, 2.019f, 9.7051f, 1.5955f)
                    curveTo(10.4038f, 1.172f, 11.2061f, 0.9501f, 12.0232f, 0.9544f)
                    curveTo(12.8402f, 0.9586f, 13.6402f, 1.1889f, 14.3345f, 1.6196f)
                    curveTo(15.0288f, 2.0503f, 15.5904f, 2.6647f, 15.9571f, 3.3949f)
                    lineTo(23.5001f, 16.6739f)
                    curveTo(23.8476f, 17.3413f, 24.0156f, 18.0875f, 23.9878f, 18.8394f)
                    curveTo(23.9599f, 19.5913f, 23.737f, 20.3231f, 23.3411f, 20.9629f)
                    curveTo(22.9459f, 21.6025f, 22.3931f, 22.13f, 21.7356f, 22.4947f)
                    curveTo(21.0781f, 22.8594f, 20.338f, 23.0492f, 19.5861f, 23.0459f)
                    close()
                    moveTo(12.0001f, 3.9549f)
                    curveTo(11.7371f, 3.9516f, 11.4785f, 4.0224f, 11.2538f, 4.1593f)
                    curveTo(11.0292f, 4.2962f, 10.8477f, 4.4936f, 10.7301f, 4.7289f)
                    lineTo(10.6911f, 4.8029f)
                    lineTo(3.1001f, 18.1559f)
                    curveTo(3.0132f, 18.3524f, 2.9768f, 18.5675f, 2.9943f, 18.7816f)
                    curveTo(3.0118f, 18.9957f, 3.0825f, 19.2021f, 3.2001f, 19.3819f)
                    curveTo(3.3267f, 19.5879f, 3.5048f, 19.7575f, 3.7167f, 19.8739f)
                    curveTo(3.9287f, 19.9903f, 4.1673f, 20.0496f, 4.4091f, 20.0459f)
                    horizontalLineTo(19.5861f)
                    curveTo(19.8279f, 20.0496f, 20.0665f, 19.9903f, 20.2785f, 19.8739f)
                    curveTo(20.4905f, 19.7575f, 20.6685f, 19.5879f, 20.7951f, 19.3819f)
                    curveTo(20.9169f, 19.189f, 20.9866f, 18.9678f, 20.9973f, 18.7399f)
                    curveTo(21.008f, 18.5121f, 20.9593f, 18.2853f, 20.8561f, 18.0819f)
                    lineTo(13.3091f, 4.7999f)
                    curveTo(13.1941f, 4.549f, 13.0098f, 4.3362f, 12.7779f, 4.1865f)
                    curveTo(12.546f, 4.0368f, 12.2761f, 3.9564f, 12.0001f, 3.9549f)
                    close()
                }
            }
        }
        .build()
        return _triangle!!
    }

private var _triangle: ImageVector? = null
