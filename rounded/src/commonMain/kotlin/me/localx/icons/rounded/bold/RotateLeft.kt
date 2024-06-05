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

public val Icons.Bold.RotateLeft: ImageVector
    get() {
        if (_rotateLeft != null) {
            return _rotateLeft!!
        }
        _rotateLeft = Builder(name = "RotateLeft", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.611f, 12.0f)
                curveToRelative(0.759f, 0.0f, 1.375f, 0.57f, 1.485f, 1.32f)
                curveToRelative(0.641f, 4.339f, 4.389f, 7.68f, 8.903f, 7.68f)
                curveToRelative(5.476f, 0.0f, 9.827f, -4.917f, 8.867f, -10.569f)
                curveToRelative(-0.453f, -2.665f, -2.148f, -5.023f, -4.523f, -6.313f)
                curveToRelative(-3.506f, -1.903f, -7.48f, -1.253f, -10.18f, 1.045f)
                lineToRelative(1.13f, 1.13f)
                curveToRelative(0.63f, 0.63f, 0.184f, 1.707f, -0.707f, 1.707f)
                horizontalLineTo(2.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineTo(2.414f)
                curveToRelative(0.0f, -0.891f, 1.077f, -1.337f, 1.707f, -0.707f)
                lineToRelative(1.332f, 1.332f)
                curveTo(7.6f, -0.115f, 12.921f, -1.068f, 17.637f, 1.408f)
                curveToRelative(3.32f, 1.743f, 5.664f, 5.027f, 6.223f, 8.735f)
                curveToRelative(1.122f, 7.437f, -4.633f, 13.857f, -11.86f, 13.857f)
                curveToRelative(-6.021f, 0.0f, -11.021f, -4.457f, -11.872f, -10.246f)
                curveToRelative(-0.135f, -0.92f, 0.553f, -1.754f, 1.483f, -1.754f)
                close()
            }
        }
        .build()
        return _rotateLeft!!
    }

private var _rotateLeft: ImageVector? = null
