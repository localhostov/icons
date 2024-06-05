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

public val Icons.Filled.GreaterThan: ImageVector
    get() {
        if (_greaterThan != null) {
            return _greaterThan!!
        }
        _greaterThan = Builder(name = "GreaterThan", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(1.02f, 24.0f)
                curveToRelative(-0.39f, 0.0f, -0.76f, -0.229f, -0.921f, -0.61f)
                curveToRelative(-0.215f, -0.509f, 0.022f, -1.096f, 0.531f, -1.311f)
                lineToRelative(20.461f, -8.656f)
                curveToRelative(0.662f, -0.28f, 0.898f, -0.919f, 0.898f, -1.423f)
                reflectiveCurveToRelative(-0.236f, -1.143f, -0.898f, -1.423f)
                lineTo(0.63f, 1.921f)
                curveTo(0.121f, 1.706f, -0.116f, 1.119f, 0.099f, 0.61f)
                reflectiveCurveTo(0.902f, -0.137f, 1.409f, 0.079f)
                lineToRelative(20.461f, 8.656f)
                curveToRelative(1.308f, 0.553f, 2.119f, 1.804f, 2.119f, 3.265f)
                reflectiveCurveToRelative(-0.812f, 2.711f, -2.119f, 3.265f)
                lineTo(1.409f, 23.921f)
                curveToRelative(-0.127f, 0.054f, -0.26f, 0.079f, -0.39f, 0.079f)
                close()
            }
        }
        .build()
        return _greaterThan!!
    }

private var _greaterThan: ImageVector? = null
