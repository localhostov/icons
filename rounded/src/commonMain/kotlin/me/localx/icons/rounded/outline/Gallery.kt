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

public val Icons.Outline.Gallery: ImageVector
    get() {
        if (_gallery != null) {
            return _gallery!!
        }
        _gallery = Builder(name = "Gallery", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 0.0f)
                horizontalLineToRelative(-6.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, -5.0f, 5.0f)
                verticalLineToRelative(0.1f)
                arcToRelative(5.009f, 5.009f, 0.0f, false, false, -4.0f, 4.9f)
                verticalLineToRelative(0.1f)
                arcToRelative(5.009f, 5.009f, 0.0f, false, false, -4.0f, 4.9f)
                verticalLineToRelative(4.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, 5.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, -5.0f)
                verticalLineToRelative(-0.1f)
                arcToRelative(5.009f, 5.009f, 0.0f, false, false, 4.0f, -4.9f)
                verticalLineToRelative(-0.1f)
                arcToRelative(5.009f, 5.009f, 0.0f, false, false, 4.0f, -4.9f)
                verticalLineToRelative(-4.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, -5.0f, -5.0f)
                close()
                moveTo(2.0f, 15.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(2.988f, 2.988f, 0.0f, false, true, 2.638f, 1.6f)
                lineToRelative(-3.455f, 3.463f)
                lineToRelative(-0.475f, -0.479f)
                arcToRelative(1.992f, 1.992f, 0.0f, false, false, -2.708f, -0.111f)
                lineToRelative(-4.621f, 3.96f)
                arcToRelative(2.96f, 2.96f, 0.0f, false, true, -0.379f, -1.433f)
                close()
                moveTo(14.0f, 19.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                horizontalLineToRelative(-6.0f)
                arcToRelative(2.971f, 2.971f, 0.0f, false, true, -1.118f, -0.221f)
                lineToRelative(4.406f, -3.779f)
                lineToRelative(0.476f, 0.481f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.828f, 0.0f)
                lineToRelative(2.408f, -2.413f)
                close()
                moveTo(18.0f, 14.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -2.0f, 2.816f)
                verticalLineToRelative(-1.816f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, -5.0f, -5.0f)
                horizontalLineToRelative(-5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                close()
                moveTo(22.0f, 9.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -2.0f, 2.816f)
                verticalLineToRelative(-1.816f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, -5.0f, -5.0f)
                horizontalLineToRelative(-5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                close()
                moveTo(4.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _gallery!!
    }

private var _gallery: ImageVector? = null
