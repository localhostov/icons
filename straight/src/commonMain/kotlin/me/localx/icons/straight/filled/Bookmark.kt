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

public val Icons.Filled.Bookmark: ImageVector
    get() {
        if (_bookmark != null) {
            return _bookmark!!
        }
        _bookmark = Builder(name = "Bookmark", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(19.9998f, 0.0f)
                    horizontalLineTo(3.9998f)
                    curveTo(3.2042f, 0.0f, 2.4411f, 0.3161f, 1.8785f, 0.8787f)
                    curveTo(1.3159f, 1.4413f, 0.9998f, 2.2043f, 0.9998f, 3.0f)
                    verticalLineTo(24.0f)
                    lineTo(11.9998f, 13.053f)
                    lineTo(22.9998f, 24.0f)
                    verticalLineTo(3.0f)
                    curveTo(22.9998f, 2.2043f, 22.6837f, 1.4413f, 22.1211f, 0.8787f)
                    curveTo(21.5585f, 0.3161f, 20.7955f, 0.0f, 19.9998f, 0.0f)
                    verticalLineTo(0.0f)
                    close()
                }
            }
        }
        .build()
        return _bookmark!!
    }

private var _bookmark: ImageVector? = null
