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

public val Icons.Outline.Thunderstorm: ImageVector
    get() {
        if (_thunderstorm != null) {
            return _thunderstorm!!
        }
        _thunderstorm = Builder(name = "Thunderstorm", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 12.5f)
                arcToRelative(7.506f, 7.506f, 0.0f, false, true, -6.863f, 7.468f)
                lineToRelative(1.383f, -1.9f)
                arcToRelative(4.013f, 4.013f, 0.0f, false, false, 0.316f, -0.592f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 16.679f, 7.0f)
                lineToRelative(-0.721f, -0.023f)
                lineToRelative(-0.206f, -0.691f)
                arcTo(6.0f, 6.0f, 0.0f, true, false, 4.391f, 10.134f)
                lineToRelative(0.318f, 0.839f)
                lineToRelative(-0.8f, 0.407f)
                arcToRelative(3.486f, 3.486f, 0.0f, false, false, 0.015f, 6.228f)
                arcToRelative(3.844f, 3.844f, 0.0f, false, false, 0.413f, 2.266f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, -2.073f, -9.825f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 10.0f, 0.0f)
                arcToRelative(8.052f, 8.052f, 0.0f, false, true, 7.44f, 5.059f)
                arcTo(7.461f, 7.461f, 0.0f, false, true, 24.0f, 12.5f)
                close()
                moveTo(16.854f, 16.958f)
                lineTo(11.736f, 24.0f)
                lineTo(8.755f, 24.0f)
                lineToRelative(0.973f, -4.0f)
                lineTo(7.8f, 20.0f)
                arcToRelative(1.921f, 1.921f, 0.0f, false, true, -1.84f, -2.48f)
                lineTo(8.557f, 10.0f)
                horizontalLineToRelative(6.472f)
                lineToRelative(-1.537f, 4.0f)
                horizontalLineToRelative(1.775f)
                arcToRelative(1.905f, 1.905f, 0.0f, false, true, 1.587f, 2.958f)
                close()
                moveTo(15.114f, 15.951f)
                lineTo(10.58f, 16.0f)
                lineToRelative(1.537f, -4.0f)
                lineTo(9.982f, 12.0f)
                lineTo(7.9f, 18.031f)
                lineTo(11.0f, 18.0f)
                horizontalLineToRelative(1.272f)
                lineToRelative(-0.679f, 2.8f)
                close()
            }
        }
        .build()
        return _thunderstorm!!
    }

private var _thunderstorm: ImageVector? = null
