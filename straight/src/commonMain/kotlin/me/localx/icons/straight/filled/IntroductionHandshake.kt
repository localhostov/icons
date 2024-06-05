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

public val Icons.Filled.IntroductionHandshake: ImageVector
    get() {
        if (_introductionHandshake != null) {
            return _introductionHandshake!!
        }
        _introductionHandshake = Builder(name = "IntroductionHandshake", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.0f, 1.5f)
                curveTo(13.0f, 0.672f, 13.671f, 0.0f, 14.499f, 0.0f)
                lineToRelative(6.0f, -0.002f)
                curveToRelative(0.829f, 0.0f, 1.501f, 0.671f, 1.501f, 1.5f)
                verticalLineToRelative(5.503f)
                lineToRelative(-5.495f, 0.004f)
                lineToRelative(-2.288f, 1.87f)
                curveToRelative(-0.526f, 0.336f, -1.215f, -0.041f, -1.215f, -0.665f)
                lineToRelative(-0.002f, -6.709f)
                close()
                moveTo(11.0f, 1.5f)
                curveTo(11.0f, 0.672f, 10.329f, 0.0f, 9.501f, 0.0f)
                lineTo(3.501f, -0.003f)
                curveToRelative(-0.829f, 0.0f, -1.501f, 0.671f, -1.501f, 1.5f)
                verticalLineToRelative(5.503f)
                lineToRelative(5.495f, 0.004f)
                lineToRelative(2.288f, 1.87f)
                curveToRelative(0.526f, 0.336f, 1.215f, -0.041f, 1.215f, -0.665f)
                lineToRelative(0.002f, -6.709f)
                close()
                moveTo(18.28f, 11.0f)
                curveToRelative(-0.571f, -0.336f, -2.29f, -1.0f, -3.28f, -1.0f)
                curveToRelative(-0.891f, 0.0f, -1.622f, 0.296f, -2.288f, 0.923f)
                lineToRelative(-3.369f, 3.302f)
                curveToRelative(-0.371f, 0.372f, -0.455f, 0.967f, -0.181f, 1.347f)
                curveToRelative(0.18f, 0.25f, 0.441f, 0.4f, 0.739f, 0.425f)
                curveToRelative(0.295f, 0.025f, 0.581f, -0.082f, 0.788f, -0.29f)
                lineToRelative(2.309f, -2.142f)
                lineToRelative(7.188f, 6.436f)
                horizontalLineToRelative(3.814f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(-5.72f)
                close()
                moveTo(12.072f, 17.15f)
                curveToRelative(-0.535f, 0.538f, -1.292f, 0.85f, -2.084f, 0.85f)
                curveToRelative(-0.086f, 0.0f, -0.172f, -0.004f, -0.259f, -0.012f)
                curveToRelative(-0.871f, -0.071f, -1.672f, -0.526f, -2.192f, -1.25f)
                curveToRelative(-0.843f, -1.167f, -0.678f, -2.857f, 0.389f, -3.926f)
                lineToRelative(2.533f, -2.473f)
                curveToRelative(-0.457f, -0.214f, -0.956f, -0.34f, -1.482f, -0.34f)
                curveToRelative(-1.004f, 0.0f, -2.573f, 0.697f, -3.208f, 1.0f)
                lineTo(0.0f, 10.999f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(5.531f)
                lineToRelative(5.125f, 4.0f)
                horizontalLineToRelative(2.688f)
                lineToRelative(4.441f, -3.466f)
                lineToRelative(-4.778f, -4.279f)
                lineToRelative(-0.935f, 0.895f)
                close()
            }
        }
        .build()
        return _introductionHandshake!!
    }

private var _introductionHandshake: ImageVector? = null
