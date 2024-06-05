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

public val Icons.Filled._2: ImageVector
    get() {
        if (__2 != null) {
            return __2!!
        }
        __2 = Builder(name = "_2", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 24.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -3.672f, 3.451f, -5.453f, 6.789f, -7.174f)
                curveToRelative(3.708f, -1.913f, 7.211f, -3.719f, 7.211f, -7.826f)
                curveToRelative(0.0f, -3.309f, -2.691f, -6.0f, -6.0f, -6.0f)
                reflectiveCurveToRelative(-6.0f, 2.691f, -6.0f, 6.0f)
                horizontalLineToRelative(-2.0f)
                curveTo(4.0f, 3.589f, 7.589f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(8.0f, 3.589f, 8.0f, 8.0f)
                curveToRelative(0.0f, 5.325f, -4.406f, 7.598f, -8.294f, 9.603f)
                curveToRelative(-2.619f, 1.351f, -4.933f, 2.544f, -5.547f, 4.397f)
                horizontalLineToRelative(13.841f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return __2!!
    }

private var __2: ImageVector? = null
