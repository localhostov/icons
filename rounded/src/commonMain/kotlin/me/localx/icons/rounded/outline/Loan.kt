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

public val Icons.Outline.Loan: ImageVector
    get() {
        if (_loan != null) {
            return _loan!!
        }
        _loan = Builder(name = "Loan", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.018f, 8.785f)
                curveToRelative(-0.595f, -0.542f, -1.356f, -0.821f, -2.169f, -0.782f)
                curveToRelative(-0.804f, 0.037f, -1.545f, 0.386f, -2.085f, 0.981f)
                lineToRelative(-3.217f, 3.534f)
                curveToRelative(-0.427f, -0.704f, -1.124f, -1.224f, -1.945f, -1.425f)
                curveToRelative(0.246f, -0.477f, 0.398f, -1.009f, 0.398f, -1.582f)
                curveToRelative(0.0f, -2.517f, -1.763f, -5.472f, -4.115f, -6.569f)
                curveToRelative(0.337f, -0.352f, 0.666f, -0.743f, 0.93f, -1.163f)
                curveToRelative(0.488f, -0.772f, -0.048f, -1.78f, -0.962f, -1.78f)
                horizontalLineToRelative(-3.708f)
                curveToRelative(-0.914f, 0.0f, -1.449f, 1.008f, -0.962f, 1.78f)
                curveToRelative(0.265f, 0.42f, 0.593f, 0.81f, 0.93f, 1.163f)
                curveToRelative(-2.352f, 1.096f, -4.115f, 4.052f, -4.115f, 6.569f)
                curveToRelative(0.0f, 0.654f, 0.193f, 1.26f, 0.508f, 1.783f)
                curveToRelative(-1.468f, 0.593f, -2.508f, 2.027f, -2.508f, 3.705f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                horizontalLineToRelative(4.965f)
                curveToRelative(2.85f, 0.0f, 5.57f, -1.22f, 7.467f, -3.348f)
                lineToRelative(6.804f, -7.637f)
                curveToRelative(1.094f, -1.225f, 0.996f, -3.123f, -0.218f, -4.23f)
                close()
                moveTo(8.0f, 4.5f)
                curveToRelative(1.821f, 0.049f, 4.0f, 2.738f, 4.0f, 5.012f)
                curveToRelative(0.0f, 0.821f, -0.673f, 1.488f, -1.5f, 1.488f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.667f, -1.5f, -1.488f)
                curveToRelative(0.0f, -2.274f, 2.179f, -4.963f, 4.0f, -5.012f)
                close()
                moveTo(21.742f, 11.684f)
                lineToRelative(-6.805f, 7.638f)
                curveToRelative(-1.517f, 1.702f, -3.693f, 2.678f, -5.973f, 2.678f)
                horizontalLineToRelative(-4.965f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(8.857f)
                curveToRelative(0.63f, 0.0f, 1.143f, 0.512f, 1.143f, 1.142f)
                curveToRelative(0.0f, 0.564f, -0.422f, 1.051f, -0.98f, 1.131f)
                lineToRelative(-5.161f, 0.737f)
                curveToRelative(-0.547f, 0.078f, -0.927f, 0.584f, -0.849f, 1.131f)
                curveToRelative(0.078f, 0.546f, 0.584f, 0.922f, 1.132f, 0.848f)
                lineToRelative(5.161f, -0.737f)
                curveToRelative(1.175f, -0.168f, 2.128f, -0.988f, 2.514f, -2.058f)
                lineToRelative(4.427f, -4.865f)
                curveToRelative(0.181f, -0.2f, 0.43f, -0.316f, 0.699f, -0.329f)
                curveToRelative(0.271f, -0.007f, 0.528f, 0.082f, 0.728f, 0.262f)
                curveToRelative(0.407f, 0.372f, 0.44f, 1.009f, 0.072f, 1.421f)
                close()
            }
        }
        .build()
        return _loan!!
    }

private var _loan: ImageVector? = null
