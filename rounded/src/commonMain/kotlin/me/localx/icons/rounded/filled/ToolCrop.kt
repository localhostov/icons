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

public val Icons.Filled.ToolCrop: ImageVector
    get() {
        if (_toolCrop != null) {
            return _toolCrop!!
        }
        _toolCrop = Builder(name = "ToolCrop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.0f, 18.0f)
                    horizontalLineTo(20.0f)
                    verticalLineTo(9.0f)
                    curveTo(19.9984f, 7.6744f, 19.4711f, 6.4036f, 18.5338f, 5.4662f)
                    curveTo(17.5964f, 4.5289f, 16.3256f, 4.0016f, 15.0f, 4.0f)
                    horizontalLineTo(6.0f)
                    verticalLineTo(1.0f)
                    curveTo(6.0f, 0.7348f, 5.8946f, 0.4804f, 5.7071f, 0.2929f)
                    curveTo(5.5196f, 0.1054f, 5.2652f, 0.0f, 5.0f, 0.0f)
                    curveTo(4.7348f, 0.0f, 4.4804f, 0.1054f, 4.2929f, 0.2929f)
                    curveTo(4.1054f, 0.4804f, 4.0f, 0.7348f, 4.0f, 1.0f)
                    verticalLineTo(4.0f)
                    horizontalLineTo(1.0f)
                    curveTo(0.7348f, 4.0f, 0.4804f, 4.1054f, 0.2929f, 4.2929f)
                    curveTo(0.1054f, 4.4804f, 0.0f, 4.7348f, 0.0f, 5.0f)
                    curveTo(0.0f, 5.2652f, 0.1054f, 5.5196f, 0.2929f, 5.7071f)
                    curveTo(0.4804f, 5.8946f, 0.7348f, 6.0f, 1.0f, 6.0f)
                    horizontalLineTo(4.0f)
                    verticalLineTo(15.0f)
                    curveTo(4.0016f, 16.3256f, 4.5289f, 17.5964f, 5.4662f, 18.5338f)
                    curveTo(6.4036f, 19.4711f, 7.6744f, 19.9984f, 9.0f, 20.0f)
                    horizontalLineTo(18.0f)
                    verticalLineTo(23.0f)
                    curveTo(18.0f, 23.2652f, 18.1054f, 23.5196f, 18.2929f, 23.7071f)
                    curveTo(18.4804f, 23.8946f, 18.7348f, 24.0f, 19.0f, 24.0f)
                    curveTo(19.2652f, 24.0f, 19.5196f, 23.8946f, 19.7071f, 23.7071f)
                    curveTo(19.8946f, 23.5196f, 20.0f, 23.2652f, 20.0f, 23.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(23.0f)
                    curveTo(23.2652f, 20.0f, 23.5196f, 19.8946f, 23.7071f, 19.7071f)
                    curveTo(23.8946f, 19.5196f, 24.0f, 19.2652f, 24.0f, 19.0f)
                    curveTo(24.0f, 18.7348f, 23.8946f, 18.4804f, 23.7071f, 18.2929f)
                    curveTo(23.5196f, 18.1054f, 23.2652f, 18.0f, 23.0f, 18.0f)
                    close()
                    moveTo(18.0f, 18.0f)
                    horizontalLineTo(9.0f)
                    curveTo(8.2044f, 18.0f, 7.4413f, 17.6839f, 6.8787f, 17.1213f)
                    curveTo(6.3161f, 16.5587f, 6.0f, 15.7956f, 6.0f, 15.0f)
                    verticalLineTo(6.0f)
                    horizontalLineTo(15.0f)
                    curveTo(15.7956f, 6.0f, 16.5587f, 6.3161f, 17.1213f, 6.8787f)
                    curveTo(17.6839f, 7.4413f, 18.0f, 8.2044f, 18.0f, 9.0f)
                    verticalLineTo(18.0f)
                    close()
                }
            }
        }
        .build()
        return _toolCrop!!
    }

private var _toolCrop: ImageVector? = null
