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

public val Icons.Bold.Script: ImageVector
    get() {
        if (_script != null) {
            return _script!!
        }
        _script = Builder(name = "Script", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.0f, 9.914f)
                lineToRelative(-3.0f, 3.0f)
                verticalLineToRelative(3.086f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                lineTo(8.0f, 4.0f)
                curveToRelative(0.0f, -0.347f, -0.058f, -0.678f, -0.142f, -1.0f)
                horizontalLineToRelative(7.228f)
                lineToRelative(2.609f, -2.609f)
                curveToRelative(-0.517f, -0.244f, -1.087f, -0.391f, -1.695f, -0.391f)
                lineTo(4.0f, 0.0f)
                curveTo(1.794f, 0.0f, 0.0f, 1.794f, 0.0f, 4.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                horizontalLineToRelative(11.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, -1.794f, 4.0f, -4.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-6.086f)
                close()
                moveTo(5.0f, 5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(21.0f, 20.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-7.127f)
                curveToRelative(0.083f, -0.319f, 0.127f, -0.655f, 0.127f, -1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(13.0f, 7.914f)
                lineTo(20.275f, 0.639f)
                curveToRelative(0.852f, -0.852f, 2.234f, -0.852f, 3.086f, 0.0f)
                reflectiveCurveToRelative(0.852f, 2.234f, 0.0f, 3.086f)
                lineToRelative(-7.275f, 7.275f)
                horizontalLineToRelative(-3.086f)
                verticalLineToRelative(-3.086f)
                close()
            }
        }
        .build()
        return _script!!
    }

private var _script: ImageVector? = null
