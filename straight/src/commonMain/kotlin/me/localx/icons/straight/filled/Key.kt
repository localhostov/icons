package me.localx.icons.straight.filled

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

public val Icons.Filled.Key: ImageVector
    get() {
        if (_key != null) {
            return _key!!
        }
        _key = Builder(name = "Key", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(21.9998f, -2.0E-4f)
                    horizontalLineTo(20.5638f)
                    curveTo(20.1697f, -0.0014f, 19.7793f, 0.0758f, 19.4152f, 0.2266f)
                    curveTo(19.0511f, 0.3775f, 18.7206f, 0.5992f, 18.4428f, 0.8788f)
                    lineTo(9.9158f, 9.3998f)
                    curveTo(8.3086f, 8.8507f, 6.5629f, 8.8621f, 4.963f, 9.4319f)
                    curveTo(3.3631f, 10.0018f, 2.0033f, 11.0965f, 1.105f, 12.5379f)
                    curveTo(0.2068f, 13.9793f, -0.177f, 15.6824f, 0.0163f, 17.3697f)
                    curveTo(0.2096f, 19.057f, 0.9685f, 20.6292f, 2.1695f, 21.8301f)
                    curveTo(3.3704f, 23.0311f, 4.9426f, 23.79f, 6.6299f, 23.9833f)
                    curveTo(8.3172f, 24.1765f, 10.0203f, 23.7928f, 11.4617f, 22.8946f)
                    curveTo(12.9031f, 21.9963f, 13.9978f, 20.6365f, 14.5677f, 19.0366f)
                    curveTo(15.1375f, 17.4367f, 15.1488f, 15.6909f, 14.5998f, 14.0838f)
                    lineTo(16.9998f, 11.6838f)
                    verticalLineTo(7.9998f)
                    horizontalLineTo(19.9998f)
                    verticalLineTo(4.9998f)
                    horizontalLineTo(23.5508f)
                    curveTo(23.8428f, 4.5302f, 23.9982f, 3.9887f, 23.9998f, 3.4358f)
                    verticalLineTo(1.9998f)
                    curveTo(23.9998f, 1.4693f, 23.7891f, 0.9606f, 23.414f, 0.5856f)
                    curveTo(23.039f, 0.2105f, 22.5303f, -2.0E-4f, 21.9998f, -2.0E-4f)
                    close()
                    moveTo(5.4998f, 19.9998f)
                    curveTo(5.2031f, 19.9998f, 4.9131f, 19.9118f, 4.6665f, 19.747f)
                    curveTo(4.4198f, 19.5821f, 4.2275f, 19.3479f, 4.114f, 19.0738f)
                    curveTo(4.0005f, 18.7997f, 3.9708f, 18.4981f, 4.0286f, 18.2071f)
                    curveTo(4.0865f, 17.9162f, 4.2294f, 17.6489f, 4.4392f, 17.4391f)
                    curveTo(4.6489f, 17.2293f, 4.9162f, 17.0865f, 5.2072f, 17.0286f)
                    curveTo(5.4981f, 16.9707f, 5.7997f, 17.0004f, 6.0738f, 17.1139f)
                    curveTo(6.3479f, 17.2275f, 6.5822f, 17.4197f, 6.747f, 17.6664f)
                    curveTo(6.9118f, 17.9131f, 6.9998f, 18.2031f, 6.9998f, 18.4998f)
                    curveTo(6.9998f, 18.8976f, 6.8418f, 19.2791f, 6.5605f, 19.5604f)
                    curveTo(6.2792f, 19.8417f, 5.8976f, 19.9998f, 5.4998f, 19.9998f)
                    close()
                }
            }
        }
        .build()
        return _key!!
    }

private var _key: ImageVector? = null
