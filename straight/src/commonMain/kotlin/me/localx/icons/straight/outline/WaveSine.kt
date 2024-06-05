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

public val Icons.Outline.WaveSine: ImageVector
    get() {
        if (_waveSine != null) {
            return _waveSine!!
        }
        _waveSine = Builder(name = "WaveSine", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.762f, 21.0f)
                curveToRelative(-4.495f, 0.0f, -6.178f, -6.588f, -6.73f, -8.752f)
                curveToRelative(-1.229f, -4.809f, -2.841f, -7.248f, -4.793f, -7.248f)
                curveToRelative(-2.495f, 0.0f, -4.238f, 3.701f, -4.238f, 9.0f)
                horizontalLineTo(0.0f)
                curveTo(0.0f, 7.318f, 2.448f, 3.0f, 6.238f, 3.0f)
                curveToRelative(4.495f, 0.0f, 6.178f, 6.588f, 6.73f, 8.752f)
                curveToRelative(1.229f, 4.809f, 2.841f, 7.248f, 4.793f, 7.248f)
                curveToRelative(2.495f, 0.0f, 4.238f, -3.701f, 4.238f, -9.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, 6.682f, -2.448f, 11.0f, -6.238f, 11.0f)
                close()
            }
        }
        .build()
        return _waveSine!!
    }

private var _waveSine: ImageVector? = null
