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

public val Icons.Outline.Receipt: ImageVector
    get() {
        if (_receipt != null) {
            return _receipt!!
        }
        _receipt = Builder(name = "Receipt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(21.0f, 23.9f)
                    lineTo(17.337f, 21.389f)
                    lineTo(14.673f, 23.214f)
                    lineTo(12.007f, 21.388f)
                    lineTo(9.341f, 23.212f)
                    lineTo(6.67f, 21.386f)
                    lineTo(3.0f, 23.9f)
                    verticalLineTo(3.0f)
                    curveTo(3.0f, 2.2043f, 3.3161f, 1.4413f, 3.8787f, 0.8787f)
                    curveTo(4.4413f, 0.3161f, 5.2043f, 0.0f, 6.0f, 0.0f)
                    lineTo(18.0f, 0.0f)
                    curveTo(18.7956f, 0.0f, 19.5587f, 0.3161f, 20.1213f, 0.8787f)
                    curveTo(20.6839f, 1.4413f, 21.0f, 2.2043f, 21.0f, 3.0f)
                    verticalLineTo(23.9f)
                    close()
                    moveTo(6.67f, 18.962f)
                    lineTo(9.34f, 20.788f)
                    lineTo(12.007f, 18.962f)
                    lineTo(14.673f, 20.788f)
                    lineTo(17.338f, 18.961f)
                    lineTo(19.0f, 20.1f)
                    verticalLineTo(3.0f)
                    curveTo(19.0f, 2.7348f, 18.8946f, 2.4804f, 18.7071f, 2.2929f)
                    curveTo(18.5196f, 2.1054f, 18.2652f, 2.0f, 18.0f, 2.0f)
                    horizontalLineTo(6.0f)
                    curveTo(5.7348f, 2.0f, 5.4804f, 2.1054f, 5.2929f, 2.2929f)
                    curveTo(5.1054f, 2.4804f, 5.0f, 2.7348f, 5.0f, 3.0f)
                    verticalLineTo(20.1f)
                    lineTo(6.67f, 18.962f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(17.0003f, 8.0006f)
                    horizontalLineTo(7.0003f)
                    verticalLineTo(10.0006f)
                    horizontalLineTo(17.0003f)
                    verticalLineTo(8.0006f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(15.0003f, 12.0f)
                    horizontalLineTo(7.0003f)
                    verticalLineTo(14.0f)
                    horizontalLineTo(15.0003f)
                    verticalLineTo(12.0f)
                    close()
                }
            }
        }
        .build()
        return _receipt!!
    }

private var _receipt: ImageVector? = null
