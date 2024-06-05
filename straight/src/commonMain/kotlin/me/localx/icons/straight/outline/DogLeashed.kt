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

public val Icons.Outline.DogLeashed: ImageVector
    get() {
        if (_dogLeashed != null) {
            return _dogLeashed!!
        }
        _dogLeashed = Builder(name = "DogLeashed", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.618f, 5.0f)
                curveToRelative(-0.309f, 0.0f, -0.586f, -0.171f, -0.724f, -0.447f)
                curveToRelative(-0.479f, -0.958f, -1.442f, -1.553f, -2.512f, -1.553f)
                horizontalLineToRelative(-1.382f)
                lineTo(17.0f, 0.0f)
                curveToRelative(-1.657f, 0.0f, -3.0f, 1.343f, -3.0f, 3.0f)
                verticalLineToRelative(1.668f)
                lineToRelative(-1.08f, 2.993f)
                lineTo(3.236f, 0.0f)
                lineTo(0.0f, 0.0f)
                lineToRelative(10.124f, 8.001f)
                lineToRelative(-4.123f, 0.002f)
                curveToRelative(-0.825f, 0.0f, -1.609f, 0.253f, -2.273f, 0.714f)
                curveToRelative(-0.466f, -0.315f, -1.728f, -1.377f, -1.728f, -3.718f)
                lineTo(0.0f, 4.999f)
                curveToRelative(0.0f, 2.981f, 1.548f, 4.574f, 2.427f, 5.24f)
                curveToRelative(-0.269f, 0.544f, -0.427f, 1.14f, -0.427f, 1.765f)
                lineToRelative(0.003f, 12.0f)
                horizontalLineToRelative(5.996f)
                verticalLineToRelative(-5.0f)
                lineToRelative(5.0f, -0.003f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(6.003f)
                verticalLineToRelative(-6.395f)
                lineToRelative(1.191f, -5.605f)
                horizontalLineToRelative(0.805f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-2.382f)
                close()
                moveTo(6.0f, 17.005f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-1.997f)
                lineToRelative(-0.002f, -10.0f)
                curveToRelative(0.0f, -0.534f, 0.208f, -1.037f, 0.585f, -1.415f)
                curveToRelative(0.378f, -0.378f, 0.88f, -0.586f, 1.415f, -0.586f)
                lineToRelative(4.999f, -0.003f)
                verticalLineToRelative(7.001f)
                lineToRelative(-5.0f, 0.003f)
                close()
                moveTo(17.003f, 22.0f)
                horizontalLineToRelative(-2.003f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-2.0f)
                reflectiveCurveToRelative(0.0f, -6.86f, 0.0f, -6.86f)
                lineToRelative(4.969f, 2.71f)
                lineToRelative(-0.944f, 4.442f)
                lineToRelative(-0.022f, 4.708f)
                close()
                moveTo(22.0f, 9.0f)
                curveToRelative(0.0f, 0.551f, -0.449f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-2.425f)
                lineToRelative(-0.172f, 0.808f)
                lineToRelative(-3.754f, -2.048f)
                lineToRelative(1.357f, -3.76f)
                horizontalLineToRelative(2.375f)
                curveToRelative(0.309f, 0.0f, 0.586f, 0.171f, 0.724f, 0.447f)
                curveToRelative(0.479f, 0.958f, 1.442f, 1.553f, 2.512f, 1.553f)
                horizontalLineToRelative(0.382f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _dogLeashed!!
    }

private var _dogLeashed: ImageVector? = null
