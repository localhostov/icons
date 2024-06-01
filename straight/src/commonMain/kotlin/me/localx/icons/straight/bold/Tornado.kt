package me.localx.icons.straight.bold

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

public val Icons.Bold.Tornado: ImageVector
    get() {
        if (_tornado != null) {
            return _tornado!!
        }
        _tornado = Builder(name = "Tornado", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(15.0f, 24.0f)
                    horizontalLineTo(10.0f)
                    verticalLineTo(21.0f)
                    horizontalLineTo(15.0f)
                    curveTo(15.2652f, 21.0f, 15.5196f, 20.8946f, 15.7071f, 20.7071f)
                    curveTo(15.8946f, 20.5196f, 16.0f, 20.2652f, 16.0f, 20.0f)
                    curveTo(16.0f, 19.7348f, 15.8946f, 19.4804f, 15.7071f, 19.2929f)
                    curveTo(15.5196f, 19.1054f, 15.2652f, 19.0f, 15.0f, 19.0f)
                    horizontalLineTo(7.0f)
                    curveTo(5.9391f, 19.0f, 4.9217f, 18.5786f, 4.1716f, 17.8284f)
                    curveTo(3.4214f, 17.0783f, 3.0f, 16.0609f, 3.0f, 15.0f)
                    curveTo(3.0f, 13.9391f, 3.4214f, 12.9217f, 4.1716f, 12.1716f)
                    curveTo(4.9217f, 11.4214f, 5.9391f, 11.0f, 7.0f, 11.0f)
                    horizontalLineTo(20.0f)
                    curveTo(20.2652f, 11.0f, 20.5196f, 10.8946f, 20.7071f, 10.7071f)
                    curveTo(20.8946f, 10.5196f, 21.0f, 10.2652f, 21.0f, 10.0f)
                    curveTo(21.0f, 9.7348f, 20.8946f, 9.4804f, 20.7071f, 9.2929f)
                    curveTo(20.5196f, 9.1054f, 20.2652f, 9.0f, 20.0f, 9.0f)
                    horizontalLineTo(4.5f)
                    curveTo(3.3065f, 9.0f, 2.1619f, 8.5259f, 1.318f, 7.682f)
                    curveTo(0.4741f, 6.8381f, 0.0f, 5.6935f, 0.0f, 4.5f)
                    curveTo(0.0f, 3.3065f, 0.4741f, 2.1619f, 1.318f, 1.318f)
                    curveTo(2.1619f, 0.4741f, 3.3065f, 0.0f, 4.5f, 0.0f)
                    lineTo(24.0f, 0.0f)
                    verticalLineTo(3.0f)
                    horizontalLineTo(4.5f)
                    curveTo(4.1022f, 3.0f, 3.7206f, 3.158f, 3.4393f, 3.4393f)
                    curveTo(3.158f, 3.7206f, 3.0f, 4.1022f, 3.0f, 4.5f)
                    curveTo(3.0f, 4.8978f, 3.158f, 5.2794f, 3.4393f, 5.5607f)
                    curveTo(3.7206f, 5.842f, 4.1022f, 6.0f, 4.5f, 6.0f)
                    horizontalLineTo(20.0f)
                    curveTo(21.0609f, 6.0f, 22.0783f, 6.4214f, 22.8284f, 7.1716f)
                    curveTo(23.5786f, 7.9217f, 24.0f, 8.9391f, 24.0f, 10.0f)
                    curveTo(24.0f, 11.0609f, 23.5786f, 12.0783f, 22.8284f, 12.8284f)
                    curveTo(22.0783f, 13.5786f, 21.0609f, 14.0f, 20.0f, 14.0f)
                    horizontalLineTo(7.0f)
                    curveTo(6.7348f, 14.0f, 6.4804f, 14.1054f, 6.2929f, 14.2929f)
                    curveTo(6.1054f, 14.4804f, 6.0f, 14.7348f, 6.0f, 15.0f)
                    curveTo(6.0f, 15.2652f, 6.1054f, 15.5196f, 6.2929f, 15.7071f)
                    curveTo(6.4804f, 15.8946f, 6.7348f, 16.0f, 7.0f, 16.0f)
                    horizontalLineTo(15.0f)
                    curveTo(16.0609f, 16.0f, 17.0783f, 16.4214f, 17.8284f, 17.1716f)
                    curveTo(18.5786f, 17.9217f, 19.0f, 18.9391f, 19.0f, 20.0f)
                    curveTo(19.0f, 21.0609f, 18.5786f, 22.0783f, 17.8284f, 22.8284f)
                    curveTo(17.0783f, 23.5786f, 16.0609f, 24.0f, 15.0f, 24.0f)
                    close()
                }
            }
        }
        .build()
        return _tornado!!
    }

private var _tornado: ImageVector? = null
