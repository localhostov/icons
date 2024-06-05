package me.localx.icons.rounded.outline

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

public val Icons.Outline.TrashSlash: ImageVector
    get() {
        if (_trashSlash != null) {
            return _trashSlash!!
        }
        _trashSlash = Builder(name = "TrashSlash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.707f, 22.293f)
                lineToRelative(-3.778f, -3.778f)
                lineToRelative(1.186f, -12.515f)
                horizontalLineToRelative(0.885f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-4.101f)
                curveToRelative(-0.465f, -2.279f, -2.485f, -4.0f, -4.899f, -4.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-2.414f, 0.0f, -4.435f, 1.721f, -4.899f, 4.0f)
                curveToRelative(0.0f, 0.0f, -0.656f, 0.001f, -0.683f, 0.004f)
                lineTo(1.707f, 0.293f)
                curveTo(1.316f, -0.098f, 0.684f, -0.098f, 0.293f, 0.293f)
                reflectiveCurveTo(-0.098f, 1.316f, 0.293f, 1.707f)
                lineToRelative(22.0f, 22.0f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.023f, 0.0f, -1.414f)
                close()
                moveTo(18.094f, 16.68f)
                lineTo(7.414f, 6.0f)
                horizontalLineToRelative(11.692f)
                lineToRelative(-1.012f, 10.68f)
                close()
                moveTo(11.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(1.304f, 0.0f, 2.415f, 0.836f, 2.828f, 2.0f)
                horizontalLineToRelative(-7.656f)
                curveToRelative(0.413f, -1.164f, 1.524f, -2.0f, 2.828f, -2.0f)
                close()
                moveTo(17.845f, 21.845f)
                curveToRelative(0.295f, 0.466f, 0.157f, 1.084f, -0.309f, 1.38f)
                curveToRelative(-0.8f, 0.507f, -1.725f, 0.775f, -2.675f, 0.775f)
                horizontalLineToRelative(-5.727f)
                curveToRelative(-2.589f, 0.0f, -4.729f, -1.943f, -4.977f, -4.521f)
                lineToRelative(-0.902f, -9.383f)
                curveToRelative(-0.053f, -0.55f, 0.35f, -1.038f, 0.9f, -1.091f)
                curveToRelative(0.562f, -0.068f, 1.038f, 0.35f, 1.091f, 0.899f)
                lineToRelative(0.902f, 9.383f)
                curveToRelative(0.148f, 1.547f, 1.432f, 2.713f, 2.986f, 2.713f)
                horizontalLineToRelative(5.727f)
                curveToRelative(0.57f, 0.0f, 1.125f, -0.161f, 1.604f, -0.465f)
                curveToRelative(0.467f, -0.297f, 1.085f, -0.157f, 1.38f, 0.31f)
                close()
            }
        }
        .build()
        return _trashSlash!!
    }

private var _trashSlash: ImageVector? = null
