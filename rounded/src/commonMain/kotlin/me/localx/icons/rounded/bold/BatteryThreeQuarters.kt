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

public val Icons.Bold.BatteryThreeQuarters: ImageVector
    get() {
        if (_batteryThreeQuarters != null) {
            return _batteryThreeQuarters!!
        }
        _batteryThreeQuarters = Builder(name = "BatteryThreeQuarters", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 8.0f)
                horizontalLineToRelative(-1.208f)
                curveToRelative(-0.655f, -2.306f, -2.78f, -4.0f, -5.292f, -4.0f)
                lineTo(5.5f, 4.0f)
                curveTo(2.468f, 4.0f, 0.0f, 6.467f, 0.0f, 9.5f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 3.033f, 2.468f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(11.0f)
                curveToRelative(2.513f, 0.0f, 4.637f, -1.694f, 5.292f, -4.0f)
                horizontalLineToRelative(1.208f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(19.0f, 14.5f)
                curveToRelative(0.0f, 1.378f, -1.121f, 2.5f, -2.5f, 2.5f)
                lineTo(5.5f, 17.0f)
                curveToRelative(-1.379f, 0.0f, -2.5f, -1.122f, -2.5f, -2.5f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -1.378f, 1.121f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(11.0f)
                curveToRelative(1.379f, 0.0f, 2.5f, 1.122f, 2.5f, 2.5f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(15.0f, 10.5f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.829f, -0.672f, 1.5f, -1.5f, 1.5f)
                lineTo(6.5f, 15.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.671f, -1.5f, -1.5f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.829f, 0.672f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.671f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _batteryThreeQuarters!!
    }

private var _batteryThreeQuarters: ImageVector? = null
