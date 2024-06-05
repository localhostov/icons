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

public val Icons.Outline.Kaaba: ImageVector
    get() {
        if (_kaaba != null) {
            return _kaaba!!
        }
        _kaaba = Builder(name = "Kaaba", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.0f, 12.752f)
                lineToRelative(4.0f, 2.121f)
                verticalLineToRelative(2.264f)
                lineToRelative(-4.0f, -2.121f)
                verticalLineToRelative(-2.264f)
                close()
                moveTo(13.0f, 17.156f)
                lineToRelative(4.0f, -2.041f)
                verticalLineToRelative(-2.264f)
                lineToRelative(-4.0f, 2.041f)
                verticalLineToRelative(2.264f)
                close()
                moveTo(23.0f, 5.994f)
                verticalLineToRelative(12.011f)
                lineToRelative(-11.0f, 5.831f)
                lineTo(1.0f, 18.005f)
                lineTo(1.0f, 5.995f)
                lineTo(12.0f, 0.164f)
                lineToRelative(11.0f, 5.831f)
                close()
                moveTo(12.0f, 2.427f)
                lineToRelative(-7.864f, 4.168f)
                lineToRelative(7.864f, 4.168f)
                lineToRelative(7.864f, -4.168f)
                lineToRelative(-7.864f, -4.168f)
                close()
                moveTo(21.0f, 16.802f)
                verticalLineToRelative(-3.87f)
                lineToRelative(-2.0f, 1.123f)
                verticalLineToRelative(-2.264f)
                lineToRelative(2.0f, -1.122f)
                verticalLineToRelative(-2.412f)
                lineToRelative(-9.0f, 4.769f)
                lineTo(3.0f, 8.258f)
                verticalLineToRelative(2.359f)
                lineToRelative(2.0f, 1.075f)
                verticalLineToRelative(2.264f)
                lineToRelative(-2.0f, -1.073f)
                verticalLineToRelative(3.919f)
                lineToRelative(9.0f, 4.77f)
                lineToRelative(9.0f, -4.77f)
                close()
            }
        }
        .build()
        return _kaaba!!
    }

private var _kaaba: ImageVector? = null
