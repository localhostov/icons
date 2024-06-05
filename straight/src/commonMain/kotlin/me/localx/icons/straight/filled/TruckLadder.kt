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

public val Icons.Filled.TruckLadder: ImageVector
    get() {
        if (_truckLadder != null) {
            return _truckLadder!!
        }
        _truckLadder = Builder(name = "TruckLadder", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 3.0f)
                lineTo(2.0f, 3.0f)
                lineTo(2.0f, 7.0f)
                lineTo(0.0f, 7.0f)
                verticalLineToRelative(2.0f)
                lineTo(14.0f, 9.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(12.0f, 3.0f)
                horizontalLineToRelative(2.0f)
                lineTo(14.0f, 1.0f)
                lineTo(0.0f, 1.0f)
                lineTo(0.0f, 3.0f)
                close()
                moveTo(4.0f, 3.0f)
                horizontalLineToRelative(2.0f)
                lineTo(6.0f, 7.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(4.0f, 3.0f)
                close()
                moveTo(10.0f, 7.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(8.0f, 3.0f)
                horizontalLineToRelative(2.0f)
                lineTo(10.0f, 7.0f)
                close()
                moveTo(11.942f, 21.0f)
                curveToRelative(0.034f, 0.162f, 0.058f, 0.328f, 0.058f, 0.5f)
                curveToRelative(0.0f, 1.381f, -1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                curveToRelative(0.0f, -0.172f, 0.024f, -0.338f, 0.058f, -0.5f)
                horizontalLineToRelative(4.885f)
                close()
                moveTo(4.942f, 21.0f)
                curveToRelative(0.034f, 0.162f, 0.058f, 0.328f, 0.058f, 0.5f)
                curveToRelative(0.0f, 1.381f, -1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                curveToRelative(0.0f, -0.172f, 0.024f, -0.338f, 0.058f, -0.5f)
                lineTo(4.942f, 21.0f)
                close()
                moveTo(0.0f, 11.0f)
                lineTo(14.0f, 11.0f)
                verticalLineToRelative(8.0f)
                lineTo(0.0f, 19.0f)
                lineTo(0.0f, 11.0f)
                close()
                moveTo(21.942f, 21.0f)
                curveToRelative(0.034f, 0.162f, 0.058f, 0.328f, 0.058f, 0.5f)
                curveToRelative(0.0f, 1.381f, -1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                curveToRelative(0.0f, -0.172f, 0.024f, -0.338f, 0.058f, -0.5f)
                horizontalLineToRelative(4.885f)
                close()
                moveTo(23.72f, 12.0f)
                horizontalLineToRelative(-7.721f)
                lineTo(15.999f, 6.0f)
                horizontalLineToRelative(3.559f)
                curveToRelative(1.293f, 0.0f, 2.437f, 0.824f, 2.846f, 2.051f)
                lineToRelative(1.316f, 3.949f)
                close()
                moveTo(23.999f, 14.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(8.0f)
                close()
            }
        }
        .build()
        return _truckLadder!!
    }

private var _truckLadder: ImageVector? = null
