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

public val Icons.Filled.Print: ImageVector
    get() {
        if (_print != null) {
            return _print!!
        }
        _print = Builder(name = "Print", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(18.9996f, 0.0f)
                    horizontalLineTo(4.9996f)
                    verticalLineTo(5.0f)
                    horizontalLineTo(18.9996f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(18.0f, 15.0f)
                    horizontalLineTo(6.0f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(18.0f)
                    verticalLineTo(15.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(21.0f, 6.9994f)
                    horizontalLineTo(3.0f)
                    curveTo(2.2043f, 6.9994f, 1.4413f, 7.3155f, 0.8787f, 7.8781f)
                    curveTo(0.3161f, 8.4407f, 0.0f, 9.2037f, 0.0f, 9.9994f)
                    lineTo(0.0f, 19.9994f)
                    horizontalLineTo(4.0f)
                    verticalLineTo(12.9994f)
                    horizontalLineTo(20.0f)
                    verticalLineTo(19.9994f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(9.9994f)
                    curveTo(24.0f, 9.2037f, 23.6839f, 8.4407f, 23.1213f, 7.8781f)
                    curveTo(22.5587f, 7.3155f, 21.7956f, 6.9994f, 21.0f, 6.9994f)
                    close()
                    moveTo(19.0f, 10.9994f)
                    horizontalLineTo(15.0f)
                    verticalLineTo(8.9994f)
                    horizontalLineTo(19.0f)
                    verticalLineTo(10.9994f)
                    close()
                }
            }
        }
        .build()
        return _print!!
    }

private var _print: ImageVector? = null
