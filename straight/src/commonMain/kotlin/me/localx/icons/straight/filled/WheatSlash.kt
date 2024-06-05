package me.localx.icons.straight.filled

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

public val Icons.Filled.WheatSlash: ImageVector
    get() {
        if (_wheatSlash != null) {
            return _wheatSlash!!
        }
        _wheatSlash = Builder(name = "WheatSlash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.393f, 11.979f)
                lineToRelative(10.564f, 10.564f)
                lineToRelative(-1.414f, 1.414f)
                lineTo(0.043f, 1.457f)
                lineTo(1.457f, 0.043f)
                lineToRelative(10.521f, 10.521f)
                lineToRelative(0.742f, -0.742f)
                curveToRelative(-0.527f, -0.872f, -1.764f, -3.03f, -1.764f, -4.117f)
                curveToRelative(0.0f, -1.381f, 2.5f, -4.705f, 2.5f, -4.705f)
                curveToRelative(0.0f, 0.0f, 2.5f, 3.324f, 2.5f, 4.705f)
                curveToRelative(0.0f, 0.37f, -0.075f, 0.725f, -0.187f, 1.068f)
                lineToRelative(1.188f, -1.188f)
                curveToRelative(0.0f, -1.21f, 0.137f, -2.892f, 0.838f, -3.593f)
                curveToRelative(1.151f, -1.151f, 6.161f, -1.992f, 6.161f, -1.992f)
                curveToRelative(0.0f, 0.0f, -0.841f, 5.01f, -1.992f, 6.161f)
                curveToRelative(-0.701f, 0.701f, -2.384f, 0.838f, -3.593f, 0.838f)
                lineToRelative(-1.188f, 1.188f)
                curveToRelative(0.342f, -0.112f, 0.698f, -0.187f, 1.068f, -0.187f)
                curveToRelative(1.381f, 0.0f, 4.705f, 2.5f, 4.705f, 2.5f)
                curveToRelative(0.0f, 0.0f, -3.324f, 2.5f, -4.705f, 2.5f)
                curveToRelative(-1.087f, 0.0f, -3.245f, -1.236f, -4.117f, -1.764f)
                lineToRelative(-0.742f, 0.742f)
                close()
                moveTo(5.957f, 10.706f)
                curveToRelative(0.0f, 1.087f, 1.236f, 3.245f, 1.764f, 4.117f)
                lineToRelative(-1.951f, 1.951f)
                curveToRelative(0.112f, -0.342f, 0.187f, -0.698f, 0.187f, -1.068f)
                curveToRelative(0.0f, -1.381f, -2.5f, -4.705f, -2.5f, -4.705f)
                curveToRelative(0.0f, 0.0f, -2.5f, 3.324f, -2.5f, 4.705f)
                curveToRelative(0.0f, 1.087f, 1.236f, 3.245f, 1.764f, 4.117f)
                lineToRelative(-2.721f, 2.721f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(2.721f, -2.721f)
                curveToRelative(0.872f, 0.528f, 3.03f, 1.764f, 4.117f, 1.764f)
                curveToRelative(1.381f, 0.0f, 4.705f, -2.5f, 4.705f, -2.5f)
                curveToRelative(0.0f, 0.0f, -3.324f, -2.5f, -4.705f, -2.5f)
                curveToRelative(-0.37f, 0.0f, -0.725f, 0.075f, -1.068f, 0.187f)
                lineToRelative(1.951f, -1.951f)
                curveToRelative(0.872f, 0.528f, 3.03f, 1.764f, 4.117f, 1.764f)
                curveToRelative(0.128f, 0.0f, 0.277f, -0.027f, 0.434f, -0.066f)
                lineToRelative(-7.663f, -7.663f)
                curveToRelative(-0.039f, 0.157f, -0.066f, 0.306f, -0.066f, 0.434f)
                close()
            }
        }
        .build()
        return _wheatSlash!!
    }

private var _wheatSlash: ImageVector? = null
