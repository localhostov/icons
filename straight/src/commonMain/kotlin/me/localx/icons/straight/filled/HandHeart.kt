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

public val Icons.Filled.HandHeart: ImageVector
    get() {
        if (_handHeart != null) {
            return _handHeart!!
        }
        _handHeart = Builder(name = "HandHeart", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.5f, 3.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(-2.0f)
                lineTo(19.0f, 2.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                lineTo(16.0f, 12.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(14.0f, 1.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                lineTo(11.0f, 12.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(9.0f, 3.58f)
                curveToRelative(0.0f, -0.747f, -0.511f, -1.44f, -1.248f, -1.56f)
                curveToRelative(-0.94f, -0.153f, -1.752f, 0.568f, -1.752f, 1.479f)
                verticalLineToRelative(12.654f)
                lineToRelative(-2.605f, -2.65f)
                curveToRelative(-0.088f, -0.088f, -0.24f, -0.201f, -0.441f, -0.333f)
                curveToRelative(-0.843f, -0.47f, -1.954f, -0.284f, -2.584f, 0.561f)
                curveToRelative(-0.604f, 0.81f, -0.437f, 1.965f, 0.276f, 2.68f)
                lineToRelative(7.354f, 7.588f)
                lineTo(24.0f, 23.999f)
                lineTo(24.0f, 4.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(15.0f, 22.2f)
                reflectiveCurveToRelative(-4.0f, -2.778f, -4.0f, -5.04f)
                curveToRelative(0.0f, -1.193f, 0.895f, -2.16f, 2.0f, -2.16f)
                reflectiveCurveToRelative(2.0f, 0.771f, 2.0f, 1.964f)
                curveToRelative(0.0f, -1.193f, 0.895f, -1.964f, 2.0f, -1.964f)
                reflectiveCurveToRelative(2.0f, 0.967f, 2.0f, 2.16f)
                curveToRelative(0.0f, 2.262f, -4.0f, 5.04f, -4.0f, 5.04f)
                close()
            }
        }
        .build()
        return _handHeart!!
    }

private var _handHeart: ImageVector? = null
