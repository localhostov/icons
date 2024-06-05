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

public val Icons.Filled.Tap: ImageVector
    get() {
        if (_tap != null) {
            return _tap!!
        }
        _tap = Builder(name = "Tap", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.062f, 24.0f)
                lineToRelative(-5.416f, -5.588f)
                curveToRelative(-0.713f, -0.715f, -0.88f, -1.87f, -0.276f, -2.68f)
                curveToRelative(0.63f, -0.845f, 1.741f, -1.031f, 2.584f, -0.561f)
                curveToRelative(0.201f, 0.131f, 0.353f, 0.245f, 0.441f, 0.333f)
                lineToRelative(2.605f, 2.65f)
                verticalLineTo(5.5f)
                curveToRelative(0.0f, -0.911f, 0.812f, -1.632f, 1.752f, -1.479f)
                curveToRelative(0.737f, 0.12f, 1.248f, 0.813f, 1.248f, 1.56f)
                verticalLineToRelative(6.92f)
                lineToRelative(12.0f, 3.0f)
                verticalLineToRelative(8.5f)
                horizontalLineTo(7.062f)
                close()
                moveTo(8.5f, 0.0f)
                curveTo(4.916f, 0.0f, 2.0f, 2.916f, 2.0f, 6.5f)
                curveToRelative(0.0f, 2.295f, 1.199f, 4.312f, 3.0f, 5.468f)
                verticalLineToRelative(-2.675f)
                curveToRelative(-0.616f, -0.77f, -1.0f, -1.733f, -1.0f, -2.794f)
                curveToRelative(0.0f, -2.481f, 2.019f, -4.5f, 4.5f, -4.5f)
                reflectiveCurveToRelative(4.5f, 2.019f, 4.5f, 4.5f)
                curveToRelative(0.0f, 1.061f, -0.384f, 2.024f, -1.0f, 2.794f)
                verticalLineToRelative(2.675f)
                curveToRelative(1.801f, -1.157f, 3.0f, -3.173f, 3.0f, -5.468f)
                curveToRelative(0.0f, -3.584f, -2.916f, -6.5f, -6.5f, -6.5f)
                close()
            }
        }
        .build()
        return _tap!!
    }

private var _tap: ImageVector? = null
