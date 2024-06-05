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

public val Icons.Bold.Kerning: ImageVector
    get() {
        if (_kerning != null) {
            return _kerning!!
        }
        _kerning = Builder(name = "Kerning", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.897f, 0.0f)
                lineToRelative(-6.481f, 24.0f)
                horizontalLineToRelative(-3.186f)
                lineTo(13.712f, 0.0f)
                horizontalLineToRelative(3.186f)
                close()
                moveTo(6.9f, 5.0f)
                lineToRelative(-1.9f, 7.305f)
                lineToRelative(-1.9f, -7.305f)
                lineTo(0.0f, 5.0f)
                lineToRelative(3.258f, 12.526f)
                curveToRelative(0.233f, 0.894f, 0.932f, 1.494f, 1.742f, 1.494f)
                reflectiveCurveToRelative(1.509f, -0.601f, 1.742f, -1.495f)
                lineToRelative(3.258f, -12.525f)
                horizontalLineToRelative(-3.1f)
                close()
                moveTo(20.374f, 17.0f)
                horizontalLineToRelative(-2.749f)
                lineToRelative(-0.526f, 2.0f)
                horizontalLineToRelative(-3.1f)
                lineToRelative(3.258f, -12.505f)
                curveToRelative(0.233f, -0.895f, 0.932f, -1.495f, 1.742f, -1.495f)
                reflectiveCurveToRelative(1.509f, 0.601f, 1.742f, 1.494f)
                lineToRelative(3.258f, 12.506f)
                horizontalLineToRelative(-3.1f)
                lineToRelative(-0.526f, -2.0f)
                close()
                moveTo(20.04f, 14.0f)
                lineToRelative(-1.041f, -4.0f)
                lineToRelative(-1.041f, 4.0f)
                horizontalLineToRelative(2.081f)
                close()
            }
        }
        .build()
        return _kerning!!
    }

private var _kerning: ImageVector? = null
