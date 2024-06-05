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

public val Icons.Bold.Integral: ImageVector
    get() {
        if (_integral != null) {
            return _integral!!
        }
        _integral = Builder(name = "Integral", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 4.25f)
                verticalLineToRelative(1.75f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.75f)
                curveToRelative(0.0f, -0.689f, -0.561f, -1.25f, -1.25f, -1.25f)
                reflectiveCurveToRelative(-1.25f, 0.561f, -1.25f, 1.25f)
                verticalLineToRelative(15.5f)
                curveToRelative(0.0f, 2.344f, -1.907f, 4.25f, -4.25f, 4.25f)
                reflectiveCurveToRelative(-4.25f, -1.906f, -4.25f, -4.25f)
                verticalLineToRelative(-1.75f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.75f)
                curveToRelative(0.0f, 0.689f, 0.561f, 1.25f, 1.25f, 1.25f)
                reflectiveCurveToRelative(1.25f, -0.561f, 1.25f, -1.25f)
                verticalLineTo(4.25f)
                curveToRelative(0.0f, -2.344f, 1.907f, -4.25f, 4.25f, -4.25f)
                reflectiveCurveToRelative(4.25f, 1.906f, 4.25f, 4.25f)
                close()
            }
        }
        .build()
        return _integral!!
    }

private var _integral: ImageVector? = null
