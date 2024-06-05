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
                moveToRelative(19.0f, 6.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                lineTo(6.0f, 7.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(0.023f)
                curveTo(6.262f, 2.365f, 8.366f, 0.261f, 11.0f, 0.023f)
                verticalLineToRelative(2.977f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                lineTo(13.0f, 0.023f)
                curveToRelative(2.634f, 0.239f, 4.738f, 2.343f, 4.977f, 4.977f)
                horizontalLineToRelative(0.023f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                close()
                moveTo(6.002f, 9.146f)
                curveToRelative(0.078f, 3.241f, 2.738f, 5.854f, 5.998f, 5.854f)
                reflectiveCurveToRelative(5.92f, -2.613f, 5.998f, -5.854f)
                lineToRelative(0.002f, -0.146f)
                lineTo(6.0f, 9.0f)
                lineToRelative(0.002f, 0.146f)
                close()
                moveTo(20.992f, 22.876f)
                curveToRelative(-0.415f, -3.645f, -4.277f, -6.876f, -8.992f, -6.876f)
                reflectiveCurveToRelative(-8.577f, 3.231f, -8.992f, 6.876f)
                curveToRelative(-0.032f, 0.285f, 0.053f, 0.571f, 0.243f, 0.786f)
                curveToRelative(0.189f, 0.215f, 0.463f, 0.338f, 0.75f, 0.338f)
                horizontalLineToRelative(16.0f)
                curveToRelative(0.287f, 0.0f, 0.56f, -0.123f, 0.75f, -0.338f)
                curveToRelative(0.19f, -0.215f, 0.275f, -0.501f, 0.243f, -0.786f)
                close()
            }
        }
        .build()
        return _userHelmetSafety!!
    }

private var _userHelmetSafety: ImageVector? = null
