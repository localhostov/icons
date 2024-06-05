package me.localx.icons.straight.filled

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

public val Icons.Filled.Smoke: ImageVector
    get() {
        if (_smoke != null) {
            return _smoke!!
        }
        _smoke = Builder(name = "Smoke", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 24.0f)
                arcToRelative(4.955f, 4.955f, 0.0f, false, true, -2.38f, -0.6f)
                arcToRelative(6.117f, 6.117f, 0.0f, false, true, -5.767f, -0.29f)
                arcTo(5.029f, 5.029f, 0.0f, false, true, 0.134f, 17.829f)
                arcToRelative(4.947f, 4.947f, 0.0f, false, true, 3.677f, -3.69f)
                arcToRelative(5.084f, 5.084f, 0.0f, false, true, 2.554f, 0.049f)
                arcToRelative(6.044f, 6.044f, 0.0f, false, true, 9.13f, -0.163f)
                arcToRelative(5.03f, 5.03f, 0.0f, false, true, 4.531f, 2.007f)
                arcToRelative(3.561f, 3.561f, 0.0f, false, true, 1.508f, 0.119f)
                horizontalLineToRelative(0.0f)
                arcToRelative(3.446f, 3.446f, 0.0f, false, true, 2.347f, 2.435f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -4.608f, 4.193f)
                arcTo(4.986f, 4.986f, 0.0f, false, true, 16.0f, 24.0f)
                close()
                moveTo(3.356f, 12.191f)
                arcToRelative(7.249f, 7.249f, 0.0f, false, true, 2.311f, -0.159f)
                arcTo(8.054f, 8.054f, 0.0f, false, true, 16.3f, 12.009f)
                arcToRelative(7.055f, 7.055f, 0.0f, false, true, 4.614f, 2.0f)
                arcToRelative(5.674f, 5.674f, 0.0f, false, true, 1.19f, 0.22f)
                arcToRelative(5.388f, 5.388f, 0.0f, false, true, 1.494f, 0.72f)
                arcToRelative(4.986f, 4.986f, 0.0f, false, false, -3.577f, -6.846f)
                arcToRelative(4.834f, 4.834f, 0.0f, false, false, -2.4f, 0.093f)
                arcToRelative(6.009f, 6.009f, 0.0f, false, false, -9.846f, 0.879f)
                arcToRelative(4.006f, 4.006f, 0.0f, false, false, -4.706f, 3.2f)
                verticalLineToRelative(0.0f)
                curveTo(3.169f, 12.253f, 3.259f, 12.214f, 3.356f, 12.191f)
                close()
                moveTo(1.443f, 10.782f)
                arcTo(5.989f, 5.989f, 0.0f, false, true, 6.773f, 7.0f)
                arcToRelative(8.015f, 8.015f, 0.0f, false, true, 11.542f, -0.97f)
                arcToRelative(6.851f, 6.851f, 0.0f, false, true, 2.119f, 0.117f)
                arcToRelative(7.038f, 7.038f, 0.0f, false, true, 2.536f, 1.1f)
                lineToRelative(0.005f, -0.009f)
                lineToRelative(0.016f, -0.008f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 20.237f, 4.01f)
                arcToRelative(4.513f, 4.513f, 0.0f, false, false, -5.3f, -1.731f)
                arcToRelative(5.518f, 5.518f, 0.0f, false, false, -9.392f, 0.851f)
                arcToRelative(4.432f, 4.432f, 0.0f, false, false, -2.156f, 0.006f)
                arcToRelative(4.519f, 4.519f, 0.0f, false, false, -1.95f, 7.646f)
                close()
            }
        }
        .build()
        return _smoke!!
    }

private var _smoke: ImageVector? = null
