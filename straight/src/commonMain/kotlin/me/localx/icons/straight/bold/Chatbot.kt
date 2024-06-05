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

public val Icons.Bold.Chatbot: ImageVector
    get() {
        if (_chatbot != null) {
            return _chatbot!!
        }
        _chatbot = Builder(name = "Chatbot", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.17f, 0.829f)
                curveToRelative(-0.535f, -0.535f, -1.247f, -0.829f, -2.003f, -0.829f)
                horizontalLineToRelative(-0.002f)
                lineToRelative(-7.333f, 0.002f)
                curveToRelative(-1.562f, 0.0f, -2.833f, 1.273f, -2.832f, 2.835f)
                lineToRelative(0.003f, 8.415f)
                curveToRelative(0.0f, 0.963f, 0.783f, 1.748f, 1.745f, 1.748f)
                curveToRelative(0.251f, 0.0f, 0.428f, -0.029f, 0.692f, -0.129f)
                lineToRelative(2.96f, -1.871f)
                horizontalLineToRelative(7.6f)
                lineTo(24.0f, 2.833f)
                curveToRelative(0.0f, -0.757f, -0.295f, -1.469f, -0.83f, -2.004f)
                close()
                moveTo(21.0f, 8.0f)
                horizontalLineToRelative(-5.469f)
                lineToRelative(-1.528f, 0.966f)
                lineToRelative(-0.003f, -5.964f)
                lineToRelative(7.0f, -0.002f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(12.5f, 19.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(7.5f, 16.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(18.0f, 15.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.0f)
                lineTo(2.0f, 24.0f)
                verticalLineToRelative(-4.0f)
                lineTo(0.0f, 20.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(3.503f)
                verticalLineToRelative(0.252f)
                curveToRelative(0.0f, 1.089f, 0.474f, 2.062f, 1.218f, 2.748f)
                horizontalLineToRelative(-4.721f)
                curveToRelative(-0.276f, 0.0f, -0.5f, 0.224f, -0.5f, 0.5f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-6.5f)
                curveToRelative(0.0f, -0.078f, -0.022f, -0.15f, -0.054f, -0.216f)
                lineToRelative(2.703f, -1.284f)
                curveToRelative(0.219f, 0.456f, 0.351f, 0.961f, 0.351f, 1.5f)
                verticalLineToRelative(0.5f)
                close()
            }
        }
        .build()
        return _chatbot!!
    }

private var _chatbot: ImageVector? = null
