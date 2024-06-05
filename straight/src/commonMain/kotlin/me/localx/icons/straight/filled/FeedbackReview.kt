package me.localx.icons.straight.filled

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

public val Icons.Filled.FeedbackReview: ImageVector
    get() {
        if (_feedbackReview != null) {
            return _feedbackReview!!
        }
        _feedbackReview = Builder(name = "FeedbackReview", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.0f, 14.0f)
                verticalLineToRelative(2.0f)
                lineToRelative(-1.5f, 8.0f)
                horizontalLineToRelative(-9.5f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, -0.895f, -2.0f, -2.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -1.105f, 0.895f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(3.026f)
                lineToRelative(2.193f, -4.149f)
                curveToRelative(0.18f, -0.352f, 0.428f, -0.614f, 0.682f, -0.719f)
                curveToRelative(0.212f, -0.088f, 0.427f, -0.132f, 0.64f, -0.132f)
                curveToRelative(0.682f, 0.0f, 1.244f, 0.446f, 1.432f, 1.136f)
                curveToRelative(0.022f, 0.08f, 0.05f, 0.265f, -0.007f, 0.599f)
                lineToRelative(-0.58f, 3.265f)
                horizontalLineToRelative(6.613f)
                close()
                moveTo(12.011f, 6.238f)
                lineToRelative(2.173f, 1.68f)
                lineToRelative(0.504f, -0.349f)
                lineToRelative(-0.884f, -2.686f)
                lineToRelative(2.197f, -1.273f)
                verticalLineToRelative(-0.611f)
                horizontalLineToRelative(-2.883f)
                lineToRelative(-0.784f, -3.0f)
                horizontalLineToRelative(-0.648f)
                lineToRelative(-0.784f, 3.0f)
                horizontalLineToRelative(-2.899f)
                verticalLineToRelative(0.615f)
                lineToRelative(2.212f, 1.231f)
                lineToRelative(-0.869f, 2.717f)
                lineToRelative(0.48f, 0.362f)
                lineToRelative(2.183f, -1.687f)
                close()
                moveTo(4.01f, 9.238f)
                lineToRelative(2.173f, 1.68f)
                lineToRelative(0.504f, -0.349f)
                lineToRelative(-0.884f, -2.686f)
                lineToRelative(2.197f, -1.273f)
                verticalLineToRelative(-0.611f)
                horizontalLineToRelative(-2.883f)
                lineToRelative(-0.784f, -3.0f)
                horizontalLineToRelative(-0.648f)
                lineToRelative(-0.784f, 3.0f)
                lineTo(0.003f, 5.999f)
                verticalLineToRelative(0.615f)
                lineToRelative(2.212f, 1.231f)
                lineToRelative(-0.869f, 2.717f)
                lineToRelative(0.48f, 0.362f)
                lineToRelative(2.183f, -1.687f)
                close()
                moveTo(20.01f, 9.238f)
                lineToRelative(2.173f, 1.68f)
                lineToRelative(0.504f, -0.349f)
                lineToRelative(-0.884f, -2.686f)
                lineToRelative(2.197f, -1.273f)
                verticalLineToRelative(-0.611f)
                horizontalLineToRelative(-2.883f)
                lineToRelative(-0.784f, -3.0f)
                horizontalLineToRelative(-0.648f)
                lineToRelative(-0.784f, 3.0f)
                horizontalLineToRelative(-2.899f)
                verticalLineToRelative(0.615f)
                lineToRelative(2.212f, 1.231f)
                lineToRelative(-0.869f, 2.717f)
                lineToRelative(0.48f, 0.362f)
                lineToRelative(2.183f, -1.687f)
                close()
            }
        }
        .build()
        return _feedbackReview!!
    }

private var _feedbackReview: ImageVector? = null
