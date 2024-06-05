package me.localx.icons.rounded.bold

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

public val Icons.Bold.ImageSlash: ImageVector
    get() {
        if (_imageSlash != null) {
            return _imageSlash!!
        }
        _imageSlash = Builder(name = "ImageSlash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.0f, 8.0f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                close()
                moveTo(23.561f, 23.561f)
                curveToRelative(-0.293f, 0.293f, -0.677f, 0.439f, -1.061f, 0.439f)
                reflectiveCurveToRelative(-0.768f, -0.146f, -1.061f, -0.439f)
                lineTo(0.439f, 2.561f)
                curveTo(-0.146f, 1.975f, -0.146f, 1.025f, 0.439f, 0.439f)
                reflectiveCurveTo(1.975f, -0.146f, 2.561f, 0.439f)
                lineToRelative(1.258f, 1.258f)
                curveToRelative(0.814f, -0.454f, 1.735f, -0.698f, 2.681f, -0.698f)
                horizontalLineToRelative(11.0f)
                curveToRelative(3.033f, 0.0f, 5.5f, 2.468f, 5.5f, 5.5f)
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 0.946f, -0.243f, 1.868f, -0.698f, 2.681f)
                lineToRelative(1.258f, 1.258f)
                curveToRelative(0.586f, 0.586f, 0.586f, 1.535f, 0.0f, 2.121f)
                close()
                moveTo(6.146f, 4.025f)
                lineToRelative(13.828f, 13.828f)
                curveToRelative(0.017f, -0.116f, 0.025f, -0.235f, 0.025f, -0.354f)
                lineTo(19.999f, 6.5f)
                curveToRelative(0.0f, -1.379f, -1.122f, -2.5f, -2.5f, -2.5f)
                lineTo(6.5f, 4.0f)
                curveToRelative(-0.119f, 0.0f, -0.237f, 0.009f, -0.354f, 0.025f)
                close()
                moveTo(15.254f, 20.204f)
                lineToRelative(-6.755f, -6.755f)
                curveToRelative(-0.538f, -0.538f, -1.41f, -0.538f, -1.948f, 0.0f)
                lineToRelative(-2.551f, 2.551f)
                verticalLineToRelative(-6.5f)
                curveToRelative(0.0f, -0.828f, -0.671f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 3.032f, 2.467f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                curveToRelative(0.0f, -0.553f, -0.3f, -1.036f, -0.745f, -1.296f)
                close()
            }
        }
        .build()
        return _imageSlash!!
    }

private var _imageSlash: ImageVector? = null
