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
                moveTo(12.0f, 9.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.043f)
                curveToRelative(0.157f, -2.715f, 0.749f, -5.302f, 1.825f, -7.0f)
                lineTo(5.0f, 0.0f)
                curveTo(2.486f, 0.0f, 0.461f, 2.814f, 0.069f, 7.0f)
                horizontalLineToRelative(1.931f)
                verticalLineToRelative(2.0f)
                lineTo(0.008f, 9.0f)
                curveToRelative(0.141f, 4.732f, 2.283f, 8.0f, 4.992f, 8.0f)
                horizontalLineToRelative(10.868f)
                curveToRelative(-1.207f, -1.905f, -1.804f, -4.93f, -1.863f, -8.0f)
                horizontalLineToRelative(-2.005f)
                close()
                moveTo(6.0f, 9.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(10.0f, 9.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _toiletPaperUnder!!
    }

private var _toiletPaperUnder: ImageVector? = null
