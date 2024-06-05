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
                lineTo(2.0f, 0.862f)
                lineToRelative(1.379f, 0.564f)
                curveToRelative(0.974f, 0.398f, 2.164f, 0.597f, 3.403f, 0.584f)
                curveToRelative(1.844f, -0.033f, 3.469f, -0.562f, 4.575f, -1.489f)
                lineTo(12.0f, -0.018f)
                lineToRelative(0.643f, 0.539f)
                curveToRelative(1.106f, 0.927f, 2.731f, 1.457f, 4.575f, 1.489f)
                curveToRelative(1.244f, 0.022f, 2.43f, -0.186f, 3.403f, -0.584f)
                lineToRelative(1.379f, -0.564f)
                verticalLineToRelative(7.143f)
                lineTo(2.0f, 8.005f)
                close()
                moveTo(2.0f, 10.005f)
                verticalLineToRelative(1.969f)
                curveToRelative(0.0f, 6.565f, 7.006f, 10.577f, 9.151f, 11.649f)
                lineToRelative(0.806f, 0.403f)
                lineToRelative(0.836f, -0.336f)
                curveToRelative(2.16f, -0.869f, 9.207f, -4.283f, 9.207f, -11.717f)
                verticalLineToRelative(-1.969f)
                lineTo(2.0f, 10.004f)
                close()
            }
        }
        .build()
        return _routeInterstate!!
    }

private var _routeInterstate: ImageVector? = null
