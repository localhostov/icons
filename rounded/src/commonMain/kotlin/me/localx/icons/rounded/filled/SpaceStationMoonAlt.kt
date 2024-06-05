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
                moveToRelative(17.501f, 12.0f)
                curveToRelative(-0.425f, -1.189f, -1.086f, -2.261f, -1.931f, -3.156f)
                lineToRelative(1.532f, -1.532f)
                curveToRelative(1.267f, 0.986f, 2.835f, 1.597f, 4.543f, 1.673f)
                curveToRelative(0.105f, 0.036f, 0.212f, 0.066f, 0.329f, 0.066f)
                curveToRelative(0.566f, 0.0f, 1.026f, -0.459f, 1.026f, -1.026f)
                curveToRelative(0.0f, -0.557f, -0.446f, -1.006f, -1.0f, -1.02f)
                verticalLineToRelative(-0.005f)
                curveToRelative(-3.252f, 0.0f, -5.893f, -2.589f, -5.991f, -5.817f)
                curveToRelative(0.015f, -0.069f, 0.042f, -0.134f, 0.042f, -0.208f)
                curveToRelative(0.0f, -0.566f, -0.459f, -1.026f, -1.026f, -1.026f)
                reflectiveCurveToRelative(-1.026f, 0.459f, -1.026f, 1.026f)
                curveToRelative(0.0f, 0.009f, 0.005f, 0.017f, 0.005f, 0.026f)
                horizontalLineToRelative(-0.005f)
                curveToRelative(0.0f, 1.846f, 0.634f, 3.542f, 1.688f, 4.898f)
                lineToRelative(-1.652f, 1.652f)
                curveToRelative(-1.184f, -0.798f, -2.559f, -1.324f, -4.036f, -1.489f)
                verticalLineToRelative(-1.061f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(1.059f)
                curveTo(3.507f, 6.56f, 0.0f, 10.39f, 0.0f, 15.029f)
                verticalLineToRelative(3.471f)
                curveToRelative(0.0f, 2.485f, 2.015f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -3.314f, 2.686f, -6.0f, 6.0f, -6.0f)
                horizontalLineToRelative(1.501f)
                close()
                moveTo(5.0f, 19.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(24.0f, 18.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 2.209f, -1.791f, 4.0f, -4.0f, 4.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -2.209f, 1.791f, -4.0f, 4.0f, -4.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(2.209f, 0.0f, 4.0f, 1.791f, 4.0f, 4.0f)
                close()
            }
        }
        .build()
        return _spaceStationMoonAlt!!
    }

private var _spaceStationMoonAlt: ImageVector? = null
