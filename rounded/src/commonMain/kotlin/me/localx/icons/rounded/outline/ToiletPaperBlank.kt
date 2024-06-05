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

public val Icons.Outline.ToiletPaperBlank: ImageVector
    get() {
        if (_toiletPaperBlank != null) {
            return _toiletPaperBlank!!
        }
        _toiletPaperBlank = Builder(name = "ToiletPaperBlank", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 0.0f)
                lineTo(8.0f, 0.0f)
                curveTo(5.196f, 0.0f, 3.0f, 3.294f, 3.0f, 7.5f)
                verticalLineToRelative(9.5f)
                curveToRelative(0.0f, 0.823f, -0.494f, 1.553f, -1.259f, 1.858f)
                curveToRelative(-1.058f, 0.422f, -1.741f, 1.399f, -1.741f, 2.488f)
                curveToRelative(0.0f, 1.463f, 1.19f, 2.653f, 2.653f, 2.653f)
                lineTo(11.0f, 23.999f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(2.804f, 0.0f, 5.0f, -3.733f, 5.0f, -8.5f)
                reflectiveCurveTo(21.804f, 0.0f, 19.0f, 0.0f)
                close()
                moveTo(14.0f, 19.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                lineTo(2.653f, 22.0f)
                curveToRelative(-0.36f, 0.0f, -0.653f, -0.293f, -0.653f, -0.653f)
                curveToRelative(0.0f, -0.323f, 0.249f, -0.538f, 0.483f, -0.631f)
                curveToRelative(1.529f, -0.611f, 2.517f, -2.07f, 2.517f, -3.716f)
                lineTo(5.0f, 7.5f)
                curveToRelative(0.0f, -3.241f, 1.581f, -5.5f, 3.0f, -5.5f)
                horizontalLineToRelative(7.745f)
                curveToRelative(-1.073f, 1.547f, -1.745f, 3.866f, -1.745f, 6.5f)
                verticalLineToRelative(10.5f)
                close()
                moveTo(19.0f, 15.0f)
                curveToRelative(-1.419f, 0.0f, -3.0f, -2.67f, -3.0f, -6.5f)
                reflectiveCurveToRelative(1.581f, -6.5f, 3.0f, -6.5f)
                reflectiveCurveToRelative(3.0f, 2.67f, 3.0f, 6.5f)
                reflectiveCurveToRelative(-1.581f, 6.5f, -3.0f, 6.5f)
                close()
                moveTo(20.0f, 8.5f)
                curveToRelative(0.0f, 0.828f, -0.448f, 1.5f, -1.0f, 1.5f)
                reflectiveCurveToRelative(-1.0f, -0.672f, -1.0f, -1.5f)
                reflectiveCurveToRelative(0.448f, -1.5f, 1.0f, -1.5f)
                reflectiveCurveToRelative(1.0f, 0.672f, 1.0f, 1.5f)
                close()
            }
        }
        .build()
        return _toiletPaperBlank!!
    }

private var _toiletPaperBlank: ImageVector? = null
