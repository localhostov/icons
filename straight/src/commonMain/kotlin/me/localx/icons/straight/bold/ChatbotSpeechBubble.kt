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

public val Icons.Bold.ChatbotSpeechBubble: ImageVector
    get() {
        if (_chatbotSpeechBubble != null) {
            return _chatbotSpeechBubble!!
        }
        _chatbotSpeechBubble = Builder(name = "ChatbotSpeechBubble", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.0f, 9.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                close()
                moveTo(8.5f, 11.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(12.0f, 13.0f)
                curveToRelative(-2.09f, 0.0f, -3.816f, -0.835f, -3.834f, -0.844f)
                lineToRelative(-1.337f, 2.686f)
                curveToRelative(0.095f, 0.047f, 2.35f, 1.158f, 5.171f, 1.158f)
                reflectiveCurveToRelative(5.076f, -1.111f, 5.171f, -1.158f)
                lineToRelative(-1.337f, -2.686f)
                curveToRelative(-0.018f, 0.009f, -1.744f, 0.844f, -3.834f, 0.844f)
                close()
                moveTo(24.0f, 9.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-2.003f)
                lineToRelative(-0.003f, 7.125f)
                curveToRelative(0.0f, 1.031f, -0.838f, 1.871f, -1.867f, 1.871f)
                curveToRelative(-0.512f, 0.0f, -0.81f, -0.192f, -0.81f, -0.192f)
                lineToRelative(-5.255f, -2.803f)
                lineTo(2.0f, 21.001f)
                verticalLineToRelative(-6.0f)
                lineTo(0.0f, 15.001f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(5.0f)
                lineTo(10.5f, 0.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(2.5f)
                reflectiveCurveToRelative(2.0f, 0.0f, 2.0f, 0.0f)
                close()
                moveTo(19.0f, 6.5f)
                curveToRelative(0.0f, -0.276f, -0.225f, -0.5f, -0.5f, -0.5f)
                lineTo(5.5f, 6.0f)
                curveToRelative(-0.275f, 0.0f, -0.5f, 0.224f, -0.5f, 0.5f)
                verticalLineToRelative(11.5f)
                horizontalLineToRelative(9.812f)
                lineToRelative(4.183f, 2.231f)
                lineToRelative(0.005f, -13.731f)
                close()
            }
        }
        .build()
        return _chatbotSpeechBubble!!
    }

private var _chatbotSpeechBubble: ImageVector? = null
