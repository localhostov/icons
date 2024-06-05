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

public val Icons.Filled.Trust: ImageVector
    get() {
        if (_trust != null) {
            return _trust!!
        }
        _trust = Builder(name = "Trust", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.001f, 5.999f)
                curveToRelative(0.056f, -1.942f, 1.391f, -3.614f, 3.247f, -4.093f)
                lineToRelative(4.252f, -0.905f)
                lineTo(14.5f, 0.0f)
                horizontalLineToRelative(9.5f)
                verticalLineToRelative(5.0f)
                lineToRelative(-4.5f, 5.0f)
                horizontalLineToRelative(-8.49f)
                reflectiveCurveToRelative(0.028f, -4.07f, 0.028f, -4.07f)
                lineToRelative(-2.0f, -0.014f)
                lineToRelative(-0.039f, 5.584f)
                curveToRelative(0.0f, 0.827f, -0.673f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.673f, -1.5f, -1.5f)
                verticalLineToRelative(-5.495f)
                reflectiveCurveToRelative(0.001f, 0.0f, 0.001f, 0.0f)
                verticalLineToRelative(-0.007f)
                close()
                moveTo(24.0f, 18.0f)
                curveToRelative(0.0f, 3.314f, -2.686f, 6.0f, -6.0f, 6.0f)
                reflectiveCurveToRelative(-6.0f, -2.686f, -6.0f, -6.0f)
                reflectiveCurveToRelative(2.686f, -6.0f, 6.0f, -6.0f)
                reflectiveCurveToRelative(6.0f, 2.686f, 6.0f, 6.0f)
                close()
                moveTo(22.235f, 16.799f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-3.615f, 3.615f)
                lineToRelative(-2.013f, -2.013f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(2.012f, 2.012f)
                curveToRelative(0.377f, 0.378f, 0.879f, 0.587f, 1.413f, 0.587f)
                horizontalLineToRelative(0.002f)
                curveToRelative(0.534f, 0.0f, 1.036f, -0.208f, 1.414f, -0.586f)
                lineToRelative(3.615f, -3.615f)
                close()
                moveTo(10.0f, 18.0f)
                curveToRelative(0.0f, -2.393f, 1.056f, -4.534f, 2.721f, -6.0f)
                horizontalLineToRelative(-1.771f)
                curveToRelative(-0.243f, 1.689f, -1.69f, 3.0f, -3.45f, 3.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineToRelative(0.002f, -4.902f)
                curveToRelative(-1.002f, 0.581f, -1.766f, 1.547f, -2.071f, 2.729f)
                lineToRelative(-0.984f, 3.811f)
                lineTo(0.027f, 14.057f)
                lineToRelative(-0.027f, 9.943f)
                horizontalLineToRelative(4.923f)
                lineToRelative(3.5f, -3.964f)
                lineToRelative(1.847f, -0.006f)
                curveToRelative(-0.17f, -0.65f, -0.27f, -1.328f, -0.27f, -2.031f)
                close()
            }
        }
        .build()
        return _trust!!
    }

private var _trust: ImageVector? = null
