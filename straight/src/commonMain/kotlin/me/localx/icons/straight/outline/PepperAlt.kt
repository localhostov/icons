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

public val Icons.Outline.PepperAlt: ImageVector
    get() {
        if (_pepperAlt != null) {
            return _pepperAlt!!
        }
        _pepperAlt = Builder(name = "PepperAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.333f, 4.0f)
                curveToRelative(-1.45f, 0.0f, -2.796f, 0.795f, -3.666f, 1.986f)
                curveToRelative(-0.593f, -0.812f, -1.41f, -1.432f, -2.328f, -1.75f)
                curveToRelative(0.351f, -1.468f, 0.893f, -2.616f, 1.226f, -3.227f)
                lineTo(12.81f, 0.053f)
                curveToRelative(-0.406f, 0.745f, -1.085f, 2.179f, -1.485f, 4.016f)
                curveToRelative(-1.214f, 0.178f, -2.269f, 0.82f, -2.991f, 1.746f)
                curveToRelative(-0.855f, -1.096f, -2.173f, -1.815f, -3.667f, -1.815f)
                curveTo(2.093f, 4.0f, 0.0f, 6.093f, 0.0f, 8.667f)
                curveToRelative(0.0f, 2.917f, 2.813f, 15.243f, 8.438f, 15.333f)
                curveToRelative(1.421f, 0.0f, 2.736f, -0.675f, 3.562f, -1.706f)
                curveToRelative(0.825f, 1.032f, 2.139f, 1.703f, 3.56f, 1.703f)
                curveToRelative(5.725f, -0.086f, 8.44f, -12.306f, 8.44f, -15.33f)
                curveToRelative(0.0f, -2.573f, -2.094f, -4.667f, -4.667f, -4.667f)
                close()
                moveTo(15.5f, 22.0f)
                curveToRelative(-1.208f, 0.0f, -2.217f, -0.86f, -2.449f, -2.0f)
                horizontalLineToRelative(-2.101f)
                curveToRelative(-0.232f, 1.14f, -1.242f, 2.0f, -2.449f, 2.0f)
                curveToRelative(-3.576f, 0.0f, -6.5f, -10.067f, -6.5f, -13.333f)
                curveToRelative(0.0f, -1.47f, 1.196f, -2.667f, 2.667f, -2.667f)
                reflectiveCurveToRelative(2.658f, 1.189f, 2.666f, 2.653f)
                curveToRelative(0.096f, 1.253f, 0.994f, 4.96f, 1.745f, 7.347f)
                horizontalLineToRelative(2.085f)
                curveToRelative(-0.73f, -2.095f, -1.732f, -5.737f, -1.828f, -7.333f)
                curveToRelative(0.0f, -1.47f, 1.196f, -2.667f, 2.667f, -2.667f)
                curveToRelative(1.396f, 0.0f, 2.667f, 1.43f, 2.667f, 3.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -1.57f, 1.271f, -3.0f, 2.666f, -3.0f)
                curveToRelative(1.471f, 0.0f, 2.667f, 1.196f, 2.667f, 2.667f)
                curveToRelative(0.0f, 3.124f, -2.771f, 13.333f, -6.5f, 13.333f)
                close()
            }
        }
        .build()
        return _pepperAlt!!
    }

private var _pepperAlt: ImageVector? = null
