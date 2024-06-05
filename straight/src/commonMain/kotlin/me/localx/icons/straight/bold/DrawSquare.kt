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

public val Icons.Bold.DrawSquare: ImageVector
    get() {
        if (_drawSquare != null) {
            return _drawSquare!!
        }
        _drawSquare = Builder(name = "DrawSquare", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 18.184f)
                lineTo(22.0f, 5.816f)
                curveToRelative(1.163f, -0.413f, 2.0f, -1.512f, 2.0f, -2.816f)
                curveToRelative(0.0f, -1.657f, -1.343f, -3.0f, -3.0f, -3.0f)
                curveToRelative(-1.304f, 0.0f, -2.403f, 0.837f, -2.816f, 2.0f)
                lineTo(5.816f, 2.0f)
                curveToRelative(-0.413f, -1.162f, -1.512f, -2.0f, -2.816f, -2.0f)
                curveTo(1.343f, 0.0f, 0.0f, 1.343f, 0.0f, 3.0f)
                curveToRelative(0.0f, 1.304f, 0.837f, 2.403f, 2.0f, 2.816f)
                verticalLineToRelative(12.368f)
                curveToRelative(-1.162f, 0.413f, -2.0f, 1.512f, -2.0f, 2.816f)
                curveToRelative(0.0f, 1.657f, 1.343f, 3.0f, 3.0f, 3.0f)
                curveToRelative(1.304f, 0.0f, 2.403f, -0.837f, 2.816f, -2.0f)
                horizontalLineToRelative(12.367f)
                curveToRelative(0.413f, 1.163f, 1.512f, 2.0f, 2.816f, 2.0f)
                curveToRelative(1.657f, 0.0f, 3.0f, -1.343f, 3.0f, -3.0f)
                curveToRelative(0.0f, -1.304f, -0.838f, -2.403f, -2.0f, -2.816f)
                close()
                moveTo(5.0f, 18.779f)
                lineTo(5.0f, 5.222f)
                curveToRelative(0.078f, -0.07f, 0.151f, -0.144f, 0.222f, -0.222f)
                horizontalLineToRelative(13.557f)
                curveToRelative(0.07f, 0.078f, 0.143f, 0.151f, 0.221f, 0.221f)
                verticalLineToRelative(13.558f)
                curveToRelative(-0.078f, 0.07f, -0.151f, 0.143f, -0.221f, 0.221f)
                lineTo(5.221f, 19.0f)
                curveToRelative(-0.07f, -0.078f, -0.144f, -0.151f, -0.222f, -0.222f)
                close()
            }
        }
        .build()
        return _drawSquare!!
    }

private var _drawSquare: ImageVector? = null
