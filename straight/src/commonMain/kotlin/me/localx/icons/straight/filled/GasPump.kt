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

public val Icons.Filled.GasPump: ImageVector
    get() {
        if (_gasPump != null) {
            return _gasPump!!
        }
        _gasPump = Builder(name = "GasPump", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(6.0f, 9.0002f)
                    horizontalLineTo(10.0f)
                    curveTo(10.0f, 8.4698f, 9.7893f, 7.9611f, 9.4142f, 7.586f)
                    curveTo(9.0391f, 7.211f, 8.5304f, 7.0002f, 8.0f, 7.0002f)
                    curveTo(7.4696f, 7.0002f, 6.9609f, 7.211f, 6.5858f, 7.586f)
                    curveTo(6.2107f, 7.9611f, 6.0f, 8.4698f, 6.0f, 9.0002f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(8.0f, 5.0f)
                    curveTo(8.4572f, 5.0046f, 8.9102f, 5.0882f, 9.339f, 5.247f)
                    lineTo(11.793f, 2.793f)
                    lineTo(13.207f, 4.207f)
                    lineTo(11.014f, 6.4f)
                    curveTo(11.6459f, 7.1191f, 11.9962f, 8.0427f, 12.0f, 9.0f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(3.0f)
                    curveTo(16.0f, 2.2043f, 15.6839f, 1.4413f, 15.1213f, 0.8787f)
                    curveTo(14.5587f, 0.3161f, 13.7956f, 0.0f, 13.0f, 0.0f)
                    lineTo(3.0f, 0.0f)
                    curveTo(2.2043f, 0.0f, 1.4413f, 0.3161f, 0.8787f, 0.8787f)
                    curveTo(0.3161f, 1.4413f, 0.0f, 2.2043f, 0.0f, 3.0f)
                    lineTo(0.0f, 9.0f)
                    horizontalLineTo(4.0f)
                    curveTo(4.0f, 7.9391f, 4.4214f, 6.9217f, 5.1716f, 6.1716f)
                    curveTo(5.9217f, 5.4214f, 6.9391f, 5.0f, 8.0f, 5.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.293f, 2.2933f)
                    lineTo(19.0f, 5.5863f)
                    verticalLineTo(19.0003f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(11.0003f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(24.0003f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(21.0003f)
                    horizontalLineTo(21.0f)
                    verticalLineTo(6.4143f)
                    lineTo(23.707f, 3.7073f)
                    lineTo(22.293f, 2.2933f)
                    close()
                }
            }
        }
        .build()
        return _gasPump!!
    }

private var _gasPump: ImageVector? = null
