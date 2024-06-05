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

public val Icons.Filled.ExternalWorld: ImageVector
    get() {
        if (_externalWorld != null) {
            return _externalWorld!!
        }
        _externalWorld = Builder(name = "ExternalWorld", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.049f, 14.0f)
                lineTo(1.046f, 14.0f)
                curveToRelative(-0.03f, -0.329f, -0.046f, -0.663f, -0.046f, -1.0f)
                curveToRelative(0.0f, -4.689f, 2.934f, -8.692f, 7.066f, -10.275f)
                curveToRelative(0.134f, 0.726f, 0.464f, 1.385f, 0.934f, 1.917f)
                verticalLineToRelative(0.258f)
                curveToRelative(-1.435f, 1.956f, -3.0f, 4.836f, -3.0f, 8.1f)
                curveToRelative(0.0f, 0.338f, 0.018f, 0.671f, 0.049f, 1.0f)
                close()
                moveTo(8.261f, 9.617f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.023f, 0.0f, 1.414f)
                lineToRelative(2.428f, 2.429f)
                curveToRelative(0.361f, 0.36f, 0.836f, 0.54f, 1.311f, 0.54f)
                reflectiveCurveToRelative(0.949f, -0.18f, 1.312f, -0.541f)
                lineToRelative(2.427f, -2.428f)
                curveToRelative(0.39f, -0.391f, 0.39f, -1.024f, 0.0f, -1.414f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.391f, -0.391f, -1.024f, -0.39f, -1.414f, 0.0f)
                lineToRelative(-1.324f, 1.325f)
                lineTo(13.001f, 3.732f)
                curveToRelative(0.732f, -0.423f, 1.171f, -1.296f, 0.937f, -2.242f)
                curveToRelative(-0.177f, -0.716f, -0.781f, -1.293f, -1.503f, -1.444f)
                curveToRelative(-1.294f, -0.272f, -2.434f, 0.708f, -2.434f, 1.954f)
                curveToRelative(0.0f, 0.74f, 0.402f, 1.386f, 1.0f, 1.732f)
                verticalLineToRelative(7.21f)
                lineToRelative(-1.324f, -1.325f)
                curveToRelative(-0.39f, -0.391f, -1.024f, -0.391f, -1.414f, 0.0f)
                close()
                moveTo(6.426f, 16.0f)
                lineTo(1.414f, 16.0f)
                curveToRelative(1.272f, 4.497f, 5.332f, 7.822f, 10.195f, 7.992f)
                lineToRelative(-0.276f, -0.247f)
                curveToRelative(-0.179f, -0.161f, -3.674f, -3.337f, -4.907f, -7.745f)
                close()
                moveTo(12.667f, 23.745f)
                lineToRelative(-0.276f, 0.247f)
                curveToRelative(4.863f, -0.17f, 8.923f, -3.495f, 10.195f, -7.992f)
                horizontalLineToRelative(-5.012f)
                curveToRelative(-1.233f, 4.408f, -4.727f, 7.584f, -4.907f, 7.745f)
                close()
                moveTo(8.522f, 16.0f)
                curveToRelative(0.852f, 2.518f, 2.54f, 4.574f, 3.478f, 5.582f)
                curveToRelative(0.939f, -1.008f, 2.627f, -3.064f, 3.478f, -5.582f)
                horizontalLineToRelative(-6.956f)
                close()
                moveTo(15.934f, 2.725f)
                curveToRelative(-0.134f, 0.726f, -0.464f, 1.385f, -0.934f, 1.917f)
                verticalLineToRelative(0.258f)
                curveToRelative(1.435f, 1.956f, 3.0f, 4.836f, 3.0f, 8.1f)
                curveToRelative(0.0f, 0.338f, -0.018f, 0.671f, -0.049f, 1.0f)
                horizontalLineToRelative(5.003f)
                curveToRelative(0.03f, -0.329f, 0.046f, -0.663f, 0.046f, -1.0f)
                curveToRelative(0.0f, -4.689f, -2.934f, -8.692f, -7.066f, -10.275f)
                close()
            }
        }
        .build()
        return _externalWorld!!
    }

private var _externalWorld: ImageVector? = null
