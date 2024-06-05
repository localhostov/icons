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

public val Icons.Bold.GrinBeam: ImageVector
    get() {
        if (_grinBeam != null) {
            return _grinBeam!!
        }
        _grinBeam = Builder(name = "GrinBeam", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 15.0f)
                arcToRelative(21.923f, 21.923f, 0.0f, false, false, 6.007f, -1.0f)
                curveToRelative(-0.615f, 2.28f, -2.664f, 5.0f, -6.0f, 5.0f)
                reflectiveCurveTo(6.615f, 16.28f, 6.0f, 14.0f)
                arcTo(21.841f, 21.841f, 0.0f, false, false, 12.0f, 15.0f)
                close()
                moveTo(11.0f, 12.0f)
                curveToRelative(-0.171f, -6.661f, -5.833f, -6.646f, -6.0f, 0.0f)
                curveTo(7.759f, 9.393f, 8.254f, 9.41f, 11.0f, 12.0f)
                close()
                moveTo(16.0f, 7.0f)
                curveToRelative(-2.267f, 0.0f, -3.0f, 3.369f, -3.0f, 5.0f)
                curveToRelative(2.759f, -2.607f, 3.254f, -2.59f, 6.0f, 0.0f)
                curveTo(19.0f, 10.369f, 18.267f, 7.0f, 16.0f, 7.0f)
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
        return _grinBeam!!
    }

private var _grinBeam: ImageVector? = null
