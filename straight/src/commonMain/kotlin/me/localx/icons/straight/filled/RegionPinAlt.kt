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

public val Icons.Filled.RegionPinAlt: ImageVector
    get() {
        if (_regionPinAlt != null) {
            return _regionPinAlt!!
        }
        _regionPinAlt = Builder(name = "RegionPinAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.389f, 1.611f)
                curveToRelative(-1.038f, -1.039f, -2.419f, -1.611f, -3.889f, -1.611f)
                reflectiveCurveToRelative(-2.851f, 0.572f, -3.889f, 1.611f)
                curveToRelative(-1.039f, 1.038f, -1.611f, 2.419f, -1.611f, 3.889f)
                reflectiveCurveToRelative(0.576f, 2.854f, 1.649f, 3.926f)
                lineToRelative(3.851f, 3.572f)
                lineToRelative(3.889f, -3.609f)
                curveToRelative(1.039f, -1.038f, 1.611f, -2.419f, 1.611f, -3.889f)
                reflectiveCurveToRelative(-0.572f, -2.851f, -1.611f, -3.889f)
                close()
                moveTo(18.5f, 7.006f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(13.198f, 0.196f)
                curveToRelative(-1.417f, 1.416f, -2.198f, 3.3f, -2.198f, 5.304f)
                reflectiveCurveToRelative(0.794f, 3.901f, 2.289f, 5.392f)
                lineToRelative(5.211f, 4.835f)
                lineToRelative(5.302f, -4.923f)
                curveToRelative(0.07f, -0.07f, 0.131f, -0.146f, 0.198f, -0.218f)
                verticalLineToRelative(7.415f)
                horizontalLineToRelative(-9.086f)
                lineToRelative(-6.914f, -5.914f)
                lineTo(8.0f, 0.0f)
                horizontalLineToRelative(5.414f)
                curveToRelative(-0.071f, 0.066f, -0.147f, 0.127f, -0.216f, 0.196f)
                close()
                moveTo(0.0f, 15.333f)
                lineTo(0.0f, 3.0f)
                curveTo(0.0f, 1.346f, 1.346f, 0.0f, 3.0f, 0.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(11.681f)
                lineTo(0.0f, 15.333f)
                close()
                moveTo(9.5f, 24.0f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-6.198f)
                lineToRelative(6.812f, -4.076f)
                lineToRelative(6.368f, 5.368f)
                lineToRelative(-3.679f, 4.906f)
                close()
                moveTo(24.0f, 20.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-12.0f)
                lineToRelative(3.0f, -4.0f)
                horizontalLineToRelative(9.0f)
                close()
            }
        }
        .build()
        return _regionPinAlt!!
    }

private var _regionPinAlt: ImageVector? = null
