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

public val Icons.Filled.CloudCode: ImageVector
    get() {
        if (_cloudCode != null) {
            return _cloudCode!!
        }
        _cloudCode = Builder(name = "CloudCode", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.18f, 7.494f)
                curveToRelative(-0.529f, -0.203f, -0.941f, -0.555f, -1.191f, -1.018f)
                curveToRelative(-1.775f, -3.298f, -5.461f, -5.035f, -9.175f, -4.313f)
                curveToRelative(-3.29f, 0.636f, -5.954f, 3.267f, -6.629f, 6.545f)
                curveToRelative(-0.177f, 0.86f, -0.227f, 1.729f, -0.148f, 2.584f)
                curveToRelative(0.062f, 0.674f, -0.335f, 1.215f, -0.577f, 1.478f)
                curveToRelative(-0.941f, 1.018f, -1.459f, 2.343f, -1.459f, 3.73f)
                curveToRelative(0.0f, 3.032f, 2.243f, 5.5f, 5.0f, 5.5f)
                horizontalLineToRelative(11.278f)
                curveToRelative(3.959f, 0.0f, 7.336f, -2.981f, 7.689f, -6.787f)
                curveToRelative(0.311f, -3.348f, -1.658f, -6.521f, -4.787f, -7.719f)
                close()
                moveTo(10.587f, 18.162f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                lineToRelative(-2.44f, -2.44f)
                curveToRelative(-0.472f, -0.473f, -0.732f, -1.1f, -0.732f, -1.768f)
                reflectiveCurveToRelative(0.26f, -1.297f, 0.733f, -1.769f)
                lineToRelative(2.394f, -2.394f)
                curveToRelative(0.391f, -0.391f, 1.023f, -0.391f, 1.414f, 0.0f)
                reflectiveCurveToRelative(0.391f, 1.023f, 0.0f, 1.414f)
                lineToRelative(-2.394f, 2.395f)
                curveToRelative(-0.127f, 0.128f, -0.146f, 0.276f, -0.146f, 0.354f)
                reflectiveCurveToRelative(0.019f, 0.226f, 0.146f, 0.354f)
                lineToRelative(2.44f, 2.44f)
                curveToRelative(0.391f, 0.391f, 0.391f, 1.023f, 0.0f, 1.414f)
                close()
                moveTo(17.268f, 15.722f)
                lineToRelative(-2.44f, 2.44f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.023f, 0.0f, -1.414f)
                lineToRelative(2.44f, -2.44f)
                curveToRelative(0.127f, -0.128f, 0.146f, -0.276f, 0.146f, -0.354f)
                reflectiveCurveToRelative(-0.019f, -0.226f, -0.146f, -0.353f)
                lineToRelative(-2.395f, -2.396f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.023f, 0.0f, -1.414f)
                reflectiveCurveToRelative(1.023f, -0.391f, 1.414f, 0.0f)
                lineToRelative(2.394f, 2.395f)
                curveToRelative(0.472f, 0.471f, 0.732f, 1.099f, 0.732f, 1.768f)
                reflectiveCurveToRelative(-0.26f, 1.295f, -0.732f, 1.768f)
                close()
            }
        }
        .build()
        return _cloudCode!!
    }

private var _cloudCode: ImageVector? = null
