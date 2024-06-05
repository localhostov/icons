package me.localx.icons.rounded.filled

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

public val Icons.Filled.CloudShowersHeavy: ImageVector
    get() {
        if (_cloudShowersHeavy != null) {
            return _cloudShowersHeavy!!
        }
        _cloudShowersHeavy = Builder(name = "CloudShowersHeavy", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 24.0f)
                arcToRelative(0.979f, 0.979f, 0.0f, false, true, -0.394f, -0.081f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.525f, -1.313f)
                lineToRelative(3.0f, -7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.838f, 0.788f)
                lineToRelative(-3.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 10.0f, 24.0f)
                close()
                moveTo(6.919f, 23.394f)
                lineTo(9.919f, 16.394f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.838f, -0.788f)
                lineToRelative(-3.0f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.525f, 1.313f)
                arcTo(0.979f, 0.979f, 0.0f, false, false, 6.0f, 24.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.919f, 23.394f)
                close()
                moveTo(14.919f, 23.394f)
                lineTo(17.919f, 16.394f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.838f, -0.788f)
                lineToRelative(-3.0f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.525f, 1.313f)
                arcTo(0.979f, 0.979f, 0.0f, false, false, 14.0f, 24.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 14.919f, 23.394f)
                close()
                moveTo(17.919f, 5.132f)
                arcToRelative(1.028f, 1.028f, 0.0f, false, true, -0.685f, -0.556f)
                arcTo(8.051f, 8.051f, 0.0f, false, false, 8.5f, 0.138f)
                arcToRelative(7.945f, 7.945f, 0.0f, false, false, -6.384f, 6.5f)
                arcToRelative(8.147f, 8.147f, 0.0f, false, false, 0.033f, 2.889f)
                arcToRelative(0.98f, 0.98f, 0.0f, false, true, -0.308f, 0.866f)
                arcToRelative(5.537f, 5.537f, 0.0f, false, false, 1.42f, 9.121f)
                arcToRelative(0.893f, 0.893f, 0.0f, false, false, 1.175f, -0.474f)
                lineToRelative(1.81f, -4.223f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.944f, -1.573f)
                arcToRelative(1.821f, 1.821f, 0.0f, false, false, 1.705f, -0.033f)
                arcToRelative(2.7f, 2.7f, 0.0f, false, true, 2.3f, 0.035f)
                arcToRelative(1.848f, 1.848f, 0.0f, false, false, 1.7f, -0.035f)
                arcToRelative(2.8f, 2.8f, 0.0f, false, true, 2.3f, 0.034f)
                arcToRelative(3.024f, 3.024f, 0.0f, false, true, 1.525f, 4.039f)
                lineToRelative(-0.482f, 1.125f)
                arcToRelative(0.559f, 0.559f, 0.0f, false, false, 0.753f, 0.729f)
                curveTo(25.9f, 16.137f, 25.265f, 6.591f, 17.916f, 5.132f)
                close()
            }
        }
        .build()
        return _cloudShowersHeavy!!
    }

private var _cloudShowersHeavy: ImageVector? = null
