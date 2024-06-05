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

public val Icons.Filled.LinkSlash: ImageVector
    get() {
        if (_linkSlash != null) {
            return _linkSlash!!
        }
        _linkSlash = Builder(name = "LinkSlash", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.063f, 11.963f)
                lineToRelative(2.813f, -2.806f)
                lineToRelative(1.412f, 1.416f)
                lineToRelative(-2.812f, 2.805f)
                curveToRelative(-0.952f, 0.952f, -1.477f, 2.218f, -1.477f, 3.564f)
                curveToRelative(0.0f, 1.346f, 0.524f, 2.612f, 1.477f, 3.564f)
                curveToRelative(0.955f, 0.956f, 2.223f, 1.486f, 3.569f, 1.493f)
                horizontalLineToRelative(0.028f)
                curveToRelative(1.335f, 0.0f, 2.588f, -0.518f, 3.529f, -1.458f)
                lineToRelative(2.823f, -2.831f)
                lineToRelative(1.416f, 1.412f)
                lineToRelative(-2.824f, 2.832f)
                curveToRelative(-1.32f, 1.32f, -3.074f, 2.045f, -4.944f, 2.045f)
                horizontalLineToRelative(-0.039f)
                curveToRelative(-1.877f, -0.01f, -3.643f, -0.749f, -4.973f, -2.079f)
                curveTo(0.732f, 20.591f, 0.0f, 18.823f, 0.0f, 16.943f)
                curveToRelative(0.0f, -1.881f, 0.732f, -3.649f, 2.063f, -4.979f)
                close()
                moveTo(10.557f, 14.854f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-1.416f, 1.416f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(1.416f, -1.416f)
                close()
                moveTo(1.457f, 0.043f)
                lineTo(7.726f, 6.312f)
                lineTo(11.981f, 2.062f)
                curveTo(13.312f, 0.732f, 15.079f, 0.0f, 16.96f, 0.0f)
                reflectiveCurveToRelative(3.648f, 0.732f, 4.978f, 2.062f)
                curveToRelative(1.33f, 1.33f, 2.062f, 3.098f, 2.062f, 4.979f)
                reflectiveCurveToRelative(-0.732f, 3.648f, -2.062f, 4.978f)
                lineToRelative(-4.25f, 4.256f)
                lineToRelative(6.269f, 6.269f)
                lineToRelative(-1.414f, 1.414f)
                lineTo(0.043f, 1.457f)
                lineTo(1.457f, 0.043f)
                close()
                moveTo(20.523f, 10.604f)
                curveToRelative(0.952f, -0.952f, 1.477f, -2.218f, 1.477f, -3.564f)
                reflectiveCurveToRelative(-0.524f, -2.612f, -1.477f, -3.564f)
                reflectiveCurveToRelative(-2.218f, -1.476f, -3.563f, -1.476f)
                reflectiveCurveToRelative(-2.612f, 0.524f, -3.564f, 1.477f)
                lineToRelative(-4.255f, 4.25f)
                lineToRelative(2.859f, 2.859f)
                lineToRelative(2.859f, -2.859f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-2.859f, 2.859f)
                lineToRelative(2.861f, 2.861f)
                lineToRelative(4.25f, -4.255f)
                close()
            }
        }
        .build()
        return _linkSlash!!
    }

private var _linkSlash: ImageVector? = null
