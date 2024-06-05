package me.localx.icons.straight.outline

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

public val Icons.Outline.Tire: ImageVector
    get() {
        if (_tire != null) {
            return _tire!!
        }
        _tire = Builder(name = "Tire", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 0.0f, 12.0f)
                curveToRelative(0.6f, 15.9f, 23.4f, 15.893f, 24.0f, 0.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 22.0f)
                arcTo(10.011f, 10.011f, 0.0f, false, true, 2.0f, 12.0f)
                curveTo(2.5f, -1.248f, 21.5f, -1.245f, 22.0f, 12.0f)
                arcTo(10.011f, 10.011f, 0.0f, false, true, 12.0f, 22.0f)
                close()
                moveTo(12.0f, 4.0f)
                arcToRelative(8.009f, 8.009f, 0.0f, false, false, -8.0f, 8.0f)
                curveToRelative(0.376f, 10.588f, 15.626f, 10.585f, 16.0f, 0.0f)
                arcTo(8.009f, 8.009f, 0.0f, false, false, 12.0f, 4.0f)
                close()
                moveTo(11.166f, 13.086f)
                arcToRelative(4.192f, 4.192f, 0.0f, false, false, -0.144f, -0.813f)
                arcToRelative(4.246f, 4.246f, 0.0f, false, false, -0.3f, -0.764f)
                arcTo(3.594f, 3.594f, 0.0f, false, false, 12.0f, 10.653f)
                arcToRelative(3.594f, 3.594f, 0.0f, false, false, 1.275f, 0.856f)
                arcToRelative(4.246f, 4.246f, 0.0f, false, false, -0.3f, 0.764f)
                arcToRelative(4.192f, 4.192f, 0.0f, false, false, -0.144f, 0.813f)
                arcTo(4.11f, 4.11f, 0.0f, false, false, 11.166f, 13.086f)
                close()
                moveTo(17.12f, 8.874f)
                lineToRelative(-1.93f, 0.772f)
                arcTo(1.6f, 1.6f, 0.0f, false, true, 13.0f, 8.163f)
                lineTo(13.0f, 6.084f)
                arcTo(6.016f, 6.016f, 0.0f, false, true, 17.12f, 8.874f)
                close()
                moveTo(11.0f, 6.084f)
                lineTo(11.0f, 8.163f)
                arcTo(1.6f, 1.6f, 0.0f, false, true, 8.81f, 9.646f)
                lineTo(6.88f, 8.874f)
                arcTo(6.016f, 6.016f, 0.0f, false, true, 11.0f, 6.084f)
                close()
                moveTo(6.0f, 12.0f)
                arcToRelative(6.031f, 6.031f, 0.0f, false, true, 0.135f, -1.269f)
                lineToRelative(1.7f, 0.681f)
                arcToRelative(2.128f, 2.128f, 0.0f, false, true, 0.917f, 3.249f)
                lineToRelative(-1.1f, 1.469f)
                arcTo(5.978f, 5.978f, 0.0f, false, true, 6.0f, 12.0f)
                close()
                moveTo(9.251f, 17.332f)
                lineTo(10.4f, 15.8f)
                arcToRelative(2.057f, 2.057f, 0.0f, false, true, 3.2f, 0.0f)
                lineToRelative(1.149f, 1.531f)
                arcTo(6.043f, 6.043f, 0.0f, false, true, 9.251f, 17.332f)
                close()
                moveTo(16.351f, 16.132f)
                lineTo(15.695f, 15.259f)
                lineTo(15.253f, 14.669f)
                arcToRelative(2.128f, 2.128f, 0.0f, false, true, 0.914f, -3.255f)
                lineToRelative(1.7f, -0.681f)
                arcTo(6.026f, 6.026f, 0.0f, false, true, 16.348f, 16.13f)
                close()
            }
        }
        .build()
        return _tire!!
    }

private var _tire: ImageVector? = null
