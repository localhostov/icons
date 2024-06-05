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

public val Icons.Bold.Olive: ImageVector
    get() {
        if (_olive != null) {
            return _olive!!
        }
        _olive = Builder(name = "Olive", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.994f, 3.006f)
                curveTo(16.618f, -1.37f, 9.022f, -0.898f, 4.062f, 4.062f)
                curveTo(1.687f, 6.436f, 0.255f, 9.482f, 0.03f, 12.64f)
                curveToRelative(-0.23f, 3.238f, 0.826f, 6.205f, 2.976f, 8.354f)
                curveToRelative(2.01f, 2.01f, 4.697f, 2.997f, 7.498f, 2.997f)
                curveToRelative(3.298f, 0.0f, 6.752f, -1.37f, 9.435f, -4.052f)
                curveToRelative(2.375f, -2.375f, 3.807f, -5.421f, 4.031f, -8.579f)
                curveToRelative(0.23f, -3.238f, -0.826f, -6.205f, -2.976f, -8.354f)
                close()
                moveTo(20.977f, 11.147f)
                curveToRelative(-0.174f, 2.438f, -1.296f, 4.807f, -3.16f, 6.671f)
                curveToRelative(-3.79f, 3.79f, -9.483f, 4.264f, -12.69f, 1.056f)
                curveToRelative(-1.525f, -1.525f, -2.272f, -3.663f, -2.104f, -6.02f)
                curveToRelative(0.174f, -2.438f, 1.296f, -4.807f, 3.16f, -6.671f)
                curveToRelative(3.79f, -3.788f, 9.484f, -4.262f, 12.69f, -1.056f)
                curveToRelative(1.525f, 1.525f, 2.272f, 3.663f, 2.104f, 6.02f)
                close()
                moveTo(17.709f, 6.291f)
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
