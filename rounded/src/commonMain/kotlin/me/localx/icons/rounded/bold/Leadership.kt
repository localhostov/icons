package me.localx.icons.rounded.bold

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

public val Icons.Bold.Leadership: ImageVector
    get() {
        if (_leadership != null) {
            return _leadership!!
        }
        _leadership = Builder(name = "Leadership", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.0f, 2.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(3.5f, 11.0f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.119f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(23.354f, 14.733f)
                lineToRelative(-12.615f, 8.733f)
                curveToRelative(-0.502f, 0.347f, -1.097f, 0.533f, -1.708f, 0.533f)
                horizontalLineToRelative(-1.532f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 0.232f, -0.054f, 0.463f, -0.158f, 0.671f)
                lineToRelative(-1.0f, 2.0f)
                curveToRelative(-0.263f, 0.525f, -0.793f, 0.829f, -1.343f, 0.829f)
                curveToRelative(-0.226f, 0.0f, -0.455f, -0.051f, -0.67f, -0.158f)
                curveToRelative(-0.741f, -0.371f, -1.041f, -1.271f, -0.671f, -2.013f)
                lineToRelative(0.842f, -1.684f)
                verticalLineToRelative(-5.646f)
                curveToRelative(0.0f, -1.266f, 0.945f, -2.302f, 2.166f, -2.466f)
                lineToRelative(4.468f, -1.364f)
                reflectiveCurveToRelative(4.164f, -3.991f, 4.18f, -4.005f)
                curveToRelative(0.445f, -0.409f, 1.034f, -0.665f, 1.686f, -0.665f)
                horizontalLineToRelative(4.5f)
                lineTo(17.999f, 1.601f)
                curveToRelative(0.0f, -0.884f, 0.717f, -1.601f, 1.601f, -1.601f)
                curveToRelative(0.262f, 0.0f, 0.52f, 0.064f, 0.751f, 0.187f)
                lineToRelative(3.056f, 1.622f)
                curveToRelative(0.709f, 0.296f, 0.803f, 1.262f, 0.164f, 1.689f)
                lineToRelative(-2.571f, 1.003f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(0.5f)
                curveToRelative(1.381f, 0.0f, 2.5f, 1.119f, 2.5f, 2.5f)
                verticalLineToRelative(0.598f)
                lineToRelative(2.646f, -1.832f)
                curveToRelative(0.682f, -0.473f, 1.616f, -0.302f, 2.087f, 0.38f)
                curveToRelative(0.472f, 0.681f, 0.302f, 1.615f, -0.379f, 2.087f)
                close()
                moveTo(11.0f, 11.594f)
                lineToRelative(-1.545f, 1.487f)
                curveToRelative(-0.17f, 0.163f, -0.376f, 0.285f, -0.602f, 0.354f)
                lineToRelative(-2.853f, 0.871f)
                verticalLineToRelative(2.695f)
                horizontalLineToRelative(0.5f)
                curveToRelative(1.378f, 0.0f, 2.5f, 1.121f, 2.5f, 2.5f)
                lineToRelative(0.031f, 1.5f)
                lineToRelative(1.969f, -1.363f)
                verticalLineToRelative(-8.043f)
                close()
                moveTo(16.0f, 14.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.56f)
                lineToRelative(2.0f, -1.385f)
                verticalLineToRelative(-2.175f)
                close()
            }
        }
        .build()
        return _leadership!!
    }

private var _leadership: ImageVector? = null
