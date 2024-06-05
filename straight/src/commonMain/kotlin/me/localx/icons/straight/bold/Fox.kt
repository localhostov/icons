package me.localx.icons.straight.bold

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
                moveTo(22.5f, 0.0f)
                arcToRelative(6.172f, 6.172f, 0.0f, false, false, -5.92f, 3.335f)
                arcToRelative(34.015f, 34.015f, 0.0f, false, false, -9.16f, 0.0f)
                arcTo(6.174f, 6.174f, 0.0f, false, false, 1.5f, 0.0f)
                lineTo(0.0f, 0.0f)
                lineTo(0.0f, 11.955f)
                arcTo(6.229f, 6.229f, 0.0f, false, false, 1.837f, 16.39f)
                lineTo(8.47f, 23.023f)
                arcToRelative(3.386f, 3.386f, 0.0f, false, false, 2.412f, 1.0f)
                horizontalLineToRelative(2.236f)
                arcToRelative(3.382f, 3.382f, 0.0f, false, false, 2.41f, -1.0f)
                lineToRelative(6.635f, -6.634f)
                arcTo(6.231f, 6.231f, 0.0f, false, false, 24.0f, 11.955f)
                lineTo(24.0f, 0.0f)
                close()
                moveTo(5.077f, 5.474f)
                lineToRelative(0.415f, 1.244f)
                lineToRelative(1.287f, -0.244f)
                arcTo(31.943f, 31.943f, 0.0f, false, true, 12.0f, 6.0f)
                arcToRelative(32.153f, 32.153f, 0.0f, false, true, 5.222f, 0.474f)
                lineToRelative(1.287f, 0.243f)
                lineToRelative(0.414f, -1.243f)
                arcTo(3.212f, 3.212f, 0.0f, false, true, 21.0f, 3.209f)
                lineTo(21.0f, 7.443f)
                arcToRelative(12.517f, 12.517f, 0.0f, false, false, -8.854f, 5.979f)
                arcTo(12.445f, 12.445f, 0.0f, false, false, 3.0f, 6.867f)
                lineTo(3.0f, 3.209f)
                arcTo(3.214f, 3.214f, 0.0f, false, true, 5.077f, 5.474f)
                close()
                moveTo(3.958f, 14.274f)
                arcTo(3.251f, 3.251f, 0.0f, false, true, 3.0f, 11.955f)
                lineTo(3.0f, 9.918f)
                arcToRelative(10.678f, 10.678f, 0.0f, false, true, 2.0f, 0.671f)
                verticalLineToRelative(0.252f)
                reflectiveCurveToRelative(0.18f, 2.533f, 3.7f, 2.648f)
                arcToRelative(9.823f, 9.823f, 0.0f, false, true, 1.8f, 6.019f)
                lineTo(10.5f, 20.0f)
                horizontalLineToRelative(-0.8f)
                close()
                moveTo(20.042f, 14.274f)
                lineTo(14.31f, 20.0f)
                horizontalLineToRelative(-0.8f)
                arcToRelative(9.511f, 9.511f, 0.0f, false, true, 2.273f, -6.51f)
                curveToRelative(3.085f, -0.09f, 3.622f, -2.032f, 3.706f, -2.532f)
                arcTo(10.43f, 10.43f, 0.0f, false, true, 21.0f, 10.494f)
                verticalLineToRelative(1.461f)
                arcTo(3.255f, 3.255f, 0.0f, false, true, 20.042f, 14.269f)
                close()
            }
        }
        .build()
        return _fox!!
    }

private var _fox: ImageVector? = null
