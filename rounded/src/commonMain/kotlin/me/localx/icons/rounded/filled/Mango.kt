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

public val Icons.Filled.Mango: ImageVector
    get() {
        if (_mango != null) {
            return _mango!!
        }
        _mango = Builder(name = "Mango", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.853f, 7.365f)
                curveToRelative(-1.195f, 0.855f, -2.547f, 1.271f, -3.626f, 1.471f)
                curveToRelative(-0.577f, 0.107f, -1.116f, -0.317f, -1.166f, -0.902f)
                curveToRelative(-0.043f, -0.509f, 0.301f, -0.971f, 0.804f, -1.062f)
                curveToRelative(1.09f, -0.198f, 2.443f, -0.647f, 3.43f, -1.634f)
                curveToRelative(1.144f, -1.144f, 1.552f, -2.768f, 1.695f, -3.915f)
                curveToRelative(0.094f, -0.757f, -0.55f, -1.401f, -1.307f, -1.307f)
                curveToRelative(-1.147f, 0.142f, -2.771f, 0.551f, -3.915f, 1.695f)
                curveToRelative(-0.584f, 0.584f, -0.991f, 1.311f, -1.254f, 2.017f)
                curveToRelative(-0.651f, -2.206f, -1.76f, -3.345f, -1.821f, -3.407f)
                curveToRelative(-0.385f, -0.39f, -1.011f, -0.394f, -1.406f, -0.012f)
                curveToRelative(-0.394f, 0.383f, -0.402f, 0.99f, -0.022f, 1.386f)
                curveToRelative(0.057f, 0.06f, 1.393f, 1.494f, 1.666f, 4.329f)
                lineToRelative(0.014f, 1.122f)
                curveToRelative(-0.344f, -1.282f, -1.575f, -2.847f, -2.717f, -4.042f)
                curveToRelative(-0.589f, -0.617f, -1.477f, -0.875f, -2.289f, -0.614f)
                curveToRelative(-4.02f, 1.295f, -6.939f, 5.065f, -6.939f, 9.51f)
                curveToRelative(0.0f, 1.855f, -0.514f, 3.129f, -1.618f, 4.008f)
                curveToRelative(-1.349f, 1.074f, -1.569f, 1.327f, -1.691f, 1.511f)
                curveToRelative(-0.452f, 0.68f, -0.69f, 1.472f, -0.69f, 2.291f)
                curveToRelative(0.0f, 2.311f, 1.858f, 4.19f, 4.143f, 4.19f)
                curveToRelative(6.445f, 0.0f, 19.857f, 0.0f, 19.857f, -12.0f)
                curveToRelative(0.0f, -1.673f, -0.418f, -3.248f, -1.147f, -4.635f)
                close()
                moveTo(15.5f, 19.548f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(18.5f, 16.048f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _mango!!
    }

private var _mango: ImageVector? = null
