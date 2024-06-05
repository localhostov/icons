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
                moveToRelative(18.0f, 22.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -1.105f, -0.895f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.895f, -2.0f, 2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-7.5f)
                curveToRelative(0.0f, -2.239f, 0.389f, -4.201f, 1.073f, -5.5f)
                horizontalLineToRelative(9.853f)
                curveToRelative(0.685f, 1.299f, 1.073f, 3.261f, 1.073f, 5.5f)
                verticalLineToRelative(7.5f)
                close()
                moveTo(21.727f, 7.0f)
                curveToRelative(-2.181f, -3.022f, -5.723f, -5.0f, -9.727f, -5.0f)
                reflectiveCurveTo(4.454f, 3.978f, 2.273f, 7.0f)
                horizontalLineToRelative(19.454f)
                close()
                moveTo(4.0f, 14.5f)
                curveToRelative(0.0f, -2.117f, 0.312f, -4.004f, 0.888f, -5.5f)
                lineTo(1.105f, 9.0f)
                curveToRelative(-0.703f, 1.524f, -1.105f, 3.214f, -1.105f, 5.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-7.5f)
                close()
                moveTo(19.112f, 9.0f)
                curveToRelative(0.575f, 1.496f, 0.888f, 3.383f, 0.888f, 5.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-8.0f)
                curveToRelative(0.0f, -1.786f, -0.403f, -3.476f, -1.105f, -5.0f)
                horizontalLineToRelative(-3.782f)
                close()
            }
        }
        .build()
        return _spaceStationMoon!!
    }

private var _spaceStationMoon: ImageVector? = null
