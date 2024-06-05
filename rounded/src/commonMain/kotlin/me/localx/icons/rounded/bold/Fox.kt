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

public val Icons.Bold.Fox: ImageVector
    get() {
        if (_fox != null) {
            return _fox!!
        }
        _fox = Builder(name = "Fox", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.069f, 0.534f)
                arcToRelative(2.446f, 2.446f, 0.0f, false, false, -2.083f, -0.47f)
                arcToRelative(6.385f, 6.385f, 0.0f, false, false, -4.13f, 3.617f)
                arcToRelative(19.008f, 19.008f, 0.0f, false, false, -9.712f, 0.0f)
                arcTo(6.391f, 6.391f, 0.0f, false, false, 3.013f, 0.064f)
                arcTo(2.46f, 2.46f, 0.0f, false, false, 0.0f, 2.46f)
                verticalLineToRelative(7.5f)
                arcToRelative(10.977f, 10.977f, 0.0f, false, false, 3.235f, 7.811f)
                lineTo(7.681f, 22.21f)
                arcToRelative(6.134f, 6.134f, 0.0f, false, false, 8.638f, 0.0f)
                lineToRelative(4.446f, -4.444f)
                arcTo(10.973f, 10.973f, 0.0f, false, false, 24.0f, 9.955f)
                lineTo(24.0f, 2.46f)
                arcTo(2.446f, 2.446f, 0.0f, false, false, 23.069f, 0.534f)
                close()
                moveTo(4.85f, 5.975f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.916f, 0.942f)
                arcTo(18.529f, 18.529f, 0.0f, false, true, 12.0f, 6.0f)
                arcToRelative(18.569f, 18.569f, 0.0f, false, true, 5.234f, 0.917f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.916f, -0.943f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 21.0f, 3.269f)
                verticalLineToRelative(3.9f)
                arcToRelative(12.536f, 12.536f, 0.0f, false, false, -9.0f, 6.287f)
                arcTo(12.536f, 12.536f, 0.0f, false, false, 3.0f, 7.17f)
                verticalLineToRelative(-3.9f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 4.85f, 5.975f)
                close()
                moveTo(5.357f, 15.645f)
                arcToRelative(7.984f, 7.984f, 0.0f, false, true, -2.343f, -5.393f)
                arcToRelative(11.57f, 11.57f, 0.0f, false, true, 2.02f, 0.686f)
                arcToRelative(3.363f, 3.363f, 0.0f, false, false, 0.622f, 1.63f)
                arcTo(3.711f, 3.711f, 0.0f, false, false, 8.8f, 14.0f)
                arcToRelative(9.875f, 9.875f, 0.0f, false, true, 1.647f, 5.144f)
                arcToRelative(2.881f, 2.881f, 0.0f, false, false, -0.81f, 0.784f)
                close()
                moveTo(18.644f, 15.645f)
                lineTo(14.36f, 19.927f)
                arcToRelative(2.881f, 2.881f, 0.0f, false, false, -0.81f, -0.784f)
                arcTo(9.875f, 9.875f, 0.0f, false, true, 15.2f, 14.0f)
                arcToRelative(3.713f, 3.713f, 0.0f, false, false, 3.147f, -1.431f)
                arcToRelative(3.363f, 3.363f, 0.0f, false, false, 0.622f, -1.63f)
                arcToRelative(11.6f, 11.6f, 0.0f, false, true, 2.02f, -0.686f)
                arcTo(7.988f, 7.988f, 0.0f, false, true, 18.644f, 15.645f)
                close()
            }
        }
        .build()
        return _fox!!
    }

private var _fox: ImageVector? = null
