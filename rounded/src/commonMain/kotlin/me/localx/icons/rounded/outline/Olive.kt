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

public val Icons.Outline.Olive: ImageVector
    get() {
        if (_olive != null) {
            return _olive!!
        }
        _olive = Builder(name = "Olive", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.019f, 2.981f)
                curveTo(16.655f, -1.38f, 9.062f, -0.887f, 4.088f, 4.087f)
                curveTo(1.697f, 6.478f, 0.257f, 9.54f, 0.03f, 12.711f)
                curveToRelative(-0.229f, 3.225f, 0.818f, 6.175f, 2.951f, 8.308f)
                curveToRelative(1.995f, 1.995f, 4.664f, 2.974f, 7.451f, 2.974f)
                curveToRelative(3.308f, 0.0f, 6.78f, -1.38f, 9.479f, -4.08f)
                curveToRelative(2.391f, -2.39f, 3.831f, -5.453f, 4.058f, -8.624f)
                curveToRelative(0.229f, -3.225f, -0.818f, -6.175f, -2.951f, -8.308f)
                close()
                moveTo(21.975f, 11.147f)
                curveToRelative(-0.191f, 2.691f, -1.427f, 5.302f, -3.477f, 7.352f)
                curveToRelative(-4.192f, 4.193f, -10.519f, 4.691f, -14.103f, 1.106f)
                curveToRelative(-1.717f, -1.717f, -2.559f, -4.114f, -2.37f, -6.751f)
                curveToRelative(0.191f, -2.691f, 1.427f, -5.302f, 3.477f, -7.352f)
                curveToRelative(2.312f, -2.312f, 5.272f, -3.5f, 8.064f, -3.5f)
                curveToRelative(2.271f, 0.0f, 4.431f, 0.787f, 6.038f, 2.394f)
                curveToRelative(1.717f, 1.717f, 2.559f, 4.114f, 2.37f, 6.751f)
                close()
                moveTo(17.71f, 6.29f)
                curveToRelative(1.361f, 1.361f, 1.7f, 3.23f, 0.755f, 4.174f)
                reflectiveCurveToRelative(-2.813f, 0.606f, -4.174f, -0.755f)
                reflectiveCurveToRelative(-1.7f, -3.23f, -0.755f, -4.174f)
                reflectiveCurveToRelative(2.813f, -0.606f, 4.174f, 0.755f)
                close()
            }
        }
        .build()
        return _olive!!
    }

private var _olive: ImageVector? = null
