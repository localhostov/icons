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

public val Icons.Bold.Comet: ImageVector
    get() {
        if (_comet != null) {
            return _comet!!
        }
        _comet = Builder(name = "Comet", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.659f, 24.0f)
                curveToRelative(-2.312f, 0.0f, -4.486f, -0.9f, -6.123f, -2.536f)
                curveTo(-4.767f, 13.742f, 5.308f, 3.76f, 9.476f, 1.469f)
                curveToRelative(0.904f, -0.581f, 2.052f, -0.622f, 2.996f, -0.107f)
                curveToRelative(0.829f, 0.453f, 1.383f, 1.271f, 1.504f, 2.193f)
                curveToRelative(2.528f, -1.812f, 4.265f, -2.881f, 5.377f, -3.316f)
                curveToRelative(1.275f, -0.5f, 2.672f, -0.208f, 3.645f, 0.765f)
                curveToRelative(0.972f, 0.973f, 1.265f, 2.369f, 0.765f, 3.645f)
                curveToRelative(-0.436f, 1.112f, -1.504f, 2.849f, -3.316f, 5.377f)
                curveToRelative(0.922f, 0.121f, 1.74f, 0.675f, 2.193f, 1.504f)
                curveToRelative(0.516f, 0.944f, 0.474f, 2.092f, -0.107f, 2.996f)
                curveToRelative(-1.43f, 2.223f, -6.653f, 9.476f, -13.872f, 9.476f)
                close()
                moveTo(11.0f, 4.056f)
                curveToRelative(-17.441f, 11.398f, -2.406f, 26.355f, 8.944f, 8.944f)
                horizontalLineToRelative(-2.444f)
                curveToRelative(-1.199f, 0.039f, -1.95f, -1.464f, -1.2f, -2.4f)
                curveToRelative(2.651f, -3.535f, 4.223f, -5.905f, 4.669f, -7.046f)
                curveToRelative(0.078f, -0.2f, -0.008f, -0.344f, -0.093f, -0.43f)
                curveToRelative(-0.086f, -0.085f, -0.229f, -0.169f, -0.43f, -0.093f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-1.141f, 0.446f, -3.511f, 2.018f, -7.046f, 4.669f)
                curveToRelative(-0.455f, 0.34f, -1.065f, 0.396f, -1.571f, 0.142f)
                curveToRelative(-0.508f, -0.254f, -0.829f, -0.773f, -0.829f, -1.342f)
                verticalLineToRelative(-2.444f)
                close()
                moveTo(9.0f, 18.0f)
                curveToRelative(3.957f, -0.1f, 3.956f, -5.9f, 0.0f, -6.0f)
                curveToRelative(-3.957f, 0.1f, -3.956f, 5.9f, 0.0f, 6.0f)
                close()
            }
        }
        .build()
        return _comet!!
    }

private var _comet: ImageVector? = null
