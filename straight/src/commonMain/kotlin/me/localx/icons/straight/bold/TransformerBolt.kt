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
                moveToRelative(23.0f, 7.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(19.0f, 0.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(8.0f, 0.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                lineTo(1.0f, 4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(14.0f)
                lineTo(1.0f, 21.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(22.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(21.0f, 7.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(18.0f, 21.0f)
                lineTo(6.0f, 21.0f)
                lineTo(6.0f, 7.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(14.0f)
                close()
                moveTo(8.724f, 12.896f)
                lineToRelative(2.283f, -4.567f)
                lineToRelative(2.684f, 1.342f)
                lineToRelative(-1.431f, 2.861f)
                horizontalLineToRelative(1.45f)
                curveToRelative(0.625f, 0.0f, 1.2f, 0.315f, 1.536f, 0.843f)
                curveToRelative(0.336f, 0.527f, 0.378f, 1.181f, 0.114f, 1.748f)
                lineToRelative(-2.104f, 4.512f)
                lineToRelative(-2.719f, -1.268f)
                lineToRelative(1.322f, -2.834f)
                horizontalLineToRelative(-1.507f)
                curveToRelative(-0.636f, 0.0f, -1.215f, -0.323f, -1.549f, -0.864f)
                reflectiveCurveToRelative(-0.363f, -1.203f, -0.078f, -1.771f)
                close()
            }
        }
        .build()
        return _transformerBolt!!
    }

private var _transformerBolt: ImageVector? = null
