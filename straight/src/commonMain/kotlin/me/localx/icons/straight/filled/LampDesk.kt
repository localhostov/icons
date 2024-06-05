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

public val Icons.Filled.LampDesk: ImageVector
    get() {
        if (_lampDesk != null) {
            return _lampDesk!!
        }
        _lampDesk = Builder(name = "LampDesk", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.102f, 8.582f)
                lineToRelative(2.852f, -2.852f)
                lineTo(16.588f, 0.819f)
                curveToRelative(-1.929f, -1.286f, -4.52f, -1.029f, -6.158f, 0.61f)
                curveToRelative(-1.309f, 1.309f, -1.736f, 3.225f, -1.2f, 4.927f)
                lineToRelative(-4.23f, 4.23f)
                verticalLineToRelative(11.414f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-10.586f)
                lineToRelative(3.222f, -3.222f)
                lineToRelative(4.508f, 6.762f)
                lineToRelative(2.852f, -2.852f)
                curveToRelative(0.045f, 0.055f, 0.094f, 0.11f, 0.15f, 0.165f)
                curveToRelative(0.976f, 0.976f, 2.559f, 0.976f, 3.536f, 0.0f)
                reflectiveCurveToRelative(0.976f, -2.559f, 0.0f, -3.536f)
                curveToRelative(-0.056f, -0.056f, -0.111f, -0.105f, -0.165f, -0.15f)
                close()
            }
        }
        .build()
        return _lampDesk!!
    }

private var _lampDesk: ImageVector? = null
