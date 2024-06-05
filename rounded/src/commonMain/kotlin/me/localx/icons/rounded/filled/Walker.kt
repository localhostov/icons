package me.localx.icons.rounded.filled

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

public val Icons.Filled.Walker: ImageVector
    get() {
        if (_walker != null) {
            return _walker!!
        }
        _walker = Builder(name = "Walker", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 18.184f)
                verticalLineTo(5.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                horizontalLineToRelative(-5.198f)
                curveToRelative(-2.095f, 0.0f, -3.983f, 1.322f, -4.698f, 3.291f)
                lineTo(0.061f, 22.658f)
                curveToRelative(-0.189f, 0.52f, 0.079f, 1.093f, 0.598f, 1.281f)
                curveToRelative(0.113f, 0.041f, 0.229f, 0.061f, 0.342f, 0.061f)
                curveToRelative(0.408f, 0.0f, 0.792f, -0.252f, 0.939f, -0.658f)
                lineToRelative(4.488f, -12.342f)
                horizontalLineToRelative(13.572f)
                verticalLineToRelative(7.184f)
                curveToRelative(-1.161f, 0.414f, -2.0f, 1.514f, -2.0f, 2.816f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.346f, 3.0f, -3.0f)
                curveToRelative(0.0f, -1.302f, -0.839f, -2.402f, -2.0f, -2.816f)
                close()
                moveTo(7.155f, 9.0f)
                lineToRelative(1.828f, -5.025f)
                curveToRelative(0.43f, -1.182f, 1.562f, -1.975f, 2.819f, -1.975f)
                horizontalLineToRelative(5.198f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(4.0f)
                horizontalLineTo(7.155f)
                close()
            }
        }
        .build()
        return _walker!!
    }

private var _walker: ImageVector? = null
