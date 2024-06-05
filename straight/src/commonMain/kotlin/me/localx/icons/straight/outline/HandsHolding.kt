package me.localx.icons.straight.outline

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

public val Icons.Outline.HandsHolding: ImageVector
    get() {
        if (_handsHolding != null) {
            return _handsHolding!!
        }
        _handsHolding = Builder(name = "HandsHolding", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 6.0f)
                verticalLineToRelative(12.231f)
                curveToRelative(0.0f, 0.742f, -0.273f, 1.455f, -0.772f, 2.01f)
                lineToRelative(-3.391f, 3.759f)
                horizontalLineToRelative(-2.693f)
                lineToRelative(4.599f, -5.098f)
                curveToRelative(0.166f, -0.185f, 0.258f, -0.423f, 0.258f, -0.671f)
                verticalLineTo(6.0f)
                curveToRelative(0.0f, -0.551f, -0.449f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.449f, -1.0f, 1.0f)
                verticalLineTo(14.0f)
                horizontalLineToRelative(-0.005f)
                curveToRelative(0.0f, 0.684f, -0.232f, 1.369f, -0.696f, 1.922f)
                lineToRelative(-2.578f, 2.684f)
                lineToRelative(-1.441f, -1.386f)
                lineToRelative(2.533f, -2.634f)
                curveToRelative(0.13f, -0.157f, 0.195f, -0.369f, 0.192f, -0.586f)
                horizontalLineToRelative(-0.004f)
                verticalLineToRelative(-0.073f)
                curveToRelative(-0.018f, -0.212f, -0.101f, -0.425f, -0.254f, -0.596f)
                curveToRelative(-0.366f, -0.409f, -0.999f, -0.443f, -1.406f, -0.077f)
                lineToRelative(-2.908f, 2.676f)
                curveToRelative(0.366f, 0.507f, 0.569f, 1.122f, 0.569f, 1.756f)
                verticalLineToRelative(6.314f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-6.314f)
                curveToRelative(0.0f, -0.279f, -0.118f, -0.547f, -0.323f, -0.735f)
                lineToRelative(-4.026f, -3.705f)
                curveToRelative(-0.398f, -0.357f, -1.03f, -0.323f, -1.397f, 0.086f)
                curveToRelative(-0.328f, 0.367f, -0.337f, 0.928f, -0.021f, 1.305f)
                lineToRelative(2.57f, 2.671f)
                lineToRelative(-1.441f, 1.386f)
                lineToRelative(-2.616f, -2.721f)
                curveToRelative(-0.488f, -0.579f, -0.73f, -1.279f, -0.735f, -1.972f)
                horizontalLineToRelative(-0.011f)
                verticalLineTo(6.0f)
                curveToRelative(0.0f, -0.551f, -0.449f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.449f, -1.0f, 1.0f)
                verticalLineToRelative(12.231f)
                curveToRelative(0.0f, 0.248f, 0.092f, 0.486f, 0.258f, 0.671f)
                lineToRelative(4.599f, 5.098f)
                horizontalLineToRelative(-2.693f)
                lineToRelative(-3.391f, -3.759f)
                curveToRelative(-0.499f, -0.555f, -0.772f, -1.268f, -0.772f, -2.01f)
                verticalLineTo(6.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(5.171f)
                curveToRelative(0.998f, -0.35f, 2.153f, -0.161f, 2.996f, 0.593f)
                lineToRelative(3.004f, 2.764f)
                lineToRelative(2.995f, -2.755f)
                curveToRelative(0.85f, -0.761f, 2.006f, -0.951f, 3.005f, -0.602f)
                verticalLineTo(6.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.346f, 3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _handsHolding!!
    }

private var _handsHolding: ImageVector? = null
