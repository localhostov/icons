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

public val Icons.Bold.StarOctogram: ImageVector
    get() {
        if (_starOctogram != null) {
            return _starOctogram!!
        }
        _starOctogram = Builder(name = "StarOctogram", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(3.611f, 3.611f, 0.0f, false, true, -3.44f, -2.428f)
                arcToRelative(0.646f, 0.646f, 0.0f, false, false, -0.366f, -0.384f)
                arcToRelative(0.635f, 0.635f, 0.0f, false, false, -0.529f, 0.013f)
                arcTo(3.652f, 3.652f, 0.0f, false, true, 2.8f, 16.335f)
                arcToRelative(0.654f, 0.654f, 0.0f, false, false, -0.371f, -0.9f)
                arcToRelative(3.651f, 3.651f, 0.0f, false, true, 0.0f, -6.88f)
                arcToRelative(0.655f, 0.655f, 0.0f, false, false, 0.37f, -0.9f)
                arcTo(3.652f, 3.652f, 0.0f, false, true, 7.665f, 2.8f)
                arcToRelative(0.654f, 0.654f, 0.0f, false, false, 0.9f, -0.371f)
                arcToRelative(3.651f, 3.651f, 0.0f, false, true, 6.88f, 0.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(0.654f, 0.654f, 0.0f, false, false, 0.9f, 0.371f)
                arcTo(3.652f, 3.652f, 0.0f, false, true, 21.2f, 7.665f)
                arcToRelative(0.652f, 0.652f, 0.0f, false, false, 0.371f, 0.9f)
                arcToRelative(3.651f, 3.651f, 0.0f, false, true, 0.0f, 6.88f)
                arcToRelative(0.652f, 0.652f, 0.0f, false, false, -0.371f, 0.9f)
                arcTo(3.652f, 3.652f, 0.0f, false, true, 16.335f, 21.2f)
                arcToRelative(0.656f, 0.656f, 0.0f, false, false, -0.529f, -0.013f)
                arcToRelative(0.646f, 0.646f, 0.0f, false, false, -0.366f, 0.384f)
                arcTo(3.612f, 3.612f, 0.0f, false, true, 12.0f, 24.0f)
                close()
                moveTo(7.945f, 18.139f)
                arcToRelative(3.65f, 3.65f, 0.0f, false, true, 3.441f, 2.427f)
                arcTo(0.617f, 0.617f, 0.0f, false, false, 12.0f, 21.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(0.617f, 0.617f, 0.0f, false, false, 0.614f, -0.434f)
                arcToRelative(3.653f, 3.653f, 0.0f, false, true, 5.01f, -2.074f)
                arcToRelative(0.652f, 0.652f, 0.0f, false, false, 0.868f, -0.868f)
                arcToRelative(3.653f, 3.653f, 0.0f, false, true, 2.074f, -5.01f)
                arcToRelative(0.651f, 0.651f, 0.0f, false, false, 0.0f, -1.228f)
                arcToRelative(3.653f, 3.653f, 0.0f, false, true, -2.074f, -5.01f)
                arcToRelative(0.652f, 0.652f, 0.0f, false, false, -0.868f, -0.868f)
                arcToRelative(3.653f, 3.653f, 0.0f, false, true, -5.01f, -2.074f)
                arcToRelative(0.651f, 0.651f, 0.0f, false, false, -1.228f, 0.0f)
                arcTo(3.652f, 3.652f, 0.0f, false, true, 6.377f, 5.508f)
                arcToRelative(0.652f, 0.652f, 0.0f, false, false, -0.869f, 0.868f)
                arcToRelative(3.654f, 3.654f, 0.0f, false, true, -2.073f, 5.01f)
                arcToRelative(0.651f, 0.651f, 0.0f, false, false, 0.0f, 1.228f)
                arcToRelative(3.653f, 3.653f, 0.0f, false, true, 2.074f, 5.01f)
                arcToRelative(0.652f, 0.652f, 0.0f, false, false, 0.869f, 0.868f)
                arcTo(3.655f, 3.655f, 0.0f, false, true, 7.945f, 18.139f)
                close()
            }
        }
        .build()
        return _starOctogram!!
    }

private var _starOctogram: ImageVector? = null
