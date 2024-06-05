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

public val Icons.Bold.LocationExclamation: ImageVector
    get() {
        if (_locationExclamation != null) {
            return _locationExclamation!!
        }
        _locationExclamation = Builder(name = "LocationExclamation", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.071f, 2.936f)
                curveTo(17.183f, 1.047f, 14.672f, 0.007f, 12.0f, 0.007f)
                reflectiveCurveToRelative(-5.183f, 1.04f, -7.071f, 2.929f)
                curveToRelative(-3.899f, 3.898f, -3.899f, 10.243f, 0.012f, 14.153f)
                lineToRelative(7.06f, 6.905f)
                lineToRelative(7.071f, -6.917f)
                curveToRelative(3.899f, -3.898f, 3.899f, -10.243f, 0.0f, -14.142f)
                close()
                moveTo(16.962f, 14.945f)
                lineToRelative(-4.962f, 4.853f)
                lineToRelative(-4.95f, -4.841f)
                curveToRelative(-2.729f, -2.729f, -2.729f, -7.17f, 0.0f, -9.899f)
                curveToRelative(1.322f, -1.322f, 3.08f, -2.05f, 4.95f, -2.05f)
                reflectiveCurveToRelative(3.628f, 0.728f, 4.95f, 2.05f)
                curveToRelative(2.729f, 2.729f, 2.729f, 7.17f, 0.012f, 9.888f)
                close()
                moveTo(10.5f, 5.001f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(10.5f, 13.001f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _locationExclamation!!
    }

private var _locationExclamation: ImageVector? = null
