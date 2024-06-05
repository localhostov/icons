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

public val Icons.Outline.Tamale: ImageVector
    get() {
        if (_tamale != null) {
            return _tamale!!
        }
        _tamale = Builder(name = "Tamale", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.145f, 13.0f)
                lineToRelative(1.292f, -11.629f)
                lineToRelative(-0.812f, -0.232f)
                curveToRelative(-0.163f, -0.046f, -4.049f, -1.139f, -9.625f, -1.139f)
                reflectiveCurveTo(2.538f, 1.092f, 2.375f, 1.139f)
                lineToRelative(-0.812f, 0.232f)
                lineToRelative(1.292f, 11.629f)
                horizontalLineToRelative(18.29f)
                close()
                moveTo(13.0f, 2.013f)
                curveToRelative(0.894f, 0.022f, 1.737f, 0.073f, 2.517f, 0.141f)
                lineToRelative(-0.465f, 8.846f)
                horizontalLineToRelative(-2.051f)
                lineTo(13.001f, 2.013f)
                close()
                moveTo(11.0f, 11.0f)
                horizontalLineToRelative(-2.051f)
                lineToRelative(-0.465f, -8.846f)
                curveToRelative(0.779f, -0.068f, 1.622f, -0.119f, 2.517f, -0.141f)
                verticalLineToRelative(8.987f)
                close()
                moveTo(19.355f, 11.0f)
                horizontalLineToRelative(-2.301f)
                lineToRelative(0.454f, -8.623f)
                curveToRelative(1.194f, 0.164f, 2.136f, 0.35f, 2.752f, 0.486f)
                lineToRelative(-0.904f, 8.137f)
                close()
                moveTo(6.492f, 2.377f)
                lineToRelative(0.454f, 8.623f)
                horizontalLineToRelative(-2.301f)
                lineToRelative(-0.904f, -8.137f)
                curveToRelative(0.616f, -0.137f, 1.558f, -0.322f, 2.752f, -0.486f)
                close()
                moveTo(21.589f, 15.0f)
                lineToRelative(0.848f, 7.629f)
                lineToRelative(-0.812f, 0.232f)
                curveToRelative(-0.163f, 0.046f, -4.049f, 1.139f, -9.625f, 1.139f)
                reflectiveCurveToRelative(-9.462f, -1.092f, -9.625f, -1.139f)
                lineToRelative(-0.812f, -0.232f)
                lineToRelative(0.848f, -7.629f)
                horizontalLineToRelative(2.012f)
                lineToRelative(-0.682f, 6.137f)
                curveToRelative(0.613f, 0.136f, 1.565f, 0.32f, 2.752f, 0.483f)
                lineToRelative(0.348f, -6.62f)
                horizontalLineToRelative(2.003f)
                lineToRelative(-0.36f, 6.842f)
                curveToRelative(0.78f, 0.068f, 1.621f, 0.118f, 2.517f, 0.14f)
                verticalLineToRelative(-6.983f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.983f)
                curveToRelative(0.896f, -0.023f, 1.737f, -0.072f, 2.517f, -0.14f)
                lineToRelative(-0.36f, -6.842f)
                horizontalLineToRelative(2.003f)
                lineToRelative(0.348f, 6.62f)
                curveToRelative(1.187f, -0.164f, 2.139f, -0.347f, 2.752f, -0.483f)
                lineToRelative(-0.682f, -6.137f)
                horizontalLineToRelative(2.012f)
                close()
            }
        }
        .build()
        return _tamale!!
    }

private var _tamale: ImageVector? = null
