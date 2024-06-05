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

public val Icons.Filled.BarberPole: ImageVector
    get() {
        if (_barberPole != null) {
            return _barberPole!!
        }
        _barberPole = Builder(name = "BarberPole", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.837f, 6.009f)
                lineToRelative(-2.837f, -0.009f)
                lineToRelative(5.0f, 5.0f)
                verticalLineToRelative(2.855f)
                lineToRelative(-7.855f, -7.855f)
                horizontalLineToRelative(-2.828f)
                lineToRelative(10.683f, 10.683f)
                verticalLineToRelative(1.317f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-1.35f)
                curveToRelative(-0.826f, 2.327f, -3.043f, 4.0f, -5.65f, 4.0f)
                reflectiveCurveToRelative(-4.824f, -1.673f, -5.65f, -4.0f)
                horizontalLineToRelative(-1.35f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-2.172f)
                lineToRelative(2.163f, 2.163f)
                lineToRelative(2.837f, 0.009f)
                lineToRelative(-5.0f, -5.0f)
                verticalLineToRelative(-2.787f)
                lineToRelative(7.787f, 7.787f)
                horizontalLineToRelative(2.828f)
                lineTo(6.0f, 7.385f)
                verticalLineToRelative(-1.385f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.35f)
                curveTo(7.176f, 1.673f, 9.393f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(4.824f, 1.673f, 5.65f, 4.0f)
                horizontalLineToRelative(1.35f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(2.172f)
                lineToRelative(-2.163f, -2.163f)
                close()
            }
        }
        .build()
        return _barberPole!!
    }

private var _barberPole: ImageVector? = null
