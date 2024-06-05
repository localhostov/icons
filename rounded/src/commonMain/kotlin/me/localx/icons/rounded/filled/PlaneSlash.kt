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

public val Icons.Filled.PlaneSlash: ImageVector
    get() {
        if (_planeSlash != null) {
            return _planeSlash!!
        }
        _planeSlash = Builder(name = "PlaneSlash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.707f, 22.293f)
                lineToRelative(-6.552f, -6.552f)
                lineToRelative(0.425f, -0.741f)
                horizontalLineToRelative(3.42f)
                curveToRelative(0.881f, 0.0f, 1.714f, -0.385f, 2.286f, -1.057f)
                reflectiveCurveToRelative(0.817f, -1.561f, 0.674f, -2.44f)
                curveToRelative(-0.232f, -1.427f, -1.551f, -2.503f, -3.066f, -2.503f)
                horizontalLineToRelative(-3.313f)
                lineTo(13.323f, 1.563f)
                curveToRelative(-0.526f, -0.965f, -1.535f, -1.563f, -2.634f, -1.563f)
                curveToRelative(-0.863f, 0.0f, -1.68f, 0.419f, -2.183f, 1.12f)
                curveToRelative(-0.504f, 0.702f, -0.64f, 1.609f, -0.358f, 2.442f)
                lineToRelative(1.752f, 4.923f)
                lineTo(1.707f, 0.293f)
                curveTo(1.316f, -0.098f, 0.684f, -0.098f, 0.293f, 0.293f)
                reflectiveCurveTo(-0.098f, 1.316f, 0.293f, 1.707f)
                lineToRelative(22.0f, 22.0f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.023f, 0.0f, -1.414f)
                close()
                moveTo(14.485f, 18.721f)
                curveToRelative(0.367f, 0.367f, 0.443f, 0.935f, 0.185f, 1.386f)
                lineToRelative(-1.343f, 2.347f)
                curveToRelative(-0.517f, 0.947f, -1.525f, 1.546f, -2.624f, 1.546f)
                curveToRelative(-0.863f, 0.0f, -1.68f, -0.419f, -2.184f, -1.121f)
                curveToRelative(-0.504f, -0.701f, -0.64f, -1.608f, -0.363f, -2.427f)
                lineToRelative(1.94f, -5.453f)
                horizontalLineToRelative(-4.551f)
                lineToRelative(-1.417f, 1.9f)
                curveToRelative(-0.452f, 0.689f, -1.214f, 1.1f, -2.037f, 1.1f)
                horizontalLineToRelative(-0.004f)
                curveToRelative(-0.677f, 0.0f, -1.312f, -0.331f, -1.701f, -0.886f)
                curveTo(0.0f, 16.559f, -0.093f, 15.848f, 0.139f, 15.212f)
                lineToRelative(1.874f, -3.212f)
                lineTo(0.139f, 8.788f)
                curveTo(-0.093f, 8.152f, 0.0f, 7.441f, 0.388f, 6.886f)
                curveToRelative(0.003f, -0.005f, 0.007f, -0.009f, 0.01f, -0.014f)
                curveToRelative(0.495f, -0.695f, 1.537f, -0.701f, 2.14f, -0.098f)
                lineToRelative(11.947f, 11.947f)
                close()
            }
        }
        .build()
        return _planeSlash!!
    }

private var _planeSlash: ImageVector? = null
