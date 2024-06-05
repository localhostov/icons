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
                lineTo(7.0f, 0.0f)
                curveTo(4.196f, 0.0f, 2.0f, 3.294f, 2.0f, 7.5f)
                verticalLineToRelative(12.5f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                verticalLineToRelative(2.0f)
                lineTo(12.0f, 24.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, -1.794f, 4.0f, -4.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(2.804f, 0.0f, 5.0f, -3.733f, 5.0f, -8.5f)
                reflectiveCurveTo(21.804f, 0.0f, 19.0f, 0.0f)
                close()
                moveTo(14.0f, 20.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                lineTo(3.463f, 22.0f)
                curveToRelative(0.342f, -0.589f, 0.537f, -1.272f, 0.537f, -2.0f)
                lineTo(4.0f, 7.5f)
                curveToRelative(0.0f, -3.241f, 1.581f, -5.5f, 3.0f, -5.5f)
                lineTo(15.745f, 2.0f)
                curveToRelative(-1.073f, 1.547f, -1.745f, 3.866f, -1.745f, 6.5f)
                verticalLineToRelative(11.5f)
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
