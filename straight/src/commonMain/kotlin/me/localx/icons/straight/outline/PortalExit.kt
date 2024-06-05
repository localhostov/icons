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

public val Icons.Outline.PortalExit: ImageVector
    get() {
        if (_portalExit != null) {
            return _portalExit!!
        }
        _portalExit = Builder(name = "PortalExit", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 11.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.565f)
                lineToRelative(-2.277f, -3.782f)
                lineToRelative(-1.952f, 4.737f)
                lineToRelative(-1.716f, -1.085f)
                lineToRelative(2.006f, -4.869f)
                horizontalLineToRelative(-1.88f)
                lineToRelative(-2.064f, 5.033f)
                curveToRelative(-0.185f, 0.449f, -0.02f, 0.964f, 0.392f, 1.225f)
                lineToRelative(5.047f, 3.191f)
                verticalLineToRelative(6.551f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-5.449f)
                lineToRelative(-4.117f, -2.604f)
                curveToRelative(-1.232f, -0.78f, -1.725f, -2.325f, -1.172f, -3.674f)
                lineToRelative(1.753f, -4.273f)
                horizontalLineToRelative(-1.836f)
                lineToRelative(-1.724f, 3.447f)
                lineToRelative(-1.789f, -0.895f)
                lineToRelative(2.276f, -4.553f)
                horizontalLineToRelative(7.478f)
                curveToRelative(1.046f, 0.0f, 2.031f, 0.557f, 2.57f, 1.453f)
                lineToRelative(2.135f, 3.547f)
                horizontalLineToRelative(2.435f)
                close()
                moveTo(18.0f, 5.0f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.119f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(9.825f, 16.801f)
                lineToRelative(-0.494f, 1.199f)
                lineTo(3.671f, 18.0f)
                curveToRelative(-0.193f, 1.568f, -0.442f, 2.706f, -0.671f, 3.393f)
                curveToRelative(-0.46f, -1.373f, -1.0f, -4.546f, -1.0f, -9.393f)
                reflectiveCurveToRelative(0.54f, -8.022f, 1.0f, -9.394f)
                curveToRelative(0.46f, 1.372f, 1.0f, 4.545f, 1.0f, 9.394f)
                curveToRelative(0.0f, 1.494f, -0.051f, 2.828f, -0.136f, 4.0f)
                horizontalLineToRelative(2.01f)
                curveToRelative(0.099f, -1.519f, 0.126f, -2.96f, 0.126f, -4.0f)
                curveToRelative(0.0f, -3.608f, -0.292f, -12.0f, -3.0f, -12.0f)
                reflectiveCurveTo(0.0f, 8.392f, 0.0f, 12.0f)
                reflectiveCurveToRelative(0.292f, 12.0f, 3.0f, 12.0f)
                curveToRelative(1.237f, 0.0f, 1.966f, -1.754f, 2.396f, -4.0f)
                horizontalLineToRelative(5.273f)
                lineToRelative(0.8f, -1.942f)
                lineToRelative(-0.665f, -0.421f)
                curveToRelative(-0.374f, -0.236f, -0.691f, -0.526f, -0.98f, -0.837f)
                close()
            }
        }
        .build()
        return _portalExit!!
    }

private var _portalExit: ImageVector? = null
