package me.localx.icons.rounded.bold

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

public val Icons.Bold.TruckSide: ImageVector
    get() {
        if (_truckSide != null) {
            return _truckSide!!
        }
        _truckSide = Builder(name = "TruckSide", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.682f, 5.0f)
                lineTo(16.815f, 5.0f)
                arcToRelative(5.314f, 5.314f, 0.0f, false, false, -5.133f, -4.0f)
                lineTo(5.318f, 1.0f)
                arcTo(5.324f, 5.324f, 0.0f, false, false, 0.0f, 6.318f)
                verticalLineToRelative(9.319f)
                arcToRelative(4.354f, 4.354f, 0.0f, false, false, 3.02f, 4.129f)
                curveTo(3.014f, 19.844f, 3.0f, 19.92f, 3.0f, 20.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 6.0f, 0.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 6.0f, 0.0f)
                curveToRelative(0.0f, -0.08f, -0.014f, -0.155f, -0.02f, -0.233f)
                arcTo(4.355f, 4.355f, 0.0f, false, false, 24.0f, 15.637f)
                lineTo(24.0f, 10.272f)
                arcTo(5.3f, 5.3f, 0.0f, false, false, 18.682f, 5.0f)
                close()
                moveTo(21.0f, 10.272f)
                lineTo(21.0f, 11.0f)
                lineTo(17.0f, 11.0f)
                lineTo(17.0f, 8.0f)
                horizontalLineToRelative(1.682f)
                arcTo(2.271f, 2.271f, 0.0f, false, true, 21.0f, 10.272f)
                close()
                moveTo(4.364f, 17.0f)
                arcTo(1.365f, 1.365f, 0.0f, false, true, 3.0f, 15.637f)
                lineTo(3.0f, 6.318f)
                arcTo(2.321f, 2.321f, 0.0f, false, true, 5.318f, 4.0f)
                horizontalLineToRelative(6.364f)
                arcTo(2.321f, 2.321f, 0.0f, false, true, 14.0f, 6.318f)
                lineTo(14.0f, 17.0f)
                close()
                moveTo(19.637f, 17.0f)
                lineTo(17.0f, 17.0f)
                lineTo(17.0f, 14.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(1.637f)
                arcTo(1.364f, 1.364f, 0.0f, false, true, 19.637f, 17.0f)
                close()
            }
        }
        .build()
        return _truckSide!!
    }

private var _truckSide: ImageVector? = null
