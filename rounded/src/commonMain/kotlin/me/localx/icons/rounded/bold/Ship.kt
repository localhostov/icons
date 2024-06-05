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

public val Icons.Bold.Ship: ImageVector
    get() {
        if (_ship != null) {
            return _ship!!
        }
        _ship = Builder(name = "Ship", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.5f, 18.972f)
                arcToRelative(1.473f, 1.473f, 0.0f, false, false, -1.5f, 1.471f)
                arcTo(1.283f, 1.283f, 0.0f, false, true, 19.875f, 21.0f)
                arcToRelative(1.656f, 1.656f, 0.0f, false, true, -0.766f, -0.183f)
                arcToRelative(12.154f, 12.154f, 0.0f, false, false, 2.841f, -5.9f)
                arcToRelative(3.408f, 3.408f, 0.0f, false, false, -1.95f, -3.7f)
                lineTo(20.0f, 8.5f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 15.5f, 4.0f)
                lineTo(15.0f, 4.0f)
                lineTo(15.0f, 3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 9.0f, 3.0f)
                lineTo(9.0f, 4.0f)
                lineTo(8.5f, 4.0f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 4.0f, 8.5f)
                verticalLineToRelative(2.583f)
                arcToRelative(3.412f, 3.412f, 0.0f, false, false, -1.929f, 3.691f)
                arcTo(13.01f, 13.01f, 0.0f, false, false, 4.893f, 20.82f)
                arcToRelative(1.682f, 1.682f, 0.0f, false, true, -0.768f, 0.18f)
                arcTo(1.324f, 1.324f, 0.0f, false, true, 3.0f, 20.452f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 0.0f, 20.5f)
                curveTo(0.0f, 22.364f, 1.928f, 24.0f, 4.125f, 24.0f)
                arcToRelative(4.636f, 4.636f, 0.0f, false, false, 2.628f, -0.81f)
                arcTo(4.67f, 4.67f, 0.0f, false, false, 12.0f, 23.2f)
                arcToRelative(4.679f, 4.679f, 0.0f, false, false, 5.258f, -0.011f)
                arcTo(4.625f, 4.625f, 0.0f, false, false, 19.875f, 24.0f)
                curveTo(22.072f, 24.0f, 24.0f, 22.364f, 24.0f, 20.5f)
                arcTo(1.522f, 1.522f, 0.0f, false, false, 22.5f, 18.972f)
                close()
                moveTo(8.5f, 7.0f)
                horizontalLineToRelative(7.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 17.0f, 8.5f)
                verticalLineToRelative(1.8f)
                lineTo(13.076f, 9.174f)
                arcToRelative(3.35f, 3.35f, 0.0f, false, false, -2.066f, -0.026f)
                lineTo(7.0f, 10.221f)
                lineTo(7.0f, 8.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 8.5f, 7.0f)
                close()
                moveTo(9.375f, 21.0f)
                arcToRelative(1.374f, 1.374f, 0.0f, false, true, -1.136f, -0.488f)
                arcToRelative(5.309f, 5.309f, 0.0f, false, false, -0.9f, -1.453f)
                arcTo(10.008f, 10.008f, 0.0f, false, true, 5.028f, 14.27f)
                arcToRelative(0.446f, 0.446f, 0.0f, false, true, 0.185f, -0.468f)
                lineTo(10.5f, 12.388f)
                verticalLineToRelative(8.149f)
                arcTo(1.4f, 1.4f, 0.0f, false, true, 9.375f, 21.0f)
                close()
                moveTo(14.625f, 21.0f)
                arcToRelative(1.668f, 1.668f, 0.0f, false, true, -1.125f, -0.409f)
                lineTo(13.5f, 12.418f)
                lineToRelative(5.239f, 1.512f)
                arcToRelative(0.434f, 0.434f, 0.0f, false, true, 0.254f, 0.487f)
                arcToRelative(9.262f, 9.262f, 0.0f, false, true, -2.326f, 4.638f)
                arcToRelative(5.292f, 5.292f, 0.0f, false, false, -0.906f, 1.463f)
                arcTo(1.367f, 1.367f, 0.0f, false, true, 14.625f, 21.0f)
                close()
            }
        }
        .build()
        return _ship!!
    }

private var _ship: ImageVector? = null
