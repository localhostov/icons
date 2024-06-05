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
                moveTo(7.0f, 6.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(4.0f, 3.5f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(9.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-3.0f)
                lineTo(17.0f, 3.5f)
                curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-3.0f)
                lineTo(13.5f, 15.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(10.5f, 3.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.28f, 0.0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(2.5f)
                close()
                moveTo(23.7f, 18.77f)
                lineToRelative(-3.7f, -3.27f)
                verticalLineToRelative(2.5f)
                lineTo(4.0f, 18.0f)
                verticalLineToRelative(-2.5f)
                lineTo(0.3f, 18.77f)
                curveToRelative(-0.4f, 0.35f, -0.4f, 0.97f, 0.0f, 1.33f)
                lineToRelative(3.7f, 3.4f)
                verticalLineToRelative(-2.5f)
                lineTo(20.0f, 21.0f)
                verticalLineToRelative(2.5f)
                lineToRelative(3.7f, -3.4f)
                curveToRelative(0.4f, -0.35f, 0.4f, -0.97f, 0.0f, -1.33f)
                close()
            }
        }
        .build()
        return _textWidth!!
    }

private var _textWidth: ImageVector? = null
