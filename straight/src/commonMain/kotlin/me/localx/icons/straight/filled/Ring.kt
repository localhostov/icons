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

public val Icons.Filled.Ring: ImageVector
    get() {
        if (_ring != null) {
            return _ring!!
        }
        _ring = Builder(name = "Ring", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.473f, 7.687f)
                curveTo(1.889f, 4.953f, 6.44f, 3.0f, 12.0f, 3.0f)
                curveToRelative(5.386f, 0.0f, 9.831f, 1.832f, 11.393f, 4.431f)
                curveToRelative(-0.12f, 1.352f, -1.226f, 2.67f, -3.05f, 3.686f)
                curveToRelative(-1.926f, -1.186f, -5.193f, -2.117f, -8.343f, -2.117f)
                curveToRelative(-3.171f, 0.0f, -6.533f, 0.883f, -8.446f, 2.071f)
                curveToRelative(-1.818f, -1.008f, -2.9f, -2.261f, -3.081f, -3.384f)
                close()
                moveTo(12.0f, 15.0f)
                curveToRelative(-5.404f, 0.0f, -9.941f, -1.667f, -12.0f, -4.115f)
                verticalLineToRelative(3.615f)
                curveToRelative(0.0f, 3.645f, 5.271f, 6.5f, 12.0f, 6.5f)
                reflectiveCurveToRelative(12.0f, -2.855f, 12.0f, -6.5f)
                verticalLineToRelative(-3.615f)
                curveToRelative(-2.059f, 2.448f, -6.596f, 4.115f, -12.0f, 4.115f)
                close()
            }
        }
        .build()
        return _ring!!
    }

private var _ring: ImageVector? = null
