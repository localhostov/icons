package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.CommentAlt: ImageVector
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
                    moveTo(21.546f, 0.0f)
                    horizontalLineTo(2.454f)
                    curveTo(1.8034f, 8.0E-4f, 1.1797f, 0.2596f, 0.7196f, 0.7196f)
                    curveTo(0.2596f, 1.1797f, 8.0E-4f, 1.8034f, 0.0f, 2.454f)
                    lineTo(0.0f, 20.0f)
                    horizontalLineTo(6.938f)
                    lineTo(10.987f, 23.387f)
                    curveTo(11.2731f, 23.6198f, 11.6312f, 23.746f, 12.0f, 23.744f)
                    curveTo(12.3763f, 23.7439f, 12.7409f, 23.6135f, 13.032f, 23.375f)
                    lineTo(17.062f, 20.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(2.454f)
                    curveTo(23.9992f, 1.8034f, 23.7404f, 1.1797f, 23.2804f, 0.7196f)
                    curveTo(22.8203f, 0.2596f, 22.1966f, 8.0E-4f, 21.546f, 0.0f)
                    verticalLineTo(0.0f)
                    close()
                    moveTo(21.0f, 17.0f)
                    horizontalLineTo(15.972f)
                    lineTo(12.0f, 20.322f)
                    lineTo(8.028f, 17.0f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(3.0f)
                    horizontalLineTo(21.0f)
                    verticalLineTo(17.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0f, 6.0f)
                    horizontalLineTo(6.0f)
                    verticalLineTo(9.0f)
                    horizontalLineTo(12.0f)
                    verticalLineTo(6.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(18.0f, 11.0001f)
                    horizontalLineTo(6.0f)
                    verticalLineTo(14.0001f)
                    horizontalLineTo(18.0f)
                    verticalLineTo(11.0001f)
                    close()
                }
            }
        }
        .build()
        return _commentAlt!!
    }

private var _commentAlt: ImageVector? = null
