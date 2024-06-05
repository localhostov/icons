package me.localx.icons.straight.outline

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

public val Icons.Outline.LinkSlash: ImageVector
    get() {
        if (_linkSlash != null) {
            return _linkSlash!!
        }
        _linkSlash = Builder(name = "LinkSlash", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.693f, 16.271f)
                lineToRelative(-1.416f, -1.413f)
                lineToRelative(4.246f, -4.253f)
                curveToRelative(0.952f, -0.952f, 1.477f, -2.218f, 1.477f, -3.564f)
                reflectiveCurveToRelative(-0.524f, -2.612f, -1.477f, -3.564f)
                reflectiveCurveToRelative(-2.218f, -1.476f, -3.563f, -1.476f)
                reflectiveCurveToRelative(-2.612f, 0.524f, -3.565f, 1.477f)
                lineToRelative(-4.253f, 4.246f)
                lineToRelative(-1.412f, -1.415f)
                lineTo(11.981f, 2.062f)
                curveTo(13.312f, 0.732f, 15.079f, 0.0f, 16.96f, 0.0f)
                reflectiveCurveToRelative(3.648f, 0.732f, 4.978f, 2.062f)
                curveToRelative(1.33f, 1.33f, 2.062f, 3.098f, 2.062f, 4.979f)
                reflectiveCurveToRelative(-0.732f, 3.648f, -2.062f, 4.978f)
                lineToRelative(-4.245f, 4.253f)
                close()
                moveTo(0.043f, 1.457f)
                lineTo(22.543f, 23.957f)
                lineToRelative(1.414f, -1.414f)
                lineTo(13.413f, 11.999f)
                lineToRelative(2.859f, -2.859f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-2.859f, 2.859f)
                lineTo(1.457f, 0.043f)
                lineTo(0.043f, 1.457f)
                close()
                moveTo(0.0f, 16.943f)
                curveToRelative(0.0f, 1.88f, 0.732f, 3.648f, 2.063f, 4.978f)
                curveToRelative(1.33f, 1.331f, 3.096f, 2.069f, 4.973f, 2.079f)
                curveToRelative(1.87f, 0.0f, 3.663f, -0.726f, 4.983f, -2.045f)
                lineToRelative(2.824f, -2.832f)
                lineToRelative(-1.416f, -1.412f)
                lineToRelative(-2.823f, 2.831f)
                curveToRelative(-0.941f, 0.941f, -2.269f, 1.458f, -3.604f, 1.458f)
                curveToRelative(-1.347f, -0.007f, -2.568f, -0.538f, -3.523f, -1.493f)
                curveToRelative(-0.952f, -0.952f, -1.477f, -2.218f, -1.477f, -3.564f)
                curveToRelative(0.0f, -1.347f, 0.524f, -2.612f, 1.477f, -3.564f)
                lineToRelative(2.812f, -2.805f)
                lineToRelative(-1.412f, -1.416f)
                lineToRelative(-2.813f, 2.806f)
                curveTo(0.732f, 13.294f, 0.0f, 15.062f, 0.0f, 16.943f)
                close()
                moveTo(10.558f, 14.855f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-1.416f, 1.416f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(1.416f, -1.416f)
                close()
            }
        }
        .build()
        return _linkSlash!!
    }

private var _linkSlash: ImageVector? = null
