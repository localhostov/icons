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

public val Icons.Bold.PaperPlaneTop: ImageVector
    get() {
        if (_paperPlaneTop != null) {
            return _paperPlaneTop!!
        }
        _paperPlaneTop = Builder(name = "PaperPlaneTop", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.697f, 8.382f)
                lineTo(4.566f, 0.324f)
                curveTo(3.396f, -0.243f, 2.021f, -0.049f, 1.056f, 0.82f)
                curveTo(0.087f, 1.692f, -0.25f, 3.048f, 0.197f, 4.272f)
                curveToRelative(0.024f, 0.064f, 4.106f, 7.734f, 4.106f, 7.734f)
                curveToRelative(0.0f, 0.0f, -4.005f, 7.664f, -4.028f, 7.727f)
                curveToRelative(-0.445f, 1.226f, -0.105f, 2.58f, 0.865f, 3.45f)
                curveToRelative(0.601f, 0.538f, 1.358f, 0.816f, 2.121f, 0.816f)
                curveToRelative(0.47f, 0.0f, 0.941f, -0.105f, 1.379f, -0.321f)
                lineToRelative(17.058f, -8.053f)
                curveToRelative(1.421f, -0.667f, 2.303f, -2.056f, 2.302f, -3.625f)
                curveToRelative(-0.002f, -1.569f, -0.885f, -2.956f, -2.303f, -3.619f)
                close()
                moveTo(3.001f, 3.184f)
                curveToRelative(-0.004f, -0.038f, 0.007f, -0.084f, 0.062f, -0.133f)
                curveToRelative(0.088f, -0.079f, 0.157f, -0.047f, 0.195f, -0.027f)
                curveToRelative(0.007f, 0.004f, 0.015f, 0.007f, 0.021f, 0.011f)
                lineToRelative(15.874f, 7.466f)
                lineTo(6.9f, 10.501f)
                lineTo(3.001f, 3.184f)
                close()
                moveTo(3.337f, 20.977f)
                curveToRelative(-0.036f, 0.019f, -0.106f, 0.053f, -0.193f, -0.026f)
                curveToRelative(-0.056f, -0.05f, -0.066f, -0.098f, -0.062f, -0.136f)
                lineToRelative(3.827f, -7.314f)
                horizontalLineToRelative(12.266f)
                lineToRelative(-15.837f, 7.477f)
                close()
            }
        }
        .build()
        return _paperPlaneTop!!
    }

private var _paperPlaneTop: ImageVector? = null
