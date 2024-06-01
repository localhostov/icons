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

public val Icons.Filled.PhoneCall: ImageVector
    get() {
        if (_phoneCall != null) {
            return _phoneCall!!
        }
        _phoneCall = Builder(name = "PhoneCall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(17.613f, 12.848f)
                    lineTo(23.878f, 19.113f)
                    lineTo(20.707f, 22.284f)
                    curveTo(20.1543f, 22.8344f, 19.4978f, 23.2695f, 18.7756f, 23.5641f)
                    curveTo(18.0534f, 23.8586f, 17.2799f, 24.0068f, 16.5f, 24.0f)
                    curveTo(9.252f, 24.0f, -0.0f, 14.748f, -0.0f, 7.5f)
                    curveTo(-0.0064f, 6.72f, 0.142f, 5.9465f, 0.4366f, 5.2242f)
                    curveTo(0.7311f, 4.5019f, 1.166f, 3.8451f, 1.716f, 3.292f)
                    lineTo(4.887f, 0.122f)
                    lineTo(11.152f, 6.387f)
                    lineTo(7.027f, 10.512f)
                    curveTo(8.2533f, 13.4263f, 10.5686f, 15.7469f, 13.48f, 16.98f)
                    lineTo(17.613f, 12.848f)
                    close()
                    moveTo(22.0f, 10.0f)
                    horizontalLineTo(24.0f)
                    curveTo(23.9971f, 7.3487f, 22.9426f, 4.8069f, 21.0678f, 2.9321f)
                    curveTo(19.1931f, 1.0574f, 16.6513f, 0.0029f, 14.0f, 0.0f)
                    verticalLineTo(2.0f)
                    curveTo(16.121f, 2.0024f, 18.1544f, 2.846f, 19.6542f, 4.3458f)
                    curveTo(21.154f, 5.8456f, 21.9976f, 7.879f, 22.0f, 10.0f)
                    close()
                    moveTo(18.0f, 10.0f)
                    horizontalLineTo(20.0f)
                    curveTo(19.9984f, 8.4092f, 19.3657f, 6.884f, 18.2409f, 5.7591f)
                    curveTo(17.116f, 4.6342f, 15.5908f, 4.0016f, 14.0f, 4.0f)
                    verticalLineTo(6.0f)
                    curveTo(15.0608f, 6.0f, 16.0783f, 6.4214f, 16.8284f, 7.1716f)
                    curveTo(17.5786f, 7.9217f, 18.0f, 8.9391f, 18.0f, 10.0f)
                    close()
                }
            }
        }
        .build()
        return _phoneCall!!
    }

private var _phoneCall: ImageVector? = null
