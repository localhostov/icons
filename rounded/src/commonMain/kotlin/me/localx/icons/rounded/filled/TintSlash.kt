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

public val Icons.Filled.TintSlash: ImageVector
    get() {
        if (_tintSlash != null) {
            return _tintSlash!!
        }
        _tintSlash = Builder(name = "TintSlash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.707f, 23.707f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                lineTo(0.293f, 1.707f)
                curveTo(-0.098f, 1.316f, -0.098f, 0.684f, 0.293f, 0.293f)
                reflectiveCurveTo(1.316f, -0.098f, 1.707f, 0.293f)
                lineToRelative(3.899f, 3.899f)
                curveToRelative(1.172f, -1.251f, 2.349f, -2.309f, 3.18f, -3.015f)
                curveToRelative(1.862f, -1.578f, 4.565f, -1.578f, 6.426f, 0.0f)
                curveToRelative(2.908f, 2.469f, 7.787f, 7.286f, 7.787f, 11.821f)
                curveToRelative(0.0f, 2.337f, -0.744f, 4.607f, -2.109f, 6.479f)
                lineToRelative(2.816f, 2.816f)
                curveToRelative(0.391f, 0.391f, 0.391f, 1.023f, 0.0f, 1.414f)
                close()
                moveTo(4.083f, 8.173f)
                curveToRelative(-0.222f, -0.221f, -0.534f, -0.325f, -0.844f, -0.281f)
                reflectiveCurveToRelative(-0.582f, 0.229f, -0.734f, 0.503f)
                curveToRelative(-1.013f, 1.816f, -1.505f, 3.323f, -1.505f, 4.605f)
                curveToRelative(0.0f, 2.938f, 1.144f, 5.7f, 3.222f, 7.778f)
                curveToRelative(2.078f, 2.077f, 4.84f, 3.222f, 7.778f, 3.222f)
                curveToRelative(1.715f, 0.0f, 3.427f, -0.406f, 4.95f, -1.175f)
                curveToRelative(0.287f, -0.145f, 0.487f, -0.418f, 0.538f, -0.735f)
                curveToRelative(0.05f, -0.317f, -0.055f, -0.64f, -0.283f, -0.866f)
                lineTo(4.083f, 8.173f)
                close()
            }
        }
        .build()
        return _tintSlash!!
    }

private var _tintSlash: ImageVector? = null
