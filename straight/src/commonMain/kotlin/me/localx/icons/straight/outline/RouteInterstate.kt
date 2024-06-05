package me.localx.icons.straight.outline

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
                moveTo(20.621f, 1.427f)
                curveToRelative(-0.974f, 0.398f, -2.159f, 0.606f, -3.403f, 0.584f)
                curveToRelative(-1.844f, -0.033f, -3.469f, -0.562f, -4.575f, -1.489f)
                lineTo(12.0f, -0.018f)
                lineToRelative(-0.643f, 0.539f)
                curveToRelative(-1.106f, 0.927f, -2.731f, 1.457f, -4.575f, 1.489f)
                curveToRelative(-1.239f, 0.013f, -2.43f, -0.186f, -3.403f, -0.584f)
                lineToRelative(-1.379f, -0.564f)
                lineTo(2.0f, 11.974f)
                curveToRelative(0.0f, 6.565f, 7.006f, 10.577f, 9.151f, 11.649f)
                lineToRelative(0.806f, 0.403f)
                lineToRelative(0.836f, -0.336f)
                curveToRelative(2.16f, -0.869f, 9.207f, -4.283f, 9.207f, -11.717f)
                lineTo(22.0f, 0.862f)
                lineToRelative(-1.379f, 0.564f)
                close()
                moveTo(6.817f, 4.011f)
                curveToRelative(1.98f, -0.036f, 3.789f, -0.556f, 5.183f, -1.478f)
                curveToRelative(1.394f, 0.922f, 3.202f, 1.442f, 5.183f, 1.478f)
                curveToRelative(0.949f, 0.011f, 1.926f, -0.086f, 2.817f, -0.296f)
                verticalLineToRelative(4.291f)
                lineTo(4.0f, 8.006f)
                lineTo(4.0f, 3.714f)
                curveToRelative(0.892f, 0.21f, 1.871f, 0.309f, 2.817f, 0.296f)
                close()
                moveTo(12.046f, 21.836f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-1.888f, -0.944f, -8.047f, -4.443f, -8.047f, -9.861f)
                verticalLineToRelative(-1.969f)
                lineTo(20.0f, 10.006f)
                verticalLineToRelative(1.969f)
                curveToRelative(0.0f, 6.18f, -6.088f, 9.11f, -7.953f, 9.861f)
                close()
            }
        }
        .build()
        return _routeInterstate!!
    }

private var _routeInterstate: ImageVector? = null
