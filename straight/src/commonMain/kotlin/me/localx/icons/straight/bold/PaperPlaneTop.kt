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
                moveToRelative(4.578f, 0.33f)
                curveTo(3.408f, -0.244f, 2.025f, -0.053f, 1.056f, 0.82f)
                curveTo(0.087f, 1.692f, -0.25f, 3.048f, 0.197f, 4.272f)
                lineToRelative(4.106f, 7.734f)
                lineTo(0.275f, 19.733f)
                curveToRelative(-0.445f, 1.226f, -0.105f, 2.58f, 0.865f, 3.45f)
                curveToRelative(0.598f, 0.536f, 1.352f, 0.813f, 2.115f, 0.813f)
                curveToRelative(0.477f, 0.0f, 0.958f, -0.108f, 1.407f, -0.329f)
                lineToRelative(19.232f, -11.671f)
                lineTo(4.578f, 0.33f)
                close()
                moveTo(3.001f, 3.184f)
                curveToRelative(-0.004f, -0.038f, 0.007f, -0.084f, 0.062f, -0.133f)
                curveToRelative(0.065f, -0.058f, 0.119f, -0.055f, 0.157f, -0.043f)
                lineToRelative(12.398f, 7.492f)
                lineTo(6.9f, 10.5f)
                lineTo(3.001f, 3.184f)
                close()
                moveTo(3.3f, 20.993f)
                curveToRelative(-0.039f, 0.013f, -0.093f, 0.015f, -0.156f, -0.042f)
                curveToRelative(-0.056f, -0.05f, -0.066f, -0.098f, -0.062f, -0.136f)
                lineToRelative(3.827f, -7.314f)
                horizontalLineToRelative(8.731f)
                lineToRelative(-12.339f, 7.492f)
                close()
            }
        }
        .build()
        return _paperPlaneTop!!
    }

private var _paperPlaneTop: ImageVector? = null
