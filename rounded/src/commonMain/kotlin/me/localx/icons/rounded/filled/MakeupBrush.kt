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

public val Icons.Filled.MakeupBrush: ImageVector
    get() {
        if (_makeupBrush != null) {
            return _makeupBrush!!
        }
        _makeupBrush = Builder(name = "MakeupBrush", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(6.4f, 23.9999f)
                    curveTo(4.7032f, 23.998f, 3.0764f, 23.3231f, 1.8766f, 22.1233f)
                    curveTo(0.6767f, 20.9235f, 0.0019f, 19.2967f, 0.0f, 17.5999f)
                    curveTo(0.0f, 14.5409f, 3.952f, 13.2729f, 6.286f, 13.0069f)
                    curveTo(6.4356f, 12.9889f, 6.5873f, 13.0053f, 6.7296f, 13.0548f)
                    curveTo(6.8719f, 13.1044f, 7.001f, 13.1858f, 7.107f, 13.2929f)
                    lineTo(10.707f, 16.8929f)
                    curveTo(10.8134f, 16.9992f, 10.8945f, 17.1281f, 10.9442f, 17.2701f)
                    curveTo(10.9939f, 17.412f, 11.0109f, 17.5634f, 10.994f, 17.7129f)
                    curveTo(10.727f, 20.0479f, 9.458f, 23.9999f, 6.4f, 23.9999f)
                    close()
                    moveTo(10.16f, 9.2279f)
                    lineTo(7.88f, 11.2369f)
                    lineTo(12.763f, 16.1199f)
                    lineTo(14.772f, 13.8399f)
                    lineTo(10.16f, 9.2279f)
                    close()
                    moveTo(23.284f, 0.7159f)
                    curveTo(22.8446f, 0.2793f, 22.2563f, 0.0252f, 21.6373f, 0.0047f)
                    curveTo(21.0183f, -0.0159f, 20.4144f, 0.1985f, 19.947f, 0.6049f)
                    lineTo(11.664f, 7.8999f)
                    lineTo(16.1f, 12.3359f)
                    lineTo(23.4f, 4.0499f)
                    curveTo(23.8053f, 3.5822f, 24.0186f, 2.9785f, 23.9971f, 2.3601f)
                    curveTo(23.9756f, 1.7416f, 23.7208f, 1.1542f, 23.284f, 0.7159f)
                    close()
                }
            }
        }
        .build()
        return _makeupBrush!!
    }

private var _makeupBrush: ImageVector? = null
