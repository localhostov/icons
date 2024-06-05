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

public val Icons.Filled.Horse: ImageVector
    get() {
        if (_horse != null) {
            return _horse!!
        }
        _horse = Builder(name = "Horse", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.587f, 6.664f)
                curveToRelative(-1.788f, -0.857f, -2.965f, -2.171f, -3.398f, -3.906f)
                lineToRelative(-0.188f, -0.758f)
                verticalLineTo(0.0f)
                curveToRelative(-1.429f, 0.0f, -2.619f, 1.001f, -2.921f, 2.338f)
                curveToRelative(-3.163f, 1.041f, -4.079f, 4.291f, -4.079f, 6.162f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-4.006f)
                curveToRelative(-1.254f, 0.0f, -2.362f, 0.593f, -3.096f, 1.5f)
                horizontalLineToRelative(-0.062f)
                lineToRelative(-0.155f, 0.052f)
                curveToRelative(-2.136f, 0.717f, -4.682f, 2.765f, -4.682f, 8.448f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -2.792f, 0.68f, -4.73f, 2.003f, -5.812f)
                curveToRelative(0.046f, 1.593f, 0.644f, 3.32f, 1.133f, 4.72f)
                curveToRelative(0.146f, 0.417f, 0.284f, 0.812f, 0.396f, 1.172f)
                lineToRelative(-0.681f, 4.92f)
                horizontalLineToRelative(4.148f)
                lineToRelative(0.617f, -5.0f)
                horizontalLineToRelative(4.383f)
                reflectiveCurveToRelative(0.0f, 5.0f, 0.0f, 5.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-5.395f)
                lineToRelative(0.385f, -1.811f)
                curveToRelative(0.417f, -1.46f, 0.615f, -2.416f, 0.615f, -3.896f)
                verticalLineToRelative(-2.899f)
                lineToRelative(5.0f, -0.5f)
                verticalLineToRelative(-0.584f)
                curveToRelative(0.0f, -0.956f, -0.555f, -1.839f, -1.413f, -2.252f)
                close()
            }
        }
        .build()
        return _horse!!
    }

private var _horse: ImageVector? = null
