package me.localx.icons.straight.filled

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

public val Icons.Filled.Ship: ImageVector
    get() {
        if (_ship != null) {
            return _ship!!
        }
        _ship = Builder(name = "Ship", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 7.838f)
                lineTo(4.0f, 10.505f)
                verticalLineTo(8.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 7.0f, 5.0f)
                horizontalLineTo(17.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                verticalLineToRelative(2.505f)
                close()
                moveTo(22.0f, 21.0f)
                curveToRelative(0.0f, 0.344f, -0.682f, 1.0f, -1.75f, 1.0f)
                arcToRelative(2.044f, 2.044f, 0.0f, false, true, -1.619f, -0.7f)
                arcTo(11.131f, 11.131f, 0.0f, false, false, 22.0f, 13.333f)
                verticalLineToRelative(-0.054f)
                lineToRelative(-9.0f, -3.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(10.28f)
                lineToRelative(-9.0f, 3.0f)
                verticalLineToRelative(0.054f)
                arcTo(11.131f, 11.131f, 0.0f, false, false, 5.375f, 21.3f)
                arcTo(2.046f, 2.046f, 0.0f, false, true, 3.75f, 22.0f)
                curveTo(2.661f, 22.0f, 2.0f, 21.306f, 2.0f, 21.0f)
                horizontalLineTo(0.0f)
                curveToRelative(0.0f, 1.626f, 1.718f, 3.0f, 3.75f, 3.0f)
                arcTo(4.194f, 4.194f, 0.0f, false, false, 6.5f, 23.0f)
                arcToRelative(4.313f, 4.313f, 0.0f, false, false, 5.5f, 0.014f)
                arcTo(4.313f, 4.313f, 0.0f, false, false, 17.5f, 23.0f)
                arcToRelative(4.194f, 4.194f, 0.0f, false, false, 2.749f, 1.0f)
                curveTo(22.282f, 24.0f, 24.0f, 22.626f, 24.0f, 21.0f)
                close()
                moveTo(16.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                horizontalLineTo(10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 8.0f, 2.0f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(8.0f)
                close()
            }
        }
        .build()
        return _ship!!
    }

private var _ship: ImageVector? = null
