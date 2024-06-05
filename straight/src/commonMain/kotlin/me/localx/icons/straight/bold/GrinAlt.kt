package me.localx.icons.straight.bold

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

public val Icons.Bold.GrinAlt: ImageVector
    get() {
        if (_grinAlt != null) {
            return _grinAlt!!
        }
        _grinAlt = Builder(name = "GrinAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.993f, 15.0f)
                arcTo(21.923f, 21.923f, 0.0f, false, false, 18.0f, 14.0f)
                curveToRelative(-0.615f, 2.28f, -2.664f, 5.0f, -6.0f, 5.0f)
                reflectiveCurveToRelative(-5.392f, -2.72f, -6.007f, -5.0f)
                arcTo(21.841f, 21.841f, 0.0f, false, false, 11.993f, 15.0f)
                close()
                moveTo(8.0f, 13.0f)
                curveToRelative(2.63f, -0.074f, 2.63f, -5.927f, 0.0f, -6.0f)
                curveTo(5.37f, 7.074f, 5.37f, 12.927f, 8.0f, 13.0f)
                close()
                moveTo(16.0f, 7.0f)
                curveToRelative(-2.63f, 0.074f, -2.63f, 5.927f, 0.0f, 6.0f)
                curveTo(18.63f, 12.926f, 18.63f, 7.073f, 16.0f, 7.0f)
                close()
                moveTo(24.0f, 12.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, true, 12.0f, 24.0f)
                curveTo(-3.9f, 23.4f, -3.893f, 0.6f, 12.0f, 0.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, true, 24.0f, 12.0f)
                close()
                moveTo(21.0f, 12.0f)
                arcToRelative(9.011f, 9.011f, 0.0f, false, false, -9.0f, -9.0f)
                curveTo(0.077f, 3.453f, 0.08f, 20.549f, 12.0f, 21.0f)
                arcTo(9.011f, 9.011f, 0.0f, false, false, 21.0f, 12.0f)
                close()
            }
        }
        .build()
        return _grinAlt!!
    }

private var _grinAlt: ImageVector? = null
