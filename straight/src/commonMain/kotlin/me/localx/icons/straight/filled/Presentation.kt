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

public val Icons.Filled.Presentation: ImageVector
    get() {
        if (_presentation != null) {
            return _presentation!!
        }
        _presentation = Builder(name = "Presentation", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(21.9996f, 12.0f)
                    verticalLineTo(3.0f)
                    curveTo(21.9996f, 2.2043f, 21.6836f, 1.4413f, 21.121f, 0.8787f)
                    curveTo(20.5583f, 0.3161f, 19.7953f, 0.0f, 18.9996f, 0.0f)
                    lineTo(4.9996f, 0.0f)
                    curveTo(4.204f, 0.0f, 3.4409f, 0.3161f, 2.8783f, 0.8787f)
                    curveTo(2.3157f, 1.4413f, 1.9996f, 2.2043f, 1.9996f, 3.0f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(21.9996f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 14.0006f)
                    verticalLineTo(16.0006f)
                    horizontalLineTo(11.0f)
                    verticalLineTo(20.0006f)
                    horizontalLineTo(9.0f)
                    curveTo(8.2044f, 20.0006f, 7.4413f, 20.3167f, 6.8787f, 20.8793f)
                    curveTo(6.3161f, 21.4419f, 6.0f, 22.205f, 6.0f, 23.0006f)
                    verticalLineTo(24.0006f)
                    horizontalLineTo(8.0f)
                    verticalLineTo(23.0006f)
                    curveTo(8.0f, 22.7354f, 8.1054f, 22.481f, 8.2929f, 22.2935f)
                    curveTo(8.4804f, 22.106f, 8.7348f, 22.0006f, 9.0f, 22.0006f)
                    horizontalLineTo(15.0f)
                    curveTo(15.2652f, 22.0006f, 15.5196f, 22.106f, 15.7071f, 22.2935f)
                    curveTo(15.8946f, 22.481f, 16.0f, 22.7354f, 16.0f, 23.0006f)
                    verticalLineTo(24.0006f)
                    horizontalLineTo(18.0f)
                    verticalLineTo(23.0006f)
                    curveTo(18.0f, 22.205f, 17.6839f, 21.4419f, 17.1213f, 20.8793f)
                    curveTo(16.5587f, 20.3167f, 15.7956f, 20.0006f, 15.0f, 20.0006f)
                    horizontalLineTo(13.0f)
                    verticalLineTo(16.0006f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(14.0006f)
                    horizontalLineTo(0.0f)
                    close()
                }
            }
        }
        .build()
        return _presentation!!
    }

private var _presentation: ImageVector? = null
