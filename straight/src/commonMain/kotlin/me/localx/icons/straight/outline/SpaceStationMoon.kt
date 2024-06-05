package me.localx.icons.straight.outline

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
                moveToRelative(12.0f, 2.0f)
                curveTo(5.383f, 2.0f, 0.0f, 7.383f, 0.0f, 14.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-8.0f)
                curveToRelative(0.0f, -6.617f, -5.383f, -12.0f, -12.0f, -12.0f)
                close()
                moveTo(12.0f, 4.0f)
                curveToRelative(2.791f, 0.0f, 5.318f, 1.15f, 7.134f, 3.0f)
                lineTo(4.866f, 7.0f)
                curveToRelative(1.816f, -1.85f, 4.343f, -3.0f, 7.134f, -3.0f)
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
                moveTo(2.0f, 14.0f)
                curveToRelative(0.0f, -1.82f, 0.489f, -3.528f, 1.343f, -5.0f)
                horizontalLineToRelative(2.538f)
                curveToRelative(-0.574f, 1.495f, -0.881f, 3.386f, -0.881f, 5.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(22.0f, 20.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0.0f, -2.114f, -0.307f, -4.005f, -0.881f, -5.5f)
                horizontalLineToRelative(2.538f)
                curveToRelative(0.853f, 1.472f, 1.343f, 3.18f, 1.343f, 5.0f)
                verticalLineToRelative(6.0f)
                close()
            }
        }
        .build()
        return _spaceStationMoon!!
    }

private var _spaceStationMoon: ImageVector? = null
