package me.localx.icons.straight.outline

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

public val Icons.Outline.Subtitles: ImageVector
    get() {
        if (_subtitles != null) {
            return _subtitles!!
        }
        _subtitles = Builder(name = "Subtitles", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0f, 22.0006f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(5.0006f)
                    curveTo(0.0f, 4.205f, 0.3161f, 3.4419f, 0.8787f, 2.8793f)
                    curveTo(1.4413f, 2.3167f, 2.2043f, 2.0006f, 3.0f, 2.0006f)
                    horizontalLineTo(21.0f)
                    curveTo(21.7956f, 2.0006f, 22.5587f, 2.3167f, 23.1213f, 2.8793f)
                    curveTo(23.6839f, 3.4419f, 24.0f, 4.205f, 24.0f, 5.0006f)
                    verticalLineTo(22.0006f)
                    close()
                    moveTo(2.0f, 20.0006f)
                    horizontalLineTo(22.0f)
                    verticalLineTo(5.0006f)
                    curveTo(22.0f, 4.7354f, 21.8946f, 4.481f, 21.7071f, 4.2935f)
                    curveTo(21.5196f, 4.106f, 21.2652f, 4.0006f, 21.0f, 4.0006f)
                    horizontalLineTo(3.0f)
                    curveTo(2.7348f, 4.0006f, 2.4804f, 4.106f, 2.2929f, 4.2935f)
                    curveTo(2.1054f, 4.481f, 2.0f, 4.7354f, 2.0f, 5.0006f)
                    verticalLineTo(20.0006f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(20.0f, 11.0006f)
                    horizontalLineTo(9.0f)
                    verticalLineTo(13.0006f)
                    horizontalLineTo(20.0f)
                    verticalLineTo(11.0006f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(6.9998f, 11.0006f)
                    horizontalLineTo(3.9999f)
                    verticalLineTo(13.0006f)
                    horizontalLineTo(6.9998f)
                    verticalLineTo(11.0006f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(14.9998f, 16.0012f)
                    horizontalLineTo(3.9999f)
                    verticalLineTo(18.0012f)
                    horizontalLineTo(14.9998f)
                    verticalLineTo(16.0012f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(20.0002f, 16.0012f)
                    horizontalLineTo(17.0002f)
                    verticalLineTo(18.0012f)
                    horizontalLineTo(20.0002f)
                    verticalLineTo(16.0012f)
                    close()
                }
            }
        }
        .build()
        return _subtitles!!
    }

private var _subtitles: ImageVector? = null
