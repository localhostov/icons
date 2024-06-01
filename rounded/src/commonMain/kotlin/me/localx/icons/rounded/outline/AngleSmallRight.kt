package me.localx.icons.rounded.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Outline.AngleSmallRight: ImageVector
    get() {
        if (_angleSmallRight != null) {
            return _angleSmallRight!!
        }
        _angleSmallRight = Builder(name = "AngleSmallRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.3998f, 9.8801f)
                lineTo(10.8098f, 5.2901f)
                curveTo(10.6225f, 5.1038f, 10.369f, 4.9993f, 10.1048f, 4.9993f)
                curveTo(9.8406f, 4.9993f, 9.5872f, 5.1038f, 9.3998f, 5.2901f)
                curveTo(9.3061f, 5.383f, 9.2317f, 5.4936f, 9.1809f, 5.6155f)
                curveTo(9.1302f, 5.7373f, 9.104f, 5.8681f, 9.104f, 6.0001f)
                curveTo(9.104f, 6.1321f, 9.1302f, 6.2628f, 9.1809f, 6.3846f)
                curveTo(9.2317f, 6.5065f, 9.3061f, 6.6171f, 9.3998f, 6.7101f)
                lineTo(13.9998f, 11.2901f)
                curveTo(14.0936f, 11.383f, 14.168f, 11.4936f, 14.2187f, 11.6155f)
                curveTo(14.2695f, 11.7373f, 14.2956f, 11.868f, 14.2956f, 12.0001f)
                curveTo(14.2956f, 12.1321f, 14.2695f, 12.2628f, 14.2187f, 12.3846f)
                curveTo(14.168f, 12.5065f, 14.0936f, 12.6171f, 13.9998f, 12.7101f)
                lineTo(9.3998f, 17.2901f)
                curveTo(9.2115f, 17.477f, 9.1052f, 17.7312f, 9.1043f, 17.9965f)
                curveTo(9.1033f, 18.2619f, 9.2079f, 18.5168f, 9.3948f, 18.7051f)
                curveTo(9.5818f, 18.8934f, 9.8359f, 18.9997f, 10.1013f, 19.0006f)
                curveTo(10.3667f, 19.0016f, 10.6215f, 18.897f, 10.8098f, 18.7101f)
                lineTo(15.3998f, 14.1201f)
                curveTo(15.9616f, 13.5576f, 16.2772f, 12.7951f, 16.2772f, 12.0001f)
                curveTo(16.2772f, 11.2051f, 15.9616f, 10.4426f, 15.3998f, 9.8801f)
                close()
            }
        }
        .build()
        return _angleSmallRight!!
    }

private var _angleSmallRight: ImageVector? = null
