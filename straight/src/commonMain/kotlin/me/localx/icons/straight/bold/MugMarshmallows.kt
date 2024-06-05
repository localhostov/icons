package me.localx.icons.straight.bold

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
                moveToRelative(24.0f, 13.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-2.557f)
                curveToRelative(0.247f, -0.34f, 0.387f, -0.743f, 0.387f, -1.171f)
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
                verticalLineToRelative(4.0f)
                lineTo(0.0f, 6.0f)
                verticalLineToRelative(14.5f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(12.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-6.5f)
                close()
                moveTo(16.0f, 20.5f)
                curveToRelative(0.0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
                lineTo(3.5f, 21.0f)
                curveToRelative(-0.276f, 0.0f, -0.5f, -0.224f, -0.5f, -0.5f)
                verticalLineToRelative(-11.5f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(11.5f)
                close()
                moveTo(21.0f, 17.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.276f, 0.0f, 0.5f, 0.224f, 0.5f, 0.5f)
                verticalLineToRelative(3.5f)
                close()
            }
        }
        .build()
        return _mugMarshmallows!!
    }

private var _mugMarshmallows: ImageVector? = null
