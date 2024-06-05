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

public val Icons.Filled.FeedbackHand: ImageVector
    get() {
        if (_feedbackHand != null) {
            return _feedbackHand!!
        }
        _feedbackHand = Builder(name = "FeedbackHand", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.0f, 16.462f)
                lineToRelative(9.0f, 3.538f)
                verticalLineToRelative(4.0f)
                lineTo(5.538f, 24.0f)
                lineToRelative(-1.821f, -1.628f)
                curveToRelative(-0.917f, -0.858f, -0.96f, -2.307f, -0.098f, -3.23f)
                curveToRelative(0.861f, -0.922f, 2.313f, -0.97f, 3.235f, -0.109f)
                curveToRelative(0.034f, 0.032f, 1.069f, 0.898f, 2.145f, 1.784f)
                verticalLineToRelative(-8.817f)
                curveToRelative(0.0f, -1.215f, 1.083f, -2.176f, 2.336f, -1.973f)
                curveToRelative(0.983f, 0.16f, 1.664f, 1.083f, 1.664f, 2.08f)
                verticalLineToRelative(4.355f)
                close()
                moveTo(21.0f, 0.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.346f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.0f, -1.904f, 1.33f, -3.497f, 3.112f, -3.901f)
                lineToRelative(0.548f, -1.714f)
                lineToRelative(-1.66f, -0.924f)
                verticalLineToRelative(-0.462f)
                horizontalLineToRelative(2.175f)
                lineToRelative(0.588f, -2.251f)
                horizontalLineToRelative(0.486f)
                lineToRelative(0.588f, 2.251f)
                horizontalLineToRelative(2.163f)
                verticalLineToRelative(0.458f)
                lineToRelative(-1.648f, 0.955f)
                lineToRelative(0.663f, 2.015f)
                lineToRelative(-0.572f, 0.405f)
                curveToRelative(0.947f, 0.731f, 1.557f, 1.878f, 1.557f, 3.167f)
                horizontalLineToRelative(9.0f)
                lineTo(24.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(8.0f, 5.458f)
                lineToRelative(-1.648f, 0.955f)
                lineToRelative(0.663f, 2.015f)
                lineToRelative(-0.378f, 0.262f)
                lineToRelative(-1.63f, -1.261f)
                lineToRelative(-1.638f, 1.266f)
                lineToRelative(-0.36f, -0.272f)
                lineToRelative(0.652f, -2.039f)
                lineToRelative(-1.66f, -0.924f)
                verticalLineToRelative(-0.462f)
                horizontalLineToRelative(2.175f)
                lineToRelative(0.588f, -2.251f)
                horizontalLineToRelative(0.486f)
                lineToRelative(0.588f, 2.251f)
                horizontalLineToRelative(2.163f)
                verticalLineToRelative(0.458f)
                close()
                moveTo(22.0f, 5.458f)
                lineToRelative(-1.648f, 0.955f)
                lineToRelative(0.663f, 2.015f)
                lineToRelative(-0.378f, 0.262f)
                lineToRelative(-1.63f, -1.261f)
                lineToRelative(-1.638f, 1.266f)
                lineToRelative(-0.36f, -0.272f)
                lineToRelative(0.652f, -2.039f)
                lineToRelative(-1.66f, -0.924f)
                verticalLineToRelative(-0.462f)
                horizontalLineToRelative(2.175f)
                lineToRelative(0.588f, -2.251f)
                horizontalLineToRelative(0.486f)
                lineToRelative(0.588f, 2.251f)
                horizontalLineToRelative(2.163f)
                verticalLineToRelative(0.458f)
                close()
            }
        }
        .build()
        return _feedbackHand!!
    }

private var _feedbackHand: ImageVector? = null
