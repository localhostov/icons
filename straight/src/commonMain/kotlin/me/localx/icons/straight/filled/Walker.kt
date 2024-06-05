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
                verticalLineTo(3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                horizontalLineToRelative(-8.585f)
                curveToRelative(-1.27f, 0.0f, -2.406f, 0.805f, -2.829f, 2.001f)
                lineTo(0.057f, 23.327f)
                lineToRelative(1.887f, 0.666f)
                lineToRelative(4.587f, -12.993f)
                horizontalLineToRelative(13.47f)
                verticalLineToRelative(7.184f)
                curveToRelative(-1.161f, 0.414f, -2.0f, 1.514f, -2.0f, 2.816f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.346f, 3.0f, -3.0f)
                curveToRelative(0.0f, -1.302f, -0.839f, -2.402f, -2.0f, -2.816f)
                close()
                moveTo(7.236f, 9.0f)
                lineToRelative(2.236f, -6.333f)
                curveToRelative(0.141f, -0.399f, 0.52f, -0.667f, 0.942f, -0.667f)
                horizontalLineToRelative(8.585f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(6.0f)
                horizontalLineTo(7.236f)
                close()
            }
        }
        .build()
        return _walker!!
    }

private var _walker: ImageVector? = null
