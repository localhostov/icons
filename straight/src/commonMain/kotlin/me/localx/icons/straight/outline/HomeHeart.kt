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

public val Icons.Outline.HomeHeart: ImageVector
    get() {
        if (_homeHeart != null) {
            return _homeHeart!!
        }
        _homeHeart = Builder(name = "HomeHeart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.813f, 7.635f)
                lineTo(13.908f, 0.659f)
                curveToRelative(-1.123f, -0.881f, -2.693f, -0.881f, -3.816f, 0.0f)
                lineTo(1.187f, 7.635f)
                curveToRelative(-0.754f, 0.592f, -1.187f, 1.48f, -1.187f, 2.439f)
                verticalLineToRelative(13.926f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-13.926f)
                curveToRelative(0.0f, -0.958f, -0.433f, -1.847f, -1.187f, -2.439f)
                close()
                moveTo(22.0f, 22.0f)
                lineTo(2.0f, 22.0f)
                verticalLineToRelative(-11.926f)
                curveToRelative(0.0f, -0.335f, 0.157f, -0.658f, 0.42f, -0.865f)
                lineTo(11.326f, 2.233f)
                curveToRelative(0.396f, -0.311f, 0.95f, -0.312f, 1.348f, 0.0f)
                lineToRelative(8.905f, 6.977f)
                curveToRelative(0.264f, 0.207f, 0.421f, 0.53f, 0.421f, 0.865f)
                verticalLineToRelative(11.926f)
                close()
                moveTo(14.23f, 9.0f)
                curveToRelative(-0.89f, 0.0f, -1.675f, 0.318f, -2.25f, 0.852f)
                curveToRelative(-0.575f, -0.533f, -1.36f, -0.852f, -2.25f, -0.852f)
                curveToRelative(-1.792f, 0.0f, -3.25f, 1.539f, -3.25f, 3.43f)
                curveToRelative(0.0f, 2.982f, 4.425f, 6.141f, 4.93f, 6.491f)
                lineToRelative(0.57f, 0.396f)
                lineToRelative(0.57f, -0.396f)
                curveToRelative(0.505f, -0.35f, 4.93f, -3.509f, 4.93f, -6.491f)
                curveToRelative(0.0f, -1.892f, -1.458f, -3.43f, -3.25f, -3.43f)
                close()
                moveTo(11.981f, 16.858f)
                curveToRelative(-1.414f, -1.1f, -3.501f, -3.096f, -3.501f, -4.428f)
                curveToRelative(0.0f, -0.789f, 0.561f, -1.43f, 1.25f, -1.43f)
                curveToRelative(0.576f, 0.0f, 1.25f, 0.316f, 1.25f, 1.209f)
                horizontalLineToRelative(0.02f)
                verticalLineToRelative(0.791f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-0.005f)
                curveToRelative(0.096f, -0.689f, 0.668f, -1.0f, 1.236f, -1.0f)
                curveToRelative(0.689f, 0.0f, 1.25f, 0.642f, 1.25f, 1.43f)
                curveToRelative(0.0f, 1.239f, -1.891f, 3.186f, -3.499f, 4.428f)
                close()
            }
        }
        .build()
        return _homeHeart!!
    }

private var _homeHeart: ImageVector? = null
