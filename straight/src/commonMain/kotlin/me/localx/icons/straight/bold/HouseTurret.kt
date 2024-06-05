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

public val Icons.Bold.HouseTurret: ImageVector
    get() {
        if (_houseTurret != null) {
            return _houseTurret!!
        }
        _houseTurret = Builder(name = "HouseTurret", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 0.0f)
                lineTo(24.0f, 4.0f)
                curveToRelative(0.0f, 1.304f, -0.836f, 2.415f, -2.0f, 2.828f)
                lineTo(22.0f, 24.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.0f)
                lineTo(19.0f, 7.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(5.478f)
                curveToRelative(-0.308f, -0.438f, -0.676f, -0.839f, -1.111f, -1.18f)
                lineToRelative(-1.889f, -1.478f)
                verticalLineToRelative(-2.992f)
                curveToRelative(-1.164f, -0.413f, -2.0f, -1.524f, -2.0f, -2.828f)
                lineTo(11.0f, 0.0f)
                horizontalLineToRelative(3.0f)
                lineTo(14.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                lineTo(16.0f, 0.0f)
                horizontalLineToRelative(3.0f)
                lineTo(19.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                lineTo(21.0f, 0.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(15.0f, 15.63f)
                verticalLineToRelative(8.37f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 15.63f)
                curveToRelative(0.0f, -1.082f, 0.489f, -2.087f, 1.342f, -2.756f)
                lineToRelative(4.001f, -3.131f)
                curveToRelative(1.27f, -0.992f, 3.043f, -0.992f, 4.313f, 0.0f)
                lineToRelative(4.0f, 3.13f)
                curveToRelative(0.854f, 0.67f, 1.343f, 1.675f, 1.343f, 2.757f)
                close()
                moveTo(12.0f, 15.63f)
                curveToRelative(0.0f, -0.154f, -0.07f, -0.299f, -0.193f, -0.395f)
                lineToRelative(-3.999f, -3.129f)
                curveToRelative(-0.182f, -0.143f, -0.435f, -0.143f, -0.616f, 0.0f)
                lineToRelative(-4.0f, 3.13f)
                curveToRelative(-0.122f, 0.095f, -0.192f, 0.239f, -0.192f, 0.394f)
                verticalLineToRelative(5.37f)
                lineTo(12.0f, 21.0f)
                verticalLineToRelative(-5.37f)
                close()
                moveTo(6.0f, 19.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _houseTurret!!
    }

private var _houseTurret: ImageVector? = null
