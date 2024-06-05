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

public val Icons.Bold.Omega: ImageVector
    get() {
        if (_omega != null) {
            return _omega!!
        }
        _omega = Builder(name = "Omega", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.0f, 21.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(-5.414f)
                lineToRelative(0.907f, -0.391f)
                curveToRelative(3.094f, -1.331f, 5.093f, -4.156f, 5.093f, -7.195f)
                curveToRelative(0.0f, -4.411f, -4.037f, -8.0f, -9.0f, -8.0f)
                reflectiveCurveTo(3.0f, 6.589f, 3.0f, 11.0f)
                curveToRelative(0.0f, 3.039f, 1.999f, 5.864f, 5.093f, 7.195f)
                lineToRelative(0.907f, 0.391f)
                verticalLineToRelative(5.414f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-0.483f)
                curveTo(2.325f, 18.564f, 0.0f, 14.925f, 0.0f, 11.0f)
                curveTo(0.0f, 4.935f, 5.383f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 4.935f, 12.0f, 11.0f)
                curveToRelative(0.0f, 3.925f, -2.324f, 7.564f, -6.0f, 9.517f)
                verticalLineToRelative(0.483f)
                close()
            }
        }
        .build()
        return _omega!!
    }

private var _omega: ImageVector? = null
