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

public val Icons.Bold.RadarMonitoringTrack: ImageVector
    get() {
        if (_radarMonitoringTrack != null) {
            return _radarMonitoringTrack!!
        }
        _radarMonitoringTrack = Builder(name = "RadarMonitoringTrack", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 10.5f)
                horizontalLineToRelative(3.703f)
                curveToRelative(-0.595f, -1.463f, -2.028f, -2.5f, -3.703f, -2.5f)
                curveToRelative(-2.206f, 0.0f, -4.0f, 1.794f, -4.0f, 4.0f)
                reflectiveCurveToRelative(1.794f, 4.0f, 4.0f, 4.0f)
                horizontalLineToRelative(5.71f)
                curveToRelative(-0.872f, 1.237f, -2.135f, 2.178f, -3.613f, 2.646f)
                curveToRelative(-0.445f, -0.688f, -1.216f, -1.146f, -2.097f, -1.146f)
                reflectiveCurveToRelative(-1.652f, 0.458f, -2.097f, 1.146f)
                curveToRelative(-2.832f, -0.896f, -4.903f, -3.521f, -4.903f, -6.646f)
                curveToRelative(0.0f, -1.165f, 0.304f, -2.253f, 0.811f, -3.219f)
                curveToRelative(0.804f, 0.175f, 1.675f, -0.046f, 2.3f, -0.67f)
                reflectiveCurveToRelative(0.845f, -1.497f, 0.67f, -2.3f)
                curveToRelative(0.966f, -0.507f, 2.054f, -0.811f, 3.219f, -0.811f)
                curveToRelative(1.179f, 0.0f, 2.282f, 0.306f, 3.257f, 0.823f)
                curveToRelative(-0.039f, 0.175f, -0.062f, 0.355f, -0.062f, 0.541f)
                curveToRelative(0.0f, 1.381f, 1.119f, 2.5f, 2.5f, 2.5f)
                curveToRelative(0.173f, 0.0f, 0.342f, -0.018f, 0.505f, -0.051f)
                curveToRelative(0.274f, 0.531f, 0.503f, 1.088f, 0.634f, 1.687f)
                horizontalLineToRelative(2.03f)
                curveToRelative(-0.174f, -1.03f, -0.526f, -2.0f, -1.019f, -2.881f)
                curveToRelative(0.216f, -0.37f, 0.349f, -0.795f, 0.349f, -1.255f)
                curveToRelative(0.0f, -1.381f, -1.119f, -2.5f, -2.5f, -2.5f)
                curveToRelative(-0.448f, 0.0f, -0.862f, 0.127f, -1.226f, 0.333f)
                curveToRelative(-1.317f, -0.759f, -2.842f, -1.198f, -4.469f, -1.198f)
                curveToRelative(-1.607f, 0.0f, -3.103f, 0.445f, -4.41f, 1.187f)
                curveToRelative(-0.956f, -0.553f, -2.196f, -0.43f, -3.015f, 0.388f)
                reflectiveCurveToRelative(-0.941f, 2.058f, -0.388f, 3.015f)
                curveToRelative(-0.742f, 1.307f, -1.187f, 2.803f, -1.187f, 4.41f)
                curveToRelative(0.0f, 4.132f, 2.801f, 7.616f, 6.602f, 8.669f)
                curveToRelative(0.294f, 1.054f, 1.251f, 1.831f, 2.398f, 1.831f)
                reflectiveCurveToRelative(2.104f, -0.778f, 2.398f, -1.831f)
                curveToRelative(2.478f, -0.687f, 4.528f, -2.409f, 5.657f, -4.669f)
                horizontalLineToRelative(3.245f)
                curveToRelative(-1.653f, 4.653f, -6.087f, 8.0f, -11.3f, 8.0f)
                curveTo(5.383f, 24.0f, 0.0f, 18.617f, 0.0f, 12.0f)
                reflectiveCurveTo(5.383f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.383f, 12.0f, 12.0f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-12.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _radarMonitoringTrack!!
    }

private var _radarMonitoringTrack: ImageVector? = null
