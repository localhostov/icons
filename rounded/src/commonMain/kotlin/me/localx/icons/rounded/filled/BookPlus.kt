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

public val Icons.Filled.BookPlus: ImageVector
    get() {
        if (_bookPlus != null) {
            return _bookPlus!!
        }
        _bookPlus = Builder(name = "BookPlus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.0f, 12.0f)
                curveToRelative(-3.314f, 0.0f, -6.0f, 2.686f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.686f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.686f, 6.0f, -6.0f)
                reflectiveCurveToRelative(-2.686f, -6.0f, -6.0f, -6.0f)
                close()
                moveTo(20.5f, 19.0f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.447f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -0.553f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.447f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(3.0f, 16.0f)
                horizontalLineToRelative(1.0f)
                lineTo(4.0f, 0.1f)
                curveTo(1.672f, 0.575f, 0.0f, 2.624f, 0.0f, 5.0f)
                verticalLineToRelative(12.025f)
                curveToRelative(0.699f, -0.527f, 1.525f, -0.86f, 2.395f, -0.964f)
                curveToRelative(0.199f, -0.041f, 0.402f, -0.061f, 0.605f, -0.061f)
                close()
                moveTo(10.263f, 16.0f)
                horizontalLineToRelative(-4.263f)
                lineTo(6.0f, 0.0f)
                horizontalLineToRelative(9.0f)
                curveToRelative(2.761f, 0.0f, 5.0f, 2.239f, 5.0f, 5.0f)
                verticalLineToRelative(5.263f)
                curveToRelative(-0.641f, -0.166f, -1.308f, -0.263f, -2.0f, -0.263f)
                curveToRelative(-3.719f, 0.0f, -6.845f, 2.555f, -7.737f, 6.0f)
                close()
                moveTo(12.726f, 24.0f)
                lineTo(3.0f, 24.0f)
                curveToRelative(-1.657f, 0.0f, -3.0f, -1.343f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.343f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.0f, 2.39f, 1.059f, 4.533f, 2.726f, 6.0f)
                close()
            }
        }
        .build()
        return _bookPlus!!
    }

private var _bookPlus: ImageVector? = null
