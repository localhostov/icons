package me.localx.icons.rounded.bold

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
import me.localx.icons.rounded.Icons

public val Icons.Bold.Box: ImageVector
    get() {
        if (_box != null) {
            return _box!!
        }
        _box = Builder(name = "Box", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0f, 5.5f)
                    curveTo(23.9967f, 2.4638f, 21.5362f, 0.0033f, 18.5f, 0.0f)
                    horizontalLineTo(5.5f)
                    curveTo(2.4638f, 0.0033f, 0.0033f, 2.4638f, 0.0f, 5.5f)
                    verticalLineTo(6.5f)
                    curveTo(4.0E-4f, 7.4136f, 0.3595f, 8.2905f, 1.0f, 8.942f)
                    verticalLineTo(18.5f)
                    curveTo(1.0033f, 21.5362f, 3.4638f, 23.9967f, 6.5f, 24.0f)
                    horizontalLineTo(17.5f)
                    curveTo(20.5362f, 23.9967f, 22.9967f, 21.5362f, 23.0f, 18.5f)
                    verticalLineTo(8.942f)
                    curveTo(23.6406f, 8.2906f, 23.9997f, 7.4136f, 24.0f, 6.5f)
                    verticalLineTo(5.5f)
                    close()
                    moveTo(3.0f, 5.5f)
                    curveTo(3.0f, 4.1193f, 4.1193f, 3.0f, 5.5f, 3.0f)
                    horizontalLineTo(18.5f)
                    curveTo(19.8807f, 3.0f, 21.0f, 4.1193f, 21.0f, 5.5f)
                    verticalLineTo(6.5f)
                    curveTo(21.0f, 6.7761f, 20.7761f, 7.0f, 20.5f, 7.0f)
                    horizontalLineTo(3.5f)
                    curveTo(3.2239f, 7.0f, 3.0f, 6.7761f, 3.0f, 6.5f)
                    verticalLineTo(5.5f)
                    close()
                    moveTo(20.0f, 18.5f)
                    curveTo(20.0f, 19.8807f, 18.8807f, 21.0f, 17.5f, 21.0f)
                    horizontalLineTo(6.5f)
                    curveTo(5.1193f, 21.0f, 4.0f, 19.8807f, 4.0f, 18.5f)
                    verticalLineTo(10.0f)
                    horizontalLineTo(20.0f)
                    verticalLineTo(18.5f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(9.5f, 12.0f)
                    horizontalLineTo(14.5001f)
                    curveTo(15.3285f, 12.0f, 16.0001f, 12.6716f, 16.0001f, 13.5f)
                    curveTo(16.0001f, 14.3284f, 15.3285f, 15.0f, 14.5001f, 15.0f)
                    horizontalLineTo(9.5f)
                    curveTo(8.6716f, 15.0f, 8.0f, 14.3284f, 8.0f, 13.5f)
                    curveTo(8.0f, 12.6716f, 8.6716f, 12.0f, 9.5f, 12.0f)
                    close()
                }
            }
        }
        .build()
        return _box!!
    }

private var _box: ImageVector? = null
