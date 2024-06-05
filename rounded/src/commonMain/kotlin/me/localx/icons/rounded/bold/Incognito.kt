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

public val Icons.Bold.Incognito: ImageVector
    get() {
        if (_incognito != null) {
            return _incognito!!
        }
        _incognito = Builder(name = "Incognito", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.847f, 7.1f)
                curveTo(19.033f, 0.6f, 15.009f, 0.016f, 14.963f, 0.011f)
                arcTo(1.522f, 1.522f, 0.0f, false, false, 14.784f, 0.0f)
                arcToRelative(5.178f, 5.178f, 0.0f, false, false, -2.828f, 0.988f)
                arcTo(4.8f, 4.8f, 0.0f, false, false, 9.212f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.177f, 0.011f)
                curveTo(8.99f, 0.016f, 4.967f, 0.6f, 4.153f, 7.1f)
                curveTo(2.724f, 7.563f, 0.0f, 8.708f, 0.0f, 10.714f)
                curveTo(0.0f, 14.669f, 6.194f, 15.0f, 12.0f, 15.0f)
                reflectiveCurveToRelative(12.0f, -0.331f, 12.0f, -4.286f)
                curveTo(24.0f, 8.708f, 21.276f, 7.563f, 19.847f, 7.1f)
                close()
                moveTo(7.0f, 10.336f)
                verticalLineTo(9.5f)
                curveTo(7.0f, 4.439f, 8.843f, 3.255f, 9.358f, 3.023f)
                arcToRelative(1.875f, 1.875f, 0.0f, false, true, 0.769f, 0.343f)
                arcToRelative(3.076f, 3.076f, 0.0f, false, false, 3.746f, 0.0f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, 0.767f, -0.344f)
                curveTo(15.152f, 3.252f, 17.0f, 4.434f, 17.0f, 9.5f)
                verticalLineToRelative(0.836f)
                arcTo(17.435f, 17.435f, 0.0f, false, true, 12.0f, 11.0f)
                arcTo(17.435f, 17.435f, 0.0f, false, true, 7.0f, 10.336f)
                close()
                moveTo(21.0f, 20.0f)
                arcToRelative(3.989f, 3.989f, 0.0f, false, true, -7.8f, 1.193f)
                arcTo(5.751f, 5.751f, 0.0f, false, false, 12.0f, 21.0f)
                arcToRelative(5.751f, 5.751f, 0.0f, false, false, -1.2f, 0.193f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -0.259f, -3.018f)
                arcTo(7.526f, 7.526f, 0.0f, false, true, 12.0f, 18.0f)
                arcToRelative(7.526f, 7.526f, 0.0f, false, true, 1.461f, 0.175f)
                arcTo(3.987f, 3.987f, 0.0f, false, true, 21.0f, 20.0f)
                close()
            }
        }
        .build()
        return _incognito!!
    }

private var _incognito: ImageVector? = null
