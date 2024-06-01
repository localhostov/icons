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

public val Icons.Bold.Expand: ImageVector
    get() {
        if (_expand != null) {
            return _expand!!
        }
        _expand = Builder(name = "Expand", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(21.0001f, 21.0004f)
                    horizontalLineTo(16.0001f)
                    verticalLineTo(24.0004f)
                    horizontalLineTo(21.5461f)
                    curveTo(22.1968f, 23.9996f, 22.8207f, 23.7406f, 23.2808f, 23.2804f)
                    curveTo(23.7408f, 22.8201f, 23.9995f, 22.1961f, 24.0f, 21.5454f)
                    verticalLineTo(16.0004f)
                    horizontalLineTo(21.0001f)
                    verticalLineTo(21.0004f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 2.455f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(3.0f)
                    horizontalLineTo(8.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(2.454f)
                    curveTo(1.8032f, 8.0E-4f, 1.1794f, 0.2597f, 0.7193f, 0.72f)
                    curveTo(0.2592f, 1.1803f, 5.0E-4f, 1.8042f, 0.0f, 2.455f)
                    horizontalLineTo(0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(3.0f, 16.0004f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(21.5454f)
                    curveTo(5.0E-4f, 22.1961f, 0.2592f, 22.8201f, 0.7193f, 23.2804f)
                    curveTo(1.1794f, 23.7406f, 1.8032f, 23.9996f, 2.454f, 24.0004f)
                    horizontalLineTo(8.0f)
                    verticalLineTo(21.0004f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(16.0004f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(21.5461f, 0.0f)
                    horizontalLineTo(16.0001f)
                    verticalLineTo(3.0f)
                    horizontalLineTo(21.0001f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(2.455f)
                    curveTo(23.9995f, 1.8042f, 23.7408f, 1.1803f, 23.2808f, 0.72f)
                    curveTo(22.8207f, 0.2597f, 22.1968f, 8.0E-4f, 21.5461f, 0.0f)
                    verticalLineTo(0.0f)
                    close()
                }
            }
        }
        .build()
        return _expand!!
    }

private var _expand: ImageVector? = null
