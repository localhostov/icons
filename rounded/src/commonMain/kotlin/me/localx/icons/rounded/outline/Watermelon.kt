package me.localx.icons.rounded.outline

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

public val Icons.Outline.Watermelon: ImageVector
    get() {
        if (_watermelon != null) {
            return _watermelon!!
        }
        _watermelon = Builder(name = "Watermelon", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.373f, 2.324f)
                arcTo(4.336f, 4.336f, 0.0f, false, false, 15.5f, 1.273f)
                lineTo(1.273f, 15.5f)
                arcTo(4.347f, 4.347f, 0.0f, false, false, 0.059f, 19.242f)
                curveToRelative(0.718f, 3.917f, 5.816f, 4.606f, 9.038f, 4.765f)
                curveTo(19.975f, 24.163f, 27.521f, 12.05f, 22.373f, 2.324f)
                close()
                moveTo(18.216f, 18.216f)
                arcTo(12.874f, 12.874f, 0.0f, false, true, 3.232f, 20.593f)
                arcToRelative(2.322f, 2.322f, 0.0f, false, true, -0.545f, -3.682f)
                lineTo(16.911f, 2.686f)
                arcToRelative(2.321f, 2.321f, 0.0f, false, true, 3.682f, 0.546f)
                arcTo(12.871f, 12.871f, 0.0f, false, true, 18.216f, 18.216f)
                close()
                moveTo(18.616f, 7.768f)
                arcToRelative(1.308f, 1.308f, 0.0f, false, true, -1.85f, 1.85f)
                arcToRelative(5.412f, 5.412f, 0.0f, false, true, -0.751f, -1.966f)
                arcToRelative(0.526f, 0.526f, 0.0f, false, true, 0.635f, -0.635f)
                arcTo(5.412f, 5.412f, 0.0f, false, true, 18.614f, 7.768f)
                close()
                moveTo(13.616f, 15.768f)
                arcToRelative(1.308f, 1.308f, 0.0f, false, true, -1.849f, 1.849f)
                arcToRelative(5.378f, 5.378f, 0.0f, false, true, -0.752f, -1.966f)
                arcToRelative(0.526f, 0.526f, 0.0f, false, true, 0.635f, -0.634f)
                arcTo(5.394f, 5.394f, 0.0f, false, true, 13.616f, 15.765f)
                close()
                moveTo(16.616f, 12.768f)
                arcToRelative(1.308f, 1.308f, 0.0f, false, true, -1.85f, 1.85f)
                arcToRelative(5.412f, 5.412f, 0.0f, false, true, -0.751f, -1.966f)
                arcToRelative(0.526f, 0.526f, 0.0f, false, true, 0.635f, -0.635f)
                arcTo(5.412f, 5.412f, 0.0f, false, true, 16.615f, 12.766f)
                close()
                moveTo(8.616f, 16.768f)
                arcToRelative(1.308f, 1.308f, 0.0f, false, true, -1.849f, 1.849f)
                arcToRelative(5.369f, 5.369f, 0.0f, false, true, -0.751f, -1.966f)
                arcToRelative(0.526f, 0.526f, 0.0f, false, true, 0.634f, -0.635f)
                arcTo(5.386f, 5.386f, 0.0f, false, true, 8.618f, 16.765f)
                close()
            }
        }
        .build()
        return _watermelon!!
    }

private var _watermelon: ImageVector? = null
