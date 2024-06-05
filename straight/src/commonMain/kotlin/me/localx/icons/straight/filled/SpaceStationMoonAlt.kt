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

public val Icons.Filled.SpaceStationMoonAlt: ImageVector
    get() {
        if (_spaceStationMoonAlt != null) {
            return _spaceStationMoonAlt!!
        }
        _spaceStationMoonAlt = Builder(name = "SpaceStationMoonAlt", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 14.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(-12.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -2.206f, 1.794f, -4.0f, 4.0f, -4.0f)
                horizontalLineToRelative(8.0f)
                close()
                moveTo(17.102f, 7.312f)
                lineToRelative(-1.532f, 1.532f)
                curveToRelative(0.845f, 0.895f, 1.506f, 1.967f, 1.931f, 3.156f)
                horizontalLineToRelative(-1.501f)
                curveToRelative(-3.309f, 0.0f, -6.0f, 2.691f, -6.0f, 6.0f)
                verticalLineToRelative(5.0f)
                lineTo(0.0f, 23.0f)
                verticalLineToRelative(-7.971f)
                curveTo(0.0f, 10.39f, 3.507f, 6.56f, 8.0f, 6.059f)
                verticalLineToRelative(-2.059f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.061f)
                curveToRelative(1.477f, 0.165f, 2.852f, 0.69f, 4.036f, 1.489f)
                lineToRelative(1.652f, -1.652f)
                curveToRelative(-1.054f, -1.355f, -1.688f, -3.052f, -1.688f, -4.898f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, 3.309f, 2.691f, 6.0f, 6.0f, 6.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(-1.846f, 0.0f, -3.542f, -0.634f, -4.898f, -1.688f)
                close()
                moveTo(6.0f, 16.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _spaceStationMoonAlt!!
    }

private var _spaceStationMoonAlt: ImageVector? = null
