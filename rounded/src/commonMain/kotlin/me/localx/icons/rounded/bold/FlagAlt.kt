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

public val Icons.Bold.FlagAlt: ImageVector
    get() {
        if (_flagAlt != null) {
            return _flagAlt!!
        }
        _flagAlt = Builder(name = "FlagAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.484f, 8.0f)
                lineToRelative(3.011f, -3.996f)
                curveToRelative(0.574f, -0.762f, 0.666f, -1.766f, 0.24f, -2.619f)
                curveToRelative(-0.426f, -0.854f, -1.283f, -1.385f, -2.237f, -1.385f)
                horizontalLineTo(4.5f)
                curveTo(2.019f, 0.0f, 0.0f, 2.019f, 0.0f, 4.5f)
                verticalLineTo(22.5f)
                curveToRelative(0.034f, 1.972f, 2.967f, 1.971f, 3.0f, 0.0f)
                verticalLineToRelative(-6.5f)
                horizontalLineTo(21.498f)
                curveToRelative(0.954f, 0.0f, 1.812f, -0.53f, 2.237f, -1.385f)
                curveToRelative(0.426f, -0.854f, 0.334f, -1.857f, -0.24f, -2.619f)
                lineToRelative(-3.011f, -3.996f)
                close()
                moveTo(3.0f, 13.0f)
                verticalLineTo(4.5f)
                curveToRelative(0.0f, -0.827f, 0.673f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(15.995f)
                lineToRelative(-3.087f, 4.098f)
                curveToRelative(-0.402f, 0.534f, -0.402f, 1.271f, 0.0f, 1.805f)
                lineToRelative(3.087f, 4.098f)
                horizontalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _flagAlt!!
    }

private var _flagAlt: ImageVector? = null
