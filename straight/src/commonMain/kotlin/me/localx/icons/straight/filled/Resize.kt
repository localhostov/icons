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

public val Icons.Filled.Resize: ImageVector
    get() {
        if (_resize != null) {
            return _resize!!
        }
        _resize = Builder(name = "Resize", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(6.0f, 18.0f)
                    horizontalLineTo(13.0f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(14.0f)
                    curveTo(0.0f, 13.2044f, 0.3161f, 12.4413f, 0.8787f, 11.8787f)
                    curveTo(1.4413f, 11.3161f, 2.2043f, 11.0f, 3.0f, 11.0f)
                    horizontalLineTo(6.0f)
                    verticalLineTo(18.0f)
                    close()
                    moveTo(10.0f, 13.0f)
                    horizontalLineTo(8.0f)
                    verticalLineTo(16.0f)
                    horizontalLineTo(11.0f)
                    verticalLineTo(14.0f)
                    curveTo(11.0f, 13.7348f, 10.8946f, 13.4804f, 10.7071f, 13.2929f)
                    curveTo(10.5196f, 13.1054f, 10.2652f, 13.0f, 10.0f, 13.0f)
                    close()
                    moveTo(21.0f, 0.0f)
                    horizontalLineTo(9.0f)
                    curveTo(8.2044f, 0.0f, 7.4413f, 0.3161f, 6.8787f, 0.8787f)
                    curveTo(6.3161f, 1.4413f, 6.0f, 2.2043f, 6.0f, 3.0f)
                    verticalLineTo(11.0f)
                    horizontalLineTo(10.0f)
                    curveTo(10.4455f, 11.0017f, 10.8848f, 11.1043f, 11.285f, 11.3f)
                    lineTo(16.585f, 6.0f)
                    horizontalLineTo(13.0f)
                    verticalLineTo(4.0f)
                    horizontalLineTo(20.0f)
                    verticalLineTo(11.0f)
                    horizontalLineTo(18.0f)
                    verticalLineTo(7.414f)
                    lineTo(12.7f, 12.714f)
                    curveTo(12.8959f, 13.1145f, 12.9984f, 13.5542f, 13.0f, 14.0f)
                    verticalLineTo(18.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(3.0f)
                    curveTo(24.0f, 2.2043f, 23.6839f, 1.4413f, 23.1213f, 0.8787f)
                    curveTo(22.5587f, 0.3161f, 21.7956f, 0.0f, 21.0f, 0.0f)
                    verticalLineTo(0.0f)
                    close()
                }
            }
        }
        .build()
        return _resize!!
    }

private var _resize: ImageVector? = null
