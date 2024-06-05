package me.localx.icons.straight.outline

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

public val Icons.Outline.Cat: ImageVector
    get() {
        if (_cat != null) {
            return _cat!!
        }
        _cat = Builder(name = "Cat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 7.5f)
                lineTo(24.0f, 0.0f)
                lineToRelative(-3.287f, 2.465f)
                curveToRelative(-0.678f, -0.299f, -1.426f, -0.465f, -2.213f, -0.465f)
                reflectiveCurveToRelative(-1.535f, 0.167f, -2.213f, 0.465f)
                lineToRelative(-3.287f, -2.465f)
                verticalLineToRelative(7.5f)
                curveToRelative(0.0f, 0.884f, 0.21f, 1.72f, 0.582f, 2.461f)
                curveToRelative(-8.153f, 2.585f, -8.577f, 10.402f, -8.585f, 11.818f)
                curveToRelative(-1.53f, -0.428f, -2.997f, -1.488f, -2.997f, -3.279f)
                curveToRelative(0.0f, -1.565f, 0.718f, -2.724f, 1.479f, -3.949f)
                curveToRelative(0.748f, -1.207f, 1.521f, -2.454f, 1.521f, -4.051f)
                curveToRelative(0.0f, -1.681f, -0.649f, -4.5f, -5.0f, -4.5f)
                verticalLineToRelative(2.0f)
                curveToRelative(2.637f, 0.0f, 3.0f, 1.202f, 3.0f, 2.5f)
                curveToRelative(0.0f, 1.027f, -0.566f, 1.94f, -1.221f, 2.996f)
                curveToRelative(-0.834f, 1.345f, -1.779f, 2.869f, -1.779f, 5.004f)
                curveToRelative(0.0f, 3.442f, 3.334f, 5.5f, 6.558f, 5.5f)
                horizontalLineToRelative(17.442f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-10.26f)
                curveToRelative(1.221f, -1.01f, 2.0f, -2.535f, 2.0f, -4.24f)
                close()
                moveTo(18.5f, 4.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                reflectiveCurveToRelative(-1.57f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
                reflectiveCurveToRelative(1.57f, -3.5f, 3.5f, -3.5f)
                close()
                moveTo(20.0f, 22.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -3.309f, -2.691f, -6.0f, -6.0f, -6.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, 1.794f, 4.0f, 4.0f)
                lineTo(6.999f, 22.0f)
                verticalLineToRelative(-0.05f)
                curveToRelative(-0.016f, -0.343f, -0.29f, -8.175f, 7.908f, -10.289f)
                curveToRelative(0.965f, 0.834f, 2.221f, 1.339f, 3.593f, 1.339f)
                curveToRelative(0.52f, 0.0f, 1.023f, -0.073f, 1.5f, -0.208f)
                verticalLineToRelative(9.208f)
                close()
            }
        }
        .build()
        return _cat!!
    }

private var _cat: ImageVector? = null
