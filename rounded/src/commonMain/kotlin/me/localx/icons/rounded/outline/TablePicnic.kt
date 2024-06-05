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

public val Icons.Outline.TablePicnic: ImageVector
    get() {
        if (_tablePicnic != null) {
            return _tablePicnic!!
        }
        _tablePicnic = Builder(name = "TablePicnic", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.916f, 19.6f)
                lineToRelative(-2.45f, -5.6f)
                horizontalLineToRelative(1.534f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-2.409f)
                lineToRelative(-3.062f, -7.0f)
                horizontalLineToRelative(2.471f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                horizontalLineTo(4.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(2.471f)
                lineToRelative(-3.062f, 7.0f)
                horizontalLineTo(1.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(1.534f)
                lineTo(0.084f, 19.6f)
                curveToRelative(-0.222f, 0.506f, 0.009f, 1.095f, 0.516f, 1.316f)
                curveToRelative(0.13f, 0.058f, 0.266f, 0.084f, 0.399f, 0.084f)
                curveToRelative(0.386f, 0.0f, 0.753f, -0.224f, 0.917f, -0.6f)
                lineToRelative(2.8f, -6.4f)
                horizontalLineToRelative(14.568f)
                lineToRelative(2.8f, 6.4f)
                curveToRelative(0.164f, 0.376f, 0.531f, 0.6f, 0.917f, 0.6f)
                curveToRelative(0.134f, 0.0f, 0.27f, -0.026f, 0.399f, -0.084f)
                curveToRelative(0.507f, -0.222f, 0.737f, -0.811f, 0.516f, -1.316f)
                close()
                moveTo(5.591f, 12.0f)
                lineToRelative(3.062f, -7.0f)
                horizontalLineToRelative(6.693f)
                lineToRelative(3.062f, 7.0f)
                horizontalLineTo(5.591f)
                close()
            }
        }
        .build()
        return _tablePicnic!!
    }

private var _tablePicnic: ImageVector? = null
