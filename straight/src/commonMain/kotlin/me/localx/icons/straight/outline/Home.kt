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

public val Icons.Outline.Home: ImageVector
    get() {
        if (_home != null) {
            return _home!!
        }
        _home = Builder(name = "Home", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.338f, 0.833f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.676f, 0.0f)
                lineTo(0.0f, 10.429f)
                verticalLineToRelative(10.4f)
                arcToRelative(3.2f, 3.2f, 0.0f, false, false, 3.2f, 3.2f)
                lineTo(20.8f, 24.029f)
                arcToRelative(3.2f, 3.2f, 0.0f, false, false, 3.2f, -3.2f)
                verticalLineToRelative(-10.4f)
                close()
                moveTo(15.0f, 22.026f)
                lineTo(9.0f, 22.026f)
                lineTo(9.0f, 17.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 6.0f, 0.0f)
                close()
                moveTo(22.0f, 20.826f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, true, -1.2f, 1.2f)
                lineTo(17.0f, 22.026f)
                lineTo(17.0f, 17.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 7.0f, 17.0f)
                verticalLineToRelative(5.026f)
                lineTo(3.2f, 22.026f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, true, -1.2f, -1.2f)
                lineTo(2.0f, 11.319f)
                lineToRelative(10.0f, -9.0f)
                lineToRelative(10.0f, 9.0f)
                close()
            }
        }
        .build()
        return _home!!
    }

private var _home: ImageVector? = null
