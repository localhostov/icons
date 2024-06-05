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

public val Icons.Filled.PenSquare: ImageVector
    get() {
        if (_penSquare != null) {
            return _penSquare!!
        }
        _penSquare = Builder(name = "PenSquare", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.25f, 11.664f)
                lineToRelative(-4.25f, 4.25f)
                curveToRelative(-0.373f, 0.372f, -0.888f, 0.586f, -1.414f, 0.586f)
                horizontalLineToRelative(-0.586f)
                verticalLineToRelative(-0.586f)
                curveToRelative(0.0f, -0.534f, 0.208f, -1.036f, 0.586f, -1.414f)
                lineToRelative(4.25f, -4.25f)
                lineToRelative(1.414f, 1.414f)
                close()
                moveTo(15.293f, 7.793f)
                lineToRelative(-1.043f, 1.043f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(1.043f, -1.043f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.024f, 0.0f, -1.414f)
                curveToRelative(-0.378f, -0.379f, -1.037f, -0.379f, -1.414f, 0.0f)
                close()
                moveTo(24.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 2.757f, -2.243f, 5.0f, -5.0f, 5.0f)
                lineTo(5.0f, 24.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                lineTo(0.0f, 5.0f)
                curveTo(0.0f, 2.243f, 2.243f, 0.0f, 5.0f, 0.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, 2.243f, 5.0f, 5.0f)
                close()
                moveTo(18.122f, 6.379f)
                curveToRelative(-1.134f, -1.133f, -3.11f, -1.133f, -4.243f, 0.0f)
                lineToRelative(-6.707f, 6.707f)
                curveToRelative(-0.755f, 0.755f, -1.172f, 1.76f, -1.172f, 2.828f)
                verticalLineToRelative(1.586f)
                curveToRelative(0.0f, 0.553f, 0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(1.586f)
                curveToRelative(1.068f, 0.0f, 2.073f, -0.416f, 2.828f, -1.172f)
                lineToRelative(6.707f, -6.707f)
                curveToRelative(1.17f, -1.17f, 1.17f, -3.072f, 0.0f, -4.242f)
                close()
            }
        }
        .build()
        return _penSquare!!
    }

private var _penSquare: ImageVector? = null
