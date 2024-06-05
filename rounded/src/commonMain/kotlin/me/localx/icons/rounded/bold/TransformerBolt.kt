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

public val Icons.Bold.TransformerBolt: ImageVector
    get() {
        if (_transformerBolt != null) {
            return _transformerBolt!!
        }
        _transformerBolt = Builder(name = "TransformerBolt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.5f, 21.0f)
                horizontalLineToRelative(-0.5f)
                lineTo(21.0f, 7.0f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.671f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.829f, -0.671f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.829f, -0.671f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.671f, -1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.829f, -0.671f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.829f, -0.671f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.671f, -1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.671f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.671f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(19.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.671f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(6.0f, 7.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(14.0f)
                lineTo(6.0f, 21.0f)
                lineTo(6.0f, 7.0f)
                close()
                moveTo(15.359f, 15.09f)
                lineToRelative(-2.015f, 4.075f)
                curveToRelative(-0.262f, 0.529f, -0.793f, 0.835f, -1.346f, 0.835f)
                curveToRelative(-0.224f, 0.0f, -0.45f, -0.05f, -0.664f, -0.156f)
                curveToRelative(-0.743f, -0.367f, -1.047f, -1.267f, -0.68f, -2.01f)
                lineToRelative(1.155f, -2.335f)
                horizontalLineToRelative(-1.458f)
                curveToRelative(-0.636f, 0.0f, -1.215f, -0.323f, -1.549f, -0.864f)
                curveToRelative(-0.334f, -0.541f, -0.364f, -1.203f, -0.08f, -1.771f)
                lineToRelative(1.925f, -4.014f)
                curveToRelative(0.358f, -0.748f, 1.256f, -1.061f, 2.001f, -0.704f)
                curveToRelative(0.747f, 0.358f, 1.062f, 1.254f, 0.704f, 2.001f)
                lineToRelative(-1.127f, 2.352f)
                horizontalLineToRelative(1.484f)
                curveToRelative(0.625f, 0.0f, 1.2f, 0.315f, 1.536f, 0.843f)
                curveToRelative(0.336f, 0.527f, 0.378f, 1.181f, 0.114f, 1.748f)
                close()
            }
        }
        .build()
        return _transformerBolt!!
    }

private var _transformerBolt: ImageVector? = null
