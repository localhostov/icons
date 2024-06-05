package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.Megaphone: ImageVector
    get() {
        if (_megaphone != null) {
            return _megaphone!!
        }
        _megaphone = Builder(name = "Megaphone", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.446f, -0.105f)
                lineToRelative(-2.0f, -1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.894f, -1.79f)
                lineToRelative(2.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.448f, 1.895f)
                close()
                moveTo(21.447f, 6.9f)
                lineTo(23.447f, 5.9f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -0.894f, -1.79f)
                lineToRelative(-2.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.894f, 1.79f)
                close()
                moveTo(24.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                close()
                moveTo(18.0f, 19.0f)
                verticalLineToRelative(-18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                curveToRelative(0.0f, 2.949f, -2.583f, 4.0f, -5.0f, 4.0f)
                horizontalLineToRelative(-7.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(2.417f, 0.0f, 5.0f, 1.051f, 5.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                close()
                moveTo(8.186f, 17.0f)
                horizontalLineToRelative(-4.186f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -1.382f, -0.167f)
                lineToRelative(2.5f, 5.582f)
                arcToRelative(2.671f, 2.671f, 0.0f, false, false, 2.44f, 1.585f)
                arcToRelative(2.462f, 2.462f, 0.0f, false, false, 2.242f, -3.472f)
                close()
            }
        }
        .build()
        return _megaphone!!
    }

private var _megaphone: ImageVector? = null
