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

public val Icons.Filled.ChartPieAlt: ImageVector
    get() {
        if (_chartPieAlt != null) {
            return _chartPieAlt!!
        }
        _chartPieAlt = Builder(name = "ChartPieAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0566f, 3.0604f)
                    lineTo(12.0437f, 2.064f)
                    horizontalLineTo(11.0472f)
                    curveTo(10.9776f, 2.0633f, 10.908f, 2.0633f, 10.8384f, 2.064f)
                    curveTo(4.8014f, 2.1216f, -0.0459f, 7.0623f, 0.0118f, 13.0993f)
                    curveTo(0.0695f, 19.1364f, 5.0102f, 23.9836f, 11.0472f, 23.9259f)
                    curveTo(17.0813f, 23.9193f, 21.9715f, 19.0296f, 21.9786f, 12.9955f)
                    verticalLineTo(11.999f)
                    horizontalLineTo(12.0437f)
                    lineTo(12.0566f, 3.0604f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(14.0552f, 0.0739f)
                    verticalLineTo(10.0078f)
                    horizontalLineTo(23.9882f)
                    curveTo(23.9625f, 4.5325f, 19.5305f, 0.1001f, 14.0552f, 0.0739f)
                    close()
                }
            }
        }
        .build()
        return _chartPieAlt!!
    }

private var _chartPieAlt: ImageVector? = null
