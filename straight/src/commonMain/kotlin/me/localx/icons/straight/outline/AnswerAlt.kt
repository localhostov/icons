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

public val Icons.Outline.AnswerAlt: ImageVector
    get() {
        if (_answerAlt != null) {
            return _answerAlt!!
        }
        _answerAlt = Builder(name = "AnswerAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.0f, 13.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(10.078f, 5.709f)
                lineToRelative(2.422f, 10.291f)
                horizontalLineToRelative(-2.053f)
                lineToRelative(-0.706f, -3.0f)
                horizontalLineToRelative(-3.481f)
                lineToRelative(-0.706f, 3.0f)
                horizontalLineToRelative(-2.053f)
                lineToRelative(2.439f, -10.362f)
                curveToRelative(0.287f, -1.237f, 1.625f, -2.008f, 2.937f, -1.458f)
                curveToRelative(0.627f, 0.263f, 1.049f, 0.866f, 1.202f, 1.528f)
                close()
                moveTo(9.269f, 11.0f)
                lineToRelative(-1.156f, -4.91f)
                curveToRelative(-0.012f, -0.053f, -0.059f, -0.09f, -0.113f, -0.09f)
                reflectiveCurveToRelative(-0.101f, 0.037f, -0.113f, 0.09f)
                lineToRelative(-1.156f, 4.91f)
                horizontalLineToRelative(2.539f)
                close()
                moveTo(24.0f, 3.0f)
                verticalLineToRelative(17.0f)
                horizontalLineToRelative(-6.853f)
                lineToRelative(-3.846f, 3.18f)
                curveToRelative(-0.362f, 0.322f, -0.825f, 0.485f, -1.292f, 0.485f)
                curveToRelative(-0.476f, 0.0f, -0.956f, -0.169f, -1.338f, -0.509f)
                lineToRelative(-3.748f, -3.156f)
                lineTo(0.0f, 20.0f)
                lineTo(0.0f, 3.0f)
                curveTo(0.0f, 1.346f, 1.346f, 0.0f, 3.0f, 0.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(22.0f, 3.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                lineTo(3.0f, 2.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(5.654f)
                lineToRelative(4.326f, 3.645f)
                lineToRelative(4.449f, -3.645f)
                horizontalLineToRelative(5.571f)
                lineTo(22.0f, 3.0f)
                close()
                moveTo(14.0f, 11.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(14.0f, 7.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _answerAlt!!
    }

private var _answerAlt: ImageVector? = null
