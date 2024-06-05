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

public val Icons.Outline.RadioAlt: ImageVector
    get() {
        if (_radioAlt != null) {
            return _radioAlt!!
        }
        _radioAlt = Builder(name = "RadioAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 6.0f)
                horizontalLineToRelative(-8.954f)
                lineTo(21.338f, 1.941f)
                curveToRelative(0.521f, -0.187f, 0.79f, -0.759f, 0.604f, -1.279f)
                curveToRelative(-0.188f, -0.52f, -0.762f, -0.793f, -1.279f, -0.603f)
                lineTo(3.447f, 6.247f)
                curveToRelative(-1.999f, 0.655f, -3.447f, 2.538f, -3.447f, 4.753f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                verticalLineToRelative(-8.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(5.0f, 8.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.304f, 0.0f, 2.415f, 0.836f, 2.828f, 2.0f)
                lineTo(2.172f, 10.0f)
                curveToRelative(0.292f, -0.823f, 0.828f, -2.0f, 2.828f, -2.0f)
                close()
                moveTo(19.0f, 22.0f)
                lineTo(5.0f, 22.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                close()
                moveTo(11.0f, 15.0f)
                curveToRelative(0.0f, 0.552f, -0.447f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.447f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                close()
                moveTo(11.0f, 19.0f)
                curveToRelative(0.0f, 0.552f, -0.447f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.447f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                close()
                moveTo(16.5f, 13.5f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(16.5f, 18.5f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.673f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.673f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.673f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _radioAlt!!
    }

private var _radioAlt: ImageVector? = null
