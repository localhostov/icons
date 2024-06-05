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

public val Icons.Bold.StarExclamation: ImageVector
    get() {
        if (_starExclamation != null) {
            return _starExclamation!!
        }
        _starExclamation = Builder(name = "StarExclamation", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.5f, 11.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(10.5f, 22.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(24.0f, 11.423f)
                lineToRelative(-1.0f, -4.467f)
                horizontalLineToRelative(-6.728f)
                lineTo(14.046f, 0.0f)
                horizontalLineToRelative(-4.093f)
                lineToRelative(-2.226f, 6.956f)
                lineTo(1.0f, 6.956f)
                lineToRelative(-1.0f, 4.467f)
                lineToRelative(5.096f, 3.734f)
                lineToRelative(-2.533f, 7.86f)
                lineToRelative(4.325f, 0.983f)
                lineToRelative(2.112f, -1.556f)
                verticalLineToRelative(-3.733f)
                lineToRelative(-2.487f, 1.833f)
                lineToRelative(2.104f, -6.532f)
                lineToRelative(-5.524f, -4.011f)
                horizontalLineToRelative(6.822f)
                lineToRelative(2.084f, -6.549f)
                lineToRelative(2.084f, 6.549f)
                horizontalLineToRelative(6.822f)
                lineToRelative(-5.524f, 4.011f)
                lineToRelative(2.104f, 6.532f)
                lineToRelative(-2.487f, -1.833f)
                verticalLineToRelative(3.733f)
                lineToRelative(2.112f, 1.556f)
                lineToRelative(4.324f, -0.987f)
                lineToRelative(-2.532f, -7.856f)
                lineToRelative(5.096f, -3.734f)
                close()
            }
        }
        .build()
        return _starExclamation!!
    }

private var _starExclamation: ImageVector? = null
