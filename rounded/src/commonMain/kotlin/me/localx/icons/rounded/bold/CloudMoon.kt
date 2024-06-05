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

public val Icons.Bold.CloudMoon: ImageVector
    get() {
        if (_cloudMoon != null) {
            return _cloudMoon!!
        }
        _cloudMoon = Builder(name = "CloudMoon", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.769f, 24.0f)
                arcToRelative(4.153f, 4.153f, 0.0f, false, true, -0.944f, -0.129f)
                arcToRelative(3.728f, 3.728f, 0.0f, false, true, -0.77f, -6.95f)
                arcTo(5.934f, 5.934f, 0.0f, false, true, 8.0f, 15.971f)
                arcToRelative(6.109f, 6.109f, 0.0f, false, true, 5.143f, -5.906f)
                arcToRelative(6.228f, 6.228f, 0.0f, false, true, 6.628f, 3.675f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.692f, 1.692f, 0.0f, false, false, 0.338f, 0.1f)
                arcToRelative(5.149f, 5.149f, 0.0f, false, true, -0.154f, 10.024f)
                arcTo(5.51f, 5.51f, 0.0f, false, true, 18.845f, 24.0f)
                close()
                moveTo(14.041f, 13.0f)
                arcToRelative(3.386f, 3.386f, 0.0f, false, false, -0.479f, 0.034f)
                arcToRelative(3.013f, 3.013f, 0.0f, false, false, -2.473f, 2.306f)
                arcToRelative(3.067f, 3.067f, 0.0f, false, false, -0.093f, 0.686f)
                arcToRelative(2.983f, 2.983f, 0.0f, false, false, 0.067f, 0.68f)
                arcTo(2.447f, 2.447f, 0.0f, false, true, 9.62f, 19.491f)
                curveToRelative(-0.3f, 0.125f, -0.721f, 0.492f, -0.6f, 0.95f)
                arcToRelative(0.793f, 0.793f, 0.0f, false, false, 0.551f, 0.526f)
                arcTo(1.159f, 1.159f, 0.0f, false, false, 9.808f, 21.0f)
                horizontalLineToRelative(9.009f)
                arcToRelative(2.413f, 2.413f, 0.0f, false, false, 0.479f, -0.062f)
                arcToRelative(2.15f, 2.15f, 0.0f, false, false, 0.046f, -4.195f)
                arcToRelative(3.045f, 3.045f, 0.0f, false, true, -2.334f, -1.825f)
                verticalLineToRelative(0.0f)
                arcTo(3.2f, 3.2f, 0.0f, false, false, 14.041f, 13.0f)
                close()
                moveTo(5.068f, 16.933f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.015f, -2.122f)
                curveTo(0.068f, 9.973f, 4.889f, 1.437f, 11.613f, 3.221f)
                arcTo(11.367f, 11.367f, 0.0f, false, false, 8.722f, 6.855f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.709f, 1.29f)
                arcToRelative(8.772f, 8.772f, 0.0f, false, true, 2.552f, -2.987f)
                arcTo(2.662f, 2.662f, 0.0f, false, false, 13.247f, 0.585f)
                arcTo(9.945f, 9.945f, 0.0f, false, false, 0.0f, 9.9f)
                arcToRelative(9.825f, 9.825f, 0.0f, false, false, 2.947f, 7.047f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.121f, -0.014f)
                close()
            }
        }
        .build()
        return _cloudMoon!!
    }

private var _cloudMoon: ImageVector? = null
