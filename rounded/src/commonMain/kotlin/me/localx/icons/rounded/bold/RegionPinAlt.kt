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

public val Icons.Bold.RegionPinAlt: ImageVector
    get() {
        if (_regionPinAlt != null) {
            return _regionPinAlt!!
        }
        _regionPinAlt = Builder(name = "RegionPinAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.5f, 12.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-5.462f)
                lineToRelative(-4.538f, -4.16f)
                lineTo(11.0f, 3.0f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.671f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-6.0f)
                curveTo(2.467f, 0.0f, 0.0f, 2.468f, 0.0f, 5.5f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 3.032f, 2.467f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(3.032f, 0.0f, 5.5f, -2.468f, 5.5f, -5.5f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(5.5f, 3.0f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(6.573f)
                lineToRelative(-5.0f, 2.5f)
                verticalLineToRelative(-6.573f)
                curveToRelative(0.0f, -1.379f, 1.122f, -2.5f, 2.5f, -2.5f)
                close()
                moveTo(3.0f, 18.5f)
                verticalLineToRelative(-3.073f)
                lineToRelative(6.248f, -3.124f)
                lineToRelative(4.291f, 3.934f)
                lineToRelative(-3.175f, 4.763f)
                horizontalLineToRelative(-4.864f)
                curveToRelative(-1.378f, 0.0f, -2.5f, -1.121f, -2.5f, -2.5f)
                close()
                moveTo(18.5f, 21.0f)
                horizontalLineToRelative(-4.531f)
                lineToRelative(2.667f, -4.0f)
                horizontalLineToRelative(4.364f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 1.379f, -1.121f, 2.5f, -2.5f, 2.5f)
                close()
                moveTo(18.113f, 11.126f)
                curveToRelative(0.493f, 0.482f, 1.281f, 0.482f, 1.774f, 0.0f)
                lineToRelative(2.648f, -2.59f)
                curveToRelative(1.953f, -1.953f, 1.953f, -5.118f, 0.0f, -7.071f)
                curveTo(21.559f, 0.488f, 20.28f, 0.0f, 19.0f, 0.0f)
                curveToRelative(-1.28f, 0.0f, -2.559f, 0.488f, -3.536f, 1.464f)
                curveToRelative(-1.953f, 1.953f, -1.953f, 5.118f, 0.0f, 7.071f)
                lineToRelative(2.648f, 2.59f)
                close()
                moveTo(19.0f, 3.554f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _regionPinAlt!!
    }

private var _regionPinAlt: ImageVector? = null
