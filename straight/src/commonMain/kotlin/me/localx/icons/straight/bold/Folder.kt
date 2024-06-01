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

public val Icons.Bold.Folder: ImageVector
    get() {
        if (_folder != null) {
            return _folder!!
        }
        _folder = Builder(name = "Folder", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(21.0f, 3.0002f)
                    horizontalLineTo(12.369f)
                    lineTo(8.551f, 1.0002f)
                    horizontalLineTo(3.0f)
                    curveTo(2.2043f, 1.0002f, 1.4413f, 1.3163f, 0.8787f, 1.8789f)
                    curveTo(0.3161f, 2.4415f, -0.0f, 3.2046f, -0.0f, 4.0002f)
                    lineTo(-0.0f, 23.0002f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(6.0002f)
                    curveTo(24.0f, 5.2046f, 23.6839f, 4.4415f, 23.1213f, 3.8789f)
                    curveTo(22.5587f, 3.3163f, 21.7956f, 3.0002f, 21.0f, 3.0002f)
                    close()
                    moveTo(3.0f, 20.0002f)
                    verticalLineTo(7.9672f)
                    horizontalLineTo(21.0f)
                    verticalLineTo(20.0002f)
                    horizontalLineTo(3.0f)
                    close()
                }
            }
        }
        .build()
        return _folder!!
    }

private var _folder: ImageVector? = null
