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

public val Icons.Bold.AnswerAlt: ImageVector
    get() {
        if (_answerAlt != null) {
            return _answerAlt!!
        }
        _answerAlt = Builder(name = "AnswerAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.5f, 0.0f)
                lineTo(3.5f, 0.0f)
                curveTo(1.57f, 0.0f, 0.0f, 1.57f, 0.0f, 3.5f)
                verticalLineToRelative(16.5f)
                horizontalLineToRelative(6.741f)
                lineToRelative(3.598f, 3.03f)
                curveToRelative(0.479f, 0.426f, 1.08f, 0.636f, 1.675f, 0.636f)
                curveToRelative(0.583f, 0.0f, 1.158f, -0.201f, 1.606f, -0.601f)
                lineToRelative(3.708f, -3.065f)
                horizontalLineToRelative(6.672f)
                lineTo(24.0f, 3.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(21.0f, 17.0f)
                horizontalLineToRelative(-4.752f)
                lineToRelative(-4.245f, 3.511f)
                lineToRelative(-4.167f, -3.511f)
                lineTo(3.0f, 17.0f)
                lineTo(3.0f, 3.5f)
                curveToRelative(0.0f, -0.275f, 0.224f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(17.0f)
                curveToRelative(0.275f, 0.0f, 0.5f, 0.225f, 0.5f, 0.5f)
                verticalLineToRelative(13.5f)
                close()
                moveTo(9.376f, 5.18f)
                curveToRelative(-1.313f, -0.55f, -2.651f, 0.221f, -2.937f, 1.458f)
                lineToRelative(-1.939f, 8.362f)
                horizontalLineToRelative(2.053f)
                lineToRelative(0.232f, -1.0f)
                horizontalLineToRelative(3.43f)
                lineToRelative(0.232f, 1.0f)
                horizontalLineToRelative(2.053f)
                lineToRelative(-1.922f, -8.291f)
                curveToRelative(-0.154f, -0.662f, -0.575f, -1.266f, -1.202f, -1.528f)
                close()
                moveTo(7.249f, 12.0f)
                lineToRelative(1.138f, -4.91f)
                curveToRelative(0.012f, -0.053f, 0.059f, -0.09f, 0.113f, -0.09f)
                reflectiveCurveToRelative(0.101f, 0.037f, 0.113f, 0.09f)
                lineToRelative(1.138f, 4.91f)
                horizontalLineToRelative(-2.503f)
                close()
                moveTo(14.0f, 6.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(14.0f, 11.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _answerAlt!!
    }

private var _answerAlt: ImageVector? = null
