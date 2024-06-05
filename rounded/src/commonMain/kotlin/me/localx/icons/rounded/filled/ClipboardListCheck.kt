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

public val Icons.Filled.ClipboardListCheck: ImageVector
    get() {
        if (_clipboardListCheck != null) {
            return _clipboardListCheck!!
        }
        _clipboardListCheck = Builder(name = "ClipboardListCheck", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 2.0f)
                horizontalLineToRelative(-0.171f)
                curveToRelative(-0.413f, -1.164f, -1.525f, -2.0f, -2.829f, -2.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-1.304f, 0.0f, -2.416f, 0.836f, -2.829f, 2.0f)
                horizontalLineToRelative(-0.171f)
                curveToRelative(-2.757f, 0.0f, -5.0f, 2.243f, -5.0f, 5.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                lineTo(21.0f, 7.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(7.0f, 17.0f)
                curveToRelative(-1.308f, -0.006f, -1.308f, -1.994f, 0.0f, -2.0f)
                curveToRelative(1.308f, 0.006f, 1.308f, 1.994f, 0.0f, 2.0f)
                close()
                moveTo(7.667f, 12.0f)
                curveToRelative(-0.445f, 0.0f, -0.864f, -0.173f, -1.178f, -0.488f)
                lineToRelative(-1.008f, -0.951f)
                curveToRelative(-0.401f, -0.379f, -0.42f, -1.012f, -0.041f, -1.414f)
                curveToRelative(0.379f, -0.402f, 1.012f, -0.42f, 1.414f, -0.041f)
                lineToRelative(0.811f, 0.766f)
                lineToRelative(1.64f, -1.59f)
                curveToRelative(0.396f, -0.384f, 1.029f, -0.375f, 1.414f, 0.022f)
                curveToRelative(0.384f, 0.396f, 0.375f, 1.029f, -0.022f, 1.414f)
                lineToRelative(-1.862f, 1.805f)
                curveToRelative(-0.303f, 0.304f, -0.722f, 0.477f, -1.167f, 0.477f)
                close()
                moveTo(17.0f, 17.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-1.308f, -0.006f, -1.307f, -1.994f, 0.0f, -2.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(1.308f, 0.006f, 1.307f, 1.994f, 0.0f, 2.0f)
                close()
                moveTo(17.0f, 12.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-1.308f, -0.006f, -1.307f, -1.994f, 0.0f, -2.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(1.308f, 0.006f, 1.307f, 1.994f, 0.0f, 2.0f)
                close()
            }
        }
        .build()
        return _clipboardListCheck!!
    }

private var _clipboardListCheck: ImageVector? = null
