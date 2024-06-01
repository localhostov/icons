package me.localx.icons.straight.filled

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

public val Icons.Filled.Expand: ImageVector
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
                    moveTo(20.9999f, 24.0004f)
                    horizontalLineTo(15.9999f)
                    verticalLineTo(22.0004f)
                    horizontalLineTo(20.9999f)
                    curveTo(21.2651f, 22.0004f, 21.5194f, 21.895f, 21.707f, 21.7075f)
                    curveTo(21.8945f, 21.5199f, 21.9999f, 21.2656f, 21.9999f, 21.0004f)
                    verticalLineTo(16.0004f)
                    horizontalLineTo(23.9999f)
                    verticalLineTo(21.0004f)
                    curveTo(23.9999f, 21.796f, 23.6838f, 22.5591f, 23.1212f, 23.1217f)
                    curveTo(22.5586f, 23.6843f, 21.7955f, 24.0004f, 20.9999f, 24.0004f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(2.0f, 8.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(3.0f)
                    curveTo(0.0f, 2.2043f, 0.3161f, 1.4413f, 0.8787f, 0.8787f)
                    curveTo(1.4413f, 0.3161f, 2.2043f, 0.0f, 3.0f, 0.0f)
                    lineTo(8.0f, 0.0f)
                    verticalLineTo(2.0f)
                    horizontalLineTo(3.0f)
                    curveTo(2.7348f, 2.0f, 2.4804f, 2.1054f, 2.2929f, 2.2929f)
                    curveTo(2.1054f, 2.4804f, 2.0f, 2.7348f, 2.0f, 3.0f)
                    verticalLineTo(8.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(8.0f, 24.0004f)
                    horizontalLineTo(3.0f)
                    curveTo(2.2043f, 24.0004f, 1.4413f, 23.6843f, 0.8787f, 23.1217f)
                    curveTo(0.3161f, 22.5591f, 0.0f, 21.796f, 0.0f, 21.0004f)
                    lineTo(0.0f, 16.0004f)
                    horizontalLineTo(2.0f)
                    verticalLineTo(21.0004f)
                    curveTo(2.0f, 21.2656f, 2.1054f, 21.5199f, 2.2929f, 21.7075f)
                    curveTo(2.4804f, 21.895f, 2.7348f, 22.0004f, 3.0f, 22.0004f)
                    horizontalLineTo(8.0f)
                    verticalLineTo(24.0004f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.9999f, 8.0f)
                    horizontalLineTo(21.9999f)
                    verticalLineTo(3.0f)
                    curveTo(21.9999f, 2.7348f, 21.8945f, 2.4804f, 21.707f, 2.2929f)
                    curveTo(21.5194f, 2.1054f, 21.2651f, 2.0f, 20.9999f, 2.0f)
                    horizontalLineTo(15.9999f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(20.9999f)
                    curveTo(21.7955f, 0.0f, 22.5586f, 0.3161f, 23.1212f, 0.8787f)
                    curveTo(23.6838f, 1.4413f, 23.9999f, 2.2043f, 23.9999f, 3.0f)
                    verticalLineTo(8.0f)
                    close()
                }
            }
        }
        .build()
        return _expand!!
    }

private var _expand: ImageVector? = null
