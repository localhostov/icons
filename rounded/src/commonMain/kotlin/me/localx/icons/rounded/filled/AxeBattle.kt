package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.AxeBattle: ImageVector
    get() {
        if (_axeBattle != null) {
            return _axeBattle!!
        }
        _axeBattle = Builder(name = "AxeBattle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.0f, 3.913f)
                verticalLineToRelative(-0.913f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(0.922f)
                curveToRelative(0.328f, 0.048f, 0.661f, 0.078f, 1.0f, 0.078f)
                curveToRelative(0.332f, 0.0f, 0.666f, -0.035f, 1.0f, -0.087f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.0f, 16.092f)
                verticalLineToRelative(6.908f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-6.915f)
                curveToRelative(-0.33f, -0.051f, -0.663f, -0.085f, -1.0f, -0.085f)
                curveToRelative(-0.34f, 0.0f, -0.672f, 0.038f, -1.0f, 0.092f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.56f, 2.141f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.416f, -0.601f, -1.043f, -0.991f, -1.767f, -1.101f)
                curveToRelative(-0.735f, -0.112f, -1.5f, 0.093f, -2.093f, 0.559f)
                curveToRelative(-1.699f, 1.336f, -3.217f, 2.081f, -4.7f, 2.313f)
                verticalLineToRelative(12.173f)
                curveToRelative(1.951f, 0.3f, 3.76f, 1.399f, 5.006f, 2.349f)
                curveToRelative(0.481f, 0.367f, 1.072f, 0.564f, 1.667f, 0.564f)
                curveToRelative(0.132f, 0.0f, 0.265f, -0.01f, 0.396f, -0.03f)
                curveToRelative(0.709f, -0.107f, 1.33f, -0.487f, 1.747f, -1.071f)
                curveToRelative(1.612f, -2.262f, 2.185f, -5.666f, 2.185f, -7.894f)
                curveToRelative(0.0f, -2.592f, -0.98f, -5.752f, -2.44f, -7.863f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.026f, 1.6f)
                curveToRelative(-0.593f, -0.466f, -1.357f, -0.672f, -2.093f, -0.559f)
                curveToRelative(-0.724f, 0.109f, -1.351f, 0.5f, -1.767f, 1.101f)
                curveTo(0.569f, 4.452f, 0.0f, 7.718f, 0.0f, 10.004f)
                curveToRelative(0.0f, 2.658f, 0.988f, 5.831f, 2.46f, 7.895f)
                curveToRelative(0.417f, 0.583f, 1.037f, 0.963f, 1.746f, 1.07f)
                curveToRelative(0.722f, 0.111f, 1.475f, -0.085f, 2.063f, -0.535f)
                curveToRelative(1.262f, -0.962f, 2.892f, -2.037f, 4.73f, -2.342f)
                verticalLineTo(3.922f)
                curveToRelative(-2.131f, -0.315f, -3.985f, -1.545f, -4.974f, -2.322f)
                close()
            }
        }
        .build()
        return _axeBattle!!
    }

private var _axeBattle: ImageVector? = null
