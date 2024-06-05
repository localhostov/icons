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

public val Icons.Filled.Alien: ImageVector
    get() {
        if (_alien != null) {
            return _alien!!
        }
        _alien = Builder(name = "Alien", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                curveTo(6.486f, 0.0f, 2.0f, 4.432f, 2.0f, 9.88f)
                curveToRelative(0.0f, 5.184f, 4.58f, 10.39f, 7.311f, 13.033f)
                curveToRelative(0.754f, 0.729f, 1.722f, 1.094f, 2.689f, 1.094f)
                reflectiveCurveToRelative(1.936f, -0.365f, 2.689f, -1.094f)
                curveToRelative(2.73f, -2.643f, 7.311f, -7.849f, 7.311f, -13.033f)
                curveTo(22.0f, 4.432f, 17.514f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(9.887f, 12.998f)
                curveToRelative(-0.905f, -0.054f, -2.152f, -0.27f, -2.883f, -1.002f)
                curveToRelative(-0.732f, -0.732f, -0.948f, -1.978f, -1.002f, -2.883f)
                curveToRelative(-0.037f, -0.628f, 0.482f, -1.148f, 1.111f, -1.111f)
                curveToRelative(0.905f, 0.054f, 2.152f, 0.27f, 2.883f, 1.002f)
                curveToRelative(0.732f, 0.732f, 0.948f, 1.978f, 1.002f, 2.883f)
                curveToRelative(0.037f, 0.628f, -0.482f, 1.148f, -1.111f, 1.111f)
                close()
                moveTo(17.998f, 9.113f)
                curveToRelative(-0.054f, 0.905f, -0.27f, 2.152f, -1.002f, 2.883f)
                curveToRelative(-0.732f, 0.732f, -1.978f, 0.948f, -2.883f, 1.002f)
                curveToRelative(-0.628f, 0.037f, -1.148f, -0.482f, -1.111f, -1.111f)
                curveToRelative(0.054f, -0.905f, 0.27f, -2.152f, 1.002f, -2.883f)
                curveToRelative(0.732f, -0.732f, 1.978f, -0.948f, 2.883f, -1.002f)
                curveToRelative(0.628f, -0.037f, 1.148f, 0.482f, 1.111f, 1.111f)
                close()
            }
        }
        .build()
        return _alien!!
    }

private var _alien: ImageVector? = null
