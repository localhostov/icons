package me.localx.icons.rounded.outline

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

public val Icons.Outline.RouteInterstate: ImageVector
    get() {
        if (_routeInterstate != null) {
            return _routeInterstate!!
        }
        _routeInterstate = Builder(name = "RouteInterstate", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.55f, 2.0f)
                lineToRelative(-1.35f, 0.011f)
                curveToRelative(-1.309f, 0.0f, -1.918f, -0.431f, -2.69f, -0.977f)
                curveToRelative(-0.319f, -0.226f, -0.639f, -0.449f, -0.995f, -0.646f)
                curveTo(13.039f, 0.127f, 12.519f, 0.0f, 12.0f, 0.003f)
                curveToRelative(-0.519f, -0.003f, -1.039f, 0.125f, -1.515f, 0.385f)
                curveToRelative(-0.356f, 0.196f, -0.676f, 0.42f, -0.995f, 0.646f)
                curveToRelative(-0.772f, 0.546f, -1.382f, 0.977f, -2.69f, 0.977f)
                lineToRelative(-1.35f, -0.011f)
                curveToRelative(-1.999f, 0.0f, -3.45f, 1.354f, -3.45f, 3.22f)
                verticalLineToRelative(7.178f)
                curveToRelative(0.0f, 5.5f, 5.033f, 9.286f, 7.947f, 11.001f)
                curveToRelative(0.491f, 0.295f, 1.0f, 0.601f, 2.053f, 0.601f)
                curveToRelative(1.053f, 0.0f, 1.562f, -0.306f, 2.053f, -0.601f)
                curveToRelative(2.914f, -1.715f, 7.947f, -5.5f, 7.947f, -11.001f)
                lineTo(22.0f, 5.22f)
                curveToRelative(0.0f, -1.866f, -1.451f, -3.22f, -3.45f, -3.22f)
                close()
                moveTo(20.0f, 12.397f)
                curveToRelative(0.0f, 4.506f, -4.434f, 7.789f, -6.979f, 9.287f)
                curveToRelative(-0.38f, 0.229f, -0.523f, 0.315f, -1.021f, 0.315f)
                curveToRelative(-0.498f, 0.0f, -0.641f, -0.086f, -1.021f, -0.315f)
                curveToRelative(-2.545f, -1.498f, -6.979f, -4.781f, -6.979f, -9.287f)
                verticalLineToRelative(-2.393f)
                lineTo(20.0f, 10.004f)
                verticalLineToRelative(2.393f)
                close()
                moveTo(20.0f, 8.004f)
                lineTo(4.0f, 8.004f)
                verticalLineToRelative(-2.785f)
                curveToRelative(0.0f, -1.132f, 1.11f, -1.22f, 1.45f, -1.22f)
                lineToRelative(1.35f, 0.011f)
                curveToRelative(1.944f, 0.0f, 2.998f, -0.745f, 3.845f, -1.344f)
                curveToRelative(0.259f, -0.183f, 0.517f, -0.368f, 0.806f, -0.527f)
                curveToRelative(0.174f, -0.096f, 0.362f, -0.141f, 0.55f, -0.138f)
                curveToRelative(0.188f, -0.003f, 0.376f, 0.042f, 0.55f, 0.138f)
                curveToRelative(0.289f, 0.159f, 0.547f, 0.344f, 0.806f, 0.527f)
                curveToRelative(0.847f, 0.599f, 1.9f, 1.344f, 3.845f, 1.344f)
                lineToRelative(1.35f, -0.011f)
                curveToRelative(0.34f, 0.0f, 1.45f, 0.088f, 1.45f, 1.22f)
                verticalLineToRelative(2.785f)
                close()
            }
        }
        .build()
        return _routeInterstate!!
    }

private var _routeInterstate: ImageVector? = null
