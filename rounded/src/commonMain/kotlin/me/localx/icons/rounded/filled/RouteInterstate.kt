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

public val Icons.Filled.RouteInterstate: ImageVector
    get() {
        if (_routeInterstate != null) {
            return _routeInterstate!!
        }
        _routeInterstate = Builder(name = "RouteInterstate", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 8.005f)
                verticalLineToRelative(-2.785f)
                curveToRelative(0.0f, -1.866f, 1.451f, -3.22f, 3.45f, -3.22f)
                lineToRelative(1.35f, 0.011f)
                curveToRelative(1.309f, 0.0f, 1.918f, -0.431f, 2.69f, -0.977f)
                curveToRelative(0.319f, -0.226f, 0.639f, -0.449f, 0.995f, -0.646f)
                curveToRelative(0.941f, -0.517f, 2.06f, -0.516f, 2.997f, 0.0f)
                curveToRelative(0.351f, 0.193f, 0.667f, 0.412f, 0.983f, 0.633f)
                curveToRelative(0.79f, 0.553f, 1.415f, 0.989f, 2.734f, 0.989f)
                lineToRelative(1.35f, -0.011f)
                curveToRelative(1.999f, 0.0f, 3.45f, 1.354f, 3.45f, 3.22f)
                verticalLineToRelative(2.785f)
                lineTo(2.0f, 8.004f)
                close()
                moveTo(2.0f, 10.005f)
                verticalLineToRelative(2.393f)
                curveToRelative(0.0f, 5.5f, 4.887f, 9.198f, 7.801f, 10.913f)
                lineToRelative(0.146f, 0.088f)
                curveToRelative(0.491f, 0.295f, 1.0f, 0.602f, 2.055f, 0.602f)
                curveToRelative(1.104f, 0.0f, 1.753f, -0.292f, 2.429f, -0.645f)
                curveToRelative(2.827f, -1.479f, 7.569f, -4.87f, 7.569f, -10.958f)
                verticalLineToRelative(-2.393f)
                lineTo(2.0f, 10.005f)
                close()
            }
        }
        .build()
        return _routeInterstate!!
    }

private var _routeInterstate: ImageVector? = null
