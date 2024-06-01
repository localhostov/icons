package me.localx.icons.straight.outline

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

public val Icons.Outline.Moon: ImageVector
    get() {
        if (_moon != null) {
            return _moon!!
        }
        _moon = Builder(name = "Moon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(14.0f, 24.0003f)
                    curveTo(10.8184f, 23.9969f, 7.7682f, 22.7315f, 5.5185f, 20.4818f)
                    curveTo(3.2688f, 18.2321f, 2.0034f, 15.1819f, 2.0f, 12.0003f)
                    curveTo(1.847f, 3.0443f, 12.0309f, -2.9847f, 19.791f, 1.5093f)
                    lineTo(21.344f, 2.3713f)
                    lineTo(19.801f, 3.2513f)
                    curveTo(13.101f, 6.9393f, 13.5909f, 17.1213f, 20.601f, 20.1573f)
                    lineTo(22.222f, 20.8883f)
                    lineTo(20.7549f, 21.8943f)
                    curveTo(18.7683f, 23.2638f, 16.4129f, 23.9981f, 14.0f, 24.0003f)
                    close()
                    moveTo(14.0f, 2.0003f)
                    curveTo(11.3487f, 2.0032f, 8.8068f, 3.0577f, 6.9321f, 4.9325f)
                    curveTo(5.0574f, 6.8072f, 4.0029f, 9.349f, 3.9999f, 12.0003f)
                    curveTo(3.8449f, 19.1173f, 11.7629f, 24.2003f, 18.155f, 21.0823f)
                    curveTo(16.6585f, 20.078f, 15.4179f, 18.7373f, 14.5327f, 17.1675f)
                    curveTo(13.6474f, 15.5977f, 13.1419f, 13.8424f, 13.0568f, 12.0422f)
                    curveTo(12.9716f, 10.242f, 13.3091f, 8.4469f, 14.0423f, 6.8005f)
                    curveTo(14.7755f, 5.1542f, 15.884f, 3.7024f, 17.2789f, 2.5613f)
                    curveTo(16.2262f, 2.1878f, 15.117f, 1.998f, 14.0f, 2.0003f)
                    close()
                }
            }
        }
        .build()
        return _moon!!
    }

private var _moon: ImageVector? = null
