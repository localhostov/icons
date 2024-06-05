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

public val Icons.Bold.Stomach: ImageVector
    get() {
        if (_stomach != null) {
            return _stomach!!
        }
        _stomach = Builder(name = "Stomach", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 10.5f)
                curveToRelative(0.0f, -4.136f, -3.364f, -7.5f, -7.5f, -7.5f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-1.177f, 0.0f, -2.272f, -0.806f, -2.548f, -1.874f)
                curveToRelative(-0.206f, -0.803f, -1.029f, -1.292f, -1.826f, -1.078f)
                curveToRelative(-0.803f, 0.206f, -1.285f, 1.024f, -1.078f, 1.826f)
                curveToRelative(0.49f, 1.907f, 2.05f, 3.397f, 3.951f, 3.922f)
                lineToRelative(-0.004f, 8.204f)
                curveToRelative(0.0f, 0.558f, -0.229f, 1.295f, -1.996f, 2.082f)
                curveToRelative(-2.328f, 0.662f, -4.003f, 2.921f, -4.002f, 5.428f)
                lineToRelative(0.003f, 0.995f)
                curveToRelative(0.003f, 0.826f, 0.674f, 1.495f, 1.5f, 1.495f)
                horizontalLineToRelative(0.005f)
                curveToRelative(0.828f, -0.003f, 1.497f, -0.676f, 1.495f, -1.505f)
                lineToRelative(-0.003f, -0.991f)
                curveToRelative(0.0f, -0.63f, 0.23f, -1.237f, 0.608f, -1.707f)
                curveToRelative(2.325f, 1.314f, 4.591f, 2.203f, 8.895f, 2.203f)
                curveToRelative(4.133f, 0.0f, 7.495f, -3.364f, 7.495f, -7.497f)
                lineToRelative(0.005f, -4.003f)
                close()
                moveTo(18.987f, 10.157f)
                curveToRelative(-0.44f, -0.096f, -0.936f, -0.157f, -1.487f, -0.157f)
                curveToRelative(-1.277f, 0.0f, -2.146f, 0.332f, -2.843f, 0.599f)
                curveToRelative(-0.608f, 0.233f, -1.048f, 0.401f, -1.771f, 0.401f)
                curveToRelative(-0.777f, 0.0f, -1.439f, -0.204f, -1.89f, -0.396f)
                lineToRelative(0.002f, -4.604f)
                horizontalLineToRelative(3.501f)
                curveToRelative(2.367f, 0.0f, 4.312f, 1.836f, 4.487f, 4.157f)
                close()
                moveTo(14.5f, 19.0f)
                curveToRelative(-2.639f, 0.0f, -4.304f, -0.36f, -5.795f, -0.997f)
                curveToRelative(1.521f, -1.042f, 2.29f, -2.383f, 2.29f, -4.003f)
                verticalLineToRelative(-0.237f)
                curveToRelative(0.556f, 0.14f, 1.192f, 0.237f, 1.892f, 0.237f)
                curveToRelative(1.277f, 0.0f, 2.146f, -0.332f, 2.843f, -0.599f)
                curveToRelative(0.608f, -0.233f, 1.048f, -0.401f, 1.771f, -0.401f)
                curveToRelative(0.676f, 0.0f, 1.174f, 0.153f, 1.497f, 0.299f)
                verticalLineToRelative(1.202f)
                curveToRelative(-0.001f, 2.48f, -2.018f, 4.499f, -4.497f, 4.499f)
                close()
            }
        }
        .build()
        return _stomach!!
    }

private var _stomach: ImageVector? = null
