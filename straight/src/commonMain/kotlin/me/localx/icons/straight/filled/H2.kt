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

public val Icons.Filled.H2: ImageVector
    get() {
        if (_h2 != null) {
            return _h2!!
        }
        _h2 = Builder(name = "H2", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.0f, 4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-7.0f)
                lineTo(2.0f, 13.0f)
                verticalLineToRelative(7.0f)
                lineTo(0.0f, 20.0f)
                lineTo(0.0f, 4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-7.0f)
                close()
                moveTo(19.141f, 15.592f)
                curveToRelative(2.165f, -1.503f, 4.859f, -3.374f, 4.859f, -6.592f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                reflectiveCurveToRelative(-5.0f, 2.243f, -5.0f, 5.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.346f, 3.0f, 3.0f)
                curveToRelative(0.0f, 2.172f, -1.943f, 3.521f, -4.0f, 4.949f)
                curveToRelative(-1.966f, 1.365f, -4.0f, 2.777f, -4.0f, 5.051f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-7.67f)
                curveToRelative(0.535f, -0.827f, 1.649f, -1.602f, 2.811f, -2.408f)
                close()
            }
        }
        .build()
        return _h2!!
    }

private var _h2: ImageVector? = null
