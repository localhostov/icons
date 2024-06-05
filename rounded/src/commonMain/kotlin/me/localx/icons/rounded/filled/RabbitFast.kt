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
                moveToRelative(20.0f, 23.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-8.043f)
                curveToRelative(-0.704f, 0.0f, -1.368f, -0.363f, -1.713f, -0.976f)
                curveToRelative(-0.327f, -0.582f, -0.936f, -0.985f, -1.641f, -1.021f)
                curveToRelative(-2.525f, -0.13f, -4.95f, -1.301f, -5.972f, -3.613f)
                curveToRelative(-0.858f, -1.94f, -0.79f, -3.856f, -0.107f, -5.447f)
                curveToRelative(-1.03f, -0.251f, -1.747f, -1.299f, -1.461f, -2.453f)
                curveToRelative(0.174f, -0.701f, 0.755f, -1.271f, 1.459f, -1.434f)
                curveToRelative(0.996f, -0.23f, 1.907f, 0.284f, 2.289f, 1.096f)
                curveToRelative(1.049f, -0.726f, 2.32f, -1.151f, 3.689f, -1.151f)
                horizontalLineToRelative(4.996f)
                curveToRelative(0.973f, 2.347f, 3.273f, 4.0f, 5.948f, 4.0f)
                curveToRelative(0.356f, 0.0f, 0.702f, -0.013f, 1.039f, -0.04f)
                lineToRelative(-2.88f, 7.04f)
                horizontalLineToRelative(-2.657f)
                curveToRelative(-0.358f, -3.192f, -2.48f, -5.0f, -5.946f, -5.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                curveToRelative(2.729f, 0.0f, 4.0f, 1.271f, 4.0f, 4.0f)
                curveToRelative(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                close()
                moveTo(18.444f, 2.0f)
                curveToRelative(-0.218f, 0.0f, -0.432f, 0.016f, -0.641f, 0.047f)
                curveTo(17.29f, 1.864f, 12.513f, 0.209f, 7.019f, 0.018f)
                curveToRelative(-0.559f, -0.019f, -1.019f, 0.441f, -1.019f, 1.001f)
                curveToRelative(0.0f, 0.545f, 0.437f, 0.98f, 0.981f, 0.999f)
                curveToRelative(2.607f, 0.095f, 5.075f, 0.548f, 6.927f, 0.991f)
                curveToRelative(-0.115f, 0.053f, -0.23f, 0.107f, -0.346f, 0.161f)
                curveToRelative(-1.673f, 0.781f, -3.548f, 1.659f, -6.63f, 1.808f)
                curveToRelative(-0.525f, 0.025f, -0.933f, 0.471f, -0.933f, 0.996f)
                curveToRelative(0.0f, 0.579f, 0.492f, 1.029f, 1.07f, 0.999f)
                curveToRelative(3.335f, -0.168f, 5.444f, -1.107f, 7.16f, -1.908f)
                curveToRelative(-0.15f, 0.451f, -0.231f, 0.933f, -0.231f, 1.435f)
                curveToRelative(0.0f, 2.485f, 1.99f, 4.5f, 4.444f, 4.5f)
                reflectiveCurveToRelative(5.556f, -0.89f, 5.556f, -3.375f)
                curveToRelative(0.0f, -2.25f, -2.222f, -5.625f, -5.556f, -5.625f)
                close()
            }
        }
        .build()
        return _rabbitFast!!
    }

private var _rabbitFast: ImageVector? = null
