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

public val Icons.Bold.IceSkate: ImageVector
    get() {
        if (_iceSkate != null) {
            return _iceSkate!!
        }
        _iceSkate = Builder(name = "IceSkate", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.5f, 18.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, 1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(1.119f)
                arcToRelative(4.406f, 4.406f, 0.0f, false, false, 4.4f, -4.4f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, -5.186f, -6.365f)
                lineToRelative(-3.433f, -0.785f)
                arcToRelative(1.54f, 1.54f, 0.0f, false, true, -1.208f, -1.363f)
                lineToRelative(-0.4f, -2.082f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -4.225f, -2.922f)
                curveToRelative(-0.044f, 0.01f, -4.294f, 1.355f, -4.294f, 1.355f)
                arcToRelative(4.52f, 4.52f, 0.0f, false, false, -3.273f, 4.331f)
                verticalLineToRelative(7.731f)
                arcToRelative(4.505f, 4.505f, 0.0f, false, false, 4.5f, 4.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(4.505f, 4.505f, 0.0f, false, false, 4.5f, -4.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, -1.5f)
                close()
                moveTo(3.0f, 13.5f)
                verticalLineToRelative(-7.731f)
                arcToRelative(1.522f, 1.522f, 0.0f, false, true, 1.136f, -1.457f)
                lineToRelative(4.125f, -1.307f)
                arcToRelative(0.467f, 0.467f, 0.0f, false, true, 0.349f, 0.085f)
                arcToRelative(0.557f, 0.557f, 0.0f, false, true, 0.223f, 0.411f)
                lineToRelative(0.289f, 1.493f)
                lineToRelative(-1.628f, 0.006f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.006f, 3.0f)
                horizontalLineToRelative(0.006f)
                lineToRelative(2.847f, -0.01f)
                curveToRelative(0.064f, 0.07f, 0.133f, 0.135f, 0.2f, 0.2f)
                lineToRelative(-1.171f, 1.31f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 2.236f, 2.0f)
                lineToRelative(1.769f, -1.977f)
                lineToRelative(2.819f, 0.644f)
                arcToRelative(3.511f, 3.511f, 0.0f, false, true, 2.814f, 3.433f)
                arcToRelative(1.4f, 1.4f, 0.0f, false, true, -1.4f, 1.4f)
                horizontalLineToRelative(-13.12f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, -1.5f)
                close()
                moveTo(7.5f, 18.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-6.0f)
                close()
            }
        }
        .build()
        return _iceSkate!!
    }

private var _iceSkate: ImageVector? = null
