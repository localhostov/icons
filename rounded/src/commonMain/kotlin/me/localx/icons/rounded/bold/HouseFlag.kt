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
                moveToRelative(22.771f, 9.907f)
                curveToRelative(-0.779f, 0.284f, -1.64f, -0.11f, -1.927f, -0.888f)
                curveToRelative(-0.183f, -0.494f, -0.51f, -0.911f, -0.946f, -1.206f)
                lineToRelative(-6.5f, -4.387f)
                curveToRelative(-0.85f, -0.573f, -1.947f, -0.573f, -2.797f, 0.0f)
                lineToRelative(-6.5f, 4.386f)
                curveToRelative(-0.689f, 0.466f, -1.102f, 1.24f, -1.102f, 2.073f)
                verticalLineToRelative(8.614f)
                curveToRelative(0.0f, 1.378f, 1.121f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.671f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-3.032f, 0.0f, -5.5f, -2.467f, -5.5f, -5.5f)
                verticalLineToRelative(-8.614f)
                curveToRelative(0.0f, -1.831f, 0.906f, -3.536f, 2.424f, -4.56f)
                lineTo(8.924f, 0.941f)
                curveToRelative(1.869f, -1.262f, 4.283f, -1.262f, 6.152f, 0.0f)
                lineToRelative(6.924f, 4.722f)
                curveToRelative(0.745f, 0.616f, 1.321f, 1.401f, 1.659f, 2.317f)
                curveToRelative(0.287f, 0.777f, -0.11f, 1.64f, -0.888f, 1.927f)
                close()
                moveTo(21.872f, 12.779f)
                lineToRelative(-3.5f, -2.5f)
                curveToRelative(-0.458f, -0.326f, -1.059f, -0.369f, -1.559f, -0.113f)
                curveToRelative(-0.499f, 0.257f, -0.813f, 0.772f, -0.813f, 1.334f)
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 0.829f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.671f, 1.5f, -1.5f)
                verticalLineToRelative(-5.364f)
                lineToRelative(2.832f, -1.888f)
                curveToRelative(0.41f, -0.273f, 0.66f, -0.731f, 0.668f, -1.224f)
                curveToRelative(0.008f, -0.493f, -0.227f, -0.958f, -0.628f, -1.245f)
                close()
            }
        }
        .build()
        return _houseFlag!!
    }

private var _houseFlag: ImageVector? = null
