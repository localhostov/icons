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

public val Icons.Filled.UserHelmetSafety: ImageVector
    get() {
        if (_userHelmetSafety != null) {
            return _userHelmetSafety!!
        }
        _userHelmetSafety = Builder(name = "UserHelmetSafety", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 5.0f)
                verticalLineToRelative(2.0f)
                lineTo(5.0f, 7.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.023f)
                curveTo(6.262f, 2.365f, 8.366f, 0.261f, 11.0f, 0.023f)
                verticalLineToRelative(3.977f)
                horizontalLineToRelative(2.0f)
                lineTo(13.0f, 0.023f)
                curveToRelative(2.634f, 0.239f, 4.738f, 2.343f, 4.977f, 4.977f)
                horizontalLineToRelative(1.023f)
                close()
                moveTo(16.0f, 16.0f)
                horizontalLineToRelative(-8.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, 2.243f, -5.0f, 5.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(6.002f, 9.146f)
                curveToRelative(0.078f, 3.241f, 2.738f, 5.854f, 5.998f, 5.854f)
                reflectiveCurveToRelative(5.92f, -2.613f, 5.998f, -5.854f)
                lineToRelative(0.002f, -0.146f)
                lineTo(6.0f, 9.0f)
                lineToRelative(0.002f, 0.146f)
                close()
            }
        }
        .build()
        return _userHelmetSafety!!
    }

private var _userHelmetSafety: ImageVector? = null
