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

public val Icons.Filled.RabbitFast: ImageVector
    get() {
        if (_rabbitFast != null) {
            return _rabbitFast!!
        }
        _rabbitFast = Builder(name = "RabbitFast", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 7.625f)
                curveToRelative(0.0f, 2.485f, -3.101f, 3.375f, -5.556f, 3.375f)
                reflectiveCurveToRelative(-4.444f, -2.015f, -4.444f, -4.5f)
                curveToRelative(0.0f, -0.502f, 0.081f, -0.984f, 0.231f, -1.435f)
                curveToRelative(-1.893f, 0.884f, -4.264f, 1.935f, -8.231f, 1.935f)
                verticalLineToRelative(-2.0f)
                curveToRelative(3.648f, 0.0f, 5.728f, -0.973f, 7.562f, -1.83f)
                curveToRelative(0.116f, -0.054f, 0.231f, -0.108f, 0.346f, -0.161f)
                curveToRelative(-2.083f, -0.498f, -4.945f, -1.009f, -7.908f, -1.009f)
                lineTo(6.0f, 0.0f)
                curveToRelative(5.911f, 0.0f, 11.258f, 1.852f, 11.804f, 2.047f)
                curveToRelative(0.209f, -0.031f, 0.423f, -0.047f, 0.641f, -0.047f)
                curveToRelative(3.333f, 0.0f, 5.556f, 3.375f, 5.556f, 5.625f)
                close()
                moveTo(12.0f, 21.0f)
                curveToRelative(0.0f, -2.729f, -1.271f, -4.0f, -4.0f, -4.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(3.466f, 0.0f, 5.588f, 1.808f, 5.946f, 5.0f)
                horizontalLineToRelative(2.657f)
                lineToRelative(2.88f, -7.04f)
                curveToRelative(-0.337f, 0.026f, -0.683f, 0.04f, -1.039f, 0.04f)
                curveToRelative(-2.675f, 0.0f, -4.975f, -1.653f, -5.948f, -4.0f)
                horizontalLineToRelative(-4.996f)
                curveToRelative(-1.369f, 0.0f, -2.64f, 0.426f, -3.689f, 1.151f)
                curveToRelative(-0.319f, -0.68f, -1.01f, -1.151f, -1.811f, -1.151f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                curveToRelative(0.0f, 0.941f, 0.65f, 1.729f, 1.525f, 1.943f)
                curveToRelative(-0.337f, 0.785f, -0.525f, 1.65f, -0.525f, 2.557f)
                curveToRelative(0.0f, 3.584f, 2.916f, 6.5f, 6.5f, 6.5f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                horizontalLineToRelative(10.5f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-1.0f)
                close()
            }
        }
        .build()
        return _rabbitFast!!
    }

private var _rabbitFast: ImageVector? = null
