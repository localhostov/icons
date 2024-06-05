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

public val Icons.Bold.PlaneSlash: ImageVector
    get() {
        if (_planeSlash != null) {
            return _planeSlash!!
        }
        _planeSlash = Builder(name = "PlaneSlash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.005f, 16.0f)
                curveToRelative(1.175f, 0.0f, 2.286f, -0.514f, 3.048f, -1.409f)
                reflectiveCurveToRelative(1.089f, -2.081f, 0.898f, -3.252f)
                curveToRelative(-0.31f, -1.903f, -2.064f, -3.339f, -4.08f, -3.339f)
                horizontalLineToRelative(-1.996f)
                lineToRelative(-3.465f, -6.223f)
                curveToRelative(-0.598f, -1.097f, -1.745f, -1.777f, -2.993f, -1.777f)
                horizontalLineToRelative(-4.965f)
                lineToRelative(1.975f, 6.307f)
                lineTo(2.161f, 0.039f)
                lineTo(0.04f, 2.16f)
                lineToRelative(21.8f, 21.801f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(-5.84f, -5.84f)
                horizontalLineToRelative(1.885f)
                close()
                moveTo(10.536f, 3.0f)
                horizontalLineToRelative(0.882f)
                curveToRelative(0.149f, 0.0f, 0.287f, 0.082f, 0.365f, 0.225f)
                lineToRelative(4.33f, 7.775f)
                horizontalLineToRelative(3.758f)
                curveToRelative(0.553f, 0.0f, 1.044f, 0.36f, 1.119f, 0.821f)
                curveToRelative(0.067f, 0.412f, -0.111f, 0.694f, -0.223f, 0.825f)
                curveToRelative(-0.191f, 0.225f, -0.469f, 0.354f, -0.763f, 0.354f)
                horizontalLineToRelative(-3.893f)
                lineToRelative(-0.355f, 0.637f)
                lineToRelative(-2.753f, -2.753f)
                lineToRelative(-2.469f, -7.884f)
                close()
                moveTo(13.229f, 18.178f)
                lineToRelative(2.206f, 2.206f)
                lineToRelative(-1.03f, 1.85f)
                curveToRelative(-0.591f, 1.084f, -1.737f, 1.766f, -2.986f, 1.766f)
                horizontalLineToRelative(-4.964f)
                lineToRelative(2.505f, -8.0f)
                horizontalLineToRelative(-4.024f)
                lineToRelative(-0.613f, 0.925f)
                curveToRelative(-0.445f, 0.671f, -1.196f, 1.075f, -2.001f, 1.075f)
                lineTo(0.01f, 18.0f)
                lineToRelative(2.197f, -6.0f)
                lineTo(-0.005f, 6.0f)
                horizontalLineToRelative(1.056f)
                lineToRelative(4.944f, 4.944f)
                verticalLineToRelative(2.056f)
                horizontalLineToRelative(2.056f)
                lineToRelative(3.8f, 3.8f)
                lineToRelative(-1.315f, 4.2f)
                horizontalLineToRelative(0.882f)
                curveToRelative(0.149f, 0.0f, 0.287f, -0.081f, 0.358f, -0.213f)
                lineToRelative(1.453f, -2.609f)
                close()
            }
        }
        .build()
        return _planeSlash!!
    }

private var _planeSlash: ImageVector? = null
