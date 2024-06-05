package me.localx.icons.rounded.bold

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

public val Icons.Bold.GpsNavigation: ImageVector
    get() {
        if (_gpsNavigation != null) {
            return _gpsNavigation!!
        }
        _gpsNavigation = Builder(name = "GpsNavigation", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 12.5f)
                curveToRelative(0.0f, 0.829f, -0.671f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-0.196f)
                curveToRelative(-0.843f, 4.352f, -4.382f, 7.743f, -8.804f, 8.38f)
                verticalLineToRelative(0.12f)
                curveToRelative(0.0f, 0.829f, -0.671f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.671f, -1.5f, -1.5f)
                verticalLineToRelative(-0.12f)
                curveToRelative(-4.421f, -0.637f, -7.96f, -4.028f, -8.804f, -8.38f)
                horizontalLineToRelative(-0.196f)
                curveToRelative(-0.829f, 0.0f, -1.5f, -0.671f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.671f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(0.051f)
                curveToRelative(0.185f, -1.973f, 0.916f, -3.831f, 2.147f, -5.419f)
                curveToRelative(0.508f, -0.655f, 1.451f, -0.773f, 2.105f, -0.266f)
                curveToRelative(0.654f, 0.508f, 0.773f, 1.45f, 0.266f, 2.105f)
                curveToRelative(-0.819f, 1.055f, -1.315f, 2.28f, -1.488f, 3.581f)
                horizontalLineToRelative(0.918f)
                curveToRelative(0.829f, 0.0f, 1.5f, 0.671f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.671f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-0.721f)
                curveToRelative(0.747f, 2.694f, 2.956f, 4.785f, 5.721f, 5.349f)
                verticalLineToRelative(-0.849f)
                curveToRelative(0.0f, -0.829f, 0.671f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.671f, 1.5f, 1.5f)
                verticalLineToRelative(0.849f)
                curveToRelative(2.765f, -0.563f, 4.974f, -2.655f, 5.721f, -5.349f)
                horizontalLineToRelative(-0.721f)
                curveToRelative(-0.829f, 0.0f, -1.5f, -0.671f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.671f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(0.918f)
                curveToRelative(-0.173f, -1.3f, -0.669f, -2.525f, -1.488f, -3.581f)
                curveToRelative(-0.507f, -0.655f, -0.388f, -1.597f, 0.266f, -2.105f)
                curveToRelative(0.654f, -0.507f, 1.597f, -0.389f, 2.105f, 0.266f)
                curveToRelative(1.232f, 1.588f, 1.962f, 3.446f, 2.147f, 5.419f)
                horizontalLineToRelative(0.051f)
                curveToRelative(0.829f, 0.0f, 1.5f, 0.671f, 1.5f, 1.5f)
                close()
                moveTo(9.047f, 8.871f)
                lineToRelative(2.953f, -1.342f)
                lineToRelative(2.953f, 1.342f)
                curveToRelative(1.264f, 0.574f, 2.493f, -0.88f, 1.794f, -2.123f)
                lineTo(13.441f, 0.868f)
                curveTo(13.118f, 0.291f, 12.56f, 0.003f, 12.0f, 0.0f)
                curveToRelative(-0.56f, 0.002f, -1.118f, 0.29f, -1.441f, 0.867f)
                lineToRelative(-3.305f, 5.879f)
                curveToRelative(-0.699f, 1.244f, 0.529f, 2.698f, 1.794f, 2.123f)
                close()
            }
        }
        .build()
        return _gpsNavigation!!
    }

private var _gpsNavigation: ImageVector? = null
