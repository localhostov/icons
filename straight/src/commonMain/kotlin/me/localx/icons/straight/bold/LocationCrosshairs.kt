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

public val Icons.Bold.LocationCrosshairs: ImageVector
    get() {
        if (_locationCrosshairs != null) {
            return _locationCrosshairs!!
        }
        _locationCrosshairs = Builder(name = "LocationCrosshairs", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 7.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, 2.243f, -5.0f, 5.0f)
                reflectiveCurveToRelative(2.243f, 5.0f, 5.0f, 5.0f)
                reflectiveCurveToRelative(5.0f, -2.243f, 5.0f, -5.0f)
                reflectiveCurveToRelative(-2.243f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(12.0f, 14.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.897f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.897f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.897f, 2.0f, -2.0f, 2.0f)
                close()
                moveTo(21.888f, 10.5f)
                curveToRelative(-0.652f, -4.315f, -4.072f, -7.736f, -8.388f, -8.388f)
                lineTo(13.5f, 0.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(10.5f, 2.112f)
                curveTo(6.184f, 2.764f, 2.764f, 6.185f, 2.112f, 10.5f)
                lineTo(0.0f, 10.5f)
                verticalLineToRelative(3.0f)
                lineTo(2.112f, 13.5f)
                curveToRelative(0.652f, 4.315f, 4.072f, 7.736f, 8.388f, 8.388f)
                verticalLineToRelative(2.112f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.112f)
                curveToRelative(4.316f, -0.652f, 7.736f, -4.072f, 8.388f, -8.388f)
                horizontalLineToRelative(2.112f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.112f)
                close()
                moveTo(12.0f, 19.0f)
                curveToRelative(-3.86f, 0.0f, -7.0f, -3.141f, -7.0f, -7.0f)
                reflectiveCurveToRelative(3.14f, -7.0f, 7.0f, -7.0f)
                reflectiveCurveToRelative(7.0f, 3.141f, 7.0f, 7.0f)
                reflectiveCurveToRelative(-3.14f, 7.0f, -7.0f, 7.0f)
                close()
            }
        }
        .build()
        return _locationCrosshairs!!
    }

private var _locationCrosshairs: ImageVector? = null
