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

public val Icons.Bold.SpaceStationMoonAlt: ImageVector
    get() {
        if (_spaceStationMoonAlt != null) {
            return _spaceStationMoonAlt!!
        }
        _spaceStationMoonAlt = Builder(name = "SpaceStationMoonAlt", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.659f, 13.0f)
                curveToRelative(-0.438f, -1.591f, -1.28f, -3.017f, -2.407f, -4.16f)
                lineToRelative(1.225f, -1.225f)
                curveToRelative(1.282f, 0.874f, 2.829f, 1.385f, 4.494f, 1.385f)
                verticalLineToRelative(-3.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(0.0f, 1.665f, 0.511f, 3.212f, 1.385f, 4.494f)
                lineToRelative(-1.55f, 1.55f)
                curveToRelative(-0.867f, -0.445f, -1.811f, -0.76f, -2.805f, -0.921f)
                verticalLineToRelative(-2.123f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.118f)
                curveTo(3.456f, 6.84f, -0.029f, 10.785f, -0.029f, 15.529f)
                verticalLineToRelative(7.471f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-10.0f)
                horizontalLineToRelative(-5.312f)
                close()
                moveTo(2.971f, 20.0f)
                verticalLineToRelative(-4.471f)
                curveToRelative(0.0f, -3.596f, 2.921f, -6.521f, 6.515f, -6.529f)
                curveToRelative(2.698f, 0.006f, 5.016f, 1.656f, 6.005f, 4.0f)
                horizontalLineToRelative(-0.02f)
                curveToRelative(-2.481f, 0.0f, -4.5f, 2.019f, -4.5f, 4.5f)
                verticalLineToRelative(2.5f)
                lineTo(2.971f, 20.0f)
                close()
                moveTo(20.971f, 20.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -0.827f, 0.673f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(4.971f, 15.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _spaceStationMoonAlt!!
    }

private var _spaceStationMoonAlt: ImageVector? = null
