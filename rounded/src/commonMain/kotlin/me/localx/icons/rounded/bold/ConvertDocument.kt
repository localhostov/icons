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

public val Icons.Bold.ConvertDocument: ImageVector
    get() {
        if (_convertDocument != null) {
            return _convertDocument!!
        }
        _convertDocument = Builder(name = "ConvertDocument", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 9.157f)
                verticalLineToRelative(9.343f)
                curveToRelative(0.0f, 2.481f, -2.019f, 4.5f, -4.5f, 4.5f)
                horizontalLineToRelative(-8.0f)
                curveToRelative(-2.481f, 0.0f, -4.5f, -2.019f, -4.5f, -4.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(0.673f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.827f, 0.0f, 1.5f, -0.673f, 1.5f, -1.5f)
                verticalLineToRelative(-8.5f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, -0.895f, -2.0f, -2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-0.827f, 0.0f, -1.5f, 0.673f, -1.5f, 1.5f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.829f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.671f, -1.5f, -1.5f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -2.481f, 2.019f, -4.5f, 4.5f, -4.5f)
                horizontalLineToRelative(4.343f)
                curveToRelative(1.47f, 0.0f, 2.851f, 0.572f, 3.89f, 1.611f)
                lineToRelative(2.656f, 2.657f)
                curveToRelative(1.039f, 1.039f, 1.611f, 2.42f, 1.611f, 3.889f)
                close()
                moveTo(4.5f, 20.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                lineTo(3.0f, 5.5f)
                curveToRelative(0.0f, -0.827f, 0.673f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, -0.671f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                curveTo(2.019f, 1.0f, 0.0f, 3.019f, 0.0f, 5.5f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 2.481f, 2.019f, 4.5f, 4.5f, 4.5f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(12.001f, 16.538f)
                curveToRelative(0.0f, 0.856f, 1.034f, 1.284f, 1.639f, 0.679f)
                lineToRelative(3.038f, -3.038f)
                curveToRelative(0.375f, -0.375f, 0.375f, -0.983f, 0.0f, -1.358f)
                lineToRelative(-3.038f, -3.038f)
                curveToRelative(-0.605f, -0.605f, -1.639f, -0.176f, -1.639f, 0.679f)
                verticalLineToRelative(1.538f)
                horizontalLineToRelative(-5.501f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(5.501f)
                verticalLineToRelative(1.538f)
                close()
            }
        }
        .build()
        return _convertDocument!!
    }

private var _convertDocument: ImageVector? = null
