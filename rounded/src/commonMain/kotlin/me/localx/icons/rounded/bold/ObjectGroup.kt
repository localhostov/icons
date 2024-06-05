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

public val Icons.Bold.ObjectGroup: ImageVector
    get() {
        if (_objectGroup != null) {
            return _objectGroup!!
        }
        _objectGroup = Builder(name = "ObjectGroup", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 18.184f)
                lineTo(22.0f, 5.816f)
                curveToRelative(1.163f, -0.413f, 2.0f, -1.512f, 2.0f, -2.816f)
                curveToRelative(0.0f, -1.657f, -1.343f, -3.0f, -3.0f, -3.0f)
                curveToRelative(-1.304f, 0.0f, -2.403f, 0.837f, -2.816f, 2.0f)
                lineTo(5.846f, 2.0f)
                curveTo(5.461f, 0.788f, 4.34f, -0.097f, 3.0f, -0.097f)
                curveTo(1.343f, -0.097f, 0.0f, 1.246f, 0.0f, 2.903f)
                curveToRelative(0.0f, 1.304f, 0.837f, 2.403f, 2.0f, 2.816f)
                verticalLineToRelative(12.464f)
                curveToRelative(-1.163f, 0.413f, -2.0f, 1.512f, -2.0f, 2.816f)
                curveToRelative(0.0f, 1.657f, 1.343f, 3.0f, 3.0f, 3.0f)
                curveToRelative(1.304f, 0.0f, 2.403f, -0.837f, 2.816f, -2.0f)
                horizontalLineToRelative(12.367f)
                curveToRelative(0.413f, 1.163f, 1.512f, 2.0f, 2.816f, 2.0f)
                curveToRelative(1.657f, 0.0f, 3.0f, -1.343f, 3.0f, -3.0f)
                curveToRelative(0.0f, -1.304f, -0.837f, -2.403f, -2.0f, -2.816f)
                close()
                moveTo(18.779f, 19.0f)
                lineTo(5.221f, 19.0f)
                curveToRelative(-0.07f, -0.078f, -0.143f, -0.151f, -0.221f, -0.221f)
                lineTo(5.0f, 5.125f)
                curveToRelative(0.047f, -0.042f, 0.098f, -0.08f, 0.142f, -0.125f)
                horizontalLineToRelative(13.637f)
                curveToRelative(0.07f, 0.078f, 0.143f, 0.151f, 0.221f, 0.221f)
                verticalLineToRelative(13.557f)
                curveToRelative(-0.078f, 0.07f, -0.151f, 0.143f, -0.221f, 0.221f)
                close()
                moveTo(12.0f, 13.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, -0.895f, -2.0f, -2.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.105f, 0.895f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, 0.895f, 2.0f, 2.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                close()
                moveTo(18.0f, 13.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, -0.895f, -2.0f, -2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(2.209f, 0.0f, 4.0f, -1.791f, 4.0f, -4.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, 0.895f, 2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _objectGroup!!
    }

private var _objectGroup: ImageVector? = null
