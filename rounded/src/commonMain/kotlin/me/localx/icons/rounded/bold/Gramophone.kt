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

public val Icons.Bold.Gramophone: ImageVector
    get() {
        if (_gramophone != null) {
            return _gramophone!!
        }
        _gramophone = Builder(name = "Gramophone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.5f, 21.0f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -2.481f, -2.019f, -4.5f, -4.5f, -4.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.827f, 0.673f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(2.25f)
                curveToRelative(2.343f, 0.0f, 4.25f, -1.907f, 4.25f, -4.25f)
                reflectiveCurveToRelative(-1.907f, -4.25f, -4.25f, -4.25f)
                horizontalLineToRelative(-2.464f)
                curveToRelative(-1.174f, -0.461f, -5.426f, -2.225f, -8.501f, -4.766f)
                curveTo(7.897f, 0.0f, 6.703f, -0.15f, 5.667f, 0.337f)
                curveToRelative(-1.028f, 0.485f, -1.667f, 1.496f, -1.667f, 2.639f)
                verticalLineToRelative(8.104f)
                curveToRelative(0.0f, 1.143f, 0.639f, 2.154f, 1.667f, 2.639f)
                curveToRelative(0.402f, 0.189f, 0.828f, 0.282f, 1.25f, 0.282f)
                curveToRelative(0.666f, 0.0f, 1.325f, -0.231f, 1.868f, -0.68f)
                curveToRelative(3.212f, -2.653f, 7.734f, -4.47f, 8.647f, -4.822f)
                horizontalLineToRelative(2.318f)
                curveToRelative(0.689f, 0.0f, 1.25f, 0.561f, 1.25f, 1.25f)
                reflectiveCurveToRelative(-0.561f, 1.25f, -1.25f, 1.25f)
                horizontalLineToRelative(-2.25f)
                curveToRelative(-2.481f, 0.0f, -4.5f, 2.019f, -4.5f, 4.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-6.5f)
                curveToRelative(-2.481f, 0.0f, -4.5f, 2.019f, -4.5f, 4.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.671f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(21.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.671f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(7.0f, 10.906f)
                lineTo(7.0f, 3.15f)
                curveToRelative(2.023f, 1.646f, 4.416f, 2.967f, 6.303f, 3.878f)
                curveToRelative(-1.887f, 0.911f, -4.278f, 2.232f, -6.303f, 3.878f)
                close()
                moveTo(5.0f, 20.5f)
                curveToRelative(0.0f, -0.827f, 0.673f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(11.0f)
                curveToRelative(0.827f, 0.0f, 1.5f, 0.673f, 1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                lineTo(5.0f, 21.0f)
                verticalLineToRelative(-0.5f)
                close()
            }
        }
        .build()
        return _gramophone!!
    }

private var _gramophone: ImageVector? = null
