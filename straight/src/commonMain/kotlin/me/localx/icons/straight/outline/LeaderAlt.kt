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

public val Icons.Outline.LeaderAlt: ImageVector
    get() {
        if (_leaderAlt != null) {
            return _leaderAlt!!
        }
        _leaderAlt = Builder(name = "LeaderAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 3.668f)
                verticalLineToRelative(0.647f)
                lineToRelative(-2.837f, 0.841f)
                lineToRelative(-0.831f, 2.844f)
                horizontalLineToRelative(-0.647f)
                lineToRelative(-0.842f, -2.843f)
                lineToRelative(-2.843f, -0.842f)
                verticalLineToRelative(-0.647f)
                lineToRelative(2.844f, -0.831f)
                lineToRelative(0.841f, -2.837f)
                horizontalLineToRelative(0.647f)
                lineToRelative(0.829f, 2.839f)
                lineToRelative(2.839f, 0.829f)
                close()
                moveTo(4.5f, 5.0f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveTo(5.881f, 0.0f, 4.5f, 0.0f)
                reflectiveCurveToRelative(-2.5f, 1.119f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(12.0f, 15.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(5.0f)
                lineTo(2.0f, 15.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -0.551f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(5.283f)
                lineToRelative(6.741f, -4.148f)
                lineToRelative(-1.049f, -1.703f)
                lineToRelative(-6.259f, 3.852f)
                lineTo(3.0f, 6.001f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(3.051f)
                curveToRelative(-1.14f, 0.232f, -2.0f, 1.242f, -2.0f, 2.449f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -0.276f, 0.225f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(13.5f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-12.0f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(11.0f, 11.559f)
                lineToRelative(6.455f, -4.044f)
                lineToRelative(-0.222f, -0.749f)
                lineToRelative(-1.591f, -0.471f)
                lineToRelative(-4.642f, 2.916f)
                verticalLineToRelative(2.349f)
                close()
            }
        }
        .build()
        return _leaderAlt!!
    }

private var _leaderAlt: ImageVector? = null
