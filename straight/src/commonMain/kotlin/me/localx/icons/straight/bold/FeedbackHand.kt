package me.localx.icons.straight.bold

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

public val Icons.Bold.FeedbackHand: ImageVector
    get() {
        if (_feedbackHand != null) {
            return _feedbackHand!!
        }
        _feedbackHand = Builder(name = "FeedbackHand", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.0f, 14.11f)
                lineToRelative(11.0f, 3.143f)
                verticalLineToRelative(6.747f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-4.484f)
                lineToRelative(-8.0f, -2.286f)
                verticalLineToRelative(6.769f)
                horizontalLineToRelative(-3.0f)
                lineToRelative(-4.266f, -3.391f)
                curveToRelative(-0.866f, -0.722f, -0.983f, -2.008f, -0.261f, -2.874f)
                curveToRelative(0.722f, -0.866f, 2.008f, -0.983f, 2.874f, -0.261f)
                lineToRelative(1.64f, 1.222f)
                verticalLineToRelative(-10.234f)
                curveToRelative(0.0f, -0.911f, 0.799f, -1.632f, 1.739f, -1.479f)
                curveToRelative(0.737f, 0.12f, 1.273f, 0.812f, 1.273f, 1.56f)
                verticalLineToRelative(5.57f)
                close()
                moveTo(24.0f, 3.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(-12.0f)
                verticalLineToRelative(-2.421f)
                curveToRelative(0.0f, -0.353f, -0.064f, -0.693f, -0.162f, -1.019f)
                lineToRelative(0.168f, -0.13f)
                lineToRelative(1.63f, 1.261f)
                lineToRelative(0.378f, -0.262f)
                lineToRelative(-0.663f, -2.015f)
                lineToRelative(1.648f, -0.955f)
                verticalLineToRelative(-0.458f)
                horizontalLineToRelative(-2.163f)
                lineToRelative(-0.588f, -2.251f)
                horizontalLineToRelative(-0.486f)
                lineToRelative(-0.588f, 2.251f)
                horizontalLineToRelative(-5.338f)
                lineToRelative(-0.588f, -2.251f)
                horizontalLineToRelative(-0.486f)
                lineToRelative(-0.588f, 2.251f)
                horizontalLineToRelative(-2.175f)
                verticalLineToRelative(0.462f)
                lineToRelative(1.66f, 0.924f)
                lineToRelative(-0.652f, 2.039f)
                lineToRelative(0.36f, 0.272f)
                lineToRelative(1.638f, -1.266f)
                lineToRelative(0.133f, 0.103f)
                curveToRelative(-0.09f, 0.312f, -0.152f, 0.633f, -0.152f, 0.966f)
                verticalLineToRelative(2.501f)
                lineTo(0.0f, 11.002f)
                lineTo(0.0f, 3.5f)
                curveTo(0.0f, 1.57f, 1.57f, 0.0f, 3.5f, 0.0f)
                horizontalLineToRelative(17.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(22.0f, 5.0f)
                horizontalLineToRelative(-2.163f)
                lineToRelative(-0.588f, -2.251f)
                horizontalLineToRelative(-0.486f)
                lineToRelative(-0.588f, 2.251f)
                horizontalLineToRelative(-2.175f)
                verticalLineToRelative(0.462f)
                lineToRelative(1.66f, 0.924f)
                lineToRelative(-0.652f, 2.039f)
                lineToRelative(0.36f, 0.272f)
                lineToRelative(1.638f, -1.266f)
                lineToRelative(1.63f, 1.261f)
                lineToRelative(0.378f, -0.262f)
                lineToRelative(-0.663f, -2.015f)
                lineToRelative(1.648f, -0.955f)
                verticalLineToRelative(-0.458f)
                close()
            }
        }
        .build()
        return _feedbackHand!!
    }

private var _feedbackHand: ImageVector? = null
