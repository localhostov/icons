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

public val Icons.Outline.PencilPaintbrush: ImageVector
    get() {
        if (_pencilPaintbrush != null) {
            return _pencilPaintbrush!!
        }
        _pencilPaintbrush = Builder(name = "PencilPaintbrush", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.912f, 6.031f)
                curveTo(0.252f, 5.27f, -0.059f, 4.336f, 0.009f, 3.37f)
                curveToRelative(0.069f, -0.967f, 0.509f, -1.847f, 1.24f, -2.48f)
                curveTo(1.981f, 0.256f, 2.909f, -0.052f, 3.881f, 0.015f)
                curveToRelative(0.965f, 0.069f, 1.846f, 0.509f, 2.479f, 1.24f)
                lineToRelative(3.843f, 4.574f)
                lineToRelative(-1.419f, 1.419f)
                lineToRelative(-3.945f, -4.696f)
                curveToRelative(-0.273f, -0.315f, -0.667f, -0.512f, -1.1f, -0.542f)
                curveToRelative(-0.438f, -0.028f, -0.853f, 0.107f, -1.179f, 0.39f)
                curveToRelative(-0.328f, 0.284f, -0.525f, 0.679f, -0.556f, 1.111f)
                curveToRelative(-0.031f, 0.434f, 0.108f, 0.852f, 0.391f, 1.178f)
                lineToRelative(4.338f, 4.609f)
                lineToRelative(-1.414f, 1.414f)
                lineTo(0.912f, 6.031f)
                close()
                moveTo(24.047f, 24.0f)
                horizontalLineToRelative(-6.352f)
                curveToRelative(-2.168f, 0.0f, -4.688f, -1.966f, -4.688f, -4.5f)
                curveToRelative(0.0f, -2.355f, 2.145f, -4.5f, 4.5f, -4.5f)
                curveToRelative(4.276f, 0.0f, 5.643f, 5.435f, 6.227f, 7.756f)
                lineToRelative(0.313f, 1.244f)
                close()
                moveTo(21.46f, 22.0f)
                curveToRelative(-0.766f, -2.637f, -1.881f, -5.0f, -3.953f, -5.0f)
                curveToRelative(-1.132f, 0.0f, -2.5f, 1.115f, -2.5f, 2.5f)
                curveToRelative(0.0f, 1.323f, 1.503f, 2.5f, 2.688f, 2.5f)
                horizontalLineToRelative(3.764f)
                close()
                moveTo(22.947f, 6.184f)
                lineTo(5.13f, 24.0f)
                lineTo(0.007f, 24.0f)
                verticalLineToRelative(-5.124f)
                lineTo(17.823f, 1.06f)
                curveToRelative(1.367f, -1.367f, 3.758f, -1.366f, 5.123f, 0.0f)
                horizontalLineToRelative(0.001f)
                curveToRelative(0.683f, 0.685f, 1.059f, 1.594f, 1.059f, 2.562f)
                reflectiveCurveToRelative(-0.376f, 1.879f, -1.061f, 2.562f)
                close()
                moveTo(17.545f, 8.757f)
                lineToRelative(-2.296f, -2.296f)
                lineTo(2.007f, 19.705f)
                verticalLineToRelative(2.295f)
                horizontalLineToRelative(2.295f)
                lineToRelative(13.242f, -13.242f)
                close()
                moveTo(22.007f, 3.622f)
                curveToRelative(0.0f, -0.434f, -0.168f, -0.842f, -0.474f, -1.148f)
                curveToRelative(-0.612f, -0.611f, -1.684f, -0.611f, -2.295f, 0.0f)
                lineToRelative(-2.574f, 2.574f)
                lineToRelative(2.296f, 2.296f)
                lineToRelative(2.574f, -2.574f)
                curveToRelative(0.306f, -0.306f, 0.474f, -0.713f, 0.474f, -1.147f)
                close()
            }
        }
        .build()
        return _pencilPaintbrush!!
    }

private var _pencilPaintbrush: ImageVector? = null
