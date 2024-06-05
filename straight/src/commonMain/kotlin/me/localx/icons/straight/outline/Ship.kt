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

public val Icons.Outline.Ship: ImageVector
    get() {
        if (_ship != null) {
            return _ship!!
        }
        _ship = Builder(name = "Ship", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.25f, 22.0f)
                arcToRelative(2.047f, 2.047f, 0.0f, false, true, -1.621f, -0.7f)
                arcTo(12.193f, 12.193f, 0.0f, false, false, 22.0f, 13.0f)
                verticalLineToRelative(-0.721f)
                lineToRelative(-2.0f, -0.666f)
                lineTo(20.0f, 8.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                lineTo(16.0f, 5.0f)
                lineTo(16.0f, 3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                lineTo(11.0f, 0.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 8.0f, 3.0f)
                lineTo(8.0f, 5.0f)
                lineTo(7.0f, 5.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 4.0f, 8.0f)
                verticalLineToRelative(3.613f)
                lineToRelative(-2.0f, 0.666f)
                lineTo(2.0f, 13.0f)
                arcToRelative(12.193f, 12.193f, 0.0f, false, false, 3.377f, 8.3f)
                arcTo(2.049f, 2.049f, 0.0f, false, true, 3.75f, 22.0f)
                curveTo(2.661f, 22.0f, 2.0f, 21.306f, 2.0f, 21.0f)
                lineTo(0.0f, 21.0f)
                curveToRelative(0.0f, 1.626f, 1.718f, 3.0f, 3.75f, 3.0f)
                arcTo(4.194f, 4.194f, 0.0f, false, false, 6.5f, 23.0f)
                arcToRelative(4.313f, 4.313f, 0.0f, false, false, 5.5f, 0.014f)
                arcTo(4.313f, 4.313f, 0.0f, false, false, 17.5f, 23.0f)
                arcToRelative(4.194f, 4.194f, 0.0f, false, false, 2.749f, 1.0f)
                curveTo(22.282f, 24.0f, 24.0f, 22.626f, 24.0f, 21.0f)
                lineTo(22.0f, 21.0f)
                curveTo(22.0f, 21.344f, 21.318f, 22.0f, 20.25f, 22.0f)
                close()
                moveTo(10.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                lineTo(14.0f, 5.0f)
                lineTo(10.0f, 5.0f)
                close()
                moveTo(6.0f, 8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.0f, 7.0f)
                lineTo(17.0f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(2.946f)
                lineToRelative(-6.0f, -2.0f)
                lineToRelative(-6.0f, 2.0f)
                close()
                moveTo(9.25f, 22.0f)
                curveToRelative(-1.089f, 0.0f, -1.75f, -0.694f, -1.75f, -1.0f)
                lineToRelative(0.0f, -0.458f)
                lineToRelative(-0.344f, -0.3f)
                arcToRelative(10.4f, 10.4f, 0.0f, false, true, -3.127f, -6.531f)
                lineTo(11.0f, 11.387f)
                lineTo(11.0f, 21.0f)
                curveTo(11.0f, 21.344f, 10.318f, 22.0f, 9.25f, 22.0f)
                close()
                moveTo(14.75f, 22.0f)
                curveTo(13.661f, 22.0f, 13.0f, 21.306f, 13.0f, 21.0f)
                lineTo(13.0f, 11.387f)
                lineToRelative(6.974f, 2.325f)
                arcToRelative(10.4f, 10.4f, 0.0f, false, true, -3.124f, 6.529f)
                lineToRelative(-0.35f, 0.3f)
                lineTo(16.5f, 21.0f)
                curveTo(16.5f, 21.344f, 15.818f, 22.0f, 14.75f, 22.0f)
                close()
            }
        }
        .build()
        return _ship!!
    }

private var _ship: ImageVector? = null
