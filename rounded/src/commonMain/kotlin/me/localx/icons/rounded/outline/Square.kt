package me.localx.icons.rounded.outline

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

public val Icons.Outline.Square: ImageVector
    get() {
        if (_square != null) {
            return _square!!
        }
        _square = Builder(name = "Square", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(19.0f, 0.0f)
                    horizontalLineTo(5.0f)
                    curveTo(3.6739f, 0.0f, 2.4021f, 0.5268f, 1.4645f, 1.4645f)
                    curveTo(0.5268f, 2.4021f, 0.0f, 3.6739f, 0.0f, 5.0f)
                    lineTo(0.0f, 19.0f)
                    curveTo(0.0f, 19.6566f, 0.1293f, 20.3068f, 0.3806f, 20.9134f)
                    curveTo(0.6319f, 21.52f, 1.0002f, 22.0712f, 1.4645f, 22.5355f)
                    curveTo(2.4021f, 23.4732f, 3.6739f, 24.0f, 5.0f, 24.0f)
                    horizontalLineTo(19.0f)
                    curveTo(19.6566f, 24.0f, 20.3068f, 23.8707f, 20.9134f, 23.6194f)
                    curveTo(21.52f, 23.3681f, 22.0712f, 22.9998f, 22.5355f, 22.5355f)
                    curveTo(22.9998f, 22.0712f, 23.3681f, 21.52f, 23.6194f, 20.9134f)
                    curveTo(23.8707f, 20.3068f, 24.0f, 19.6566f, 24.0f, 19.0f)
                    verticalLineTo(5.0f)
                    curveTo(24.0f, 4.3434f, 23.8707f, 3.6932f, 23.6194f, 3.0866f)
                    curveTo(23.3681f, 2.4799f, 22.9998f, 1.9288f, 22.5355f, 1.4645f)
                    curveTo(22.0712f, 1.0002f, 21.52f, 0.6319f, 20.9134f, 0.3806f)
                    curveTo(20.3068f, 0.1293f, 19.6566f, 0.0f, 19.0f, 0.0f)
                    verticalLineTo(0.0f)
                    close()
                    moveTo(22.0f, 19.0f)
                    curveTo(22.0f, 19.7956f, 21.6839f, 20.5587f, 21.1213f, 21.1213f)
                    curveTo(20.5587f, 21.6839f, 19.7956f, 22.0f, 19.0f, 22.0f)
                    horizontalLineTo(5.0f)
                    curveTo(4.2043f, 22.0f, 3.4413f, 21.6839f, 2.8787f, 21.1213f)
                    curveTo(2.3161f, 20.5587f, 2.0f, 19.7956f, 2.0f, 19.0f)
                    verticalLineTo(5.0f)
                    curveTo(2.0f, 4.2043f, 2.3161f, 3.4413f, 2.8787f, 2.8787f)
                    curveTo(3.4413f, 2.3161f, 4.2043f, 2.0f, 5.0f, 2.0f)
                    horizontalLineTo(19.0f)
                    curveTo(19.7956f, 2.0f, 20.5587f, 2.3161f, 21.1213f, 2.8787f)
                    curveTo(21.6839f, 3.4413f, 22.0f, 4.2043f, 22.0f, 5.0f)
                    verticalLineTo(19.0f)
                    close()
                }
            }
        }
        .build()
        return _square!!
    }

private var _square: ImageVector? = null
