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

public val Icons.Filled.Select: ImageVector
    get() {
        if (_select != null) {
            return _select!!
        }
        _select = Builder(name = "Select", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.883f, 15.216f)
                lineToRelative(-7.935f, 7.935f)
                arcToRelative(2.9f, 2.9f, 0.0f, true, true, -4.1f, -4.1f)
                lineToRelative(7.935f, -7.935f)
                close()
                moveTo(17.1f, 6.9f)
                arcToRelative(2.967f, 2.967f, 0.0f, false, false, -4.1f, 0.0f)
                lineToRelative(-2.8f, 2.8f)
                lineToRelative(4.1f, 4.1f)
                lineToRelative(2.8f, -2.8f)
                arcToRelative(2.9f, 2.9f, 0.0f, false, false, 0.0f, -4.1f)
                close()
                moveTo(4.863f, 5.145f)
                lineTo(6.413f, 5.587f)
                lineTo(6.855f, 7.137f)
                arcToRelative(1.191f, 1.191f, 0.0f, false, false, 2.29f, 0.0f)
                lineToRelative(0.442f, -1.55f)
                lineToRelative(1.55f, -0.442f)
                arcToRelative(1.191f, 1.191f, 0.0f, false, false, 0.0f, -2.29f)
                lineToRelative(-1.55f, -0.442f)
                lineToRelative(-0.442f, -1.55f)
                arcToRelative(1.191f, 1.191f, 0.0f, false, false, -2.29f, 0.0f)
                lineToRelative(-0.442f, 1.55f)
                lineToRelative(-1.55f, 0.442f)
                arcToRelative(1.191f, 1.191f, 0.0f, false, false, 0.0f, 2.29f)
                close()
                moveTo(16.863f, 17.145f)
                lineTo(18.413f, 17.587f)
                lineTo(18.855f, 19.137f)
                arcToRelative(1.191f, 1.191f, 0.0f, false, false, 2.29f, 0.0f)
                lineToRelative(0.442f, -1.55f)
                lineToRelative(1.55f, -0.442f)
                arcToRelative(1.191f, 1.191f, 0.0f, false, false, 0.0f, -2.29f)
                lineToRelative(-1.55f, -0.442f)
                lineToRelative(-0.442f, -1.55f)
                arcToRelative(1.191f, 1.191f, 0.0f, false, false, -2.29f, 0.0f)
                lineToRelative(-0.442f, 1.55f)
                lineToRelative(-1.55f, 0.442f)
                arcToRelative(1.191f, 1.191f, 0.0f, false, false, 0.0f, 2.29f)
                close()
                moveTo(17.756f, 4.5f)
                lineTo(19.111f, 4.887f)
                lineTo(19.5f, 6.244f)
                arcToRelative(1.042f, 1.042f, 0.0f, false, false, 2.0f, 0.0f)
                lineToRelative(0.387f, -1.355f)
                lineToRelative(1.357f, -0.389f)
                arcToRelative(1.042f, 1.042f, 0.0f, false, false, 0.0f, -2.0f)
                lineToRelative(-1.355f, -0.387f)
                lineToRelative(-0.389f, -1.357f)
                arcToRelative(1.042f, 1.042f, 0.0f, false, false, -2.0f, 0.0f)
                lineToRelative(-0.387f, 1.355f)
                lineToRelative(-1.357f, 0.389f)
                arcToRelative(1.042f, 1.042f, 0.0f, false, false, 0.0f, 2.0f)
                close()
            }
        }
        .build()
        return _select!!
    }

private var _select: ImageVector? = null
