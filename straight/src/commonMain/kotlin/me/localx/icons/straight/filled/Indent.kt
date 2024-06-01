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

public val Icons.Filled.Indent: ImageVector
    get() {
        if (_indent != null) {
            return _indent!!
        }
        _indent = Builder(name = "Indent", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0f, 4.0002f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(6.0002f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(4.0002f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0002f, 9.0f)
                    horizontalLineTo(8.0001f)
                    verticalLineTo(11.0f)
                    horizontalLineTo(24.0002f)
                    verticalLineTo(9.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0f, 19.0002f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(21.0003f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(19.0002f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0002f, 14.0005f)
                    horizontalLineTo(8.0001f)
                    verticalLineTo(16.0005f)
                    horizontalLineTo(24.0002f)
                    verticalLineTo(14.0005f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 8.0005f)
                    verticalLineTo(17.0005f)
                    lineTo(4.174f, 13.2435f)
                    curveTo(4.2781f, 13.1497f, 4.3613f, 13.0351f, 4.4183f, 12.9071f)
                    curveTo(4.4753f, 12.7791f, 4.5047f, 12.6406f, 4.5047f, 12.5005f)
                    curveTo(4.5047f, 12.3604f, 4.4753f, 12.2218f, 4.4183f, 12.0939f)
                    curveTo(4.3613f, 11.9659f, 4.2781f, 11.8513f, 4.174f, 11.7575f)
                    lineTo(0.0f, 8.0005f)
                    close()
                }
            }
        }
        .build()
        return _indent!!
    }

private var _indent: ImageVector? = null
