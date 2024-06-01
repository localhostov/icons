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

public val Icons.Bold.GraphicTablet: ImageVector
    get() {
        if (_graphicTablet != null) {
            return _graphicTablet!!
        }
        _graphicTablet = Builder(name = "GraphicTablet", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(21.0f, 3.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(10.994f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(13.006f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(21.0f)
                    horizontalLineTo(21.0f)
                    curveTo(21.7956f, 21.0f, 22.5587f, 20.6839f, 23.1213f, 20.1213f)
                    curveTo(23.6839f, 19.5587f, 24.0f, 18.7956f, 24.0f, 18.0f)
                    verticalLineTo(6.0f)
                    curveTo(24.0f, 5.2043f, 23.6839f, 4.4413f, 23.1213f, 3.8787f)
                    curveTo(22.5587f, 3.3161f, 21.7956f, 3.0f, 21.0f, 3.0f)
                    close()
                    moveTo(21.0f, 18.0f)
                    horizontalLineTo(7.0f)
                    verticalLineTo(6.0f)
                    horizontalLineTo(21.0f)
                    verticalLineTo(18.0f)
                    close()
                }
            }
        }
        .build()
        return _graphicTablet!!
    }

private var _graphicTablet: ImageVector? = null
