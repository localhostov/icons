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

public val Icons.Bold.Folders: ImageVector
    get() {
        if (_folders != null) {
            return _folders!!
        }
        _folders = Builder(name = "Folders", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 3.0f)
                horizontalLineToRelative(-4.646f)
                lineTo(11.854f, 1.0f)
                horizontalLineToRelative(-3.354f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(13.5f)
                lineTo(24.0f, 18.0f)
                lineTo(24.0f, 6.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(8.0f, 15.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(7.0f)
                lineTo(8.0f, 15.0f)
                close()
                moveTo(3.0f, 20.0f)
                lineTo(19.0f, 20.0f)
                verticalLineToRelative(3.0f)
                lineTo(0.0f, 23.0f)
                lineTo(0.0f, 8.524f)
                curveToRelative(0.0f, -1.469f, 0.937f, -2.789f, 2.332f, -3.286f)
                lineToRelative(0.668f, -0.238f)
                verticalLineToRelative(15.0f)
                close()
            }
        }
        .build()
        return _folders!!
    }

private var _folders: ImageVector? = null
