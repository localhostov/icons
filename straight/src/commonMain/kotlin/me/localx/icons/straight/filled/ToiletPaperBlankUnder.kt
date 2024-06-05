package me.localx.icons.straight.filled

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

public val Icons.Filled.ToiletPaperBlankUnder: ImageVector
    get() {
        if (_toiletPaperBlankUnder != null) {
            return _toiletPaperBlankUnder!!
        }
        _toiletPaperBlankUnder = Builder(name = "ToiletPaperBlankUnder", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 0.0f)
                curveToRelative(-1.657f, 0.0f, -3.0f, 3.806f, -3.0f, 8.5f)
                reflectiveCurveToRelative(1.343f, 8.5f, 3.0f, 8.5f)
                reflectiveCurveToRelative(3.0f, -3.806f, 3.0f, -8.5f)
                reflectiveCurveTo(20.657f, 0.0f, 19.0f, 0.0f)
                close()
                moveTo(19.0f, 10.5f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.895f, -1.0f, -2.0f)
                reflectiveCurveToRelative(0.448f, -2.0f, 1.0f, -2.0f)
                reflectiveCurveToRelative(1.0f, 0.895f, 1.0f, 2.0f)
                reflectiveCurveToRelative(-0.448f, 2.0f, -1.0f, 2.0f)
                close()
                moveTo(0.0f, 8.5f)
                curveTo(0.0f, 3.5f, 2.196f, 0.0f, 5.0f, 0.0f)
                horizontalLineToRelative(10.868f)
                curveToRelative(-1.273f, 2.009f, -1.868f, 5.262f, -1.868f, 8.5f)
                reflectiveCurveToRelative(0.595f, 6.491f, 1.868f, 8.5f)
                lineTo(5.0f, 17.0f)
                curveToRelative(-2.804f, 0.0f, -5.0f, -3.5f, -5.0f, -8.5f)
                close()
                moveTo(24.0f, 22.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-13.0f)
                curveToRelative(-1.657f, 0.0f, -3.0f, -1.343f, -3.0f, -3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(11.0f)
                curveToRelative(1.241f, 0.0f, 2.235f, -0.68f, 3.0f, -1.794f)
                verticalLineToRelative(2.794f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _toiletPaperBlankUnder!!
    }

private var _toiletPaperBlankUnder: ImageVector? = null
