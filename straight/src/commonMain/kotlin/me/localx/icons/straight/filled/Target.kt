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

public val Icons.Filled.Target: ImageVector
    get() {
        if (_target != null) {
            return _target!!
        }
        _target = Builder(name = "Target", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(20.0001f, 13.0001f)
                    verticalLineTo(11.0001f)
                    horizontalLineTo(23.9491f)
                    curveTo(23.7097f, 8.1764f, 22.4793f, 5.5285f, 20.4755f, 3.5247f)
                    curveTo(18.4717f, 1.5209f, 15.8237f, 0.2904f, 13.0001f, 0.0511f)
                    verticalLineTo(4.0001f)
                    horizontalLineTo(11.0001f)
                    verticalLineTo(0.0511f)
                    curveTo(8.1764f, 0.2904f, 5.5285f, 1.5209f, 3.5247f, 3.5247f)
                    curveTo(1.5209f, 5.5285f, 0.2904f, 8.1764f, 0.0511f, 11.0001f)
                    horizontalLineTo(4.0001f)
                    verticalLineTo(13.0001f)
                    horizontalLineTo(0.0511f)
                    curveTo(0.2904f, 15.8237f, 1.5209f, 18.4717f, 3.5247f, 20.4755f)
                    curveTo(5.5285f, 22.4793f, 8.1764f, 23.7097f, 11.0001f, 23.9491f)
                    verticalLineTo(20.0001f)
                    horizontalLineTo(13.0001f)
                    verticalLineTo(23.9491f)
                    curveTo(15.8237f, 23.7097f, 18.4717f, 22.4793f, 20.4755f, 20.4755f)
                    curveTo(22.4793f, 18.4717f, 23.7097f, 15.8237f, 23.9491f, 13.0001f)
                    horizontalLineTo(20.0001f)
                    close()
                    moveTo(15.0001f, 13.0001f)
                    horizontalLineTo(13.0001f)
                    verticalLineTo(15.0001f)
                    horizontalLineTo(11.0001f)
                    verticalLineTo(13.0001f)
                    horizontalLineTo(9.0001f)
                    verticalLineTo(11.0001f)
                    horizontalLineTo(11.0001f)
                    verticalLineTo(9.0001f)
                    horizontalLineTo(13.0001f)
                    verticalLineTo(11.0001f)
                    horizontalLineTo(15.0001f)
                    verticalLineTo(13.0001f)
                    close()
                }
            }
        }
        .build()
        return _target!!
    }

private var _target: ImageVector? = null
