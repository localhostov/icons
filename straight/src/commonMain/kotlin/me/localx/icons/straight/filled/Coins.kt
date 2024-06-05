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

public val Icons.Filled.Coins: ImageVector
    get() {
        if (_coins != null) {
            return _coins!!
        }
        _coins = Builder(name = "Coins", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 4.0f)
                curveToRelative(0.0f, -2.209f, 3.358f, -4.0f, 7.5f, -4.0f)
                reflectiveCurveToRelative(7.5f, 1.791f, 7.5f, 4.0f)
                reflectiveCurveToRelative(-3.358f, 4.0f, -7.5f, 4.0f)
                reflectiveCurveToRelative(-7.5f, -1.791f, -7.5f, -4.0f)
                close()
                moveTo(16.5f, 10.0f)
                curveToRelative(-1.027f, 0.0f, -2.001f, -0.115f, -2.891f, -0.315f)
                curveToRelative(-1.359f, -1.019f, -3.586f, -1.685f, -6.109f, -1.685f)
                curveToRelative(-4.142f, 0.0f, -7.5f, 1.791f, -7.5f, 4.0f)
                reflectiveCurveToRelative(3.358f, 4.0f, 7.5f, 4.0f)
                reflectiveCurveToRelative(7.5f, -1.791f, 7.5f, -4.0f)
                curveToRelative(0.0f, -0.029f, -0.007f, -0.057f, -0.008f, -0.086f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(2.086f)
                curveToRelative(0.0f, 2.209f, -3.358f, 4.0f, -7.5f, 4.0f)
                reflectiveCurveTo(0.0f, 16.209f, 0.0f, 14.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 2.209f, 3.358f, 4.0f, 7.5f, 4.0f)
                reflectiveCurveToRelative(7.5f, -1.791f, 7.5f, -4.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 2.209f, -3.358f, 4.0f, -7.5f, 4.0f)
                reflectiveCurveTo(0.0f, 20.209f, 0.0f, 18.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 2.209f, 3.358f, 4.0f, 7.5f, 4.0f)
                reflectiveCurveToRelative(7.5f, -1.791f, 7.5f, -4.0f)
                verticalLineToRelative(-0.08f)
                curveToRelative(0.485f, 0.052f, 0.986f, 0.08f, 1.5f, 0.08f)
                curveToRelative(4.142f, 0.0f, 7.5f, -1.791f, 7.5f, -4.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, 2.119f, -3.092f, 3.849f, -7.0f, 3.987f)
                verticalLineToRelative(-2.0f)
                curveToRelative(3.908f, -0.138f, 7.0f, -1.867f, 7.0f, -3.987f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, 2.119f, -3.092f, 3.849f, -7.0f, 3.987f)
                verticalLineToRelative(-2.0f)
                curveToRelative(3.908f, -0.138f, 7.0f, -1.867f, 7.0f, -3.987f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, 2.209f, -3.358f, 4.0f, -7.5f, 4.0f)
                close()
            }
        }
        .build()
        return _coins!!
    }

private var _coins: ImageVector? = null
