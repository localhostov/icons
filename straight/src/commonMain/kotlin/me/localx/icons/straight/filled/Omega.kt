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

public val Icons.Filled.Omega: ImageVector
    get() {
        if (_omega != null) {
            return _omega!!
        }
        _omega = Builder(name = "Omega", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 24.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(-4.443f)
                lineToRelative(0.666f, -0.235f)
                curveToRelative(3.848f, -1.362f, 6.334f, -4.628f, 6.334f, -8.321f)
                curveToRelative(0.0f, -4.962f, -4.486f, -9.0f, -10.0f, -9.0f)
                reflectiveCurveTo(2.0f, 6.038f, 2.0f, 11.0f)
                curveToRelative(0.0f, 3.693f, 2.486f, 6.959f, 6.333f, 8.321f)
                lineToRelative(0.667f, 0.235f)
                verticalLineToRelative(4.443f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-1.05f)
                curveTo(2.724f, 19.168f, 0.0f, 15.331f, 0.0f, 11.0f)
                curveTo(0.0f, 4.935f, 5.383f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 4.935f, 12.0f, 11.0f)
                curveToRelative(0.0f, 4.331f, -2.724f, 8.168f, -7.0f, 9.95f)
                verticalLineToRelative(1.05f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _omega!!
    }

private var _omega: ImageVector? = null
