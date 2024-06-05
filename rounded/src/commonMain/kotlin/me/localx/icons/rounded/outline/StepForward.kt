package me.localx.icons.rounded.outline

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

public val Icons.Outline.StepForward: ImageVector
    get() {
        if (_stepForward != null) {
            return _stepForward!!
        }
        _stepForward = Builder(name = "StepForward", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.0f, 0.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(7.482f)
                lineTo(9.363f, 0.783f)
                curveToRelative(-1.238f, -0.909f, -2.798f, -1.039f, -4.173f, -0.343f)
                curveToRelative(-1.372f, 0.696f, -2.19f, 2.029f, -2.19f, 3.567f)
                verticalLineToRelative(15.993f)
                curveToRelative(0.0f, 1.538f, 0.818f, 2.872f, 2.191f, 3.568f)
                curveToRelative(0.577f, 0.292f, 1.189f, 0.44f, 1.817f, 0.44f)
                curveToRelative(0.843f, 0.0f, 1.657f, -0.271f, 2.388f, -0.809f)
                lineToRelative(9.604f, -7.683f)
                verticalLineToRelative(7.483f)
                curveToRelative(0.0f, 0.552f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                lineTo(21.0f, 1.0f)
                curveToRelative(0.0f, -0.552f, -0.447f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(18.149f, 13.637f)
                lineToRelative(-9.97f, 7.976f)
                curveToRelative(-0.618f, 0.453f, -1.399f, 0.518f, -2.085f, 0.17f)
                curveToRelative(-0.695f, -0.353f, -1.095f, -1.002f, -1.095f, -1.783f)
                lineTo(4.999f, 4.007f)
                curveToRelative(0.0f, -0.78f, 0.399f, -1.43f, 1.094f, -1.782f)
                curveToRelative(0.303f, -0.153f, 0.618f, -0.229f, 0.926f, -0.229f)
                curveToRelative(0.401f, 0.0f, 0.791f, 0.127f, 1.128f, 0.374f)
                lineToRelative(10.036f, 8.018f)
                curveToRelative(0.519f, 0.38f, 0.816f, 0.967f, 0.816f, 1.611f)
                reflectiveCurveToRelative(-0.298f, 1.231f, -0.851f, 1.637f)
                close()
            }
        }
        .build()
        return _stepForward!!
    }

private var _stepForward: ImageVector? = null
