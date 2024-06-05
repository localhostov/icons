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

public val Icons.Filled.Stretcher: ImageVector
    get() {
        if (_stretcher != null) {
            return _stretcher!!
        }
        _stretcher = Builder(name = "Stretcher", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.394f, 11.0f)
                horizontalLineToRelative(2.606f)
                verticalLineToRelative(-2.0f)
                lineTo(7.549f, 9.0f)
                lineTo(1.844f, 0.045f)
                lineTo(0.156f, 1.119f)
                lineToRelative(6.295f, 9.881f)
                horizontalLineToRelative(2.155f)
                lineToRelative(4.93f, 4.607f)
                lineToRelative(-2.932f, 2.866f)
                curveToRelative(-0.465f, -0.296f, -1.013f, -0.474f, -1.604f, -0.474f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                reflectiveCurveToRelative(1.346f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.346f, 3.0f, -3.0f)
                curveToRelative(0.0f, -0.329f, -0.066f, -0.639f, -0.164f, -0.935f)
                lineToRelative(3.164f, -3.089f)
                lineToRelative(3.164f, 3.089f)
                curveToRelative(-0.098f, 0.296f, -0.164f, 0.607f, -0.164f, 0.935f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.346f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-1.346f, -3.0f, -3.0f, -3.0f)
                curveToRelative(-0.591f, 0.0f, -1.139f, 0.178f, -1.604f, 0.474f)
                lineToRelative(-2.932f, -2.866f)
                lineToRelative(4.93f, -4.607f)
                close()
                moveTo(11.534f, 11.0f)
                horizontalLineToRelative(6.932f)
                lineToRelative(-3.466f, 3.239f)
                lineToRelative(-3.466f, -3.239f)
                close()
            }
        }
        .build()
        return _stretcher!!
    }

private var _stretcher: ImageVector? = null
