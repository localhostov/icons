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

public val Icons.Bold.PlusHexagon: ImageVector
    get() {
        if (_plusHexagon != null) {
            return _plusHexagon!!
        }
        _plusHexagon = Builder(name = "PlusHexagon", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.229f, 9.219f)
                lineToRelative(-3.224f, -5.5f)
                curveToRelative(-0.982f, -1.677f, -2.801f, -2.719f, -4.745f, -2.719f)
                horizontalLineToRelative(-6.551f)
                curveToRelative(-1.943f, 0.0f, -3.761f, 1.042f, -4.745f, 2.719f)
                lineTo(0.742f, 9.219f)
                curveToRelative(-1.006f, 1.715f, -1.006f, 3.847f, 0.0f, 5.562f)
                lineToRelative(3.223f, 5.5f)
                curveToRelative(0.984f, 1.677f, 2.803f, 2.719f, 4.745f, 2.719f)
                horizontalLineToRelative(6.551f)
                curveToRelative(1.944f, 0.0f, 3.763f, -1.042f, 4.745f, -2.719f)
                lineToRelative(3.224f, -5.501f)
                curveToRelative(1.005f, -1.715f, 1.005f, -3.846f, 0.0f, -5.561f)
                close()
                moveTo(20.641f, 13.263f)
                lineToRelative(-3.224f, 5.5f)
                curveToRelative(-0.447f, 0.763f, -1.273f, 1.236f, -2.157f, 1.236f)
                horizontalLineToRelative(-6.551f)
                curveToRelative(-0.883f, 0.0f, -1.71f, -0.474f, -2.157f, -1.236f)
                lineToRelative(-3.223f, -5.5f)
                curveToRelative(-0.457f, -0.779f, -0.457f, -1.748f, 0.0f, -2.528f)
                lineToRelative(3.223f, -5.499f)
                curveToRelative(0.447f, -0.763f, 1.274f, -1.237f, 2.157f, -1.237f)
                horizontalLineToRelative(6.551f)
                curveToRelative(0.884f, 0.0f, 1.71f, 0.474f, 2.157f, 1.236f)
                lineToRelative(3.224f, 5.5f)
                curveToRelative(0.456f, 0.78f, 0.456f, 1.749f, 0.0f, 2.528f)
                close()
                moveTo(16.999f, 11.999f)
                curveToRelative(0.0f, 0.829f, -0.672f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.671f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.829f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.671f, 1.5f, 1.5f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.671f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _plusHexagon!!
    }

private var _plusHexagon: ImageVector? = null
