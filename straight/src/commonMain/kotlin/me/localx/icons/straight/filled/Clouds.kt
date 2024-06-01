package me.localx.icons.straight.filled

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

public val Icons.Filled.Clouds: ImageVector
    get() {
        if (_clouds != null) {
            return _clouds!!
        }
        _clouds = Builder(name = "Clouds", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(18.9569f, 23.9926f)
                    horizontalLineTo(9.9821f)
                    curveTo(7.7765f, 23.9717f, 6.0054f, 22.1668f, 6.0263f, 19.9612f)
                    curveTo(6.0434f, 18.1537f, 7.2724f, 16.583f, 9.0228f, 16.1317f)
                    curveTo(8.4096f, 9.4186f, 17.868f, 7.6316f, 19.7417f, 14.0825f)
                    curveTo(22.4612f, 14.5147f, 24.3154f, 17.0698f, 23.8831f, 19.7893f)
                    curveTo(23.4981f, 22.2112f, 21.4092f, 23.9936f, 18.9569f, 23.9926f)
                    close()
                    moveTo(3.999f, 20.0038f)
                    curveTo(3.9956f, 17.8507f, 5.1516f, 15.8626f, 7.0244f, 14.8004f)
                    curveTo(7.7404f, 7.2696f, 18.1213f, 5.5086f, 21.2535f, 12.4072f)
                    curveTo(22.2692f, 12.7572f, 23.1898f, 13.3382f, 23.9429f, 14.1044f)
                    curveTo(23.9748f, 10.3588f, 21.4002f, 7.0939f, 17.7503f, 6.2515f)
                    curveTo(16.7918f, 1.9511f, 12.5288f, -0.7581f, 8.2284f, 0.2003f)
                    curveTo(3.928f, 1.1588f, 1.2188f, 5.4219f, 2.1772f, 9.7222f)
                    curveTo(2.3305f, 10.41f, 2.5742f, 11.0744f, 2.902f, 11.6981f)
                    curveTo(0.2431f, 13.1606f, -0.7268f, 16.5016f, 0.7356f, 19.1605f)
                    curveTo(1.4864f, 20.5255f, 2.7812f, 21.5076f, 4.2981f, 21.8626f)
                    curveTo(4.1007f, 21.2627f, 3.9997f, 20.6353f, 3.999f, 20.0038f)
                    close()
                }
            }
        }
        .build()
        return _clouds!!
    }

private var _clouds: ImageVector? = null
