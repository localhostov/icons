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

public val Icons.Filled.FluxCapacitor: ImageVector
    get() {
        if (_fluxCapacitor != null) {
            return _fluxCapacitor!!
        }
        _fluxCapacitor = Builder(name = "FluxCapacitor", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 0.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.346f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                verticalLineToRelative(21.0f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(4.183f, 10.332f)
                curveToRelative(-1.56f, -1.56f, -1.56f, -4.097f, 0.0f, -5.657f)
                reflectiveCurveToRelative(4.097f, -1.56f, 5.657f, 0.0f)
                curveToRelative(0.94f, 0.94f, 1.303f, 2.235f, 1.11f, 3.458f)
                curveToRelative(-1.215f, -0.945f, -2.248f, -1.768f, -2.524f, -2.043f)
                curveToRelative(-0.78f, -0.78f, -2.048f, -0.78f, -2.828f, 0.0f)
                curveToRelative(-0.78f, 0.78f, -0.78f, 2.049f, 0.0f, 2.828f)
                curveToRelative(0.295f, 0.295f, 1.503f, 1.241f, 2.889f, 2.301f)
                curveToRelative(-1.438f, 0.569f, -3.142f, 0.275f, -4.304f, -0.886f)
                close()
                moveTo(6.696f, 8.603f)
                lineToRelative(1.213f, -1.591f)
                lineToRelative(4.091f, 3.23f)
                lineToRelative(4.091f, -3.235f)
                lineToRelative(1.213f, 1.591f)
                lineToRelative(-4.304f, 3.397f)
                verticalLineToRelative(5.004f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-5.005f)
                lineToRelative(-4.304f, -3.391f)
                close()
                moveTo(12.0f, 20.999f)
                curveToRelative(-2.206f, 0.0f, -4.0f, -1.794f, -4.0f, -4.0f)
                curveToRelative(0.0f, -1.474f, 0.81f, -2.75f, 2.0f, -3.444f)
                verticalLineToRelative(3.444f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.897f, 2.0f, -2.0f)
                verticalLineToRelative(-3.444f)
                curveToRelative(1.19f, 0.694f, 2.0f, 1.97f, 2.0f, 3.444f)
                curveToRelative(0.0f, 2.206f, -1.794f, 4.0f, -4.0f, 4.0f)
                close()
                moveTo(19.83f, 10.326f)
                curveToRelative(-1.162f, 1.162f, -2.865f, 1.455f, -4.304f, 0.886f)
                curveToRelative(1.386f, -1.06f, 2.594f, -2.005f, 2.889f, -2.301f)
                curveToRelative(0.78f, -0.78f, 0.78f, -2.048f, 0.0f, -2.828f)
                curveToRelative(-0.78f, -0.78f, -2.049f, -0.78f, -2.828f, 0.0f)
                curveToRelative(-0.276f, 0.276f, -1.309f, 1.098f, -2.524f, 2.043f)
                curveToRelative(-0.194f, -1.223f, 0.169f, -2.517f, 1.11f, -3.458f)
                curveToRelative(1.56f, -1.56f, 4.097f, -1.56f, 5.657f, 0.0f)
                reflectiveCurveToRelative(1.56f, 4.097f, 0.0f, 5.657f)
                close()
            }
        }
        .build()
        return _fluxCapacitor!!
    }

private var _fluxCapacitor: ImageVector? = null
