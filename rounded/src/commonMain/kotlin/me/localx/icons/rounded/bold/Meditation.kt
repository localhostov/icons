package me.localx.icons.rounded.bold

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

public val Icons.Bold.Meditation: ImageVector
    get() {
        if (_meditation != null) {
            return _meditation!!
        }
        _meditation = Builder(name = "Meditation", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 3.0f)
                curveToRelative(0.0f, -1.657f, 1.343f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(2.894f, 1.343f, 2.894f, 3.0f)
                reflectiveCurveToRelative(-1.237f, 3.0f, -2.894f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.343f, -3.0f, -3.0f)
                close()
                moveTo(23.171f, 14.658f)
                lineToRelative(-3.644f, -1.822f)
                lineToRelative(-1.295f, -1.942f)
                curveToRelative(-1.208f, -1.812f, -3.23f, -2.895f, -5.408f, -2.895f)
                horizontalLineToRelative(-1.648f)
                curveToRelative(-2.178f, 0.0f, -4.2f, 1.082f, -5.408f, 2.895f)
                lineToRelative(-1.295f, 1.942f)
                lineToRelative(-3.644f, 1.822f)
                curveToRelative(-0.741f, 0.371f, -1.041f, 1.271f, -0.671f, 2.013f)
                curveToRelative(0.371f, 0.74f, 1.271f, 1.041f, 2.013f, 0.671f)
                lineToRelative(4.0f, -2.0f)
                curveToRelative(0.233f, -0.117f, 0.433f, -0.292f, 0.577f, -0.51f)
                lineToRelative(1.252f, -1.878f)
                verticalLineToRelative(4.619f)
                lineToRelative(-4.834f, 2.417f)
                curveToRelative(-0.882f, 0.441f, -1.34f, 1.42f, -1.113f, 2.38f)
                reflectiveCurveToRelative(1.074f, 1.63f, 2.06f, 1.63f)
                horizontalLineToRelative(2.387f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                verticalLineToRelative(-1.573f)
                lineToRelative(2.171f, -1.085f)
                curveToRelative(0.508f, -0.254f, 0.829f, -0.773f, 0.829f, -1.342f)
                verticalLineToRelative(-7.478f)
                curveToRelative(0.06f, -0.003f, 0.116f, -0.022f, 0.176f, -0.022f)
                horizontalLineToRelative(1.648f)
                curveToRelative(0.06f, 0.0f, 0.116f, 0.019f, 0.176f, 0.022f)
                verticalLineToRelative(7.478f)
                curveToRelative(0.0f, 0.581f, 0.335f, 1.11f, 0.861f, 1.357f)
                lineToRelative(2.428f, 1.143f)
                horizontalLineToRelative(-4.79f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.671f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(8.333f)
                curveToRelative(1.042f, 0.0f, 1.927f, -0.71f, 2.154f, -1.727f)
                curveToRelative(0.228f, -1.016f, -0.272f, -2.036f, -1.214f, -2.479f)
                lineToRelative(-4.773f, -2.246f)
                verticalLineToRelative(-4.594f)
                lineToRelative(1.252f, 1.878f)
                curveToRelative(0.145f, 0.217f, 0.344f, 0.393f, 0.577f, 0.51f)
                lineToRelative(4.0f, 2.0f)
                curveToRelative(0.215f, 0.107f, 0.444f, 0.159f, 0.67f, 0.159f)
                curveToRelative(0.55f, 0.0f, 1.08f, -0.304f, 1.343f, -0.83f)
                curveToRelative(0.37f, -0.741f, 0.07f, -1.642f, -0.671f, -2.013f)
                close()
            }
        }
        .build()
        return _meditation!!
    }

private var _meditation: ImageVector? = null
