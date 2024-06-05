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

public val Icons.Filled.TrashClock: ImageVector
    get() {
        if (_trashClock != null) {
            return _trashClock!!
        }
        _trashClock = Builder(name = "TrashClock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.961f, 17.336f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.332f, -2.997f, -2.878f, -5.336f, -5.961f, -5.336f)
                curveToRelative(-3.308f, 0.0f, -6.0f, 2.692f, -6.0f, 6.0f)
                curveToRelative(0.0f, 3.071f, 2.32f, 5.606f, 5.298f, 5.955f)
                curveToRelative(0.231f, 0.027f, 0.464f, 0.045f, 0.702f, 0.045f)
                curveToRelative(3.308f, 0.0f, 6.0f, -2.692f, 6.0f, -6.0f)
                curveToRelative(0.0f, -0.225f, -0.015f, -0.446f, -0.039f, -0.664f)
                close()
                moveTo(20.0f, 20.0f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                lineToRelative(-1.293f, -1.293f)
                curveToRelative(-0.188f, -0.188f, -0.293f, -0.442f, -0.293f, -0.707f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.552f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(1.586f)
                lineToRelative(1.0f, 1.0f)
                curveToRelative(0.391f, 0.391f, 0.391f, 1.023f, 0.0f, 1.414f)
                close()
                moveTo(10.0f, 18.0f)
                curveToRelative(0.0f, -4.418f, 3.582f, -8.0f, 8.0f, -8.0f)
                curveToRelative(0.59f, 0.0f, 1.164f, 0.068f, 1.718f, 0.19f)
                lineToRelative(0.397f, -4.19f)
                horizontalLineToRelative(0.886f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-4.101f)
                curveToRelative(-0.465f, -2.279f, -2.484f, -4.0f, -4.899f, -4.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-2.414f, 0.0f, -4.434f, 1.721f, -4.899f, 4.0f)
                lineTo(1.0f, 4.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(0.861f)
                lineToRelative(1.296f, 13.479f)
                curveToRelative(0.247f, 2.578f, 2.387f, 4.521f, 4.977f, 4.521f)
                horizontalLineToRelative(4.587f)
                curveToRelative(-1.665f, -1.466f, -2.721f, -3.607f, -2.721f, -6.0f)
                close()
                moveTo(7.184f, 4.0f)
                curveToRelative(0.414f, -1.161f, 1.514f, -2.0f, 2.816f, -2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(1.302f, 0.0f, 2.402f, 0.839f, 2.816f, 2.0f)
                horizontalLineToRelative(-7.631f)
                close()
            }
        }
        .build()
        return _trashClock!!
    }

private var _trashClock: ImageVector? = null
