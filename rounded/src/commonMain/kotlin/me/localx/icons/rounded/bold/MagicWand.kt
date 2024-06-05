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

public val Icons.Bold.MagicWand: ImageVector
    get() {
        if (_magicWand != null) {
            return _magicWand!!
        }
        _magicWand = Builder(name = "MagicWand", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(4.863f, 2.855f)
                lineToRelative(1.55f, -0.442f)
                lineToRelative(0.442f, -1.55f)
                arcToRelative(1.191f, 1.191f, 0.0f, false, true, 2.29f, 0.0f)
                lineToRelative(0.442f, 1.55f)
                lineToRelative(1.55f, 0.442f)
                arcToRelative(1.191f, 1.191f, 0.0f, false, true, 0.0f, 2.29f)
                lineToRelative(-1.55f, 0.442f)
                lineToRelative(-0.442f, 1.55f)
                arcToRelative(1.191f, 1.191f, 0.0f, false, true, -2.29f, 0.0f)
                lineToRelative(-0.442f, -1.55f)
                lineToRelative(-1.55f, -0.442f)
                arcToRelative(1.191f, 1.191f, 0.0f, false, true, 0.0f, -2.29f)
                close()
                moveTo(23.137f, 14.855f)
                lineTo(21.587f, 14.413f)
                lineTo(21.145f, 12.863f)
                arcToRelative(1.191f, 1.191f, 0.0f, false, false, -2.29f, 0.0f)
                lineToRelative(-0.442f, 1.55f)
                lineToRelative(-1.55f, 0.442f)
                arcToRelative(1.191f, 1.191f, 0.0f, false, false, 0.0f, 2.29f)
                lineToRelative(1.55f, 0.442f)
                lineToRelative(0.442f, 1.55f)
                arcToRelative(1.191f, 1.191f, 0.0f, false, false, 2.29f, 0.0f)
                lineToRelative(0.442f, -1.55f)
                lineToRelative(1.55f, -0.442f)
                arcToRelative(1.191f, 1.191f, 0.0f, false, false, 0.0f, -2.29f)
                close()
                moveTo(17.755f, 4.5f)
                lineTo(19.111f, 4.887f)
                lineTo(19.5f, 6.244f)
                arcToRelative(1.042f, 1.042f, 0.0f, false, false, 2.0f, 0.0f)
                lineToRelative(0.387f, -1.355f)
                lineToRelative(1.358f, -0.389f)
                arcToRelative(1.042f, 1.042f, 0.0f, false, false, 0.0f, -2.0f)
                lineToRelative(-1.356f, -0.387f)
                lineToRelative(-0.389f, -1.358f)
                arcToRelative(1.042f, 1.042f, 0.0f, false, false, -2.0f, 0.0f)
                lineToRelative(-0.387f, 1.356f)
                lineToRelative(-1.358f, 0.389f)
                arcToRelative(1.042f, 1.042f, 0.0f, false, false, 0.0f, 2.0f)
                close()
                moveTo(17.155f, 12.648f)
                lineTo(6.686f, 22.864f)
                arcToRelative(3.926f, 3.926f, 0.0f, false, true, -5.537f, -0.013f)
                arcToRelative(3.929f, 3.929f, 0.0f, false, true, 0.0f, -5.55f)
                lineToRelative(10.524f, -10.268f)
                arcToRelative(3.923f, 3.923f, 0.0f, false, true, 6.664f, 2.832f)
                arcToRelative(3.894f, 3.894f, 0.0f, false, true, -1.184f, 2.785f)
                close()
                moveTo(10.975f, 14.487f)
                lineTo(9.666f, 13.182f)
                lineTo(3.257f, 19.435f)
                arcToRelative(0.921f, 0.921f, 0.0f, false, false, 0.014f, 1.294f)
                arcToRelative(0.943f, 0.943f, 0.0f, false, false, 1.306f, 0.0f)
                close()
                moveTo(15.339f, 9.845f)
                arcToRelative(0.924f, 0.924f, 0.0f, false, false, -1.569f, -0.667f)
                lineToRelative(-1.955f, 1.907f)
                lineToRelative(1.307f, 1.307f)
                lineToRelative(1.937f, -1.892f)
                arcToRelative(0.92f, 0.92f, 0.0f, false, false, 0.278f, -0.653f)
                close()
            }
        }
        .build()
        return _magicWand!!
    }

private var _magicWand: ImageVector? = null
