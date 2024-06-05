package me.localx.icons.rounded.filled

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

public val Icons.Filled.ChatbotSpeechBubble: ImageVector
    get() {
        if (_chatbotSpeechBubble != null) {
            return _chatbotSpeechBubble!!
        }
        _chatbotSpeechBubble = Builder(name = "ChatbotSpeechBubble", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.5f, 9.0f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(13.0f, 1.0f)
                curveToRelative(0.0f, -0.552f, -0.447f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, 2.243f, -5.0f, 5.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-0.827f, 0.0f, -1.5f, 0.673f, -1.5f, 1.5f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.827f, 0.673f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(7.697f)
                lineToRelative(3.963f, 2.642f)
                curveToRelative(0.36f, 0.24f, 0.775f, 0.361f, 1.191f, 0.361f)
                curveToRelative(0.348f, 0.0f, 0.696f, -0.084f, 1.015f, -0.255f)
                curveToRelative(0.699f, -0.375f, 1.134f, -1.1f, 1.134f, -1.894f)
                verticalLineToRelative(-6.855f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.827f, 0.0f, 1.5f, -0.673f, 1.5f, -1.5f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.827f, -0.673f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(8.5f, 8.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(16.531f, 15.573f)
                curveToRelative(-1.037f, 0.651f, -2.666f, 1.427f, -4.531f, 1.427f)
                reflectiveCurveToRelative(-3.494f, -0.776f, -4.531f, -1.427f)
                curveToRelative(-0.468f, -0.293f, -0.609f, -0.911f, -0.315f, -1.378f)
                curveToRelative(0.294f, -0.467f, 0.911f, -0.609f, 1.378f, -0.316f)
                curveToRelative(0.815f, 0.512f, 2.079f, 1.121f, 3.469f, 1.121f)
                reflectiveCurveToRelative(2.653f, -0.609f, 3.469f, -1.121f)
                curveToRelative(0.466f, -0.294f, 1.085f, -0.152f, 1.378f, 0.316f)
                curveToRelative(0.294f, 0.468f, 0.152f, 1.085f, -0.315f, 1.378f)
                close()
                moveTo(15.5f, 11.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _chatbotSpeechBubble!!
    }

private var _chatbotSpeechBubble: ImageVector? = null
