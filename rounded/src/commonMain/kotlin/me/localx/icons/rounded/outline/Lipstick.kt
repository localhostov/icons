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

public val Icons.Outline.Lipstick: ImageVector
    get() {
        if (_lipstick != null) {
            return _lipstick!!
        }
        _lipstick = Builder(name = "Lipstick", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.0f, 13.184f)
                verticalLineToRelative(-3.184f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                verticalLineToRelative(-6.586f)
                arcToRelative(2.412f, 2.412f, 0.0f, false, false, -3.492f, -2.157f)
                lineToRelative(-2.622f, 1.31f)
                arcToRelative(3.4f, 3.4f, 0.0f, false, false, -1.886f, 3.053f)
                verticalLineToRelative(4.38f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(3.184f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -2.0f, 2.816f)
                verticalLineToRelative(3.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, 5.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, -5.0f)
                verticalLineToRelative(-3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -2.0f, -2.816f)
                close()
                moveTo(9.0f, 13.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(10.0f, 4.62f)
                arcToRelative(1.407f, 1.407f, 0.0f, false, true, 0.781f, -1.264f)
                lineToRelative(2.619f, -1.31f)
                arcToRelative(0.411f, 0.411f, 0.0f, false, true, 0.6f, 0.368f)
                verticalLineToRelative(6.586f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(17.0f, 19.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                verticalLineToRelative(-3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _lipstick!!
    }

private var _lipstick: ImageVector? = null
