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

public val Icons.Filled.Cursor: ImageVector
    get() {
        if (_cursor != null) {
            return _cursor!!
        }
        _cursor = Builder(name = "Cursor", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(15.0081f, 24.0f)
                    curveTo(14.4539f, 24.0009f, 13.9102f, 23.8485f, 13.4371f, 23.5598f)
                    curveTo(12.9639f, 23.2711f, 12.5798f, 22.8573f, 12.3271f, 22.364f)
                    lineTo(9.2001f, 15.66f)
                    lineTo(5.6581f, 18.753f)
                    curveTo(5.5135f, 18.8794f, 5.3355f, 18.9614f, 5.1455f, 18.9894f)
                    curveTo(4.9555f, 19.0173f, 4.7615f, 18.9899f, 4.5866f, 18.9105f)
                    curveTo(4.4117f, 18.8311f, 4.2634f, 18.703f, 4.1594f, 18.5415f)
                    curveTo(4.0554f, 18.3801f, 4.0001f, 18.1921f, 4.0001f, 18.0f)
                    verticalLineTo(2.98f)
                    curveTo(4.0001f, 2.4021f, 4.167f, 1.8365f, 4.4807f, 1.3512f)
                    curveTo(4.7944f, 0.8659f, 5.2417f, 0.4815f, 5.7686f, 0.2443f)
                    curveTo(6.2955f, 0.0071f, 6.8798f, -0.0729f, 7.4511f, 0.014f)
                    curveTo(8.0224f, 0.1008f, 8.5565f, 0.3509f, 8.9891f, 0.734f)
                    lineTo(19.6891f, 10.972f)
                    curveTo(19.828f, 11.1046f, 19.9257f, 11.2744f, 19.9706f, 11.4611f)
                    curveTo(20.0156f, 11.6477f, 20.0058f, 11.8434f, 19.9425f, 12.0247f)
                    curveTo(19.8793f, 12.2059f, 19.7652f, 12.3652f, 19.6138f, 12.4833f)
                    curveTo(19.4625f, 12.6015f, 19.2803f, 12.6736f, 19.0891f, 12.691f)
                    lineTo(14.6211f, 13.098f)
                    lineTo(17.6861f, 19.667f)
                    curveTo(17.9126f, 20.1237f, 18.019f, 20.6305f, 17.9953f, 21.1397f)
                    curveTo(17.9716f, 21.6489f, 17.8185f, 22.1436f, 17.5505f, 22.5772f)
                    curveTo(17.2825f, 23.0108f, 16.9084f, 23.369f, 16.4636f, 23.618f)
                    curveTo(16.0188f, 23.8669f, 15.5179f, 23.9984f, 15.0081f, 24.0f)
                    close()
                }
            }
        }
        .build()
        return _cursor!!
    }

private var _cursor: ImageVector? = null
