package me.localx.icons.rounded.outline

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

public val Icons.Outline.SpaceStationMoon: ImageVector
    get() {
        if (_spaceStationMoon != null) {
            return _spaceStationMoon!!
        }
        _spaceStationMoon = Builder(name = "SpaceStationMoon", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.225f, 2.002f)
                curveToRelative(-3.276f, -0.042f, -6.315f, 1.16f, -8.631f, 3.435f)
                curveTo(1.276f, 7.712f, 0.0f, 10.753f, 0.0f, 14.0f)
                verticalLineToRelative(3.5f)
                curveToRelative(0.0f, 2.481f, 2.019f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(15.0f)
                curveToRelative(2.481f, 0.0f, 4.5f, -2.019f, 4.5f, -4.5f)
                verticalLineToRelative(-3.135f)
                curveToRelative(0.0f, -6.698f, -5.282f, -12.245f, -11.775f, -12.363f)
                close()
                moveTo(11.998f, 4.0f)
                curveToRelative(0.063f, 0.0f, 0.127f, 0.0f, 0.189f, 0.002f)
                curveToRelative(2.65f, 0.048f, 5.057f, 1.188f, 6.824f, 2.998f)
                horizontalLineToRelative(-2.496f)
                curveToRelative(-0.009f, 0.0f, -0.018f, 0.0f, -0.028f, 0.0f)
                lineTo(7.511f, 7.0f)
                curveToRelative(-0.009f, 0.0f, -0.018f, 0.0f, -0.028f, 0.0f)
                horizontalLineToRelative(-2.625f)
                curveToRelative(0.045f, -0.046f, 0.09f, -0.092f, 0.136f, -0.137f)
                curveToRelative(1.886f, -1.851f, 4.366f, -2.863f, 7.004f, -2.863f)
                close()
                moveTo(17.0f, 14.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -1.105f, -0.895f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.895f, -2.0f, 2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0.0f, -2.236f, 0.386f, -4.2f, 1.069f, -5.5f)
                horizontalLineToRelative(7.861f)
                curveToRelative(0.683f, 1.3f, 1.069f, 3.264f, 1.069f, 5.5f)
                close()
                moveTo(2.0f, 17.5f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -1.786f, 0.464f, -3.497f, 1.334f, -5.0f)
                horizontalLineToRelative(2.547f)
                curveToRelative(-0.574f, 1.495f, -0.881f, 3.386f, -0.881f, 5.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-1.379f, 0.0f, -2.5f, -1.121f, -2.5f, -2.5f)
                close()
                moveTo(22.0f, 17.5f)
                curveToRelative(0.0f, 1.379f, -1.121f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0.0f, -2.114f, -0.307f, -4.005f, -0.881f, -5.5f)
                horizontalLineToRelative(2.421f)
                curveToRelative(0.925f, 1.57f, 1.459f, 3.409f, 1.459f, 5.365f)
                verticalLineToRelative(3.135f)
                close()
            }
        }
        .build()
        return _spaceStationMoon!!
    }

private var _spaceStationMoon: ImageVector? = null
