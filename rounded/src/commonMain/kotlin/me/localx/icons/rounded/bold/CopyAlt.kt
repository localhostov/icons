package me.localx.icons.rounded.bold

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

public val Icons.Bold.CopyAlt: ImageVector
    get() {
        if (_copyAlt != null) {
            return _copyAlt!!
        }
        _copyAlt = Builder(name = "CopyAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.0f, 13.5f)
                verticalLineToRelative(-5.929f)
                arcToRelative(6.457f, 6.457f, 0.0f, false, false, -1.9f, -4.6f)
                lineToRelative(-1.075f, -1.071f)
                arcToRelative(6.457f, 6.457f, 0.0f, false, false, -4.6f, -1.9f)
                horizontalLineToRelative(-2.925f)
                arcToRelative(5.506f, 5.506f, 0.0f, false, false, -5.5f, 5.5f)
                verticalLineToRelative(8.0f)
                arcToRelative(5.506f, 5.506f, 0.0f, false, false, 5.5f, 5.5f)
                horizontalLineToRelative(5.0f)
                arcToRelative(5.506f, 5.506f, 0.0f, false, false, 5.5f, -5.5f)
                close()
                moveTo(5.0f, 13.5f)
                verticalLineToRelative(-8.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.5f, -2.5f)
                horizontalLineToRelative(2.929f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 0.571f, 0.056f)
                verticalLineToRelative(1.944f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(1.944f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 0.056f, 0.571f)
                verticalLineToRelative(5.929f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.5f, 2.5f)
                horizontalLineToRelative(-5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.5f, -2.5f)
                close()
                moveTo(23.0f, 8.5f)
                verticalLineToRelative(10.0f)
                arcToRelative(5.506f, 5.506f, 0.0f, false, true, -5.5f, 5.5f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 2.5f, -2.5f)
                verticalLineToRelative(-10.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                close()
            }
        }
        .build()
        return _copyAlt!!
    }

private var _copyAlt: ImageVector? = null
