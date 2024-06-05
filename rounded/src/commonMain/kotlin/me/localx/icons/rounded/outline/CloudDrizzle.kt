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

public val Icons.Outline.CloudDrizzle: ImageVector
    get() {
        if (_cloudDrizzle != null) {
            return _cloudDrizzle!!
        }
        _cloudDrizzle = Builder(name = "CloudDrizzle", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 24.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(17.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 18.0f, 24.0f)
                close()
                moveTo(12.0f, 24.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(11.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 24.0f)
                close()
                moveTo(6.0f, 24.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(5.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.0f, 24.0f)
                close()
                moveTo(5.0f, 19.973f)
                arcToRelative(1.032f, 1.032f, 0.0f, false, true, -0.111f, -0.006f)
                arcTo(5.526f, 5.526f, 0.0f, false, true, 1.8f, 10.43f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.345f, -0.9f)
                arcToRelative(8.147f, 8.147f, 0.0f, false, true, -0.033f, -2.889f)
                arcTo(7.946f, 7.946f, 0.0f, false, true, 8.5f, 0.137f)
                arcToRelative(8.06f, 8.06f, 0.0f, false, true, 8.735f, 4.44f)
                arcToRelative(1.036f, 1.036f, 0.0f, false, false, 0.742f, 0.569f)
                arcTo(7.5f, 7.5f, 0.0f, false, true, 19.4f, 19.39f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.792f, -1.837f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 17.583f, 7.106f)
                arcToRelative(3.011f, 3.011f, 0.0f, false, true, -2.158f, -1.672f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 4.086f, 6.967f)
                arcTo(6.142f, 6.142f, 0.0f, false, false, 4.11f, 9.148f)
                arcToRelative(3.005f, 3.005f, 0.0f, false, true, -0.964f, 2.762f)
                arcTo(3.522f, 3.522f, 0.0f, false, false, 5.11f, 17.979f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 5.0f, 19.973f)
                close()
                moveTo(15.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(14.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 15.0f, 18.0f)
                close()
                moveTo(9.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(8.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 9.0f, 18.0f)
                close()
            }
        }
        .build()
        return _cloudDrizzle!!
    }

private var _cloudDrizzle: ImageVector? = null
