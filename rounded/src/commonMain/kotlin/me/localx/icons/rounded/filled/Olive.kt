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

public val Icons.Filled.Olive: ImageVector
    get() {
        if (_olive != null) {
            return _olive!!
        }
        _olive = Builder(name = "Olive", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.019f, 2.973f)
                curveTo(16.656f, -1.388f, 9.062f, -0.895f, 4.089f, 4.079f)
                curveTo(1.698f, 6.47f, 0.258f, 9.532f, 0.031f, 12.703f)
                curveToRelative(-0.229f, 3.225f, 0.818f, 6.175f, 2.951f, 8.308f)
                curveToRelative(1.995f, 1.995f, 4.664f, 2.974f, 7.451f, 2.974f)
                curveToRelative(3.308f, 0.0f, 6.78f, -1.38f, 9.479f, -4.08f)
                curveToRelative(2.391f, -2.39f, 3.831f, -5.453f, 4.058f, -8.624f)
                curveToRelative(0.229f, -3.225f, -0.818f, -6.175f, -2.951f, -8.308f)
                close()
                moveTo(19.465f, 9.456f)
                curveToRelative(-0.944f, 0.944f, -2.813f, 0.606f, -4.174f, -0.755f)
                reflectiveCurveToRelative(-1.7f, -3.23f, -0.755f, -4.174f)
                reflectiveCurveToRelative(2.813f, -0.606f, 4.174f, 0.755f)
                curveToRelative(1.361f, 1.361f, 1.7f, 3.23f, 0.755f, 4.174f)
                close()
            }
        }
        .build()
        return _olive!!
    }

private var _olive: ImageVector? = null
