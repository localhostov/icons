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

public val Icons.Outline.TrashXmark: ImageVector
    get() {
        if (_trashXmark != null) {
            return _trashXmark!!
        }
        _trashXmark = Builder(name = "TrashXmark", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.707f, 11.707f)
                lineToRelative(-2.293f, 2.293f)
                lineToRelative(2.293f, 2.293f)
                curveToRelative(0.391f, 0.391f, 0.391f, 1.023f, 0.0f, 1.414f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                lineToRelative(-2.293f, -2.293f)
                lineToRelative(-2.293f, 2.293f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.023f, 0.0f, -1.414f)
                lineToRelative(2.293f, -2.293f)
                lineToRelative(-2.293f, -2.293f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.023f, 0.0f, -1.414f)
                reflectiveCurveToRelative(1.023f, -0.391f, 1.414f, 0.0f)
                lineToRelative(2.293f, 2.293f)
                lineToRelative(2.293f, -2.293f)
                curveToRelative(0.391f, -0.391f, 1.023f, -0.391f, 1.414f, 0.0f)
                reflectiveCurveToRelative(0.391f, 1.023f, 0.0f, 1.414f)
                close()
                moveTo(23.0f, 5.0f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-0.885f)
                lineToRelative(-1.276f, 13.472f)
                curveToRelative(-0.245f, 2.581f, -2.385f, 4.528f, -4.978f, 4.528f)
                horizontalLineToRelative(-5.727f)
                curveToRelative(-2.589f, 0.0f, -4.729f, -1.943f, -4.977f, -4.521f)
                lineToRelative(-1.296f, -13.479f)
                horizontalLineToRelative(-0.86f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(4.101f)
                curveToRelative(0.465f, -2.279f, 2.485f, -4.0f, 4.899f, -4.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(2.414f, 0.0f, 4.435f, 1.721f, 4.899f, 4.0f)
                horizontalLineToRelative(4.101f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                close()
                moveTo(8.172f, 4.0f)
                horizontalLineToRelative(7.656f)
                curveToRelative(-0.413f, -1.164f, -1.524f, -2.0f, -2.828f, -2.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-1.304f, 0.0f, -2.415f, 0.836f, -2.828f, 2.0f)
                close()
                moveTo(19.106f, 6.0f)
                lineTo(4.87f, 6.0f)
                lineToRelative(1.278f, 13.287f)
                curveToRelative(0.148f, 1.547f, 1.432f, 2.713f, 2.986f, 2.713f)
                horizontalLineToRelative(5.727f)
                curveToRelative(1.556f, 0.0f, 2.84f, -1.168f, 2.987f, -2.718f)
                lineToRelative(1.258f, -13.282f)
                close()
            }
        }
        .build()
        return _trashXmark!!
    }

private var _trashXmark: ImageVector? = null
