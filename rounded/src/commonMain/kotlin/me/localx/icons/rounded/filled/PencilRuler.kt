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

public val Icons.Filled.PencilRuler: ImageVector
    get() {
        if (_pencilRuler != null) {
            return _pencilRuler!!
        }
        _pencilRuler = Builder(name = "PencilRuler", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.515f, 5.776f)
                lineToRelative(3.71f, 3.71f)
                lineTo(4.881f, 22.828f)
                curveToRelative(-0.75f, 0.75f, -1.768f, 1.172f, -2.828f, 1.172f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-2.053f)
                curveToRelative(0.0f, -1.061f, 0.421f, -2.078f, 1.172f, -2.828f)
                lineTo(14.515f, 5.776f)
                close()
                moveTo(23.145f, 0.855f)
                curveToRelative(-1.024f, -1.024f, -2.685f, -1.024f, -3.71f, 0.0f)
                lineToRelative(-3.507f, 3.507f)
                lineToRelative(3.71f, 3.71f)
                lineToRelative(3.507f, -3.507f)
                curveToRelative(1.024f, -1.024f, 1.024f, -2.685f, 0.0f, -3.71f)
                close()
                moveTo(12.266f, 5.196f)
                lineToRelative(-1.5f, -1.5f)
                lineToRelative(-2.253f, 2.253f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.023f, 0.0f, -1.414f)
                lineToRelative(2.253f, -2.253f)
                lineToRelative(-1.256f, -1.256f)
                curveTo(6.729f, -0.342f, 4.513f, -0.342f, 3.146f, 1.025f)
                lineTo(1.025f, 3.146f)
                curveToRelative(-1.367f, 1.367f, -1.367f, 3.583f, 0.0f, 4.95f)
                lineToRelative(4.171f, 4.171f)
                lineToRelative(7.071f, -7.071f)
                close()
                moveTo(11.733f, 18.805f)
                lineToRelative(4.171f, 4.171f)
                curveToRelative(1.367f, 1.367f, 3.583f, 1.367f, 4.95f, 0.0f)
                lineToRelative(2.121f, -2.121f)
                curveToRelative(1.367f, -1.367f, 1.367f, -3.583f, 0.0f, -4.95f)
                lineToRelative(-1.256f, -1.256f)
                lineToRelative(-2.253f, 2.253f)
                curveToRelative(-0.391f, 0.391f, -1.023f, 0.391f, -1.414f, 0.0f)
                curveToRelative(-0.195f, -0.195f, -0.293f, -0.451f, -0.293f, -0.707f)
                reflectiveCurveToRelative(0.098f, -0.512f, 0.293f, -0.707f)
                lineToRelative(2.253f, -2.253f)
                lineToRelative(-1.5f, -1.5f)
                lineToRelative(-7.071f, 7.071f)
                close()
            }
        }
        .build()
        return _pencilRuler!!
    }

private var _pencilRuler: ImageVector? = null
