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

public val Icons.Filled.LimitSpeedometer: ImageVector
    get() {
        if (_limitSpeedometer != null) {
            return _limitSpeedometer!!
        }
        _limitSpeedometer = Builder(name = "LimitSpeedometer", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.654f, 13.773f)
                lineToRelative(-4.599f, 7.884f)
                curveToRelative(-0.606f, 1.039f, 0.143f, 2.343f, 1.346f, 2.343f)
                horizontalLineToRelative(9.197f)
                curveToRelative(1.203f, 0.0f, 1.952f, -1.304f, 1.346f, -2.343f)
                lineToRelative(-4.599f, -7.884f)
                curveToRelative(-0.601f, -1.031f, -2.091f, -1.031f, -2.692f, 0.0f)
                close()
                moveTo(17.0f, 23.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(16.0f, 19.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                close()
                moveTo(13.926f, 12.767f)
                curveToRelative(0.645f, -1.106f, 1.794f, -1.767f, 3.074f, -1.767f)
                reflectiveCurveToRelative(2.429f, 0.66f, 3.074f, 1.767f)
                lineToRelative(1.211f, 2.076f)
                curveToRelative(0.049f, -0.114f, 0.097f, -0.22f, 0.147f, -0.343f)
                curveToRelative(0.444f, -1.101f, 0.568f, -2.302f, 0.568f, -3.499f)
                curveToRelative(0.0f, -3.127f, -1.338f, -6.117f, -3.671f, -8.203f)
                curveTo(15.998f, 0.714f, 12.859f, -0.283f, 9.732f, 0.071f)
                curveTo(4.774f, 0.628f, 0.719f, 4.621f, 0.091f, 9.567f)
                curveToRelative(-0.437f, 3.445f, 0.717f, 6.812f, 3.168f, 9.239f)
                curveToRelative(0.525f, 0.519f, 1.219f, 0.783f, 1.92f, 0.783f)
                curveToRelative(0.65f, 0.0f, 1.306f, -0.227f, 1.839f, -0.688f)
                lineToRelative(1.593f, -1.484f)
                horizontalLineToRelative(2.603f)
                lineToRelative(2.712f, -4.65f)
                close()
                moveTo(9.0f, 11.0f)
                curveToRelative(0.0f, -0.178f, 0.031f, -0.347f, 0.074f, -0.512f)
                lineToRelative(-3.781f, -3.781f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.023f, 0.0f, -1.414f)
                reflectiveCurveToRelative(1.023f, -0.391f, 1.414f, 0.0f)
                lineToRelative(3.781f, 3.781f)
                curveToRelative(0.164f, -0.044f, 0.334f, -0.074f, 0.512f, -0.074f)
                curveToRelative(1.105f, 0.0f, 2.0f, 0.895f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.895f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.895f, -2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _limitSpeedometer!!
    }

private var _limitSpeedometer: ImageVector? = null
