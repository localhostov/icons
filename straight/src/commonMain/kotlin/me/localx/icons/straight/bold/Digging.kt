package me.localx.icons.straight.bold

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

public val Icons.Bold.Digging: ImageVector
    get() {
        if (_digging != null) {
            return _digging!!
        }
        _digging = Builder(name = "Digging", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.5f, 24.0f)
                lineToRelative(2.44f, -3.486f)
                lineTo(0.653f, 10.738f)
                lineToRelative(1.693f, -2.477f)
                lineToRelative(2.559f, 1.751f)
                lineToRelative(0.608f, -1.695f)
                curveToRelative(0.337f, -0.94f, 1.062f, -1.693f, 1.989f, -2.065f)
                curveToRelative(0.927f, -0.373f, 1.971f, -0.331f, 2.866f, 0.114f)
                lineToRelative(0.67f, 0.335f)
                curveToRelative(1.264f, 0.629f, 2.226f, 1.707f, 2.708f, 3.035f)
                lineToRelative(1.253f, 3.443f)
                lineToRelative(-2.82f, 1.025f)
                lineToRelative(-1.252f, -3.443f)
                curveToRelative(-0.219f, -0.602f, -0.654f, -1.091f, -1.228f, -1.376f)
                lineToRelative(-0.67f, -0.335f)
                curveToRelative(-0.177f, -0.088f, -0.332f, -0.048f, -0.408f, -0.016f)
                curveToRelative(-0.078f, 0.031f, -0.219f, 0.111f, -0.284f, 0.295f)
                lineToRelative(-0.873f, 2.433f)
                lineToRelative(9.196f, 6.292f)
                lineToRelative(2.839f, -4.056f)
                lineToRelative(4.5f, 10.0f)
                horizontalLineToRelative(-11.5f)
                close()
                moveTo(11.5f, 5.0f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.119f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(8.0f, 24.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.759f)
                lineToRelative(-3.0f, -2.053f)
                verticalLineToRelative(5.812f)
                close()
                moveTo(0.0f, 24.0f)
                horizontalLineToRelative(3.188f)
                lineToRelative(2.623f, -7.31f)
                lineToRelative(-2.559f, -1.751f)
                lineTo(0.0f, 24.0f)
                close()
            }
        }
        .build()
        return _digging!!
    }

private var _digging: ImageVector? = null
