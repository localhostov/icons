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

public val Icons.Filled.HandBackPointLeft: ImageVector
    get() {
        if (_handBackPointLeft != null) {
            return _handBackPointLeft!!
        }
        _handBackPointLeft = Builder(name = "HandBackPointLeft", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.955f, 2.952f)
                curveToRelative(-0.441f, -0.46f, -1.012f, -0.774f, -1.637f, -0.9f)
                curveToRelative(-0.976f, -0.185f, -1.98f, 0.125f, -2.682f, 0.828f)
                lineToRelative(-3.025f, 3.121f)
                horizontalLineToRelative(5.389f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(2.5f)
                curveToRelative(-1.381f, 0.0f, -2.5f, 1.119f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(5.681f)
                lineToRelative(2.014f, 9.0f)
                horizontalLineToRelative(13.806f)
                verticalLineTo(8.0f)
                lineToRelative(-5.045f, -5.049f)
                close()
            }
        }
        .build()
        return _handBackPointLeft!!
    }

private var _handBackPointLeft: ImageVector? = null
