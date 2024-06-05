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

public val Icons.Filled.Glasses: ImageVector
    get() {
        if (_glasses != null) {
            return _glasses!!
        }
        _glasses = Builder(name = "Glasses", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.0f, 0.058f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(13.025f)
                arcToRelative(4.954f, 4.954f, 0.0f, false, false, -3.0f, -1.025f)
                arcToRelative(5.008f, 5.008f, 0.0f, false, false, -4.9f, 4.0f)
                horizontalLineToRelative(-4.2f)
                arcToRelative(5.008f, 5.008f, 0.0f, false, false, -4.9f, -4.0f)
                arcToRelative(4.954f, 4.954f, 0.0f, false, false, -3.0f, 1.025f)
                verticalLineToRelative(-13.025f)
                horizontalLineToRelative(2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(19.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 9.9f, 1.0f)
                horizontalLineToRelative(4.2f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 9.9f, -1.0f)
                verticalLineToRelative(-19.0f)
                close()
            }
        }
        .build()
        return _glasses!!
    }

private var _glasses: ImageVector? = null
