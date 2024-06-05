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

public val Icons.Bold.SpaceStationMoon: ImageVector
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
                moveTo(17.65f, 7.0f)
                lineTo(6.35f, 7.0f)
                curveToRelative(1.546f, -1.25f, 3.512f, -2.0f, 5.65f, -2.0f)
                reflectiveCurveToRelative(4.104f, 0.75f, 5.65f, 2.0f)
                close()
                moveTo(16.0f, 15.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.105f, -0.895f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.895f, -2.0f, 2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -1.978f, 0.323f, -3.776f, 0.882f, -5.0f)
                horizontalLineToRelative(6.236f)
                curveToRelative(0.559f, 1.224f, 0.882f, 3.022f, 0.882f, 5.0f)
                close()
                moveTo(3.0f, 14.0f)
                curveToRelative(0.0f, -1.436f, 0.339f, -2.794f, 0.939f, -4.0f)
                horizontalLineToRelative(1.741f)
                curveToRelative(-0.445f, 1.43f, -0.68f, 3.133f, -0.68f, 5.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(21.0f, 19.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -1.867f, -0.236f, -3.57f, -0.68f, -5.0f)
                horizontalLineToRelative(1.741f)
                curveToRelative(0.601f, 1.206f, 0.939f, 2.564f, 0.939f, 4.0f)
                verticalLineToRelative(5.0f)
                close()
            }
        }
        .build()
        return _spaceStationMoon!!
    }

private var _spaceStationMoon: ImageVector? = null
