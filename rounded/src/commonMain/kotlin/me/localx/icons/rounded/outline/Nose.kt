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

public val Icons.Outline.Nose: ImageVector
    get() {
        if (_nose != null) {
            return _nose!!
        }
        _nose = Builder(name = "Nose", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.927f, 12.128f)
                curveToRelative(0.206f, 0.512f, -0.043f, 1.094f, -0.555f, 1.3f)
                curveToRelative(-1.216f, 0.491f, -4.373f, 2.269f, -4.373f, 4.572f)
                curveToRelative(0.0f, 2.78f, 2.779f, 4.03f, 2.897f, 4.082f)
                curveToRelative(0.504f, 0.222f, 0.737f, 0.81f, 0.518f, 1.314f)
                curveToRelative(-0.164f, 0.378f, -0.531f, 0.604f, -0.917f, 0.604f)
                curveToRelative(-0.131f, 0.0f, -0.264f, -0.026f, -0.393f, -0.081f)
                curveToRelative(-0.167f, -0.071f, -4.106f, -1.807f, -4.106f, -5.919f)
                reflectiveCurveToRelative(5.399f, -6.337f, 5.628f, -6.429f)
                curveToRelative(0.512f, -0.206f, 1.093f, 0.044f, 1.299f, 0.557f)
                close()
                moveTo(22.999f, 19.44f)
                curveToRelative(-0.021f, -1.424f, -0.78f, -2.975f, -2.258f, -4.61f)
                curveToRelative(-1.452f, -1.606f, -2.898f, -4.765f, -3.955f, -7.071f)
                lineToRelative(-0.419f, -0.909f)
                curveToRelative(-0.986f, -2.124f, -1.302f, -3.211f, -1.358f, -5.87f)
                curveToRelative(-0.012f, -0.552f, -0.476f, -0.967f, -1.021f, -0.979f)
                curveToRelative(-0.552f, 0.012f, -0.99f, 0.469f, -0.979f, 1.021f)
                curveToRelative(0.063f, 2.975f, 0.459f, 4.333f, 1.545f, 6.669f)
                lineToRelative(0.414f, 0.9f)
                curveToRelative(1.11f, 2.425f, 2.631f, 5.744f, 4.289f, 7.579f)
                curveToRelative(1.14f, 1.262f, 1.752f, 2.555f, 1.752f, 3.472f)
                curveToRelative(0.0f, 0.007f, 0.083f, 0.777f, -0.457f, 1.399f)
                curveToRelative(-0.511f, 0.589f, -1.488f, 0.906f, -2.807f, 0.944f)
                curveToRelative(-1.162f, -0.075f, -1.853f, -0.648f, -2.705f, -1.367f)
                curveToRelative(-0.496f, -0.42f, -1.008f, -0.854f, -1.652f, -1.219f)
                curveToRelative(-1.033f, -0.586f, -1.812f, -0.466f, -2.282f, -0.259f)
                curveToRelative(-0.549f, 0.239f, -0.812f, 0.646f, -0.88f, 0.766f)
                reflectiveCurveToRelative(-0.282f, 0.554f, -0.205f, 1.148f)
                curveToRelative(0.065f, 0.509f, 0.36f, 1.238f, 1.394f, 1.824f)
                curveToRelative(1.845f, 1.046f, 3.743f, 1.115f, 6.078f, 1.12f)
                curveToRelative(0.002f, 0.0f, 0.69f, -0.028f, 0.779f, -0.054f)
                curveToRelative(1.678f, -0.127f, 2.968f, -0.645f, 3.791f, -1.593f)
                curveToRelative(1.024f, -1.182f, 0.972f, -2.542f, 0.936f, -2.912f)
                close()
            }
        }
        .build()
        return _nose!!
    }

private var _nose: ImageVector? = null
