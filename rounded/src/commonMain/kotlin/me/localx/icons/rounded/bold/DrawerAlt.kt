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

public val Icons.Bold.DrawerAlt: ImageVector
    get() {
        if (_drawerAlt != null) {
            return _drawerAlt!!
        }
        _drawerAlt = Builder(name = "DrawerAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.775f, 4.27f)
                lineTo(1.723f, 17.327f)
                curveToRelative(-0.372f, -0.102f, -0.728f, -0.286f, -1.024f, -0.578f)
                curveToRelative(-0.855f, -0.842f, -0.935f, -2.194f, -0.186f, -3.131f)
                lineToRelative(3.93f, -4.822f)
                curveToRelative(0.695f, -0.852f, 1.58f, -1.529f, 2.585f, -1.975f)
                lineToRelative(5.747f, -2.552f)
                close()
                moveTo(22.037f, 9.552f)
                curveToRelative(0.938f, 0.38f, 1.963f, -0.311f, 1.963f, -1.323f)
                curveToRelative(0.0f, -0.586f, -0.358f, -1.112f, -0.902f, -1.327f)
                lineToRelative(-1.242f, -0.491f)
                curveToRelative(-0.148f, 0.234f, -0.317f, 0.456f, -0.513f, 0.661f)
                lineToRelative(-1.387f, 1.639f)
                lineToRelative(2.081f, 0.843f)
                close()
                moveTo(22.5f, 18.001f)
                horizontalLineToRelative(-0.024f)
                curveToRelative(-0.905f, 0.0f, -1.714f, -0.104f, -2.698f, -0.348f)
                lineToRelative(-0.902f, -0.224f)
                curveToRelative(-1.169f, -0.289f, -2.378f, -0.399f, -3.577f, -0.434f)
                lineToRelative(-4.299f, 0.004f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(5.5f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.671f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-1.951f)
                lineToRelative(5.311f, -6.275f)
                curveToRelative(0.852f, -0.852f, 0.852f, -2.234f, 0.0f, -3.086f)
                reflectiveCurveToRelative(-2.234f, -0.852f, -3.086f, 0.0f)
                lineTo(3.947f, 17.796f)
                curveToRelative(-0.611f, 0.722f, -0.947f, 1.638f, -0.947f, 2.584f)
                verticalLineToRelative(1.12f)
                curveToRelative(0.0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(0.731f)
                curveToRelative(1.176f, 0.0f, 2.293f, -0.518f, 3.053f, -1.416f)
                lineToRelative(1.257f, -1.485f)
                curveToRelative(0.719f, 0.561f, 1.626f, 0.901f, 2.596f, 0.901f)
                horizontalLineToRelative(0.007f)
                lineToRelative(4.159f, -0.005f)
                horizontalLineToRelative(0.022f)
                curveToRelative(0.954f, 0.0f, 1.905f, 0.116f, 2.831f, 0.346f)
                lineToRelative(0.902f, 0.224f)
                curveToRelative(1.218f, 0.301f, 2.274f, 0.436f, 3.419f, 0.436f)
                horizontalLineToRelative(0.027f)
                curveToRelative(0.828f, -0.002f, 1.499f, -0.674f, 1.497f, -1.503f)
                curveToRelative(-0.001f, -0.827f, -0.673f, -1.497f, -1.5f, -1.497f)
                close()
            }
        }
        .build()
        return _drawerAlt!!
    }

private var _drawerAlt: ImageVector? = null
