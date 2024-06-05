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

public val Icons.Filled.Sauce: ImageVector
    get() {
        if (_sauce != null) {
            return _sauce!!
        }
        _sauce = Builder(name = "Sauce", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 8.0f)
                lineTo(7.0f, 8.0f)
                lineTo(7.0f, 5.0f)
                horizontalLineToRelative(3.167f)
                lineTo(11.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                lineToRelative(0.833f, 5.0f)
                lineTo(17.0f, 5.0f)
                close()
                moveTo(13.974f, 16.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(20.0f, 13.0f)
                lineTo(20.0f, 24.0f)
                lineTo(4.0f, 24.0f)
                lineTo(4.0f, 13.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                lineTo(17.0f, 10.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 20.0f, 13.0f)
                close()
                moveTo(15.974f, 14.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(8.0f)
                close()
            }
        }
        .build()
        return _sauce!!
    }

private var _sauce: ImageVector? = null
