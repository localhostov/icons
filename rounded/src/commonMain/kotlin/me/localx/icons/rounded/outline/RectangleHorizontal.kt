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

public val Icons.Outline.RectangleHorizontal: ImageVector
    get() {
        if (_rectangleHorizontal != null) {
            return _rectangleHorizontal!!
        }
        _rectangleHorizontal = Builder(name = "RectangleHorizontal", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(19.0f, 3.0f)
                    horizontalLineTo(5.0f)
                    curveTo(3.6739f, 3.0f, 2.4021f, 3.5268f, 1.4645f, 4.4645f)
                    curveTo(0.5268f, 5.4022f, 0.0f, 6.6739f, 0.0f, 8.0f)
                    lineTo(0.0f, 16.0f)
                    curveTo(0.0f, 17.3261f, 0.5268f, 18.5979f, 1.4645f, 19.5355f)
                    curveTo(2.4021f, 20.4732f, 3.6739f, 21.0f, 5.0f, 21.0f)
                    horizontalLineTo(19.0f)
                    curveTo(19.6566f, 21.0f, 20.3068f, 20.8707f, 20.9134f, 20.6194f)
                    curveTo(21.52f, 20.3681f, 22.0712f, 19.9998f, 22.5355f, 19.5355f)
                    curveTo(22.9998f, 19.0712f, 23.3681f, 18.52f, 23.6194f, 17.9134f)
                    curveTo(23.8707f, 17.3068f, 24.0f, 16.6566f, 24.0f, 16.0f)
                    verticalLineTo(8.0f)
                    curveTo(24.0f, 7.3434f, 23.8707f, 6.6932f, 23.6194f, 6.0866f)
                    curveTo(23.3681f, 5.4799f, 22.9998f, 4.9288f, 22.5355f, 4.4645f)
                    curveTo(22.0712f, 4.0002f, 21.52f, 3.6319f, 20.9134f, 3.3806f)
                    curveTo(20.3068f, 3.1293f, 19.6566f, 3.0f, 19.0f, 3.0f)
                    close()
                    moveTo(22.0f, 16.0f)
                    curveTo(22.0f, 16.7956f, 21.6839f, 17.5587f, 21.1213f, 18.1213f)
                    curveTo(20.5587f, 18.6839f, 19.7956f, 19.0f, 19.0f, 19.0f)
                    horizontalLineTo(5.0f)
                    curveTo(4.2043f, 19.0f, 3.4413f, 18.6839f, 2.8787f, 18.1213f)
                    curveTo(2.3161f, 17.5587f, 2.0f, 16.7956f, 2.0f, 16.0f)
                    verticalLineTo(8.0f)
                    curveTo(2.0f, 7.2043f, 2.3161f, 6.4413f, 2.8787f, 5.8787f)
                    curveTo(3.4413f, 5.3161f, 4.2043f, 5.0f, 5.0f, 5.0f)
                    horizontalLineTo(19.0f)
                    curveTo(19.7956f, 5.0f, 20.5587f, 5.3161f, 21.1213f, 5.8787f)
                    curveTo(21.6839f, 6.4413f, 22.0f, 7.2043f, 22.0f, 8.0f)
                    verticalLineTo(16.0f)
                    close()
                }
            }
        }
        .build()
        return _rectangleHorizontal!!
    }

private var _rectangleHorizontal: ImageVector? = null
