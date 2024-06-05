package me.localx.icons.rounded.bold

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

public val Icons.Bold.Alien: ImageVector
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
                curveTo(6.486f, 0.0f, 2.0f, 4.475f, 2.0f, 9.976f)
                curveToRelative(0.0f, 5.146f, 4.428f, 10.245f, 7.068f, 12.827f)
                curveToRelative(0.822f, 0.803f, 1.876f, 1.205f, 2.932f, 1.205f)
                reflectiveCurveToRelative(2.11f, -0.402f, 2.932f, -1.206f)
                curveToRelative(2.64f, -2.582f, 7.068f, -7.681f, 7.068f, -12.827f)
                curveTo(22.0f, 4.475f, 17.514f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.835f, 20.658f)
                curveToRelative(-0.469f, 0.457f, -1.202f, 0.458f, -1.669f, 0.0f)
                curveToRelative(-3.918f, -3.832f, -6.166f, -7.726f, -6.166f, -10.682f)
                curveToRelative(0.0f, -3.847f, 3.14f, -6.976f, 7.0f, -6.976f)
                reflectiveCurveToRelative(7.0f, 3.129f, 7.0f, 6.976f)
                curveToRelative(0.0f, 2.957f, -2.247f, 6.85f, -6.165f, 10.682f)
                close()
                moveTo(17.998f, 9.113f)
                curveToRelative(-0.054f, 0.905f, -0.27f, 2.152f, -1.002f, 2.883f)
                curveToRelative(-0.732f, 0.732f, -1.978f, 0.948f, -2.883f, 1.002f)
                curveToRelative(-0.628f, 0.037f, -1.148f, -0.482f, -1.111f, -1.111f)
                curveToRelative(0.054f, -0.905f, 0.27f, -2.152f, 1.002f, -2.883f)
                curveToRelative(0.732f, -0.732f, 1.978f, -0.948f, 2.883f, -1.002f)
                curveToRelative(0.628f, -0.037f, 1.148f, 0.482f, 1.111f, 1.111f)
                close()
                moveTo(10.998f, 11.888f)
                curveToRelative(0.037f, 0.628f, -0.482f, 1.148f, -1.111f, 1.111f)
                curveToRelative(-0.905f, -0.054f, -2.152f, -0.27f, -2.883f, -1.002f)
                curveToRelative(-0.732f, -0.732f, -0.948f, -1.978f, -1.002f, -2.883f)
                curveToRelative(-0.037f, -0.628f, 0.482f, -1.148f, 1.111f, -1.111f)
                curveToRelative(0.905f, 0.054f, 2.152f, 0.27f, 2.883f, 1.002f)
                curveToRelative(0.732f, 0.732f, 0.948f, 1.978f, 1.002f, 2.883f)
                close()
            }
        }
        .build()
        return _alien!!
    }

private var _alien: ImageVector? = null
