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

public val Icons.Outline.ChatbotSpeechBubble: ImageVector
    get() {
        if (_chatbotSpeechBubble != null) {
            return _chatbotSpeechBubble!!
        }
        _chatbotSpeechBubble = Builder(name = "ChatbotSpeechBubble", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 9.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                horizontalLineToRelative(-6.0f)
                lineTo(13.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(3.0f)
                lineTo(0.0f, 9.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(12.697f)
                lineToRelative(3.963f, 2.642f)
                curveToRelative(0.36f, 0.24f, 0.775f, 0.361f, 1.191f, 0.361f)
                curveToRelative(0.348f, 0.0f, 0.696f, -0.084f, 1.015f, -0.255f)
                curveToRelative(0.699f, -0.375f, 1.134f, -1.1f, 1.134f, -1.894f)
                verticalLineToRelative(-6.855f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(20.0f, 21.855f)
                curveToRelative(0.0f, 0.022f, 0.0f, 0.089f, -0.078f, 0.13f)
                curveToRelative(-0.08f, 0.043f, -0.136f, 0.004f, -0.152f, -0.007f)
                lineToRelative(-4.467f, -2.978f)
                lineTo(4.0f, 19.0f)
                lineTo(4.0f, 6.0f)
                curveToRelative(0.0f, -0.551f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(15.855f)
                close()
                moveTo(7.0f, 9.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                close()
                moveTo(14.0f, 9.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                close()
                moveTo(16.336f, 13.252f)
                lineToRelative(1.33f, 1.493f)
                curveToRelative(-0.103f, 0.092f, -2.559f, 2.254f, -5.666f, 2.254f)
                reflectiveCurveToRelative(-5.563f, -2.162f, -5.666f, -2.254f)
                lineToRelative(1.33f, -1.493f)
                curveToRelative(0.02f, 0.018f, 2.005f, 1.748f, 4.336f, 1.748f)
                reflectiveCurveToRelative(4.316f, -1.73f, 4.336f, -1.748f)
                close()
            }
        }
        .build()
        return _chatbotSpeechBubble!!
    }

private var _chatbotSpeechBubble: ImageVector? = null
