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

public val Icons.Filled.Pharmacy: ImageVector
    get() {
        if (_pharmacy != null) {
            return _pharmacy!!
        }
        _pharmacy = Builder(name = "Pharmacy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0f, 24.0f)
                    curveTo(10.9391f, 24.0f, 9.9217f, 23.5786f, 9.1716f, 22.8284f)
                    curveTo(8.4214f, 22.0783f, 8.0f, 21.0609f, 8.0f, 20.0f)
                    verticalLineTo(16.0f)
                    horizontalLineTo(4.0f)
                    curveTo(2.9391f, 16.0f, 1.9217f, 15.5786f, 1.1716f, 14.8284f)
                    curveTo(0.4214f, 14.0783f, 0.0f, 13.0609f, 0.0f, 12.0f)
                    curveTo(0.0f, 10.9391f, 0.4214f, 9.9217f, 1.1716f, 9.1716f)
                    curveTo(1.9217f, 8.4214f, 2.9391f, 8.0f, 4.0f, 8.0f)
                    horizontalLineTo(8.0f)
                    verticalLineTo(4.0f)
                    curveTo(8.0f, 2.9391f, 8.4214f, 1.9217f, 9.1716f, 1.1716f)
                    curveTo(9.9217f, 0.4214f, 10.9391f, 0.0f, 12.0f, 0.0f)
                    curveTo(13.0609f, 0.0f, 14.0783f, 0.4214f, 14.8284f, 1.1716f)
                    curveTo(15.5786f, 1.9217f, 16.0f, 2.9391f, 16.0f, 4.0f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(20.0f)
                    curveTo(21.0609f, 8.0f, 22.0783f, 8.4214f, 22.8284f, 9.1716f)
                    curveTo(23.5786f, 9.9217f, 24.0f, 10.9391f, 24.0f, 12.0f)
                    curveTo(24.0f, 13.0609f, 23.5786f, 14.0783f, 22.8284f, 14.8284f)
                    curveTo(22.0783f, 15.5786f, 21.0609f, 16.0f, 20.0f, 16.0f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(20.0f)
                    curveTo(16.0f, 21.0609f, 15.5786f, 22.0783f, 14.8284f, 22.8284f)
                    curveTo(14.0783f, 23.5786f, 13.0609f, 24.0f, 12.0f, 24.0f)
                    close()
                }
            }
        }
        .build()
        return _pharmacy!!
    }

private var _pharmacy: ImageVector? = null
