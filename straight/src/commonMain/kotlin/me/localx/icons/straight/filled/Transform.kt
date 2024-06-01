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

public val Icons.Filled.Transform: ImageVector
    get() {
        if (_transform != null) {
            return _transform!!
        }
        _transform = Builder(name = "Transform", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0f, 24.0f)
                    horizontalLineTo(18.0f)
                    verticalLineTo(22.0f)
                    horizontalLineTo(22.0f)
                    verticalLineTo(18.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(24.0f)
                    close()
                    moveTo(24.0f, 3.0f)
                    curveTo(24.0f, 2.2043f, 23.6839f, 1.4413f, 23.1213f, 0.8787f)
                    curveTo(22.5587f, 0.3161f, 21.7956f, 0.0f, 21.0f, 0.0f)
                    lineTo(18.0f, 0.0f)
                    verticalLineTo(2.0f)
                    horizontalLineTo(21.0f)
                    curveTo(21.2652f, 2.0f, 21.5196f, 2.1054f, 21.7071f, 2.2929f)
                    curveTo(21.8946f, 2.4804f, 22.0f, 2.7348f, 22.0f, 3.0f)
                    verticalLineTo(6.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(3.0f)
                    close()
                    moveTo(6.0f, 22.0f)
                    horizontalLineTo(2.0f)
                    verticalLineTo(18.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(6.0f)
                    verticalLineTo(22.0f)
                    close()
                    moveTo(2.0f, 3.0f)
                    curveTo(2.0f, 2.7348f, 2.1054f, 2.4804f, 2.2929f, 2.2929f)
                    curveTo(2.4804f, 2.1054f, 2.7348f, 2.0f, 3.0f, 2.0f)
                    horizontalLineTo(6.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(3.0f)
                    curveTo(2.2043f, 0.0f, 1.4413f, 0.3161f, 0.8787f, 0.8787f)
                    curveTo(0.3161f, 1.4413f, 0.0f, 2.2043f, 0.0f, 3.0f)
                    lineTo(0.0f, 6.0f)
                    horizontalLineTo(2.0f)
                    verticalLineTo(3.0f)
                    close()
                    moveTo(16.0f, 12.0f)
                    curveTo(16.0f, 11.2089f, 15.7654f, 10.4355f, 15.3259f, 9.7777f)
                    curveTo(14.8864f, 9.1199f, 14.2616f, 8.6072f, 13.5307f, 8.3045f)
                    curveTo(12.7998f, 8.0017f, 11.9956f, 7.9225f, 11.2196f, 8.0769f)
                    curveTo(10.4437f, 8.2312f, 9.731f, 8.6122f, 9.1716f, 9.1716f)
                    curveTo(8.6122f, 9.731f, 8.2312f, 10.4437f, 8.0769f, 11.2196f)
                    curveTo(7.9225f, 11.9956f, 8.0017f, 12.7998f, 8.3045f, 13.5307f)
                    curveTo(8.6072f, 14.2616f, 9.1199f, 14.8864f, 9.7777f, 15.3259f)
                    curveTo(10.4355f, 15.7654f, 11.2089f, 16.0f, 12.0f, 16.0f)
                    curveTo(13.0609f, 16.0f, 14.0783f, 15.5786f, 14.8284f, 14.8284f)
                    curveTo(15.5786f, 14.0783f, 16.0f, 13.0609f, 16.0f, 12.0f)
                    close()
                }
            }
        }
        .build()
        return _transform!!
    }

private var _transform: ImageVector? = null
