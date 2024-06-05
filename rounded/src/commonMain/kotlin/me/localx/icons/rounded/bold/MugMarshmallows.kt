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

public val Icons.Bold.MugMarshmallows: ImageVector
    get() {
        if (_mugMarshmallows != null) {
            return _mugMarshmallows!!
        }
        _mugMarshmallows = Builder(name = "MugMarshmallows", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.0f, 9.5f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.64f, -1.138f, -3.01f, -2.663f, -3.388f)
                lineToRelative(0.106f, -0.112f)
                curveToRelative(0.248f, -0.34f, 0.387f, -0.744f, 0.387f, -1.172f)
                curveToRelative(0.0f, -0.535f, -0.208f, -1.037f, -0.586f, -1.414f)
                lineToRelative(-2.829f, -2.83f)
                curveToRelative(-0.78f, -0.78f, -2.049f, -0.778f, -2.828f, 0.0f)
                lineToRelative(-2.829f, 2.829f)
                curveToRelative(-0.704f, 0.704f, -0.766f, 1.804f, -0.198f, 2.585f)
                horizontalLineToRelative(-2.192f)
                curveToRelative(-0.419f, -1.37f, -0.105f, -2.918f, 0.976f, -4.0f)
                lineTo(8.312f, 0.031f)
                curveToRelative(-0.102f, -0.016f, -0.205f, -0.031f, -0.312f, -0.031f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(4.351f)
                curveToRelative(-1.178f, 0.564f, -2.0f, 1.758f, -2.0f, 3.149f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 3.033f, 2.467f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(8.0f)
                curveToRelative(2.327f, 0.0f, 4.316f, -1.454f, 5.118f, -3.5f)
                horizontalLineToRelative(1.382f)
                curveToRelative(2.206f, 0.0f, 4.0f, -1.794f, 4.0f, -4.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                close()
                moveTo(13.5f, 21.0f)
                lineTo(5.5f, 21.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, -1.122f, -2.5f, -2.5f)
                verticalLineToRelative(-9.0f)
                curveToRelative(0.0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(12.0f)
                curveToRelative(0.276f, 0.0f, 0.5f, 0.224f, 0.5f, 0.5f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 1.378f, -1.122f, 2.5f, -2.5f, 2.5f)
                close()
                moveTo(21.0f, 16.5f)
                curveToRelative(0.0f, 0.551f, -0.449f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _mugMarshmallows!!
    }

private var _mugMarshmallows: ImageVector? = null
