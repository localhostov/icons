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

public val Icons.Filled.PlaneTail: ImageVector
    get() {
        if (_planeTail != null) {
            return _planeTail!!
        }
        _planeTail = Builder(name = "PlaneTail", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.382f, 16.622f)
                curveToRelative(-0.456f, -0.189f, -11.299f, -4.622f, -21.382f, -4.622f)
                lineTo(0.0f, 12.0f)
                verticalLineToRelative(12.0f)
                lineTo(2.0f, 24.0f)
                curveToRelative(10.083f, 0.0f, 20.926f, -4.433f, 21.382f, -4.622f)
                lineToRelative(0.618f, -0.255f)
                verticalLineToRelative(-2.246f)
                lineToRelative(-0.618f, -0.255f)
                close()
                moveTo(14.0f, 19.0f)
                lineTo(7.0f, 19.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(8.441f, 10.489f)
                curveToRelative(0.309f, -0.27f, 0.596f, -0.568f, 0.846f, -0.901f)
                lineTo(15.588f, 1.187f)
                curveTo(16.15f, 0.435f, 17.048f, -0.013f, 17.987f, -0.013f)
                horizontalLineToRelative(4.302f)
                lineToRelative(-3.443f, 12.909f)
                curveToRelative(-2.809f, -0.871f, -6.483f, -1.837f, -10.405f, -2.408f)
                close()
            }
        }
        .build()
        return _planeTail!!
    }

private var _planeTail: ImageVector? = null
