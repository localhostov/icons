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

public val Icons.Filled.Tents: ImageVector
    get() {
        if (_tents != null) {
            return _tents!!
        }
        _tents = Builder(name = "Tents", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.6f, 10.936f)
                curveToRelative(-0.022f, -0.048f, -5.819f, -8.625f, -5.819f, -8.625f)
                curveToRelative(-1.11f, -1.554f, -2.347f, -2.31f, -3.782f, -2.31f)
                curveToRelative(-1.671f, 0.0f, -2.523f, 0.847f, -3.728f, 2.241f)
                curveToRelative(-0.023f, 0.029f, -1.197f, 1.759f, -1.197f, 1.759f)
                curveToRelative(0.0f, 0.0f, -0.575f, 1.0f, 0.923f, 1.0f)
                curveToRelative(2.098f, 0.0f, 3.918f, 1.059f, 5.409f, 3.148f)
                curveToRelative(0.0f, 0.0f, 3.938f, 5.822f, 5.328f, 7.878f)
                curveToRelative(0.287f, 0.424f, 0.864f, 0.578f, 1.295f, 0.302f)
                curveToRelative(0.513f, -0.329f, 0.957f, -0.769f, 1.298f, -1.303f)
                curveToRelative(0.787f, -1.233f, 0.889f, -2.763f, 0.271f, -4.09f)
                close()
                moveTo(10.499f, 19.357f)
                lineToRelative(2.516f, 4.644f)
                horizontalLineToRelative(-6.034f)
                lineToRelative(2.542f, -4.698f)
                curveToRelative(0.126f, -0.272f, 0.374f, -0.302f, 0.474f, -0.302f)
                reflectiveCurveToRelative(0.348f, 0.029f, 0.501f, 0.356f)
                close()
                moveTo(19.326f, 22.026f)
                curveToRelative(-0.789f, 1.236f, -2.135f, 1.975f, -3.603f, 1.975f)
                horizontalLineToRelative(-0.432f)
                lineToRelative(-3.005f, -5.542f)
                curveToRelative(-0.418f, -0.899f, -1.295f, -1.458f, -2.288f, -1.458f)
                reflectiveCurveToRelative(-1.87f, 0.559f, -2.26f, 1.403f)
                lineToRelative(-3.031f, 5.597f)
                horizontalLineToRelative(-0.432f)
                curveToRelative(-1.468f, 0.0f, -2.814f, -0.738f, -3.603f, -1.975f)
                curveToRelative(-0.787f, -1.233f, -0.889f, -2.763f, -0.271f, -4.09f)
                curveToRelative(0.022f, -0.048f, 5.847f, -8.668f, 5.873f, -8.698f)
                curveToRelative(1.203f, -1.392f, 2.054f, -2.237f, 3.724f, -2.237f)
                curveToRelative(1.435f, 0.0f, 2.672f, 0.756f, 3.782f, 2.31f)
                curveToRelative(0.0f, 0.0f, 5.796f, 8.578f, 5.819f, 8.625f)
                curveToRelative(0.617f, 1.327f, 0.516f, 2.856f, -0.271f, 4.09f)
                close()
            }
        }
        .build()
        return _tents!!
    }

private var _tents: ImageVector? = null
