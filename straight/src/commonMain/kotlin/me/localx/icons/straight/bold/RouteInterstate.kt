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

public val Icons.Bold.RouteInterstate: ImageVector
    get() {
        if (_routeInterstate != null) {
            return _routeInterstate!!
        }
        _routeInterstate = Builder(name = "RouteInterstate", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.932f, 1.612f)
                curveToRelative(-0.712f, 0.292f, -1.599f, 0.415f, -2.905f, 0.388f)
                curveToRelative(-1.873f, -0.033f, -3.239f, -0.4f, -4.062f, -1.09f)
                lineToRelative(-0.964f, -0.808f)
                lineToRelative(-0.964f, 0.808f)
                curveToRelative(-0.838f, 0.703f, -2.298f, 1.107f, -4.112f, 1.14f)
                curveToRelative(-1.181f, 0.01f, -2.076f, -0.118f, -2.855f, -0.438f)
                lineTo(2.0f, 0.765f)
                lineTo(2.0f, 12.0f)
                curveToRelative(0.0f, 6.518f, 6.852f, 10.45f, 8.951f, 11.5f)
                lineToRelative(0.984f, 0.492f)
                lineToRelative(1.021f, -0.411f)
                curveToRelative(2.122f, -0.853f, 9.044f, -4.21f, 9.044f, -11.581f)
                lineTo(22.0f, 0.765f)
                lineToRelative(-2.068f, 0.847f)
                close()
                moveTo(6.978f, 5.049f)
                curveToRelative(1.462f, -0.026f, 3.405f, -0.267f, 5.021f, -1.176f)
                curveToRelative(1.278f, 0.72f, 2.919f, 1.091f, 4.975f, 1.127f)
                curveToRelative(0.752f, 0.015f, 1.422f, -0.015f, 2.026f, -0.09f)
                verticalLineToRelative(3.09f)
                lineTo(5.0f, 8.0f)
                verticalLineToRelative(-3.06f)
                curveToRelative(0.608f, 0.086f, 1.263f, 0.12f, 1.978f, 0.109f)
                close()
                moveTo(12.069f, 20.702f)
                curveToRelative(-1.927f, -0.998f, -7.068f, -4.098f, -7.068f, -8.702f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 5.259f, -5.031f, 7.896f, -6.932f, 8.702f)
                close()
            }
        }
        .build()
        return _routeInterstate!!
    }

private var _routeInterstate: ImageVector? = null
