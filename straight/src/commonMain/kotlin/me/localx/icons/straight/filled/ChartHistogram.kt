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

public val Icons.Filled.ChartHistogram: ImageVector
    get() {
        if (_chartHistogram != null) {
            return _chartHistogram!!
        }
        _chartHistogram = Builder(name = "ChartHistogram", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(3.0f, 21.976f)
                    curveTo(2.7348f, 21.976f, 2.4804f, 21.8706f, 2.2929f, 21.6831f)
                    curveTo(2.1054f, 21.4956f, 2.0f, 21.2412f, 2.0f, 20.976f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.976f)
                    curveTo(0.0f, 21.7716f, 0.3161f, 22.5347f, 0.8787f, 23.0973f)
                    curveTo(1.4413f, 23.6599f, 2.2043f, 23.976f, 3.0f, 23.976f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(21.976f)
                    horizontalLineTo(3.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(7.0002f, 12.0f)
                    horizontalLineTo(5.0002f)
                    verticalLineTo(19.0f)
                    horizontalLineTo(7.0002f)
                    verticalLineTo(12.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(11.9999f, 9.9999f)
                    horizontalLineTo(9.9999f)
                    verticalLineTo(18.9999f)
                    horizontalLineTo(11.9999f)
                    verticalLineTo(9.9999f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(17.0f, 12.9999f)
                    horizontalLineTo(15.0f)
                    verticalLineTo(18.9999f)
                    horizontalLineTo(17.0f)
                    verticalLineTo(12.9999f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.0002f, 9.0f)
                    horizontalLineTo(20.0002f)
                    verticalLineTo(19.0f)
                    horizontalLineTo(22.0002f)
                    verticalLineTo(9.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(10.9998f, 4.414f)
                    lineTo(15.9998f, 9.414f)
                    lineTo(23.7068f, 1.707f)
                    lineTo(22.2928f, 0.293f)
                    lineTo(15.9998f, 6.586f)
                    lineTo(10.9998f, 1.586f)
                    lineTo(5.2929f, 7.293f)
                    lineTo(6.7069f, 8.707f)
                    lineTo(10.9998f, 4.414f)
                    close()
                }
            }
        }
        .build()
        return _chartHistogram!!
    }

private var _chartHistogram: ImageVector? = null
