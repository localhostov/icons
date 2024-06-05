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

public val Icons.Filled.CloudDrizzle: ImageVector
    get() {
        if (_cloudDrizzle != null) {
            return _cloudDrizzle!!
        }
        _cloudDrizzle = Builder(name = "CloudDrizzle", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(11.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 24.0f)
                close()
                moveTo(7.0f, 23.0f)
                lineTo(7.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                close()
                moveTo(23.991f, 12.365f)
                arcTo(7.185f, 7.185f, 0.0f, false, true, 16.724f, 19.0f)
                lineTo(6.057f, 19.0f)
                curveToRelative(-5.44f, 0.244f, -7.827f, -4.843f, -4.622f, -8.179f)
                arcTo(2.1f, 2.1f, 0.0f, false, false, 2.1f, 9.012f)
                curveTo(0.987f, 0.257f, 12.758f, -3.473f, 17.016f, 4.165f)
                arcToRelative(1.979f, 1.979f, 0.0f, false, false, 1.356f, 0.978f)
                arcTo(6.994f, 6.994f, 0.0f, false, true, 23.991f, 12.365f)
                close()
                moveTo(10.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                close()
                moveTo(16.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                close()
                moveTo(19.0f, 23.0f)
                lineTo(19.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                close()
            }
        }
        .build()
        return _cloudDrizzle!!
    }

private var _cloudDrizzle: ImageVector? = null
