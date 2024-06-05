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

public val Icons.Outline.RabbitFast: ImageVector
    get() {
        if (_rabbitFast != null) {
            return _rabbitFast!!
        }
        _rabbitFast = Builder(name = "RabbitFast", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 8.0f)
                curveToRelative(0.0f, -2.446f, -2.337f, -6.0f, -6.0f, -6.0f)
                curveToRelative(-0.102f, 0.0f, -0.203f, 0.003f, -0.303f, 0.009f)
                curveToRelative(-0.935f, -0.325f, -6.06f, -2.009f, -11.697f, -2.009f)
                verticalLineToRelative(2.0f)
                curveToRelative(2.963f, 0.0f, 5.825f, 0.511f, 7.908f, 1.009f)
                curveToRelative(-0.115f, 0.053f, -0.23f, 0.107f, -0.346f, 0.161f)
                curveToRelative(-1.835f, 0.857f, -3.914f, 1.83f, -7.562f, 1.83f)
                verticalLineToRelative(2.0f)
                curveToRelative(3.296f, 0.0f, 5.489f, -0.726f, 7.223f, -1.478f)
                curveToRelative(-0.145f, 0.467f, -0.223f, 0.964f, -0.223f, 1.478f)
                curveToRelative(0.0f, 0.711f, 0.149f, 1.387f, 0.418f, 2.0f)
                horizontalLineToRelative(-5.918f)
                curveToRelative(-1.369f, 0.0f, -2.64f, 0.426f, -3.689f, 1.151f)
                curveToRelative(-0.319f, -0.68f, -1.01f, -1.151f, -1.811f, -1.151f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                curveToRelative(0.0f, 0.941f, 0.65f, 1.729f, 1.525f, 1.943f)
                curveToRelative(-0.337f, 0.785f, -0.525f, 1.65f, -0.525f, 2.557f)
                curveToRelative(0.0f, 3.584f, 2.916f, 6.5f, 6.5f, 6.5f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                horizontalLineToRelative(10.5f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-4.215f)
                lineToRelative(4.167f, -10.185f)
                curveToRelative(2.22f, -0.437f, 4.048f, -1.663f, 4.048f, -3.815f)
                close()
                moveTo(14.0f, 21.08f)
                curveToRelative(0.0f, -3.813f, -2.187f, -6.08f, -6.0f, -6.08f)
                verticalLineToRelative(2.0f)
                curveToRelative(2.729f, 0.0f, 4.0f, 1.271f, 4.0f, 4.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.037f)
                curveToRelative(-0.693f, -1.195f, -1.986f, -2.0f, -3.463f, -2.0f)
                curveToRelative(-2.481f, 0.0f, -4.5f, -2.019f, -4.5f, -4.5f)
                reflectiveCurveToRelative(2.019f, -4.5f, 4.5f, -4.5f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(-0.003f)
                curveToRelative(0.766f, 0.576f, 1.702f, 0.938f, 2.718f, 0.995f)
                lineToRelative(-3.718f, 9.088f)
                close()
                moveTo(15.0f, 7.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                curveToRelative(2.481f, 0.0f, 4.0f, 2.59f, 4.0f, 4.0f)
                curveToRelative(0.0f, 1.468f, -2.392f, 2.0f, -4.0f, 2.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                close()
            }
        }
        .build()
        return _rabbitFast!!
    }

private var _rabbitFast: ImageVector? = null
