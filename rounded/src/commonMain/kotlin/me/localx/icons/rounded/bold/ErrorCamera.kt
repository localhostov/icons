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

public val Icons.Bold.ErrorCamera: ImageVector
    get() {
        if (_errorCamera != null) {
            return _errorCamera!!
        }
        _errorCamera = Builder(name = "ErrorCamera", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.539f, 11.0f)
                horizontalLineToRelative(5.961f)
                curveToRelative(1.378f, 0.0f, 2.5f, -1.121f, 2.5f, -2.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-0.073f)
                lineToRelative(0.415f, -0.829f)
                curveToRelative(0.232f, -0.465f, 0.208f, -1.018f, -0.066f, -1.46f)
                curveToRelative(-0.273f, -0.441f, -0.756f, -0.711f, -1.276f, -0.711f)
                lineTo(6.5f, -0.0f)
                curveTo(4.019f, 0.0f, 2.0f, 2.019f, 2.0f, 4.5f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 2.481f, 2.019f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(2.836f)
                lineToRelative(-1.267f, 3.378f)
                curveToRelative(-0.364f, 0.97f, -1.305f, 1.622f, -2.341f, 1.622f)
                lineTo(3.0f, 16.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -0.828f, -0.671f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 0.828f, 0.671f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(2.728f)
                curveToRelative(2.28f, 0.0f, 4.349f, -1.435f, 5.149f, -3.569f)
                lineToRelative(1.662f, -4.431f)
                close()
                moveTo(5.0f, 6.5f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.827f, 0.673f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(12.073f)
                lineToRelative(-0.415f, 0.829f)
                curveToRelative(-0.104f, 0.208f, -0.158f, 0.438f, -0.158f, 0.671f)
                verticalLineToRelative(3.5f)
                lineTo(6.5f, 8.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                close()
                moveTo(23.756f, 21.337f)
                lineToRelative(-5.197f, -8.458f)
                curveToRelative(-0.683f, -1.171f, -2.376f, -1.171f, -3.059f, 0.0f)
                lineToRelative(-5.256f, 8.458f)
                curveToRelative(-0.689f, 1.181f, 0.163f, 2.663f, 1.53f, 2.663f)
                horizontalLineToRelative(10.453f)
                curveToRelative(1.367f, 0.0f, 2.218f, -1.483f, 1.53f, -2.663f)
                close()
                moveTo(17.0f, 23.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(18.0f, 19.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _errorCamera!!
    }

private var _errorCamera: ImageVector? = null
