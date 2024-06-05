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

public val Icons.Filled.ExitAlt: ImageVector
    get() {
        if (_exitAlt != null) {
            return _exitAlt!!
        }
        _exitAlt = Builder(name = "ExitAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.661f, 21.0f)
                curveToRelative(-0.627f, 0.0f, -1.229f, -0.192f, -1.74f, -0.557f)
                curveToRelative(-0.45f, -0.32f, -0.555f, -0.944f, -0.235f, -1.395f)
                curveToRelative(0.325f, -0.456f, 0.962f, -0.558f, 1.414f, -0.22f)
                curveToRelative(0.18f, 0.134f, 0.415f, 0.172f, 0.639f, 0.172f)
                horizontalLineToRelative(3.262f)
                reflectiveCurveToRelative(0.0f, -14.0f, 0.0f, -14.0f)
                curveToRelative(0.0f, -2.761f, -2.239f, -5.0f, -5.0f, -5.0f)
                horizontalLineToRelative(-8.998f)
                curveTo(5.241f, 0.0f, 3.003f, 2.238f, 3.002f, 4.999f)
                lineToRelative(-0.002f, 17.0f)
                curveToRelative(0.0f, 1.105f, 0.895f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(6.022f)
                verticalLineToRelative(-3.551f)
                curveToRelative(0.0f, -0.902f, 0.405f, -1.755f, 1.104f, -2.325f)
                lineToRelative(1.726f, -1.409f)
                lineToRelative(-1.664f, -3.609f)
                lineToRelative(-0.222f, 0.387f)
                curveToRelative(-0.535f, 0.933f, -1.527f, 1.508f, -2.602f, 1.508f)
                horizontalLineToRelative(-2.365f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(2.364f)
                curveToRelative(0.357f, 0.0f, 0.689f, -0.192f, 0.868f, -0.503f)
                curveToRelative(0.0f, 0.0f, 1.397f, -2.424f, 1.441f, -2.474f)
                curveToRelative(0.508f, -0.58f, 1.22f, -0.952f, 1.98f, -1.023f)
                curveToRelative(0.062f, -0.01f, 3.068f, 0.0f, 3.068f, 0.0f)
                curveToRelative(1.166f, 0.0f, 2.235f, 0.684f, 2.724f, 1.741f)
                lineToRelative(1.08f, 2.34f)
                curveToRelative(0.232f, 0.501f, 0.013f, 1.096f, -0.488f, 1.327f)
                curveToRelative(-0.499f, 0.231f, -1.095f, 0.014f, -1.327f, -0.489f)
                lineToRelative(-1.079f, -2.338f)
                curveToRelative(-0.164f, -0.354f, -0.518f, -0.581f, -0.909f, -0.581f)
                horizontalLineToRelative(-1.349f)
                lineToRelative(1.433f, 3.106f)
                curveToRelative(0.562f, 1.368f, 0.092f, 2.888f, -1.099f, 3.678f)
                lineToRelative(-2.314f, 1.889f)
                curveToRelative(-0.233f, 0.19f, -0.369f, 0.475f, -0.369f, 0.777f)
                verticalLineToRelative(3.551f)
                horizontalLineToRelative(6.978f)
                curveToRelative(1.105f, 0.0f, 2.0f, -0.895f, 2.0f, -2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-3.339f)
                close()
                moveTo(11.5f, 8.0f)
                curveToRelative(-1.381f, 0.0f, -2.5f, -1.119f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                close()
            }
        }
        .build()
        return _exitAlt!!
    }

private var _exitAlt: ImageVector? = null
