package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.Forward: ImageVector
    get() {
        if (_forward != null) {
            return _forward!!
        }
        _forward = Builder(name = "Forward", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0001f, 23.8001f)
                verticalLineTo(0.2001f)
                lineTo(9.0001f, 5.9111f)
                verticalLineTo(0.3171f)
                lineTo(22.1801f, 9.0581f)
                curveTo(22.6047f, 9.3613f, 22.9508f, 9.7616f, 23.1895f, 10.2256f)
                curveTo(23.4283f, 10.6895f, 23.5529f, 11.2038f, 23.5529f, 11.7256f)
                curveTo(23.5529f, 12.2474f, 23.4283f, 12.7616f, 23.1895f, 13.2256f)
                curveTo(22.9508f, 13.6895f, 22.6047f, 14.0898f, 22.1801f, 14.3931f)
                lineTo(9.0001f, 23.8001f)
                verticalLineTo(18.0891f)
                lineTo(1.0001f, 23.8001f)
                close()
                moveTo(12.0001f, 12.2601f)
                verticalLineTo(17.9751f)
                lineTo(20.4371f, 11.9521f)
                curveTo(20.4734f, 11.9267f, 20.503f, 11.8929f, 20.5232f, 11.8535f)
                curveTo(20.5434f, 11.8141f, 20.5537f, 11.7704f, 20.5531f, 11.7261f)
                curveTo(20.5543f, 11.6846f, 20.5459f, 11.6435f, 20.5286f, 11.6058f)
                curveTo(20.5112f, 11.5682f, 20.4854f, 11.535f, 20.4531f, 11.5091f)
                lineTo(12.0001f, 5.9061f)
                verticalLineTo(11.7401f)
                lineTo(4.0001f, 6.0261f)
                verticalLineTo(17.9741f)
                lineTo(12.0001f, 12.2601f)
                close()
            }
        }
        .build()
        return _forward!!
    }

private var _forward: ImageVector? = null
