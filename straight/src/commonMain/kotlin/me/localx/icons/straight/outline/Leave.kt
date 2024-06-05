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

public val Icons.Outline.Leave: ImageVector
    get() {
        if (_leave != null) {
            return _leave!!
        }
        _leave = Builder(name = "Leave", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.473f, 16.247f)
                lineToRelative(-2.862f, 2.863f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(1.696f, -1.696f)
                horizontalLineToRelative(-6.892f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(6.956f)
                lineToRelative(-1.76f, -1.761f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(2.862f, 2.862f)
                curveToRelative(0.706f, 0.706f, 0.706f, 1.854f, 0.0f, 2.56f)
                close()
                moveTo(6.5f, 11.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(14.0f, 18.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.0f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 4.2f)
                curveTo(0.0f, 2.776f, 1.014f, 1.539f, 2.411f, 1.259f)
                lineTo(8.412f, 0.059f)
                curveToRelative(0.888f, -0.174f, 1.793f, 0.051f, 2.491f, 0.622f)
                curveToRelative(0.428f, 0.351f, 0.728f, 0.812f, 0.908f, 1.319f)
                horizontalLineToRelative(1.19f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(18.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(10.0f, 3.001f)
                curveToRelative(0.0f, -0.301f, -0.133f, -0.583f, -0.366f, -0.773f)
                curveToRelative(-0.232f, -0.19f, -0.537f, -0.265f, -0.83f, -0.208f)
                lineToRelative(-6.0f, 1.2f)
                curveToRelative(-0.466f, 0.094f, -0.804f, 0.506f, -0.804f, 0.98f)
                verticalLineToRelative(17.8f)
                horizontalLineToRelative(8.0f)
                lineTo(10.0f, 3.001f)
                close()
            }
        }
        .build()
        return _leave!!
    }

private var _leave: ImageVector? = null
