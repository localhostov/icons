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

public val Icons.Bold.PortalExit: ImageVector
    get() {
        if (_portalExit != null) {
            return _portalExit!!
        }
        _portalExit = Builder(name = "PortalExit", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.0f, 2.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(19.319f, 13.0f)
                horizontalLineToRelative(4.681f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.319f)
                lineToRelative(-2.455f, -2.806f)
                curveToRelative(-0.665f, -0.759f, -1.625f, -1.194f, -2.634f, -1.194f)
                horizontalLineToRelative(-6.567f)
                lineToRelative(-2.396f, 5.391f)
                lineToRelative(2.741f, 1.219f)
                lineToRelative(1.604f, -3.609f)
                horizontalLineToRelative(1.529f)
                lineToRelative(-1.265f, 3.084f)
                curveToRelative(-0.646f, 1.573f, -0.07f, 3.375f, 1.428f, 4.322f)
                lineToRelative(4.333f, 2.466f)
                verticalLineToRelative(5.128f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-6.872f)
                lineToRelative(-4.439f, -2.525f)
                lineToRelative(1.668f, -3.992f)
                lineToRelative(2.09f, 2.389f)
                close()
                moveTo(10.392f, 17.028f)
                lineToRelative(-0.401f, 0.972f)
                horizontalLineToRelative(-5.991f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.826f)
                curveToRelative(0.111f, -1.253f, 0.174f, -2.595f, 0.174f, -4.0f)
                curveTo(6.0f, 5.373f, 4.657f, 0.0f, 3.0f, 0.0f)
                reflectiveCurveTo(0.0f, 5.373f, 0.0f, 12.0f)
                reflectiveCurveToRelative(1.343f, 12.0f, 3.0f, 12.0f)
                curveToRelative(0.769f, 0.0f, 1.47f, -1.161f, 2.0f, -3.067f)
                verticalLineToRelative(0.067f)
                horizontalLineToRelative(7.0f)
                lineToRelative(0.892f, -2.164f)
                lineToRelative(-1.215f, -0.692f)
                curveToRelative(-0.499f, -0.314f, -0.918f, -0.698f, -1.285f, -1.116f)
                close()
            }
        }
        .build()
        return _portalExit!!
    }

private var _portalExit: ImageVector? = null
