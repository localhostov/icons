package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.Rewind: ImageVector
    get() {
        if (_rewind != null) {
            return _rewind!!
        }
        _rewind = Builder(name = "Rewind", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.9998f, 23.7991f)
                lineTo(14.9998f, 18.0851f)
                verticalLineTo(23.7991f)
                lineTo(1.8198f, 14.3921f)
                curveTo(1.3952f, 14.0888f, 1.0491f, 13.6886f, 0.8104f, 13.2246f)
                curveTo(0.5716f, 12.7607f, 0.447f, 12.2464f, 0.447f, 11.7246f)
                curveTo(0.447f, 11.2028f, 0.5716f, 10.6885f, 0.8104f, 10.2246f)
                curveTo(1.0491f, 9.7606f, 1.3952f, 9.3604f, 1.8198f, 9.0571f)
                lineTo(1.8628f, 9.0281f)
                lineTo(14.9998f, 0.3161f)
                verticalLineTo(5.9101f)
                lineTo(22.9998f, 0.1991f)
                verticalLineTo(23.7991f)
                close()
                moveTo(3.5508f, 11.5081f)
                curveTo(3.5185f, 11.5341f, 3.4927f, 11.5672f, 3.4753f, 11.6048f)
                curveTo(3.458f, 11.6425f, 3.4496f, 11.6837f, 3.4508f, 11.7251f)
                curveTo(3.4502f, 11.7694f, 3.4605f, 11.8131f, 3.4807f, 11.8525f)
                curveTo(3.5009f, 11.8919f, 3.5305f, 11.9258f, 3.5668f, 11.9511f)
                lineTo(11.9998f, 17.9741f)
                verticalLineTo(12.2591f)
                lineTo(19.9998f, 17.9731f)
                verticalLineTo(6.0251f)
                lineTo(11.9998f, 11.7391f)
                verticalLineTo(5.9051f)
                lineTo(3.5508f, 11.5081f)
                close()
            }
        }
        .build()
        return _rewind!!
    }

private var _rewind: ImageVector? = null
