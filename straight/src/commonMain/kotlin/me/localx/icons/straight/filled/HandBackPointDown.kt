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

public val Icons.Filled.HandBackPointDown: ImageVector
    get() {
        if (_handBackPointDown != null) {
            return _handBackPointDown!!
        }
        _handBackPointDown = Builder(name = "HandBackPointDown", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 0.0f)
                lineTo(2.952f, 5.045f)
                curveToRelative(-0.46f, 0.441f, -0.774f, 1.012f, -0.9f, 1.637f)
                curveToRelative(-0.185f, 0.976f, 0.125f, 1.98f, 0.828f, 2.682f)
                lineToRelative(3.121f, 3.025f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(14.5f)
                curveToRelative(0.0f, 1.381f, 1.119f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.119f, 2.5f, -2.5f)
                verticalLineToRelative(-5.681f)
                lineToRelative(9.0f, -2.014f)
                verticalLineTo(0.0f)
                horizontalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _handBackPointDown!!
    }

private var _handBackPointDown: ImageVector? = null
