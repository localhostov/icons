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

public val Icons.Filled.Flag: ImageVector
    get() {
        if (_flag != null) {
            return _flag!!
        }
        _flag = Builder(name = "Flag", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(1.0f, 24.0f)
                    curveTo(0.7348f, 24.0f, 0.4804f, 23.8946f, 0.2929f, 23.7071f)
                    curveTo(0.1054f, 23.5196f, 0.0f, 23.2652f, 0.0f, 23.0f)
                    verticalLineTo(4.0f)
                    curveTo(0.0f, 2.9391f, 0.4214f, 1.9217f, 1.1716f, 1.1716f)
                    curveTo(1.9217f, 0.4214f, 2.9391f, 0.0f, 4.0f, 0.0f)
                    lineTo(11.0f, 0.0f)
                    curveTo(12.0609f, 0.0f, 13.0783f, 0.4214f, 13.8284f, 1.1716f)
                    curveTo(14.5786f, 1.9217f, 15.0f, 2.9391f, 15.0f, 4.0f)
                    verticalLineTo(9.0f)
                    curveTo(15.0f, 10.0609f, 14.5786f, 11.0783f, 13.8284f, 11.8284f)
                    curveTo(13.0783f, 12.5786f, 12.0609f, 13.0f, 11.0f, 13.0f)
                    horizontalLineTo(2.0f)
                    verticalLineTo(23.0f)
                    curveTo(2.0f, 23.2652f, 1.8946f, 23.5196f, 1.7071f, 23.7071f)
                    curveTo(1.5196f, 23.8946f, 1.2652f, 24.0f, 1.0f, 24.0f)
                    close()
                    moveTo(20.0f, 4.0f)
                    horizontalLineTo(17.0f)
                    verticalLineTo(9.0f)
                    curveTo(16.9984f, 10.5908f, 16.3658f, 12.116f, 15.2409f, 13.2409f)
                    curveTo(14.116f, 14.3658f, 12.5908f, 14.9984f, 11.0f, 15.0f)
                    horizontalLineTo(10.556f)
                    curveTo(10.9044f, 15.606f, 11.4059f, 16.1098f, 12.0104f, 16.4608f)
                    curveTo(12.6149f, 16.8118f, 13.301f, 16.9978f, 14.0f, 17.0f)
                    horizontalLineTo(20.0f)
                    curveTo(21.0609f, 17.0f, 22.0783f, 16.5786f, 22.8284f, 15.8284f)
                    curveTo(23.5786f, 15.0783f, 24.0f, 14.0609f, 24.0f, 13.0f)
                    verticalLineTo(8.0f)
                    curveTo(24.0f, 6.9391f, 23.5786f, 5.9217f, 22.8284f, 5.1716f)
                    curveTo(22.0783f, 4.4214f, 21.0609f, 4.0f, 20.0f, 4.0f)
                    close()
                }
            }
        }
        .build()
        return _flag!!
    }

private var _flag: ImageVector? = null
