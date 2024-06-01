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

public val Icons.Bold.ToolCrop: ImageVector
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
                    moveTo(24.0f, 17.0f)
                    horizontalLineTo(20.0f)
                    verticalLineTo(6.5f)
                    curveTo(20.0f, 5.837f, 19.7366f, 5.2011f, 19.2678f, 4.7322f)
                    curveTo(18.7989f, 4.2634f, 18.163f, 4.0f, 17.5f, 4.0f)
                    horizontalLineTo(7.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(4.0f)
                    verticalLineTo(4.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(7.0f)
                    horizontalLineTo(4.0f)
                    verticalLineTo(17.5f)
                    curveTo(4.0f, 18.163f, 4.2634f, 18.7989f, 4.7322f, 19.2678f)
                    curveTo(5.2011f, 19.7366f, 5.837f, 20.0f, 6.5f, 20.0f)
                    horizontalLineTo(17.0f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(20.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(17.0f)
                    close()
                    moveTo(7.0f, 17.0f)
                    verticalLineTo(7.0f)
                    horizontalLineTo(17.0f)
                    verticalLineTo(17.0f)
                    horizontalLineTo(7.0f)
                    close()
                }
            }
        }
        .build()
        return _toolCrop!!
    }

private var _toolCrop: ImageVector? = null
