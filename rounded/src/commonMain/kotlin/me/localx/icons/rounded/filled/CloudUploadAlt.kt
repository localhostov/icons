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

public val Icons.Filled.CloudUploadAlt: ImageVector
    get() {
        if (_cloudUploadAlt != null) {
            return _cloudUploadAlt!!
        }
        _cloudUploadAlt = Builder(name = "CloudUploadAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.974f, 7.146f)
                curveToRelative(-0.331f, -0.066f, -0.602f, -0.273f, -0.742f, -0.569f)
                curveToRelative(-1.55f, -3.271f, -5.143f, -5.1f, -8.734f, -4.438f)
                curveToRelative(-3.272f, 0.6f, -5.837f, 3.212f, -6.384f, 6.501f)
                curveToRelative(-0.162f, 0.971f, -0.15f, 1.943f, 0.033f, 2.89f)
                curveToRelative(0.06f, 0.309f, -0.073f, 0.653f, -0.346f, 0.901f)
                curveToRelative(-1.145f, 1.041f, -1.801f, 2.524f, -1.801f, 4.07f)
                curveToRelative(0.0f, 3.032f, 2.467f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(11.0f)
                curveToRelative(4.136f, 0.0f, 7.5f, -3.364f, 7.5f, -7.5f)
                curveToRelative(0.0f, -3.565f, -2.534f, -6.658f, -6.026f, -7.354f)
                close()
                moveTo(15.121f, 13.708f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                lineToRelative(-1.707f, -1.707f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-5.0f)
                lineToRelative(-1.707f, 1.707f)
                curveToRelative(-0.391f, 0.391f, -1.023f, 0.391f, -1.414f, 0.0f)
                reflectiveCurveToRelative(-0.391f, -1.023f, 0.0f, -1.414f)
                lineToRelative(2.707f, -2.707f)
                curveToRelative(0.386f, -0.386f, 0.893f, -0.58f, 1.4f, -0.583f)
                lineToRelative(0.014f, -0.003f)
                lineToRelative(0.014f, 0.003f)
                curveToRelative(0.508f, 0.003f, 1.014f, 0.197f, 1.4f, 0.583f)
                lineToRelative(2.707f, 2.707f)
                curveToRelative(0.391f, 0.391f, 0.391f, 1.023f, 0.0f, 1.414f)
                close()
            }
        }
        .build()
        return _cloudUploadAlt!!
    }

private var _cloudUploadAlt: ImageVector? = null
