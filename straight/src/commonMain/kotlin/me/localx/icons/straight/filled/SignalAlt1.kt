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

public val Icons.Filled.SignalAlt1: ImageVector
    get() {
        if (_signalAlt1 != null) {
            return _signalAlt1!!
        }
        _signalAlt1 = Builder(name = "SignalAlt1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(13.0f, 6.0f)
                    horizontalLineTo(11.0f)
                    curveTo(10.4696f, 6.0f, 9.9609f, 6.2107f, 9.5858f, 6.5858f)
                    curveTo(9.2107f, 6.9609f, 9.0f, 7.4696f, 9.0f, 8.0f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(15.0f)
                    verticalLineTo(8.0f)
                    curveTo(15.0f, 7.4696f, 14.7893f, 6.9609f, 14.4142f, 6.5858f)
                    curveTo(14.0391f, 6.2107f, 13.5304f, 6.0f, 13.0f, 6.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.0f, 0.0f)
                    horizontalLineTo(20.0f)
                    curveTo(19.4696f, 0.0f, 18.9609f, 0.2107f, 18.5858f, 0.5858f)
                    curveTo(18.2107f, 0.9609f, 18.0f, 1.4696f, 18.0f, 2.0f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(2.0f)
                    curveTo(24.0f, 1.4696f, 23.7893f, 0.9609f, 23.4142f, 0.5858f)
                    curveTo(23.0391f, 0.2107f, 22.5304f, 0.0f, 22.0f, 0.0f)
                    verticalLineTo(0.0f)
                    close()
                    moveTo(22.0f, 22.0f)
                    horizontalLineTo(20.0f)
                    verticalLineTo(2.0f)
                    horizontalLineTo(22.0f)
                    verticalLineTo(22.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(4.0f, 12.0f)
                    horizontalLineTo(2.0f)
                    curveTo(1.4696f, 12.0f, 0.9609f, 12.2107f, 0.5858f, 12.5858f)
                    curveTo(0.2107f, 12.9609f, 0.0f, 13.4696f, 0.0f, 14.0f)
                    lineTo(0.0f, 24.0f)
                    horizontalLineTo(6.0f)
                    verticalLineTo(14.0f)
                    curveTo(6.0f, 13.4696f, 5.7893f, 12.9609f, 5.4142f, 12.5858f)
                    curveTo(5.0391f, 12.2107f, 4.5304f, 12.0f, 4.0f, 12.0f)
                    close()
                }
            }
        }
        .build()
        return _signalAlt1!!
    }

private var _signalAlt1: ImageVector? = null
