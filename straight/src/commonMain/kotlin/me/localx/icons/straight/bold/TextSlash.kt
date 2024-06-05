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

public val Icons.Bold.TextSlash: ImageVector
    get() {
        if (_textSlash != null) {
            return _textSlash!!
        }
        _textSlash = Builder(name = "TextSlash", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.533f, 11.415f)
                lineTo(13.533f, 5.0f)
                horizontalLineToRelative(4.967f)
                curveToRelative(0.276f, 0.0f, 0.5f, 0.224f, 0.5f, 0.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(3.0f)
                lineTo(22.0f, 5.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(5.5f, 2.0f)
                curveToRelative(-0.413f, 0.0f, -0.805f, 0.078f, -1.172f, 0.21f)
                lineTo(2.121f, 0.004f)
                lineTo(0.0f, 2.125f)
                lineTo(21.876f, 24.0f)
                lineToRelative(2.121f, -2.121f)
                lineTo(13.533f, 11.415f)
                close()
                moveTo(10.467f, 5.0f)
                lineToRelative(0.066f, -0.066f)
                verticalLineToRelative(3.481f)
                lineToRelative(-3.416f, -3.415f)
                horizontalLineToRelative(3.35f)
                close()
                moveTo(2.0f, 6.915f)
                lineToRelative(3.0f, 3.0f)
                verticalLineToRelative(0.085f)
                lineTo(2.0f, 10.0f)
                verticalLineToRelative(-3.085f)
                close()
                moveTo(10.533f, 15.447f)
                lineToRelative(3.0f, 3.0f)
                verticalLineToRelative(3.553f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-6.553f)
                close()
            }
        }
        .build()
        return _textSlash!!
    }

private var _textSlash: ImageVector? = null
