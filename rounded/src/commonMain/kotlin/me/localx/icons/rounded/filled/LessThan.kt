package me.localx.icons.rounded.filled

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

public val Icons.Filled.LessThan: ImageVector
    get() {
        if (_lessThan != null) {
            return _lessThan!!
        }
        _lessThan = Builder(name = "LessThan", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.0f, 24.0f)
                curveToRelative(-0.13f, 0.0f, -0.263f, -0.025f, -0.39f, -0.079f)
                lineTo(2.149f, 15.265f)
                curveTo(0.842f, 14.711f, 0.03f, 13.46f, 0.03f, 12.0f)
                reflectiveCurveToRelative(0.812f, -2.711f, 2.119f, -3.265f)
                lineTo(22.61f, 0.079f)
                curveToRelative(0.507f, -0.216f, 1.096f, 0.022f, 1.311f, 0.531f)
                reflectiveCurveToRelative(-0.022f, 1.096f, -0.531f, 1.311f)
                lineTo(2.929f, 10.577f)
                curveToRelative(-0.662f, 0.28f, -0.898f, 0.919f, -0.898f, 1.423f)
                reflectiveCurveToRelative(0.236f, 1.143f, 0.898f, 1.423f)
                lineToRelative(20.461f, 8.656f)
                curveToRelative(0.509f, 0.215f, 0.746f, 0.802f, 0.531f, 1.311f)
                curveToRelative(-0.161f, 0.382f, -0.531f, 0.61f, -0.921f, 0.61f)
                close()
            }
        }
        .build()
        return _lessThan!!
    }

private var _lessThan: ImageVector? = null
