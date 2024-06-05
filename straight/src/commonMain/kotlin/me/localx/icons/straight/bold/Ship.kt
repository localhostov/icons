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
                moveTo(19.875f, 21.0f)
                arcToRelative(1.174f, 1.174f, 0.0f, false, true, -0.9f, -0.466f)
                arcTo(9.338f, 9.338f, 0.0f, false, false, 22.0f, 13.5f)
                lineTo(22.0f, 12.438f)
                lineToRelative(-2.0f, -0.7f)
                lineTo(20.0f, 7.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 16.5f, 4.0f)
                lineTo(15.0f, 4.0f)
                lineTo(15.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                lineTo(11.0f, 0.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 9.0f, 2.0f)
                lineTo(9.0f, 4.0f)
                lineTo(7.5f, 4.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 4.0f, 7.5f)
                verticalLineToRelative(4.233f)
                lineToRelative(-2.0f, 0.705f)
                lineTo(2.0f, 13.5f)
                arcToRelative(9.34f, 9.34f, 0.0f, false, false, 3.02f, 7.029f)
                arcTo(1.145f, 1.145f, 0.0f, false, true, 4.125f, 21.0f)
                arcTo(1.173f, 1.173f, 0.0f, false, true, 3.0f, 20.0f)
                lineTo(0.0f, 20.0f)
                arcToRelative(4.171f, 4.171f, 0.0f, false, false, 4.125f, 4.0f)
                arcToRelative(4.147f, 4.147f, 0.0f, false, false, 2.63f, -0.969f)
                arcToRelative(4.079f, 4.079f, 0.0f, false, false, 5.261f, 0.015f)
                arcToRelative(4.076f, 4.076f, 0.0f, false, false, 5.259f, -0.015f)
                arcTo(4.084f, 4.084f, 0.0f, false, false, 24.0f, 20.0f)
                lineTo(21.0f, 20.0f)
                arcTo(1.158f, 1.158f, 0.0f, false, true, 19.875f, 21.0f)
                close()
                moveTo(7.0f, 7.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 7.5f, 7.0f)
                horizontalLineToRelative(9.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(3.174f)
                lineTo(12.0f, 8.909f)
                lineTo(7.0f, 10.674f)
                close()
                moveTo(9.375f, 21.0f)
                arcTo(1.173f, 1.173f, 0.0f, false, true, 8.25f, 20.0f)
                lineToRelative(-0.012f, -0.828f)
                lineToRelative(-0.691f, -0.443f)
                arcToRelative(6.147f, 6.147f, 0.0f, false, true, -2.475f, -4.193f)
                lineTo(10.5f, 12.62f)
                lineTo(10.5f, 20.0f)
                arcTo(1.158f, 1.158f, 0.0f, false, true, 9.375f, 21.0f)
                close()
                moveTo(14.625f, 21.0f)
                arcTo(1.173f, 1.173f, 0.0f, false, true, 13.5f, 20.0f)
                lineTo(13.5f, 12.62f)
                lineToRelative(5.428f, 1.916f)
                arcToRelative(6.161f, 6.161f, 0.0f, false, true, -2.472f, 4.192f)
                lineToRelative(-0.706f, 0.434f)
                lineTo(15.75f, 20.0f)
                arcTo(1.158f, 1.158f, 0.0f, false, true, 14.625f, 21.0f)
                close()
            }
        }
        .build()
        return _ship!!
    }

private var _ship: ImageVector? = null
