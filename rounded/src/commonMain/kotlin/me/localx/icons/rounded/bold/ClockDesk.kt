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

public val Icons.Bold.ClockDesk: ImageVector
    get() {
        if (_clockDesk != null) {
            return _clockDesk!!
        }
        _clockDesk = Builder(name = "ClockDesk", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                curveTo(6.486f, 0.0f, 2.0f, 4.486f, 2.0f, 10.0f)
                verticalLineToRelative(9.5f)
                curveToRelative(0.0f, 2.481f, 2.019f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(11.0f)
                curveToRelative(2.481f, 0.0f, 4.5f, -2.019f, 4.5f, -4.5f)
                verticalLineToRelative(-9.5f)
                curveTo(22.0f, 4.486f, 17.514f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 3.0f)
                curveToRelative(3.859f, 0.0f, 7.0f, 3.14f, 7.0f, 7.0f)
                reflectiveCurveToRelative(-3.141f, 7.0f, -7.0f, 7.0f)
                reflectiveCurveToRelative(-7.0f, -3.14f, -7.0f, -7.0f)
                reflectiveCurveToRelative(3.141f, -7.0f, 7.0f, -7.0f)
                close()
                moveTo(17.5f, 21.0f)
                lineTo(6.5f, 21.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                verticalLineToRelative(-2.366f)
                curveToRelative(1.805f, 1.772f, 4.277f, 2.866f, 7.0f, 2.866f)
                reflectiveCurveToRelative(5.195f, -1.095f, 7.0f, -2.866f)
                verticalLineToRelative(2.366f)
                curveToRelative(0.0f, 0.827f, -0.673f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(8.197f, 12.173f)
                curveToRelative(-0.411f, -0.719f, -0.161f, -1.635f, 0.559f, -2.046f)
                lineToRelative(1.744f, -0.997f)
                verticalLineToRelative(-2.629f)
                curveToRelative(0.0f, -0.829f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.671f, 1.5f, 1.5f)
                verticalLineToRelative(3.5f)
                curveToRelative(0.0f, 0.538f, -0.288f, 1.035f, -0.756f, 1.302f)
                lineToRelative(-2.5f, 1.429f)
                curveToRelative(-0.234f, 0.134f, -0.49f, 0.198f, -0.743f, 0.198f)
                curveToRelative(-0.521f, 0.0f, -1.026f, -0.271f, -1.304f, -0.756f)
                close()
            }
        }
        .build()
        return _clockDesk!!
    }

private var _clockDesk: ImageVector? = null
