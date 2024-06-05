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

public val Icons.Bold.GlassEmpty: ImageVector
    get() {
        if (_glassEmpty != null) {
            return _glassEmpty!!
        }
        _glassEmpty = Builder(name = "GlassEmpty", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(1.014f, 0.0f)
                lineToRelative(1.709f, 20.787f)
                curveToRelative(0.148f, 1.802f, 1.681f, 3.213f, 3.488f, 3.213f)
                horizontalLineToRelative(11.459f)
                curveToRelative(1.827f, 0.0f, 3.326f, -1.373f, 3.486f, -3.193f)
                lineTo(22.985f, 0.0f)
                lineTo(1.014f, 0.0f)
                close()
                moveTo(18.168f, 20.544f)
                curveToRelative(-0.023f, 0.26f, -0.237f, 0.456f, -0.498f, 0.456f)
                lineTo(6.211f, 21.0f)
                curveToRelative(-0.258f, 0.0f, -0.477f, -0.202f, -0.498f, -0.459f)
                lineTo(4.271f, 3.0f)
                horizontalLineToRelative(15.439f)
                lineToRelative(-1.542f, 17.544f)
                close()
            }
        }
        .build()
        return _glassEmpty!!
    }

private var _glassEmpty: ImageVector? = null
