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

public val Icons.Bold.Narwhal: ImageVector
    get() {
        if (_narwhal != null) {
            return _narwhal!!
        }
        _narwhal = Builder(name = "Narwhal", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.0f, 16.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                close()
                moveTo(21.416f, 10.132f)
                lineTo(23.979f, 0.763f)
                curveToRelative(0.072f, -0.263f, -0.042f, -0.542f, -0.277f, -0.68f)
                curveToRelative(-0.287f, -0.168f, -0.656f, -0.072f, -0.825f, 0.214f)
                lineToRelative(-4.717f, 8.009f)
                curveToRelative(-0.685f, -0.193f, -1.404f, -0.304f, -2.15f, -0.304f)
                lineToRelative(-1.509f, -0.002f)
                curveToRelative(-0.166f, 0.0f, -4.126f, 0.05f, -8.997f, 4.379f)
                curveToRelative(-0.619f, 0.551f, -0.675f, 1.498f, -0.125f, 2.117f)
                curveToRelative(0.55f, 0.62f, 1.498f, 0.675f, 2.118f, 0.125f)
                curveToRelative(3.944f, -3.506f, 6.991f, -3.62f, 7.001f, -3.621f)
                lineToRelative(1.508f, 0.002f)
                curveToRelative(2.754f, 0.002f, 4.994f, 2.245f, 4.994f, 4.999f)
                reflectiveCurveToRelative(-2.243f, 4.999f, -4.999f, 4.999f)
                horizontalLineToRelative(-6.452f)
                curveToRelative(-3.611f, 0.0f, -6.549f, -2.938f, -6.549f, -6.549f)
                curveToRelative(0.0f, -2.287f, 0.671f, -4.503f, 1.939f, -6.406f)
                lineToRelative(1.76f, -2.639f)
                curveToRelative(2.193f, -0.488f, 3.907f, -2.267f, 4.29f, -4.501f)
                curveToRelative(0.087f, -0.507f, -0.361f, -0.956f, -0.872f, -0.9f)
                curveToRelative(-3.478f, 0.378f, -4.617f, 2.761f, -4.617f, 2.761f)
                curveTo(5.5f, 2.766f, 4.32f, 0.388f, 0.883f, 0.006f)
                curveTo(0.372f, -0.051f, -0.076f, 0.399f, 0.011f, 0.906f)
                curveToRelative(0.323f, 1.882f, 1.596f, 3.437f, 3.299f, 4.175f)
                lineToRelative(-0.866f, 1.3f)
                curveTo(0.845f, 8.779f, 0.0f, 11.569f, 0.0f, 14.451f)
                curveToRelative(0.0f, 5.266f, 4.284f, 9.549f, 9.549f, 9.549f)
                horizontalLineToRelative(6.452f)
                curveToRelative(4.411f, 0.0f, 7.999f, -3.588f, 7.999f, -7.999f)
                curveToRelative(0.0f, -2.32f, -1.0f, -4.407f, -2.584f, -5.869f)
                close()
            }
        }
        .build()
        return _narwhal!!
    }

private var _narwhal: ImageVector? = null
