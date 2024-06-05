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
                curveToRelative(-0.427f, -0.705f, -1.124f, -1.225f, -1.945f, -1.425f)
                curveToRelative(0.246f, -0.477f, 0.398f, -1.009f, 0.398f, -1.582f)
                curveToRelative(0.0f, -2.662f, -1.971f, -5.811f, -4.526f, -6.736f)
                curveToRelative(0.759f, -0.748f, 1.526f, -1.756f, 1.526f, -2.776f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(0.0f, 1.02f, 0.767f, 2.028f, 1.526f, 2.776f)
                curveToRelative(-2.555f, 0.925f, -4.526f, 4.074f, -4.526f, 6.736f)
                curveToRelative(0.0f, 0.561f, 0.146f, 1.083f, 0.383f, 1.553f)
                curveToRelative(-1.359f, 0.285f, -2.383f, 1.492f, -2.383f, 2.935f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(10.448f)
                lineToRelative(9.787f, -10.985f)
                curveToRelative(1.094f, -1.225f, 0.996f, -3.123f, -0.218f, -4.23f)
                close()
                moveTo(8.0f, 4.5f)
                curveToRelative(1.832f, 0.0f, 4.0f, 2.717f, 4.0f, 5.012f)
                curveToRelative(0.0f, 0.821f, -0.673f, 1.488f, -1.5f, 1.488f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.667f, -1.5f, -1.488f)
                curveToRelative(0.0f, -2.295f, 2.168f, -5.012f, 4.0f, -5.012f)
                close()
                moveTo(21.742f, 11.684f)
                lineToRelative(-9.19f, 10.316f)
                lineTo(3.0f, 22.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.449f, -1.0f, -1.0f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -0.551f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(9.857f)
                curveToRelative(0.63f, 0.0f, 1.143f, 0.512f, 1.143f, 1.142f)
                curveToRelative(0.0f, 0.564f, -0.422f, 1.051f, -0.98f, 1.131f)
                lineToRelative(-5.161f, 0.737f)
                lineToRelative(0.283f, 1.979f)
                lineToRelative(5.161f, -0.737f)
                curveToRelative(1.175f, -0.168f, 2.129f, -0.988f, 2.514f, -2.059f)
                lineToRelative(4.427f, -4.864f)
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
