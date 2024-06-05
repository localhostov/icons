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

public val Icons.Filled.Flask: ImageVector
    get() {
        if (_flask != null) {
            return _flask!!
        }
        _flask = Builder(name = "Flask", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.0f, 9.04f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(0.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.04f)
                curveToRelative(-0.947f, 0.829f, -3.497f, 3.181f, -5.242f, 5.909f)
                horizontalLineToRelative(18.057f)
                curveToRelative(0.49f, 0.654f, 0.937f, 1.329f, 1.298f, 2.0f)
                horizontalLineTo(0.678f)
                curveToRelative(-0.42f, 0.973f, -0.678f, 1.958f, -0.678f, 2.908f)
                curveToRelative(0.0f, 3.035f, 2.765f, 4.044f, 2.882f, 4.086f)
                lineToRelative(0.162f, 0.057f)
                horizontalLineToRelative(17.912f)
                lineToRelative(0.162f, -0.057f)
                curveToRelative(0.117f, -0.042f, 2.882f, -1.051f, 2.882f, -4.086f)
                curveToRelative(0.0f, -4.39f, -5.503f, -9.506f, -7.0f, -10.817f)
                close()
            }
        }
        .build()
        return _flask!!
    }

private var _flask: ImageVector? = null
