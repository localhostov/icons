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

public val Icons.Filled.PenSlash: ImageVector
    get() {
        if (_penSlash != null) {
            return _penSlash!!
        }
        _penSlash = Builder(name = "PenSlash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.707f, 22.293f)
                curveToRelative(0.391f, 0.391f, 0.391f, 1.023f, 0.0f, 1.414f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                lineTo(0.293f, 1.707f)
                curveTo(-0.098f, 1.316f, -0.098f, 0.684f, 0.293f, 0.293f)
                reflectiveCurveTo(1.316f, -0.098f, 1.707f, 0.293f)
                lineToRelative(9.145f, 9.145f)
                lineToRelative(3.749f, -3.749f)
                lineToRelative(3.71f, 3.71f)
                lineToRelative(-3.749f, 3.749f)
                lineToRelative(9.145f, 9.145f)
                close()
                moveTo(23.232f, 4.478f)
                curveToRelative(1.024f, -1.024f, 1.024f, -2.685f, 0.0f, -3.71f)
                curveToRelative(-1.024f, -1.024f, -2.685f, -1.024f, -3.71f, 0.0f)
                lineToRelative(-3.507f, 3.507f)
                lineToRelative(3.71f, 3.71f)
                lineToRelative(3.507f, -3.507f)
                close()
                moveTo(1.172f, 19.119f)
                curveToRelative(-0.75f, 0.75f, -1.172f, 1.768f, -1.172f, 2.828f)
                verticalLineToRelative(2.053f)
                horizontalLineToRelative(2.053f)
                curveToRelative(1.061f, 0.0f, 2.078f, -0.421f, 2.828f, -1.172f)
                lineToRelative(6.844f, -6.844f)
                lineToRelative(-3.71f, -3.71f)
                lineToRelative(-6.844f, 6.844f)
                close()
            }
        }
        .build()
        return _penSlash!!
    }

private var _penSlash: ImageVector? = null
