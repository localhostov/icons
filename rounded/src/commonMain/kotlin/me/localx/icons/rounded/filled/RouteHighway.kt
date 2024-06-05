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

public val Icons.Filled.RouteHighway: ImageVector
    get() {
        if (_routeHighway != null) {
            return _routeHighway!!
        }
        _routeHighway = Builder(name = "RouteHighway", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.664f, 7.406f)
                curveToRelative(-0.625f, -0.842f, -0.822f, -1.918f, -0.54f, -2.952f)
                curveToRelative(0.457f, -1.668f, 2.31f, -2.417f, 3.84f, -2.417f)
                curveToRelative(0.434f, 0.0f, 1.072f, -0.012f, 1.604f, -0.022f)
                lineToRelative(0.414f, -0.008f)
                curveToRelative(0.601f, -0.011f, 1.06f, -0.413f, 1.591f, -0.879f)
                curveToRelative(0.252f, -0.221f, 0.496f, -0.431f, 0.743f, -0.601f)
                curveToRelative(1.022f, -0.702f, 2.343f, -0.704f, 3.365f, -0.002f)
                curveToRelative(0.247f, 0.169f, 0.491f, 0.379f, 0.744f, 0.6f)
                curveToRelative(0.531f, 0.465f, 0.991f, 0.866f, 1.592f, 0.876f)
                curveToRelative(0.23f, -0.014f, 0.46f, 0.004f, 0.717f, 0.009f)
                curveToRelative(0.329f, 0.006f, 0.713f, 0.014f, 1.289f, 0.014f)
                curveToRelative(1.967f, 0.0f, 3.442f, 0.926f, 3.852f, 2.417f)
                curveToRelative(0.284f, 1.039f, 0.087f, 2.123f, -0.543f, 2.974f)
                curveToRelative(0.0f, 0.0f, -0.343f, 0.46f, -0.437f, 0.59f)
                lineToRelative(-17.788f, -0.003f)
                curveToRelative(-0.099f, -0.136f, -0.443f, -0.595f, -0.443f, -0.595f)
                close()
                moveTo(20.0f, 10.004f)
                lineToRelative(-16.0f, -0.003f)
                curveToRelative(0.0f, 0.764f, -0.435f, 1.632f, -0.895f, 2.552f)
                curveToRelative(-0.543f, 1.087f, -1.105f, 2.211f, -1.105f, 3.447f)
                curveToRelative(0.0f, 4.843f, 5.116f, 6.605f, 7.864f, 7.552f)
                curveToRelative(0.287f, 0.099f, 0.553f, 0.19f, 0.791f, 0.278f)
                curveToRelative(0.432f, 0.158f, 1.139f, 0.17f, 1.345f, 0.17f)
                curveToRelative(0.146f, 0.0f, 0.9f, -0.008f, 1.356f, -0.174f)
                curveToRelative(0.233f, -0.085f, 0.494f, -0.175f, 0.774f, -0.271f)
                curveToRelative(2.75f, -0.947f, 7.869f, -2.709f, 7.869f, -7.554f)
                curveToRelative(0.0f, -1.236f, -0.563f, -2.36f, -1.105f, -3.447f)
                curveToRelative(-0.459f, -0.918f, -0.893f, -1.786f, -0.894f, -2.549f)
                close()
            }
        }
        .build()
        return _routeHighway!!
    }

private var _routeHighway: ImageVector? = null
