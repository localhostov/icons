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

public val Icons.Bold.TextHeight: ImageVector
    get() {
        if (_textHeight != null) {
            return _textHeight!!
        }
        _textHeight = Builder(name = "TextHeight", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                lineTo(12.0f, 22.5f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                lineTo(9.0f, 3.0f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-1.38f, 0.0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-1.0f)
                curveTo(0.0f, 2.47f, 2.47f, 0.0f, 5.5f, 0.0f)
                lineTo(15.5f, 0.0f)
                curveToRelative(3.03f, 0.0f, 5.5f, 2.47f, 5.5f, 5.5f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-3.5f)
                close()
                moveTo(22.56f, 19.0f)
                horizontalLineToRelative(-1.56f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(1.56f)
                curveToRelative(0.86f, 0.0f, 1.29f, -1.04f, 0.68f, -1.65f)
                lineToRelative(-3.06f, -3.06f)
                curveToRelative(-0.38f, -0.38f, -0.99f, -0.38f, -1.37f, 0.0f)
                lineToRelative(-3.06f, 3.06f)
                curveToRelative(-0.61f, 0.61f, -0.18f, 1.65f, 0.68f, 1.65f)
                horizontalLineToRelative(1.56f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-1.56f)
                curveToRelative(-0.86f, 0.0f, -1.29f, 1.04f, -0.68f, 1.65f)
                lineToRelative(3.06f, 3.06f)
                curveToRelative(0.38f, 0.38f, 0.99f, 0.38f, 1.37f, 0.0f)
                lineToRelative(3.06f, -3.06f)
                curveToRelative(0.61f, -0.61f, 0.18f, -1.65f, -0.68f, -1.65f)
                close()
            }
        }
        .build()
        return _textHeight!!
    }

private var _textHeight: ImageVector? = null
