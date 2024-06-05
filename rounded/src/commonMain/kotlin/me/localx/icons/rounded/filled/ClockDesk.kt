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

public val Icons.Filled.ClockDesk: ImageVector
    get() {
        if (_clockDesk != null) {
            return _clockDesk!!
        }
        _clockDesk = Builder(name = "ClockDesk", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 20.0f)
                curveToRelative(5.514f, 0.0f, 10.0f, -4.486f, 10.0f, -10.0f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(-0.013f)
                curveToRelative(-0.261f, -5.283f, -4.641f, -9.5f, -9.987f, -9.5f)
                reflectiveCurveTo(2.274f, 4.217f, 2.013f, 9.5f)
                horizontalLineToRelative(-0.013f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 5.514f, 4.486f, 10.0f, 10.0f, 10.0f)
                close()
                moveTo(11.0f, 9.446f)
                verticalLineToRelative(-3.446f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.345f, -0.178f, 0.665f, -0.47f, 0.848f)
                lineToRelative(-3.152f, 1.97f)
                curveToRelative(-0.468f, 0.293f, -1.085f, 0.15f, -1.378f, -0.318f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.293f, -0.469f, -0.15f, -1.086f, 0.318f, -1.379f)
                lineToRelative(2.682f, -1.676f)
                close()
                moveTo(22.0f, 16.626f)
                verticalLineToRelative(3.375f)
                curveToRelative(0.0f, 2.209f, -1.791f, 4.0f, -4.0f, 4.0f)
                lineTo(6.0f, 24.001f)
                curveToRelative(-2.209f, 0.0f, -4.0f, -1.791f, -4.0f, -4.0f)
                verticalLineToRelative(-3.375f)
                curveToRelative(2.151f, 3.237f, 5.83f, 5.375f, 10.0f, 5.375f)
                reflectiveCurveToRelative(7.849f, -2.138f, 10.0f, -5.375f)
                close()
            }
        }
        .build()
        return _clockDesk!!
    }

private var _clockDesk: ImageVector? = null
