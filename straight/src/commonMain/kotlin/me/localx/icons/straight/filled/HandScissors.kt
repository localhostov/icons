package me.localx.icons.straight.filled

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
                lineToRelative(4.782f, 1.102f)
                lineToRelative(-0.44f, 1.91f)
                lineTo(1.88f, 5.046f)
                curveToRelative(-0.887f, -0.21f, -1.776f, 0.339f, -1.986f, 1.225f)
                curveToRelative(-0.21f, 0.887f, 0.339f, 1.776f, 1.225f, 1.986f)
                lineToRelative(9.18f, 2.244f)
                lineTo(1.12f, 12.745f)
                curveToRelative(-0.887f, 0.21f, -1.435f, 1.099f, -1.225f, 1.986f)
                curveToRelative(0.21f, 0.887f, 1.099f, 1.435f, 1.986f, 1.225f)
                lineToRelative(7.395f, -1.784f)
                lineToRelative(1.725f, 7.829f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(-14.0f)
                lineToRelative(-5.045f, -5.049f)
                close()
            }
        }
        .build()
        return _handScissors!!
    }

private var _handScissors: ImageVector? = null
