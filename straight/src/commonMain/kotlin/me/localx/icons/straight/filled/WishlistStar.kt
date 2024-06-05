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

public val Icons.Filled.WishlistStar: ImageVector
    get() {
        if (_wishlistStar != null) {
            return _wishlistStar!!
        }
        _wishlistStar = Builder(name = "WishlistStar", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.5f, 0.0f)
                lineTo(4.5f, 0.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, 1.121f, -2.5f, 2.5f)
                verticalLineToRelative(21.456f)
                lineToRelative(10.0f, -7.223f)
                lineToRelative(10.0f, 7.223f)
                lineTo(22.0f, 2.5f)
                curveToRelative(0.0f, -1.379f, -1.122f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(17.0f, 7.833f)
                lineToRelative(-2.545f, 1.736f)
                lineToRelative(1.059f, 3.318f)
                lineToRelative(-0.681f, 0.476f)
                lineToRelative(-2.818f, -1.948f)
                lineToRelative(-2.776f, 1.948f)
                lineToRelative(-0.656f, -0.494f)
                lineToRelative(0.984f, -3.351f)
                lineToRelative(-2.566f, -1.68f)
                verticalLineToRelative(-0.838f)
                horizontalLineToRelative(3.5f)
                lineToRelative(1.071f, -3.636f)
                horizontalLineToRelative(0.882f)
                lineToRelative(1.069f, 3.636f)
                horizontalLineToRelative(3.478f)
                verticalLineToRelative(0.833f)
                close()
            }
        }
        .build()
        return _wishlistStar!!
    }

private var _wishlistStar: ImageVector? = null
