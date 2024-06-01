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

public val Icons.Filled.Stats: ImageVector
    get() {
        if (_stats != null) {
            return _stats!!
        }
        _stats = Builder(name = "Stats", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0f, 24.0f)
                    horizontalLineTo(3.0f)
                    curveTo(2.2043f, 24.0f, 1.4413f, 23.6839f, 0.8787f, 23.1213f)
                    curveTo(0.3161f, 22.5587f, 0.0f, 21.7956f, 0.0f, 21.0f)
                    lineTo(0.0f, 0.0f)
                    horizontalLineTo(2.0f)
                    verticalLineTo(21.0f)
                    curveTo(2.0f, 21.2652f, 2.1054f, 21.5196f, 2.2929f, 21.7071f)
                    curveTo(2.4804f, 21.8946f, 2.7348f, 22.0f, 3.0f, 22.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(24.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(16.0001f, 11.0006f)
                    horizontalLineTo(14.0001f)
                    verticalLineTo(20.0006f)
                    horizontalLineTo(16.0001f)
                    verticalLineTo(11.0006f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(8.0f, 11.0006f)
                    horizontalLineTo(6.0f)
                    verticalLineTo(20.0006f)
                    horizontalLineTo(8.0f)
                    verticalLineTo(11.0006f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(20.0f, 6.0f)
                    horizontalLineTo(18.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(20.0f)
                    verticalLineTo(6.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(11.9999f, 6.0f)
                    horizontalLineTo(9.9999f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(11.9999f)
                    verticalLineTo(6.0f)
                    close()
                }
            }
        }
        .build()
        return _stats!!
    }

private var _stats: ImageVector? = null
