package me.localx.icons.rounded.outline

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

public val Icons.Outline.Flag: ImageVector
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
                    moveTo(20.0f, 4.0f)
                    horizontalLineTo(15.0f)
                    curveTo(15.0f, 2.9391f, 14.5786f, 1.9217f, 13.8284f, 1.1716f)
                    curveTo(13.0783f, 0.4214f, 12.0609f, 0.0f, 11.0f, 0.0f)
                    lineTo(4.0f, 0.0f)
                    curveTo(2.9391f, 0.0f, 1.9217f, 0.4214f, 1.1716f, 1.1716f)
                    curveTo(0.4214f, 1.9217f, 0.0f, 2.9391f, 0.0f, 4.0f)
                    lineTo(0.0f, 23.0f)
                    curveTo(0.0f, 23.2652f, 0.1054f, 23.5196f, 0.2929f, 23.7071f)
                    curveTo(0.4804f, 23.8946f, 0.7348f, 24.0f, 1.0f, 24.0f)
                    curveTo(1.2652f, 24.0f, 1.5196f, 23.8946f, 1.7071f, 23.7071f)
                    curveTo(1.8946f, 23.5196f, 2.0f, 23.2652f, 2.0f, 23.0f)
                    verticalLineTo(13.0f)
                    horizontalLineTo(10.0f)
                    curveTo(10.0f, 14.0609f, 10.4214f, 15.0783f, 11.1716f, 15.8284f)
                    curveTo(11.9217f, 16.5786f, 12.9391f, 17.0f, 14.0f, 17.0f)
                    horizontalLineTo(20.0f)
                    curveTo(21.0609f, 17.0f, 22.0783f, 16.5786f, 22.8284f, 15.8284f)
                    curveTo(23.5786f, 15.0783f, 24.0f, 14.0609f, 24.0f, 13.0f)
                    verticalLineTo(8.0f)
                    curveTo(24.0f, 6.9391f, 23.5786f, 5.9217f, 22.8284f, 5.1716f)
                    curveTo(22.0783f, 4.4214f, 21.0609f, 4.0f, 20.0f, 4.0f)
                    close()
                    moveTo(2.0f, 11.0f)
                    verticalLineTo(4.0f)
                    curveTo(2.0f, 3.4696f, 2.2107f, 2.9609f, 2.5858f, 2.5858f)
                    curveTo(2.9609f, 2.2107f, 3.4696f, 2.0f, 4.0f, 2.0f)
                    horizontalLineTo(11.0f)
                    curveTo(11.5304f, 2.0f, 12.0391f, 2.2107f, 12.4142f, 2.5858f)
                    curveTo(12.7893f, 2.9609f, 13.0f, 3.4696f, 13.0f, 4.0f)
                    verticalLineTo(9.0f)
                    curveTo(13.0f, 9.5304f, 12.7893f, 10.0391f, 12.4142f, 10.4142f)
                    curveTo(12.0391f, 10.7893f, 11.5304f, 11.0f, 11.0f, 11.0f)
                    horizontalLineTo(2.0f)
                    close()
                    moveTo(22.0f, 13.0f)
                    curveTo(22.0f, 13.5304f, 21.7893f, 14.0391f, 21.4142f, 14.4142f)
                    curveTo(21.0391f, 14.7893f, 20.5304f, 15.0f, 20.0f, 15.0f)
                    horizontalLineTo(14.0f)
                    curveTo(13.4696f, 15.0f, 12.9609f, 14.7893f, 12.5858f, 14.4142f)
                    curveTo(12.2107f, 14.0391f, 12.0f, 13.5304f, 12.0f, 13.0f)
                    verticalLineTo(12.858f)
                    curveTo(12.8561f, 12.637f, 13.6149f, 12.1385f, 14.1577f, 11.4404f)
                    curveTo(14.7005f, 10.7424f, 14.9967f, 9.8842f, 15.0f, 9.0f)
                    verticalLineTo(6.0f)
                    horizontalLineTo(20.0f)
                    curveTo(20.5304f, 6.0f, 21.0391f, 6.2107f, 21.4142f, 6.5858f)
                    curveTo(21.7893f, 6.9609f, 22.0f, 7.4696f, 22.0f, 8.0f)
                    verticalLineTo(13.0f)
                    close()
                }
            }
        }
        .build()
        return _flag!!
    }

private var _flag: ImageVector? = null
