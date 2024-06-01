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

public val Icons.Outline.ToolCrop: ImageVector
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
                    moveTo(24.0f, 18.0f)
                    horizontalLineTo(20.0f)
                    verticalLineTo(7.0f)
                    curveTo(20.0f, 6.2043f, 19.6839f, 5.4413f, 19.1213f, 4.8787f)
                    curveTo(18.5587f, 4.3161f, 17.7956f, 4.0f, 17.0f, 4.0f)
                    horizontalLineTo(6.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(4.0f)
                    verticalLineTo(4.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(6.0f)
                    horizontalLineTo(4.0f)
                    verticalLineTo(17.0f)
                    curveTo(4.0f, 17.7956f, 4.3161f, 18.5587f, 4.8787f, 19.1213f)
                    curveTo(5.4413f, 19.6839f, 6.2043f, 20.0f, 7.0f, 20.0f)
                    horizontalLineTo(18.0f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(20.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(18.0f)
                    close()
                    moveTo(7.0f, 18.0f)
                    curveTo(6.7348f, 18.0f, 6.4804f, 17.8946f, 6.2929f, 17.7071f)
                    curveTo(6.1054f, 17.5196f, 6.0f, 17.2652f, 6.0f, 17.0f)
                    verticalLineTo(6.0f)
                    horizontalLineTo(17.0f)
                    curveTo(17.2652f, 6.0f, 17.5196f, 6.1054f, 17.7071f, 6.2929f)
                    curveTo(17.8946f, 6.4804f, 18.0f, 6.7348f, 18.0f, 7.0f)
                    verticalLineTo(18.0f)
                    horizontalLineTo(7.0f)
                    close()
                }
            }
        }
        .build()
        return _toolCrop!!
    }

private var _toolCrop: ImageVector? = null
