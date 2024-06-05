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

public val Icons.Filled.TruckContainerEmpty: ImageVector
    get() {
        if (_truckContainerEmpty != null) {
            return _truckContainerEmpty!!
        }
        _truckContainerEmpty = Builder(name = "TruckContainerEmpty", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.0f, 11.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(3.559f)
                curveToRelative(1.293f, 0.0f, 2.437f, 0.824f, 2.846f, 2.051f)
                lineToRelative(1.316f, 3.949f)
                horizontalLineToRelative(-7.721f)
                close()
                moveTo(0.0f, 18.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(5.0f)
                lineTo(0.0f, 18.0f)
                close()
                moveTo(0.058f, 20.0f)
                curveToRelative(-0.034f, 0.162f, -0.058f, 0.328f, -0.058f, 0.5f)
                curveToRelative(0.0f, 1.381f, 1.119f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.119f, 2.5f, -2.5f)
                curveToRelative(0.0f, -0.172f, -0.024f, -0.338f, -0.058f, -0.5f)
                lineTo(0.058f, 20.0f)
                close()
                moveTo(7.058f, 20.0f)
                curveToRelative(-0.034f, 0.162f, -0.058f, 0.328f, -0.058f, 0.5f)
                curveToRelative(0.0f, 1.381f, 1.119f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.119f, 2.5f, -2.5f)
                curveToRelative(0.0f, -0.172f, -0.024f, -0.338f, -0.058f, -0.5f)
                horizontalLineToRelative(-4.885f)
                close()
                moveTo(17.058f, 20.0f)
                curveToRelative(-0.034f, 0.162f, -0.058f, 0.328f, -0.058f, 0.5f)
                curveToRelative(0.0f, 1.381f, 1.119f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.119f, 2.5f, -2.5f)
                curveToRelative(0.0f, -0.172f, -0.024f, -0.338f, -0.058f, -0.5f)
                horizontalLineToRelative(-4.885f)
                close()
            }
        }
        .build()
        return _truckContainerEmpty!!
    }

private var _truckContainerEmpty: ImageVector? = null
