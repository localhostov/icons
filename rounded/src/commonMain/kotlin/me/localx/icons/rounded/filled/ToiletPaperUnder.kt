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

public val Icons.Filled.ToiletPaperUnder: ImageVector
    get() {
        if (_toiletPaperUnder != null) {
            return _toiletPaperUnder!!
        }
        _toiletPaperUnder = Builder(name = "ToiletPaperUnder", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.975f, 22.634f)
                curveToRelative(-0.141f, 0.811f, -0.907f, 1.366f, -1.73f, 1.366f)
                horizontalLineToRelative(-11.245f)
                curveToRelative(-1.657f, 0.0f, -3.0f, -1.343f, -3.0f, -3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(11.504f)
                lineToRelative(-0.022f, -0.036f)
                curveToRelative(1.019f, -0.153f, 1.855f, -0.793f, 2.519f, -1.759f)
                verticalLineToRelative(0.795f)
                curveToRelative(0.0f, 1.264f, -0.219f, 2.345f, 0.887f, 2.787f)
                curveToRelative(0.741f, 0.296f, 1.232f, 1.02f, 1.088f, 1.847f)
                close()
                moveTo(15.868f, 0.0f)
                curveToRelative(-1.076f, 1.698f, -1.667f, 4.285f, -1.825f, 7.0f)
                horizontalLineToRelative(-1.043f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(1.005f)
                curveToRelative(0.058f, 3.07f, 0.655f, 6.095f, 1.863f, 8.0f)
                lineTo(5.0f, 17.0f)
                curveTo(2.291f, 17.0f, 0.149f, 13.732f, 0.008f, 9.0f)
                horizontalLineToRelative(0.992f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                lineTo(0.069f, 7.0f)
                curveTo(0.461f, 2.814f, 2.486f, 0.0f, 5.0f, 0.0f)
                horizontalLineToRelative(10.868f)
                close()
                moveTo(6.0f, 8.0f)
                curveToRelative(0.0f, -0.552f, -0.447f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                close()
                moveTo(10.5f, 8.0f)
                curveToRelative(0.0f, -0.552f, -0.447f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                close()
                moveTo(22.0f, 8.5f)
                curveToRelative(0.0f, 4.694f, -1.343f, 8.5f, -3.0f, 8.5f)
                reflectiveCurveToRelative(-3.0f, -3.806f, -3.0f, -8.5f)
                reflectiveCurveTo(17.343f, 0.0f, 19.0f, 0.0f)
                reflectiveCurveToRelative(3.0f, 3.806f, 3.0f, 8.5f)
                close()
                moveTo(20.0f, 8.5f)
                curveToRelative(0.0f, -1.105f, -0.448f, -2.0f, -1.0f, -2.0f)
                reflectiveCurveToRelative(-1.0f, 0.895f, -1.0f, 2.0f)
                reflectiveCurveToRelative(0.448f, 2.0f, 1.0f, 2.0f)
                reflectiveCurveToRelative(1.0f, -0.895f, 1.0f, -2.0f)
                close()
            }
        }
        .build()
        return _toiletPaperUnder!!
    }

private var _toiletPaperUnder: ImageVector? = null
