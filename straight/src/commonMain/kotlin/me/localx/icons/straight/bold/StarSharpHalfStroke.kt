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

public val Icons.Bold.StarSharpHalfStroke: ImageVector
    get() {
        if (_starSharpHalfStroke != null) {
            return _starSharpHalfStroke!!
        }
        _starSharpHalfStroke = Builder(name = "StarSharpHalfStroke", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.0f, 6.956f)
                horizontalLineToRelative(-6.728f)
                lineTo(14.046f, 0.0f)
                horizontalLineToRelative(-4.093f)
                lineToRelative(-2.226f, 6.956f)
                lineTo(1.0f, 6.956f)
                lineToRelative(-1.0f, 4.467f)
                lineToRelative(5.096f, 3.734f)
                lineToRelative(-2.533f, 7.86f)
                lineToRelative(4.325f, 0.983f)
                lineToRelative(5.112f, -3.767f)
                lineToRelative(5.112f, 3.767f)
                lineToRelative(4.324f, -0.987f)
                lineToRelative(-2.532f, -7.856f)
                lineToRelative(5.096f, -3.734f)
                lineToRelative(-1.0f, -4.467f)
                close()
                moveTo(15.382f, 14.011f)
                lineToRelative(2.104f, 6.532f)
                lineToRelative(-5.487f, -4.045f)
                lineTo(11.999f, 3.451f)
                lineToRelative(2.084f, 6.513f)
                horizontalLineToRelative(6.822f)
                lineToRelative(-5.524f, 4.047f)
                close()
            }
        }
        .build()
        return _starSharpHalfStroke!!
    }

private var _starSharpHalfStroke: ImageVector? = null
