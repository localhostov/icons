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

public val Icons.Filled.CommentAlt: ImageVector
    get() {
        if (_commentAlt != null) {
            return _commentAlt!!
        }
        _commentAlt = Builder(name = "CommentAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(21.0f, 0.0f)
                    horizontalLineTo(3.0f)
                    curveTo(2.2043f, 0.0f, 1.4413f, 0.3161f, 0.8787f, 0.8787f)
                    curveTo(0.3161f, 1.4413f, 0.0f, 2.2043f, 0.0f, 3.0f)
                    lineTo(0.0f, 20.0f)
                    horizontalLineTo(6.9f)
                    lineTo(10.708f, 23.218f)
                    curveTo(11.069f, 23.5231f, 11.5264f, 23.6905f, 11.999f, 23.6905f)
                    curveTo(12.4716f, 23.6905f, 12.929f, 23.5231f, 13.29f, 23.218f)
                    lineTo(17.1f, 20.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(3.0f)
                    curveTo(24.0f, 2.2043f, 23.6839f, 1.4413f, 23.1213f, 0.8787f)
                    curveTo(22.5587f, 0.3161f, 21.7956f, 0.0f, 21.0f, 0.0f)
                    verticalLineTo(0.0f)
                    close()
                    moveTo(6.0f, 5.0f)
                    horizontalLineTo(12.0f)
                    verticalLineTo(7.0f)
                    horizontalLineTo(6.0f)
                    verticalLineTo(5.0f)
                    close()
                    moveTo(18.0f, 15.0f)
                    horizontalLineTo(6.0f)
                    verticalLineTo(13.0f)
                    horizontalLineTo(18.0f)
                    verticalLineTo(15.0f)
                    close()
                    moveTo(18.0f, 11.0f)
                    horizontalLineTo(6.0f)
                    verticalLineTo(9.0f)
                    horizontalLineTo(18.0f)
                    verticalLineTo(11.0f)
                    close()
                }
            }
        }
        .build()
        return _commentAlt!!
    }

private var _commentAlt: ImageVector? = null
