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

public val Icons.Bold.TextWidth: ImageVector
    get() {
        if (_textWidth != null) {
            return _textWidth!!
        }
        _textWidth = Builder(name = "TextWidth", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 5.5f)
                verticalLineToRelative(-1.0f)
                curveTo(4.0f, 2.02f, 6.02f, 0.0f, 8.5f, 0.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(2.48f, 0.0f, 4.5f, 2.02f, 4.5f, 4.5f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-2.0f)
                lineTo(13.5f, 13.5f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                lineTo(10.5f, 3.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(23.72f, 18.82f)
                lineToRelative(-3.06f, -3.06f)
                curveToRelative(-0.61f, -0.61f, -1.65f, -0.18f, -1.65f, 0.68f)
                verticalLineToRelative(1.56f)
                lineTo(5.0f, 18.0f)
                verticalLineToRelative(-1.56f)
                curveToRelative(0.0f, -0.86f, -1.04f, -1.29f, -1.65f, -0.68f)
                lineTo(0.28f, 18.82f)
                curveToRelative(-0.38f, 0.38f, -0.38f, 0.99f, 0.0f, 1.37f)
                lineToRelative(3.06f, 3.06f)
                curveToRelative(0.61f, 0.61f, 1.65f, 0.18f, 1.65f, -0.68f)
                verticalLineToRelative(-1.56f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(1.56f)
                curveToRelative(0.0f, 0.86f, 1.04f, 1.29f, 1.65f, 0.68f)
                lineToRelative(3.06f, -3.06f)
                curveToRelative(0.38f, -0.38f, 0.38f, -0.99f, 0.0f, -1.37f)
                close()
            }
        }
        .build()
        return _textWidth!!
    }

private var _textWidth: ImageVector? = null
