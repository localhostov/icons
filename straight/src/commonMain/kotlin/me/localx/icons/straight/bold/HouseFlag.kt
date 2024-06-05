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

public val Icons.Bold.HouseFlag: ImageVector
    get() {
        if (_houseFlag != null) {
            return _houseFlag!!
        }
        _houseFlag = Builder(name = "HouseFlag", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 10.164f)
                verticalLineToRelative(1.938f)
                lineTo(12.308f, 3.118f)
                curveToRelative(-0.182f, -0.142f, -0.434f, -0.142f, -0.615f, 0.0f)
                lineTo(3.192f, 9.77f)
                curveToRelative(-0.122f, 0.096f, -0.192f, 0.239f, -0.192f, 0.394f)
                verticalLineToRelative(10.824f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(3.0f)
                lineTo(0.0f, 23.988f)
                verticalLineToRelative(-13.824f)
                curveToRelative(0.0f, -1.084f, 0.489f, -2.089f, 1.344f, -2.757f)
                lineTo(9.843f, 0.756f)
                curveToRelative(1.27f, -0.994f, 3.043f, -0.994f, 4.314f, 0.0f)
                lineToRelative(8.5f, 6.652f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.854f, 0.668f, 1.343f, 1.673f, 1.343f, 2.756f)
                close()
                moveTo(21.0f, 23.988f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-7.248f)
                lineToRelative(-3.0f, 1.516f)
                verticalLineToRelative(5.732f)
                close()
                moveTo(16.0f, 11.531f)
                verticalLineToRelative(12.469f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-6.974f)
                lineToRelative(5.0f, -2.526f)
                lineToRelative(-6.0f, -4.362f)
                curveToRelative(-0.665f, -0.332f, -2.0f, -0.134f, -2.0f, 1.393f)
                close()
            }
        }
        .build()
        return _houseFlag!!
    }

private var _houseFlag: ImageVector? = null
