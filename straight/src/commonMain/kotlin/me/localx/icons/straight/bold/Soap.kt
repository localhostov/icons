package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.Soap: ImageVector
    get() {
        if (_soap != null) {
            return _soap!!
        }
        _soap = Builder(name = "Soap", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(7.0002f, 16.0f)
                    horizontalLineTo(17.0002f)
                    verticalLineTo(19.0f)
                    horizontalLineTo(7.0002f)
                    verticalLineTo(16.0f)
                    close()
                    moveTo(22.0002f, 17.0f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(2.0001f)
                    verticalLineTo(17.0f)
                    curveTo(2.0025f, 15.2469f, 2.4656f, 13.5252f, 3.3432f, 12.0075f)
                    curveTo(4.2208f, 10.4898f, 5.4819f, 9.2296f, 7.0002f, 8.353f)
                    verticalLineTo(5.0f)
                    horizontalLineTo(9.0001f)
                    verticalLineTo(3.5f)
                    curveTo(9.0001f, 2.5717f, 9.3689f, 1.6815f, 10.0253f, 1.0251f)
                    curveTo(10.6817f, 0.3687f, 11.5719f, 0.0f, 12.5002f, 0.0f)
                    lineTo(20.0002f, 0.0f)
                    verticalLineTo(3.0f)
                    horizontalLineTo(15.0002f)
                    verticalLineTo(5.0f)
                    horizontalLineTo(17.0002f)
                    verticalLineTo(8.353f)
                    curveTo(18.5184f, 9.2296f, 19.7795f, 10.4898f, 20.6571f, 12.0075f)
                    curveTo(21.5347f, 13.5252f, 21.9978f, 15.2469f, 22.0002f, 17.0f)
                    close()
                    moveTo(19.0002f, 17.0f)
                    curveTo(19.0002f, 15.1435f, 18.2627f, 13.363f, 16.9499f, 12.0503f)
                    curveTo(15.6371f, 10.7375f, 13.8567f, 10.0f, 12.0002f, 10.0f)
                    curveTo(10.1436f, 10.0f, 8.3632f, 10.7375f, 7.0504f, 12.0503f)
                    curveTo(5.7376f, 13.363f, 5.0002f, 15.1435f, 5.0002f, 17.0f)
                    verticalLineTo(21.0f)
                    horizontalLineTo(19.0002f)
                    verticalLineTo(17.0f)
                    close()
                }
            }
        }
        .build()
        return _soap!!
    }

private var _soap: ImageVector? = null
