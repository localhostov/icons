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

public val Icons.Filled.Galaxy: ImageVector
    get() {
        if (_galaxy != null) {
            return _galaxy!!
        }
        _galaxy = Builder(name = "Galaxy", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.088f, 6.482f)
                curveToRelative(-1.213f, -0.306f, -2.384f, -0.311f, -3.474f, -0.092f)
                curveToRelative(-0.397f, 0.08f, -0.72f, -0.296f, -0.598f, -0.683f)
                curveToRelative(0.406f, -1.295f, 0.977f, -2.482f, 1.818f, -3.505f)
                curveToRelative(0.395f, -0.481f, 0.046f, -1.203f, -0.577f, -1.203f)
                curveToRelative(-3.641f, 0.001f, -6.882f, 2.382f, -7.773f, 5.913f)
                curveToRelative(-0.306f, 1.213f, -0.311f, 2.384f, -0.092f, 3.474f)
                curveToRelative(0.08f, 0.397f, -0.296f, 0.72f, -0.683f, 0.598f)
                curveToRelative(-1.295f, -0.406f, -2.482f, -0.977f, -3.505f, -1.818f)
                curveToRelative(-0.481f, -0.395f, -1.203f, -0.046f, -1.203f, 0.577f)
                curveToRelative(0.001f, 3.641f, 2.382f, 6.882f, 5.912f, 7.773f)
                curveToRelative(1.21f, 0.305f, 2.379f, 0.311f, 3.467f, 0.093f)
                curveToRelative(0.397f, -0.079f, 0.727f, 0.295f, 0.605f, 0.681f)
                curveToRelative(-0.406f, 1.294f, -0.977f, 2.481f, -1.818f, 3.505f)
                curveToRelative(-0.391f, 0.477f, -0.052f, 1.189f, 0.56f, 1.202f)
                curveToRelative(3.618f, -0.027f, 6.904f, -2.401f, 7.79f, -5.912f)
                curveToRelative(0.306f, -1.213f, 0.311f, -2.384f, 0.092f, -3.474f)
                curveToRelative(-0.08f, -0.397f, 0.296f, -0.72f, 0.683f, -0.598f)
                curveToRelative(1.295f, 0.406f, 2.482f, 0.977f, 3.505f, 1.818f)
                curveToRelative(0.481f, 0.395f, 1.203f, 0.046f, 1.203f, -0.577f)
                curveToRelative(-0.001f, -3.641f, -2.382f, -6.882f, -5.912f, -7.773f)
                close()
                moveTo(12.0f, 13.5f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _galaxy!!
    }

private var _galaxy: ImageVector? = null
