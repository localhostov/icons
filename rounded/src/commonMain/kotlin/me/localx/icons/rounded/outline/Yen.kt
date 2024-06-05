package me.localx.icons.rounded.outline

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

public val Icons.Outline.Yen: ImageVector
    get() {
        if (_yen != null) {
            return _yen!!
        }
        _yen = Builder(name = "Yen", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.61f, 0.208f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.4f, 0.182f)
                lineToRelative(-9.21f, 11.97f)
                lineToRelative(-9.208f, -11.97f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.584f, 1.22f)
                lineToRelative(9.53f, 12.39f)
                horizontalLineToRelative(-4.738f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                horizontalLineToRelative(-4.738f)
                lineToRelative(9.53f, -12.39f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.182f, -1.402f)
                close()
            }
        }
        .build()
        return _yen!!
    }

private var _yen: ImageVector? = null
