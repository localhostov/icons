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

public val Icons.Outline.Resize: ImageVector
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
                    moveTo(24.0f, 3.0f)
                    curveTo(24.0f, 2.2043f, 23.6839f, 1.4413f, 23.1213f, 0.8787f)
                    curveTo(22.5587f, 0.3161f, 21.7956f, 0.0f, 21.0f, 0.0f)
                    lineTo(9.0f, 0.0f)
                    curveTo(8.2044f, 0.0f, 7.4413f, 0.3161f, 6.8787f, 0.8787f)
                    curveTo(6.3161f, 1.4413f, 6.0f, 2.2043f, 6.0f, 3.0f)
                    verticalLineTo(11.0f)
                    horizontalLineTo(3.0f)
                    curveTo(2.2043f, 11.0f, 1.4413f, 11.3161f, 0.8787f, 11.8787f)
                    curveTo(0.3161f, 12.4413f, 0.0f, 13.2044f, 0.0f, 14.0f)
                    lineTo(0.0f, 24.0f)
                    horizontalLineTo(13.0f)
                    verticalLineTo(18.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(3.0f)
                    close()
                    moveTo(11.0f, 22.0f)
                    horizontalLineTo(2.0f)
                    verticalLineTo(14.0f)
                    curveTo(2.0f, 13.7348f, 2.1054f, 13.4804f, 2.2929f, 13.2929f)
                    curveTo(2.4804f, 13.1054f, 2.7348f, 13.0f, 3.0f, 13.0f)
                    horizontalLineTo(6.0f)
                    verticalLineTo(18.0f)
                    horizontalLineTo(11.0f)
                    verticalLineTo(22.0f)
                    close()
                    moveTo(11.0f, 14.0f)
                    verticalLineTo(16.0f)
                    horizontalLineTo(8.0f)
                    verticalLineTo(13.0f)
                    horizontalLineTo(10.0f)
                    curveTo(10.2652f, 13.0f, 10.5196f, 13.1054f, 10.7071f, 13.2929f)
                    curveTo(10.8946f, 13.4804f, 11.0f, 13.7348f, 11.0f, 14.0f)
                    close()
                    moveTo(22.0f, 16.0f)
                    horizontalLineTo(13.0f)
                    verticalLineTo(14.0f)
                    curveTo(12.9983f, 13.5545f, 12.8957f, 13.1152f, 12.7f, 12.715f)
                    lineTo(18.0f, 7.415f)
                    verticalLineTo(11.0f)
                    horizontalLineTo(20.0f)
                    verticalLineTo(4.0f)
                    horizontalLineTo(13.0f)
                    verticalLineTo(6.0f)
                    horizontalLineTo(16.586f)
                    lineTo(11.286f, 11.3f)
                    curveTo(10.8855f, 11.1041f, 10.4458f, 11.0016f, 10.0f, 11.0f)
                    horizontalLineTo(8.0f)
                    verticalLineTo(3.0f)
                    curveTo(8.0f, 2.7348f, 8.1054f, 2.4804f, 8.2929f, 2.2929f)
                    curveTo(8.4804f, 2.1054f, 8.7348f, 2.0f, 9.0f, 2.0f)
                    horizontalLineTo(21.0f)
                    curveTo(21.2652f, 2.0f, 21.5196f, 2.1054f, 21.7071f, 2.2929f)
                    curveTo(21.8946f, 2.4804f, 22.0f, 2.7348f, 22.0f, 3.0f)
                    verticalLineTo(16.0f)
                    close()
                }
            }
        }
        .build()
        return _resize!!
    }

private var _resize: ImageVector? = null
