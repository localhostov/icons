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

public val Icons.Bold.BringForward: ImageVector
    get() {
        if (_bringForward != null) {
            return _bringForward!!
        }
        _bringForward = Builder(name = "BringForward", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5f, 16.0f)
                lineTo(5.5f, 16.0f)
                curveToRelative(-3.03f, 0.0f, -5.5f, -2.47f, -5.5f, -5.5f)
                lineTo(0.0f, 5.5f)
                curveTo(0.0f, 2.47f, 2.47f, 0.0f, 5.5f, 0.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(3.03f, 0.0f, 5.5f, 2.47f, 5.5f, 5.5f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
                close()
                moveTo(5.5f, 3.0f)
                curveToRelative(-1.38f, 0.0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(5.0f)
                curveToRelative(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f)
                lineTo(13.0f, 5.5f)
                curveToRelative(0.0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                lineTo(5.5f, 3.0f)
                close()
                moveTo(24.0f, 18.5f)
                verticalLineToRelative(-5.13f)
                curveToRelative(0.0f, -2.51f, -1.7f, -4.7f, -4.13f, -5.33f)
                curveToRelative(-0.8f, -0.2f, -1.62f, 0.28f, -1.83f, 1.08f)
                curveToRelative(-0.21f, 0.8f, 0.28f, 1.62f, 1.08f, 1.83f)
                curveToRelative(1.1f, 0.28f, 1.87f, 1.28f, 1.87f, 2.42f)
                verticalLineToRelative(5.13f)
                curveToRelative(0.0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-5.13f)
                curveToRelative(-1.14f, 0.0f, -2.14f, -0.77f, -2.42f, -1.87f)
                curveToRelative(-0.21f, -0.8f, -1.02f, -1.28f, -1.83f, -1.08f)
                curveToRelative(-0.8f, 0.21f, -1.29f, 1.02f, -1.08f, 1.83f)
                curveToRelative(0.62f, 2.43f, 2.82f, 4.13f, 5.33f, 4.13f)
                horizontalLineToRelative(5.13f)
                curveToRelative(3.03f, 0.0f, 5.5f, -2.47f, 5.5f, -5.5f)
                close()
            }
        }
        .build()
        return _bringForward!!
    }

private var _bringForward: ImageVector? = null
