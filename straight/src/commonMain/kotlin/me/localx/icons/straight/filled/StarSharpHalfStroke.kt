package me.localx.icons.straight.filled

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

public val Icons.Filled.StarSharpHalfStroke: ImageVector
    get() {
        if (_starSharpHalfStroke != null) {
            return _starSharpHalfStroke!!
        }
        _starSharpHalfStroke = Builder(name = "StarSharpHalfStroke", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.448f, 23.309f)
                lineToRelative(-7.467f, -5.488f)
                lineToRelative(-7.467f, 5.488f)
                lineToRelative(2.864f, -8.863f)
                lineTo(-0.082f, 8.992f)
                horizontalLineToRelative(9.214f)
                lineTo(11.981f, 0.114f)
                lineToRelative(2.849f, 8.878f)
                horizontalLineToRelative(9.214f)
                lineToRelative(-7.46f, 5.453f)
                lineToRelative(2.864f, 8.863f)
                close()
                moveTo(11.981f, 15.338f)
                lineToRelative(3.658f, 2.689f)
                lineToRelative(-1.403f, -4.344f)
                lineToRelative(3.683f, -2.691f)
                horizontalLineToRelative(-4.548f)
                lineToRelative(-1.39f, -4.331f)
                verticalLineToRelative(8.677f)
                close()
            }
        }
        .build()
        return _starSharpHalfStroke!!
    }

private var _starSharpHalfStroke: ImageVector? = null
