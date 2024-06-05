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

public val Icons.Filled.HandScissors: ImageVector
    get() {
        if (_handScissors != null) {
            return _handScissors!!
        }
        _handScissors = Builder(name = "HandScissors", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.955f, 2.952f)
                curveToRelative(-0.441f, -0.46f, -1.012f, -0.774f, -1.637f, -0.9f)
                curveToRelative(-0.976f, -0.185f, -1.98f, 0.125f, -2.682f, 0.828f)
                lineToRelative(-2.437f, 2.479f)
                lineToRelative(3.825f, 0.881f)
                curveToRelative(0.528f, 0.122f, 0.858f, 0.649f, 0.736f, 1.177f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.121f, 0.527f, -0.647f, 0.857f, -1.174f, 0.737f)
                lineTo(2.013f, 5.045f)
                curveToRelative(-0.887f, -0.21f, -1.776f, 0.339f, -1.986f, 1.225f)
                curveToRelative(-0.21f, 0.887f, 0.339f, 1.776f, 1.225f, 1.986f)
                lineToRelative(9.047f, 2.244f)
                lineTo(1.253f, 12.744f)
                curveToRelative(-0.887f, 0.21f, -1.435f, 1.099f, -1.225f, 1.986f)
                curveToRelative(0.21f, 0.887f, 1.099f, 1.435f, 1.986f, 1.225f)
                lineToRelative(7.262f, -1.784f)
                lineToRelative(0.86f, 3.905f)
                curveToRelative(0.505f, 2.292f, 2.536f, 3.924f, 4.883f, 3.924f)
                horizontalLineToRelative(3.982f)
                curveToRelative(2.761f, 0.0f, 5.0f, -2.239f, 5.0f, -5.0f)
                verticalLineToRelative(-6.102f)
                curveToRelative(0.0f, -1.856f, -0.737f, -3.635f, -2.048f, -4.948f)
                lineToRelative(-2.997f, -2.999f)
                close()
            }
        }
        .build()
        return _handScissors!!
    }

private var _handScissors: ImageVector? = null
