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

public val Icons.Outline.Surfing: ImageVector
    get() {
        if (_surfing != null) {
            return _surfing!!
        }
        _surfing = Builder(name = "Surfing", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.124f, 0.876f)
                arcToRelative(2.958f, 2.958f, 0.0f, false, false, -2.4f, -0.861f)
                curveToRelative(-2.272f, 0.221f, -8.014f, 1.2f, -12.263f, 5.446f)
                arcToRelative(34.9f, 34.9f, 0.0f, false, false, -8.219f, 13.053f)
                lineToRelative(-0.242f, 0.608f)
                lineToRelative(4.855f, 4.855f)
                lineToRelative(0.609f, -0.238f)
                arcToRelative(34.981f, 34.981f, 0.0f, false, false, 13.071f, -8.2f)
                curveToRelative(4.248f, -4.248f, 5.225f, -9.991f, 5.446f, -12.263f)
                arcToRelative(2.971f, 2.971f, 0.0f, false, false, -0.857f, -2.4f)
                close()
                moveTo(17.124f, 14.125f)
                arcToRelative(32.127f, 32.127f, 0.0f, false, true, -11.777f, 7.512f)
                lineToRelative(-0.785f, -0.785f)
                lineToRelative(12.145f, -12.145f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-12.145f, 12.145f)
                lineToRelative(-0.8f, -0.8f)
                arcToRelative(32.536f, 32.536f, 0.0f, false, true, 7.527f, -11.763f)
                curveToRelative(3.792f, -3.791f, 8.986f, -4.669f, 11.044f, -4.87f)
                arcToRelative(0.992f, 0.992f, 0.0f, false, true, 0.791f, 0.285f)
                arcToRelative(0.982f, 0.982f, 0.0f, false, true, 0.29f, 0.791f)
                curveToRelative(-0.206f, 2.058f, -1.084f, 7.253f, -4.875f, 11.044f)
                close()
            }
        }
        .build()
        return _surfing!!
    }

private var _surfing: ImageVector? = null
