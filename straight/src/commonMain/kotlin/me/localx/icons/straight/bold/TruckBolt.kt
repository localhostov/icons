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

public val Icons.Bold.TruckBolt: ImageVector
    get() {
        if (_truckBolt != null) {
            return _truckBolt!!
        }
        _truckBolt = Builder(name = "TruckBolt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.713f, 9.873f)
                curveToRelative(0.337f, 0.526f, 0.381f, 1.179f, 0.118f, 1.746f)
                lineToRelative(-2.106f, 4.515f)
                lineToRelative(-2.719f, -1.268f)
                lineToRelative(1.321f, -2.834f)
                horizontalLineToRelative(-1.506f)
                curveToRelative(-0.636f, 0.0f, -1.215f, -0.323f, -1.549f, -0.863f)
                curveToRelative(-0.334f, -0.541f, -0.364f, -1.203f, -0.08f, -1.771f)
                lineToRelative(2.284f, -4.568f)
                lineToRelative(2.684f, 1.342f)
                lineToRelative(-1.431f, 2.861f)
                horizontalLineToRelative(1.449f)
                curveToRelative(0.625f, 0.0f, 1.198f, 0.314f, 1.534f, 0.841f)
                close()
                moveTo(24.0f, 20.0f)
                horizontalLineToRelative(-3.058f)
                curveToRelative(0.034f, 0.162f, 0.058f, 0.328f, 0.058f, 0.5f)
                curveToRelative(0.0f, 1.381f, -1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                curveToRelative(0.0f, -0.172f, 0.024f, -0.338f, 0.058f, -0.5f)
                lineTo(7.942f, 20.0f)
                curveToRelative(0.034f, 0.162f, 0.058f, 0.328f, 0.058f, 0.5f)
                curveToRelative(0.0f, 1.381f, -1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                curveToRelative(0.0f, -0.172f, 0.024f, -0.338f, 0.058f, -0.5f)
                lineTo(0.0f, 20.0f)
                lineTo(0.0f, 1.0f)
                horizontalLineToRelative(13.5f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(1.5f)
                curveToRelative(3.032f, 0.0f, 5.5f, 2.468f, 5.5f, 5.5f)
                verticalLineToRelative(9.5f)
                close()
                moveTo(14.0f, 4.5f)
                curveToRelative(0.0f, -0.275f, -0.225f, -0.5f, -0.5f, -0.5f)
                lineTo(3.0f, 4.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(11.0f)
                lineTo(14.0f, 4.5f)
                close()
                moveTo(21.0f, 10.5f)
                curveToRelative(0.0f, -1.379f, -1.121f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-2.5f)
                close()
            }
        }
        .build()
        return _truckBolt!!
    }

private var _truckBolt: ImageVector? = null
