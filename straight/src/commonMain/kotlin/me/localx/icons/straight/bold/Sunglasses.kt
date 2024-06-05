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

public val Icons.Bold.Sunglasses: ImageVector
    get() {
        if (_sunglasses != null) {
            return _sunglasses!!
        }
        _sunglasses = Builder(name = "Sunglasses", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.89f, 13.667f)
                lineToRelative(-1.646f, -10.7f)
                curveToRelative(-0.265f, -1.719f, -1.72f, -2.967f, -3.459f, -2.967f)
                horizontalLineToRelative(-2.784f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.784f)
                curveToRelative(0.248f, 0.0f, 0.456f, 0.178f, 0.494f, 0.424f)
                lineToRelative(1.474f, 9.576f)
                horizontalLineToRelative(-3.252f)
                curveToRelative(-1.557f, 0.0f, -2.932f, 0.795f, -3.74f, 2.0f)
                horizontalLineToRelative(-3.52f)
                curveToRelative(-0.808f, -1.205f, -2.183f, -2.0f, -3.74f, -2.0f)
                horizontalLineToRelative(-3.252f)
                lineToRelative(1.474f, -9.576f)
                curveToRelative(0.038f, -0.246f, 0.246f, -0.424f, 0.494f, -0.424f)
                horizontalLineToRelative(2.784f)
                lineTo(8.001f, 0.0f)
                horizontalLineToRelative(-2.784f)
                curveToRelative(-1.739f, 0.0f, -3.194f, 1.248f, -3.459f, 2.968f)
                lineTo(0.11f, 13.669f)
                curveToRelative(-0.073f, 0.477f, -0.11f, 0.963f, -0.11f, 1.443f)
                verticalLineToRelative(4.388f)
                curveToRelative(0.0f, 2.481f, 2.019f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(2.0f)
                curveToRelative(2.481f, 0.0f, 4.5f, -2.019f, 4.5f, -4.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 2.481f, 2.019f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(2.0f)
                curveToRelative(2.481f, 0.0f, 4.5f, -2.019f, 4.5f, -4.5f)
                verticalLineToRelative(-4.388f)
                curveToRelative(0.0f, -0.48f, -0.037f, -0.966f, -0.11f, -1.444f)
                close()
                moveTo(8.0f, 19.5f)
                curveToRelative(0.0f, 0.827f, -0.673f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.827f, 0.0f, 1.5f, 0.673f, 1.5f, 1.5f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(21.0f, 19.5f)
                curveToRelative(0.0f, 0.827f, -0.673f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.827f, 0.673f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(3.5f)
                close()
            }
        }
        .build()
        return _sunglasses!!
    }

private var _sunglasses: ImageVector? = null
