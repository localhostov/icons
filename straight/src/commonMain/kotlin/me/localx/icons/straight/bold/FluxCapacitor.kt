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

public val Icons.Bold.FluxCapacitor: ImageVector
    get() {
        if (_fluxCapacitor != null) {
            return _fluxCapacitor!!
        }
        _fluxCapacitor = Builder(name = "FluxCapacitor", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.5f, 15.5f)
                curveToRelative(0.0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.567f, -3.5f, -3.5f)
                curveToRelative(0.0f, -1.394f, 0.821f, -2.587f, 2.0f, -3.15f)
                verticalLineToRelative(3.65f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.65f)
                curveToRelative(1.179f, 0.563f, 2.0f, 1.756f, 2.0f, 3.15f)
                close()
                moveTo(6.699f, 9.41f)
                lineToRelative(1.801f, -2.4f)
                lineToRelative(2.93f, 2.188f)
                curveToRelative(0.046f, -0.225f, 0.07f, -0.458f, 0.07f, -0.697f)
                curveToRelative(0.0f, -1.933f, -1.567f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.567f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.567f, 3.5f, 3.5f, 3.5f)
                curveToRelative(0.586f, 0.0f, 1.131f, -0.158f, 1.616f, -0.413f)
                lineToRelative(-2.917f, -2.178f)
                close()
                moveTo(16.0f, 5.0f)
                curveToRelative(-1.933f, 0.0f, -3.493f, 1.567f, -3.5f, 3.5f)
                curveToRelative(0.0f, 0.241f, 0.024f, 0.474f, 0.066f, 0.7f)
                lineToRelative(2.812f, -2.165f)
                lineToRelative(1.801f, 2.4f)
                lineToRelative(-2.827f, 2.175f)
                curveToRelative(0.493f, 0.257f, 1.048f, 0.408f, 1.647f, 0.389f)
                curveToRelative(1.932f, -0.059f, 3.5f, -1.567f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.567f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(24.0f, 3.5f)
                verticalLineToRelative(20.5f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 3.5f)
                curveTo(0.0f, 1.57f, 1.57f, 0.0f, 3.5f, 0.0f)
                horizontalLineToRelative(17.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(21.0f, 3.5f)
                curveToRelative(0.0f, -0.276f, -0.225f, -0.5f, -0.5f, -0.5f)
                lineTo(3.5f, 3.0f)
                curveToRelative(-0.275f, 0.0f, -0.5f, 0.224f, -0.5f, 0.5f)
                verticalLineToRelative(17.5f)
                horizontalLineToRelative(18.0f)
                lineTo(21.0f, 3.5f)
                close()
            }
        }
        .build()
        return _fluxCapacitor!!
    }

private var _fluxCapacitor: ImageVector? = null
