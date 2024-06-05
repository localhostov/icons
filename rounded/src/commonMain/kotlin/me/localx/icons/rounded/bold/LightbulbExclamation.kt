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

public val Icons.Bold.LightbulbExclamation: ImageVector
    get() {
        if (_lightbulbExclamation != null) {
            return _lightbulbExclamation!!
        }
        _lightbulbExclamation = Builder(name = "LightbulbExclamation", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.958f, 2.269f)
                curveTo(16.029f, 0.549f, 13.552f, -0.235f, 10.977f, 0.06f)
                curveTo(6.924f, 0.527f, 3.61f, 3.844f, 3.097f, 7.946f)
                curveToRelative(-0.372f, 2.969f, 0.643f, 5.835f, 2.783f, 7.863f)
                curveToRelative(0.95f, 0.901f, 1.142f, 2.188f, 1.142f, 3.97f)
                verticalLineToRelative(0.153f)
                curveToRelative(0.0f, 2.243f, 1.805f, 4.067f, 4.022f, 4.067f)
                horizontalLineToRelative(1.956f)
                curveToRelative(2.218f, 0.0f, 4.021f, -1.825f, 4.021f, -4.067f)
                verticalLineToRelative(-0.524f)
                curveToRelative(0.0f, -1.669f, 0.15f, -2.708f, 0.942f, -3.415f)
                curveToRelative(1.943f, -1.734f, 3.058f, -4.233f, 3.058f, -6.857f)
                reflectiveCurveToRelative(-1.116f, -5.131f, -3.063f, -6.867f)
                close()
                moveTo(15.966f, 13.755f)
                curveToRelative(-1.36f, 1.215f, -1.774f, 2.748f, -1.896f, 4.245f)
                horizontalLineToRelative(-4.136f)
                curveToRelative(-0.172f, -1.576f, -0.662f, -3.109f, -1.991f, -4.368f)
                curveToRelative(-1.44f, -1.365f, -2.122f, -3.301f, -1.87f, -5.313f)
                curveToRelative(0.344f, -2.748f, 2.551f, -4.968f, 5.247f, -5.278f)
                curveToRelative(0.236f, -0.027f, 0.472f, -0.041f, 0.705f, -0.041f)
                curveToRelative(1.454f, 0.0f, 2.831f, 0.523f, 3.937f, 1.508f)
                curveToRelative(1.309f, 1.167f, 2.06f, 2.854f, 2.06f, 4.628f)
                reflectiveCurveToRelative(-0.749f, 3.454f, -2.056f, 4.619f)
                close()
                moveTo(10.5f, 10.5f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.829f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.671f, 1.5f, 1.5f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.829f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.671f, -1.5f, -1.5f)
                close()
                moveTo(13.5f, 14.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _lightbulbExclamation!!
    }

private var _lightbulbExclamation: ImageVector? = null
