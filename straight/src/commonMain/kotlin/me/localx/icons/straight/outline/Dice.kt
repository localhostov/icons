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

public val Icons.Outline.Dice: ImageVector
    get() {
        if (_dice != null) {
            return _dice!!
        }
        _dice = Builder(name = "Dice", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 24.0f)
                horizontalLineToRelative(-24.0f)
                verticalLineToRelative(-21.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                close()
                moveTo(2.0f, 22.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(-19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                horizontalLineToRelative(-18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                close()
                moveTo(11.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.0f, -1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                close()
                moveTo(6.0f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.0f, -1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                close()
                moveTo(16.0f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.0f, -1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                close()
                moveTo(6.0f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.0f, -1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                close()
                moveTo(16.0f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.0f, -1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _dice!!
    }

private var _dice: ImageVector? = null
