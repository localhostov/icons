package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.ToiletPaperSlash: ImageVector
    get() {
        if (_toiletPaperSlash != null) {
            return _toiletPaperSlash!!
        }
        _toiletPaperSlash = Builder(name = "ToiletPaperSlash", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.121f, 16.0f)
                horizontalLineToRelative(1.879f)
                curveToRelative(2.209f, 0.0f, 4.0f, -3.582f, 4.0f, -8.0f)
                curveTo(24.0f, 3.786f, 22.37f, 0.341f, 20.303f, 0.031f)
                curveToRelative(-0.098f, -0.02f, -0.199f, -0.031f, -0.303f, -0.031f)
                lineTo(7.5f, 0.0f)
                curveToRelative(-1.341f, 0.0f, -2.575f, 0.656f, -3.544f, 1.835f)
                lineTo(2.561f, 0.439f)
                curveTo(1.975f, -0.146f, 1.025f, -0.146f, 0.439f, 0.439f)
                reflectiveCurveTo(-0.146f, 1.975f, 0.439f, 2.561f)
                lineToRelative(21.0f, 21.0f)
                curveToRelative(0.293f, 0.293f, 0.677f, 0.439f, 1.061f, 0.439f)
                reflectiveCurveToRelative(0.768f, -0.146f, 1.061f, -0.439f)
                curveToRelative(0.586f, -0.586f, 0.586f, -1.535f, 0.0f, -2.121f)
                lineToRelative(-5.439f, -5.439f)
                close()
                moveTo(20.0f, 5.5f)
                curveToRelative(0.552f, 0.0f, 1.0f, 1.119f, 1.0f, 2.5f)
                reflectiveCurveToRelative(-0.448f, 2.5f, -1.0f, 2.5f)
                reflectiveCurveToRelative(-1.0f, -1.119f, -1.0f, -2.5f)
                reflectiveCurveToRelative(0.448f, -2.5f, 1.0f, -2.5f)
                close()
                moveTo(16.0f, 8.0f)
                verticalLineToRelative(5.879f)
                lineTo(6.093f, 3.972f)
                curveToRelative(0.431f, -0.612f, 0.939f, -0.972f, 1.407f, -0.972f)
                horizontalLineToRelative(9.38f)
                curveToRelative(-0.55f, 1.37f, -0.88f, 3.107f, -0.88f, 5.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.152f, 20.914f)
                curveToRelative(-0.211f, 0.057f, -0.431f, 0.086f, -0.652f, 0.086f)
                horizontalLineTo(3.153f)
                curveToRelative(-0.085f, 0.0f, -0.153f, -0.068f, -0.153f, -0.153f)
                curveToRelative(0.0f, -0.068f, 0.087f, -0.134f, 0.169f, -0.167f)
                curveToRelative(1.471f, -0.588f, 1.973f, -2.083f, 1.831f, -3.281f)
                verticalLineToRelative(-6.898f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                verticalLineToRelative(7.421f)
                curveToRelative(-1.216f, 0.511f, -2.0f, 1.651f, -2.0f, 2.926f)
                curveToRelative(0.0f, 1.738f, 1.415f, 3.153f, 3.153f, 3.153f)
                horizontalLineToRelative(10.347f)
                curveToRelative(0.485f, 0.0f, 0.968f, -0.063f, 1.434f, -0.189f)
                curveToRelative(0.8f, -0.216f, 1.273f, -1.039f, 1.058f, -1.839f)
                reflectiveCurveToRelative(-1.038f, -1.273f, -1.839f, -1.058f)
                close()
            }
        }
        .build()
        return _toiletPaperSlash!!
    }

private var _toiletPaperSlash: ImageVector? = null
