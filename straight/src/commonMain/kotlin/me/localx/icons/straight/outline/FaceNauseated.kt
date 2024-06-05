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

public val Icons.Outline.FaceNauseated: ImageVector
    get() {
        if (_faceNauseated != null) {
            return _faceNauseated!!
        }
        _faceNauseated = Builder(name = "FaceNauseated", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 22.0f)
                curveToRelative(-5.514f, 0.0f, -10.0f, -4.486f, -10.0f, -10.0f)
                reflectiveCurveTo(6.486f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.486f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.486f, 10.0f, -10.0f, 10.0f)
                close()
                moveTo(7.0f, 11.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                close()
                moveTo(17.0f, 11.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(5.37f, 10.429f)
                lineToRelative(-0.741f, -1.857f)
                curveToRelative(1.187f, -0.474f, 2.266f, -1.372f, 3.039f, -2.531f)
                lineToRelative(1.664f, 1.109f)
                curveToRelative(-1.01f, 1.515f, -2.38f, 2.648f, -3.962f, 3.279f)
                close()
                moveTo(19.371f, 8.572f)
                lineToRelative(-0.741f, 1.857f)
                curveToRelative(-1.582f, -0.631f, -2.952f, -1.765f, -3.962f, -3.279f)
                lineToRelative(1.664f, -1.109f)
                curveToRelative(0.773f, 1.159f, 1.852f, 2.058f, 3.039f, 2.531f)
                close()
                moveTo(16.825f, 15.475f)
                curveToRelative(-0.269f, 0.272f, -0.825f, 1.005f, -0.825f, 1.525f)
                reflectiveCurveToRelative(0.556f, 1.253f, 0.825f, 1.525f)
                lineToRelative(-1.417f, 1.412f)
                curveToRelative(-0.11f, -0.111f, -0.878f, -0.904f, -1.231f, -1.938f)
                horizontalLineToRelative(-4.354f)
                curveToRelative(-0.353f, 1.033f, -1.121f, 1.827f, -1.231f, 1.938f)
                lineToRelative(-1.414f, -1.414f)
                curveToRelative(0.267f, -0.271f, 0.822f, -1.003f, 0.822f, -1.523f)
                reflectiveCurveToRelative(-0.556f, -1.253f, -0.825f, -1.525f)
                lineToRelative(1.417f, -1.412f)
                curveToRelative(0.11f, 0.111f, 0.878f, 0.904f, 1.231f, 1.938f)
                horizontalLineToRelative(4.354f)
                curveToRelative(0.353f, -1.033f, 1.121f, -1.827f, 1.231f, -1.938f)
                lineToRelative(0.707f, 0.707f)
                lineToRelative(0.709f, 0.705f)
                close()
            }
        }
        .build()
        return _faceNauseated!!
    }

private var _faceNauseated: ImageVector? = null
