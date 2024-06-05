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

public val Icons.Filled.SpaceStationMoon: ImageVector
    get() {
        if (_spaceStationMoon != null) {
            return _spaceStationMoon!!
        }
        _spaceStationMoon = Builder(name = "SpaceStationMoon", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.0f, 9.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(0.683f, 1.3f, 1.069f, 3.264f, 1.069f, 5.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(-4.069f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -1.105f, -0.895f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.895f, -2.0f, 2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-4.069f)
                verticalLineToRelative(-7.5f)
                curveToRelative(0.0f, -2.236f, 0.386f, -4.2f, 1.069f, -5.5f)
                close()
                moveTo(21.615f, 7.0f)
                curveToRelative(-2.152f, -2.969f, -5.56f, -4.928f, -9.39f, -4.998f)
                curveToRelative(-3.276f, -0.042f, -6.315f, 1.16f, -8.631f, 3.435f)
                curveToRelative(-0.497f, 0.488f, -0.945f, 1.011f, -1.344f, 1.563f)
                horizontalLineToRelative(19.365f)
                close()
                moveTo(19.189f, 9.0f)
                curveToRelative(0.574f, 1.495f, 0.881f, 3.386f, 0.881f, 5.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(-0.069f)
                curveToRelative(2.209f, 0.0f, 4.0f, -1.791f, 4.0f, -4.0f)
                verticalLineToRelative(-3.635f)
                curveToRelative(0.0f, -1.916f, -0.433f, -3.738f, -1.202f, -5.365f)
                horizontalLineToRelative(-3.609f)
                close()
                moveTo(3.931f, 14.5f)
                curveToRelative(0.0f, -2.114f, 0.307f, -4.005f, 0.881f, -5.5f)
                lineTo(1.084f, 9.0f)
                curveToRelative(-0.71f, 1.547f, -1.084f, 3.243f, -1.084f, 5.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 2.209f, 1.791f, 4.0f, 4.0f, 4.0f)
                horizontalLineToRelative(-0.069f)
                verticalLineToRelative(-7.5f)
                close()
            }
        }
        .build()
        return _spaceStationMoon!!
    }

private var _spaceStationMoon: ImageVector? = null
