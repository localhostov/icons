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

public val Icons.Bold.Eject: ImageVector
    get() {
        if (_eject != null) {
            return _eject!!
        }
        _eject = Builder(name = "Eject", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 19.0f)
                verticalLineToRelative(3.0f)
                lineTo(0.0f, 22.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(24.0f)
                close()
                moveTo(23.937f, 17.0f)
                lineTo(0.063f, 17.0f)
                lineTo(12.0f, 1.546f)
                lineToRelative(11.937f, 15.454f)
                close()
                moveTo(6.171f, 14.0f)
                horizontalLineToRelative(11.657f)
                lineToRelative(-5.829f, -7.546f)
                lineToRelative(-5.829f, 7.546f)
                close()
            }
        }
        .build()
        return _eject!!
    }

private var _eject: ImageVector? = null
