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

public val Icons.Bold.Bookmark: ImageVector
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
                    moveTo(22.5f, 24.173f)
                    lineTo(12.0f, 13.463f)
                    lineTo(1.5f, 24.173f)
                    verticalLineTo(3.0f)
                    curveTo(1.5f, 2.2043f, 1.8161f, 1.4413f, 2.3787f, 0.8787f)
                    curveTo(2.9413f, 0.3161f, 3.7043f, 0.0f, 4.5f, 0.0f)
                    lineTo(19.5f, 0.0f)
                    curveTo(20.2956f, 0.0f, 21.0587f, 0.3161f, 21.6213f, 0.8787f)
                    curveTo(22.1839f, 1.4413f, 22.5f, 2.2043f, 22.5f, 3.0f)
                    verticalLineTo(24.173f)
                    close()
                    moveTo(12.0f, 9.178f)
                    lineTo(19.5f, 16.827f)
                    verticalLineTo(3.0f)
                    horizontalLineTo(4.5f)
                    verticalLineTo(16.827f)
                    lineTo(12.0f, 9.178f)
                    close()
                }
            }
        }
        .build()
        return _bookmark!!
    }

private var _bookmark: ImageVector? = null
