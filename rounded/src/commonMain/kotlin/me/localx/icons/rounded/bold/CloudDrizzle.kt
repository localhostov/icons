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

public val Icons.Bold.CloudDrizzle: ImageVector
    get() {
        if (_cloudDrizzle != null) {
            return _cloudDrizzle!!
        }
        _cloudDrizzle = Builder(name = "CloudDrizzle", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.5f, 24.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 10.0f, 22.5f)
                verticalLineToRelative(-1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                verticalLineToRelative(1.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 11.5f, 24.0f)
                close()
                moveTo(10.0f, 16.5f)
                verticalLineToRelative(-1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                close()
                moveTo(8.0f, 22.5f)
                verticalLineToRelative(-1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                close()
                moveTo(16.0f, 16.5f)
                verticalLineToRelative(-1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                close()
                moveTo(18.0f, 22.5f)
                verticalLineToRelative(-1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                close()
                moveTo(4.747f, 18.834f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.413f, -2.081f)
                arcToRelative(2.806f, 2.806f, 0.0f, false, true, -0.418f, -4.436f)
                arcTo(3.417f, 3.417f, 0.0f, false, false, 5.0f, 9.173f)
                arcToRelative(5.317f, 5.317f, 0.0f, false, true, -0.02f, -1.888f)
                arcToRelative(5.183f, 5.183f, 0.0f, false, true, 9.792f, -1.32f)
                arcToRelative(3.418f, 3.418f, 0.0f, false, false, 2.447f, 1.9f)
                curveToRelative(4.0f, 0.768f, 5.039f, 5.971f, 1.9f, 8.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 1.954f, 2.276f)
                curveTo(26.118f, 14.5f, 24.239f, 6.17f, 17.809f, 4.922f)
                arcToRelative(0.437f, 0.437f, 0.0f, false, true, -0.322f, -0.242f)
                arcTo(8.241f, 8.241f, 0.0f, false, false, 8.558f, 0.14f)
                arcTo(8.128f, 8.128f, 0.0f, false, false, 2.025f, 6.793f)
                arcToRelative(8.289f, 8.289f, 0.0f, false, false, 0.034f, 2.952f)
                arcTo(0.433f, 0.433f, 0.0f, false, true, 1.9f, 10.1f)
                arcToRelative(5.823f, 5.823f, 0.0f, false, false, 0.768f, 9.149f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.081f, -0.413f)
                close()
            }
        }
        .build()
        return _cloudDrizzle!!
    }

private var _cloudDrizzle: ImageVector? = null
