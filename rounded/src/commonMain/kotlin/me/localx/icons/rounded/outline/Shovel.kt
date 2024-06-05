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

public val Icons.Outline.Shovel: ImageVector
    get() {
        if (_shovel != null) {
            return _shovel!!
        }
        _shovel = Builder(name = "Shovel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.707f, 5.793f)
                lineTo(18.207f, 0.293f)
                curveToRelative(-0.391f, -0.391f, -1.023f, -0.391f, -1.414f, 0.0f)
                reflectiveCurveToRelative(-0.391f, 1.023f, 0.0f, 1.414f)
                lineToRelative(2.043f, 2.043f)
                lineToRelative(-8.864f, 8.864f)
                lineToRelative(-1.191f, -1.191f)
                curveToRelative(-1.211f, -1.212f, -3.326f, -1.212f, -4.539f, 0.0f)
                lineToRelative(-1.606f, 1.606f)
                curveToRelative(-1.7f, 1.699f, -2.636f, 3.959f, -2.636f, 6.364f)
                verticalLineToRelative(1.107f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(1.107f)
                curveToRelative(2.404f, 0.0f, 4.665f, -0.936f, 6.364f, -2.636f)
                lineToRelative(1.606f, -1.606f)
                curveToRelative(0.606f, -0.606f, 0.94f, -1.412f, 0.94f, -2.269f)
                reflectiveCurveToRelative(-0.333f, -1.664f, -0.94f, -2.27f)
                lineToRelative(-1.191f, -1.191f)
                lineToRelative(8.864f, -8.864f)
                lineToRelative(2.043f, 2.043f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.023f, 0.0f, -1.414f)
                close()
                moveTo(11.163f, 16.633f)
                curveToRelative(0.472f, 0.472f, 0.472f, 1.239f, 0.0f, 1.71f)
                lineToRelative(-1.606f, 1.606f)
                curveToRelative(-1.322f, 1.322f, -3.08f, 2.05f, -4.95f, 2.05f)
                horizontalLineToRelative(-1.107f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                verticalLineToRelative(-1.107f)
                curveToRelative(0.0f, -1.87f, 0.728f, -3.628f, 2.05f, -4.95f)
                lineToRelative(1.606f, -1.606f)
                curveToRelative(0.236f, -0.236f, 0.545f, -0.354f, 0.855f, -0.354f)
                reflectiveCurveToRelative(0.619f, 0.118f, 0.855f, 0.354f)
                lineToRelative(1.191f, 1.191f)
                lineToRelative(-2.265f, 2.265f)
                curveToRelative(-0.391f, 0.391f, -0.391f, 1.023f, 0.0f, 1.414f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                lineToRelative(2.265f, -2.265f)
                lineToRelative(1.191f, 1.191f)
                close()
            }
        }
        .build()
        return _shovel!!
    }

private var _shovel: ImageVector? = null
