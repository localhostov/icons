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

public val Icons.Bold.BringFront: ImageVector
    get() {
        if (_bringFront != null) {
            return _bringFront!!
        }
        _bringFront = Builder(name = "BringFront", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.8f, 18.0f)
                horizontalLineToRelative(-3.6f)
                curveToRelative(-2.32f, 0.0f, -4.2f, -1.88f, -4.2f, -4.2f)
                verticalLineToRelative(-3.6f)
                curveToRelative(0.0f, -2.32f, 1.88f, -4.2f, 4.2f, -4.2f)
                horizontalLineToRelative(3.6f)
                curveToRelative(2.32f, 0.0f, 4.2f, 1.88f, 4.2f, 4.2f)
                verticalLineToRelative(3.6f)
                curveToRelative(0.0f, 2.32f, -1.88f, 4.2f, -4.2f, 4.2f)
                close()
                moveTo(10.2f, 9.0f)
                curveToRelative(-0.66f, 0.0f, -1.2f, 0.54f, -1.2f, 1.2f)
                verticalLineToRelative(3.6f)
                curveToRelative(0.0f, 0.66f, 0.54f, 1.2f, 1.2f, 1.2f)
                horizontalLineToRelative(3.6f)
                curveToRelative(0.66f, 0.0f, 1.2f, -0.54f, 1.2f, -1.2f)
                verticalLineToRelative(-3.6f)
                curveToRelative(0.0f, -0.66f, -0.54f, -1.2f, -1.2f, -1.2f)
                horizontalLineToRelative(-3.6f)
                close()
                moveTo(3.62f, 10.5f)
                curveToRelative(0.55f, -0.62f, 0.5f, -1.57f, -0.12f, -2.12f)
                curveToRelative(-0.32f, -0.29f, -0.5f, -0.69f, -0.5f, -1.12f)
                verticalLineToRelative(-2.76f)
                curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(2.76f)
                curveToRelative(0.43f, 0.0f, 0.83f, 0.18f, 1.12f, 0.5f)
                curveToRelative(0.55f, 0.62f, 1.5f, 0.67f, 2.12f, 0.12f)
                curveToRelative(0.62f, -0.55f, 0.67f, -1.5f, 0.12f, -2.12f)
                curveTo(9.77f, 0.55f, 8.54f, 0.0f, 7.26f, 0.0f)
                horizontalLineToRelative(-2.76f)
                curveToRelative(-2.48f, 0.0f, -4.5f, 2.02f, -4.5f, 4.5f)
                verticalLineToRelative(2.76f)
                curveToRelative(0.0f, 1.28f, 0.55f, 2.5f, 1.5f, 3.35f)
                curveToRelative(0.29f, 0.26f, 0.64f, 0.38f, 1.0f, 0.38f)
                curveToRelative(0.41f, 0.0f, 0.82f, -0.17f, 1.12f, -0.5f)
                close()
                moveTo(24.0f, 19.5f)
                verticalLineToRelative(-2.76f)
                curveToRelative(0.0f, -1.28f, -0.55f, -2.5f, -1.5f, -3.35f)
                curveToRelative(-0.62f, -0.55f, -1.57f, -0.5f, -2.12f, 0.12f)
                curveToRelative(-0.55f, 0.62f, -0.5f, 1.57f, 0.12f, 2.12f)
                curveToRelative(0.32f, 0.29f, 0.5f, 0.69f, 0.5f, 1.12f)
                verticalLineToRelative(2.76f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-2.76f)
                curveToRelative(-0.43f, 0.0f, -0.83f, -0.18f, -1.12f, -0.5f)
                curveToRelative(-0.55f, -0.62f, -1.5f, -0.67f, -2.12f, -0.12f)
                curveToRelative(-0.62f, 0.55f, -0.67f, 1.5f, -0.12f, 2.12f)
                curveToRelative(0.85f, 0.95f, 2.08f, 1.5f, 3.35f, 1.5f)
                horizontalLineToRelative(2.76f)
                curveToRelative(2.48f, 0.0f, 4.5f, -2.02f, 4.5f, -4.5f)
                close()
            }
        }
        .build()
        return _bringFront!!
    }

private var _bringFront: ImageVector? = null
