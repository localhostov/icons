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

public val Icons.Bold.ArrowAltSquareUp: ImageVector
    get() {
        if (_arrowAltSquareUp != null) {
            return _arrowAltSquareUp!!
        }
        _arrowAltSquareUp = Builder(name = "ArrowAltSquareUp", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.74f, 10.475f)
                curveToRelative(0.559f, 0.566f, 0.158f, 1.525f, -0.638f, 1.525f)
                horizontalLineToRelative(-2.602f)
                verticalLineToRelative(4.5f)
                curveToRelative(0.0f, 0.829f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.671f, -1.5f, -1.5f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(-2.602f)
                curveToRelative(-0.795f, 0.0f, -1.196f, -0.959f, -0.638f, -1.525f)
                lineToRelative(4.188f, -4.243f)
                curveToRelative(0.304f, -0.308f, 0.8f, -0.308f, 1.104f, 0.0f)
                lineToRelative(4.188f, 4.243f)
                close()
                moveTo(24.0f, 5.5f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 3.033f, -2.468f, 5.5f, -5.5f, 5.5f)
                lineTo(5.5f, 24.0f)
                curveToRelative(-3.032f, 0.0f, -5.5f, -2.467f, -5.5f, -5.5f)
                lineTo(0.0f, 5.5f)
                curveTo(0.0f, 2.467f, 2.468f, 0.0f, 5.5f, 0.0f)
                horizontalLineToRelative(13.0f)
                curveToRelative(3.032f, 0.0f, 5.5f, 2.467f, 5.5f, 5.5f)
                close()
                moveTo(21.0f, 5.5f)
                curveToRelative(0.0f, -1.378f, -1.121f, -2.5f, -2.5f, -2.5f)
                lineTo(5.5f, 3.0f)
                curveToRelative(-1.379f, 0.0f, -2.5f, 1.122f, -2.5f, 2.5f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 1.378f, 1.121f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(1.379f, 0.0f, 2.5f, -1.122f, 2.5f, -2.5f)
                lineTo(21.0f, 5.5f)
                close()
            }
        }
        .build()
        return _arrowAltSquareUp!!
    }

private var _arrowAltSquareUp: ImageVector? = null
