package me.localx.icons.straight.bold

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

public val Icons.Bold.Scalpel: ImageVector
    get() {
        if (_scalpel != null) {
            return _scalpel!!
        }
        _scalpel = Builder(name = "Scalpel", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.828f, 2.172f)
                curveToRelative(-1.559f, -1.561f, -4.096f, -1.56f, -5.656f, 0.0f)
                lineTo(0.0f, 19.326f)
                verticalLineToRelative(3.646f)
                reflectiveCurveToRelative(3.56f, 0.027f, 3.56f, 0.027f)
                curveToRelative(3.999f, -0.159f, 7.436f, -1.564f, 9.937f, -4.066f)
                lineToRelative(0.328f, -0.328f)
                lineToRelative(0.409f, -2.181f)
                lineToRelative(8.595f, -8.596f)
                curveToRelative(1.56f, -1.56f, 1.56f, -4.097f, 0.0f, -5.656f)
                close()
                moveTo(11.05f, 17.122f)
                curveToRelative(-2.374f, 2.171f, -5.328f, 2.769f, -7.475f, 2.873f)
                lineToRelative(6.18f, -6.173f)
                lineToRelative(1.629f, 1.521f)
                lineToRelative(-0.334f, 1.778f)
                close()
                moveTo(20.707f, 5.707f)
                lineToRelative(-7.362f, 7.362f)
                lineToRelative(-1.467f, -1.368f)
                lineToRelative(7.415f, -7.408f)
                curveToRelative(0.391f, -0.389f, 1.023f, -0.389f, 1.414f, 0.0f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.024f, 0.0f, 1.414f)
                close()
            }
        }
        .build()
        return _scalpel!!
    }

private var _scalpel: ImageVector? = null
