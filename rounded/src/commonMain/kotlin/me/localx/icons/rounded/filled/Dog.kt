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

public val Icons.Filled.Dog: ImageVector
    get() {
        if (_dog != null) {
            return _dog!!
        }
        _dog = Builder(name = "Dog", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 5.0f)
                horizontalLineToRelative(-0.382f)
                curveToRelative(-0.309f, 0.0f, -0.586f, -0.171f, -0.724f, -0.447f)
                curveToRelative(-0.479f, -0.958f, -1.442f, -1.553f, -2.512f, -1.553f)
                horizontalLineToRelative(-1.382f)
                verticalLineTo(0.77f)
                curveToRelative(0.0f, -0.525f, -0.522f, -0.904f, -1.015f, -0.726f)
                curveToRelative(-1.157f, 0.416f, -1.985f, 1.523f, -1.985f, 2.824f)
                verticalLineToRelative(1.632f)
                lineToRelative(-0.964f, 2.839f)
                curveToRelative(-0.143f, 0.395f, -0.521f, 0.66f, -0.94f, 0.661f)
                lineToRelative(-5.098f, 0.003f)
                curveToRelative(-1.091f, 0.0f, -2.1f, 0.353f, -2.923f, 0.948f)
                curveToRelative(-0.6f, -0.277f, -2.075f, -1.141f, -2.075f, -2.951f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                curveToRelative(0.0f, 2.472f, 1.596f, 3.834f, 2.688f, 4.476f)
                curveToRelative(-0.437f, 0.742f, -0.687f, 1.606f, -0.687f, 2.528f)
                lineToRelative(0.002f, 8.503f)
                curveToRelative(0.0f, 1.377f, 1.122f, 2.498f, 2.499f, 2.498f)
                reflectiveCurveToRelative(2.499f, -1.121f, 2.499f, -2.499f)
                verticalLineToRelative(-3.506f)
                lineToRelative(6.0f, -0.003f)
                verticalLineToRelative(3.504f)
                curveToRelative(0.0f, 1.378f, 1.122f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.122f, 2.5f, -2.5f)
                verticalLineToRelative(-3.265f)
                curveToRelative(0.0f, -0.4f, 0.041f, -0.801f, 0.12f, -1.193f)
                lineToRelative(2.06f, -6.148f)
                curveToRelative(2.123f, -0.094f, 3.82f, -1.851f, 3.82f, -3.996f)
                curveToRelative(0.0f, -0.92f, -0.701f, -1.898f, -2.0f, -1.898f)
                close()
            }
        }
        .build()
        return _dog!!
    }

private var _dog: ImageVector? = null
