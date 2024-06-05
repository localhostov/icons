package me.localx.icons.straight.bold

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

public val Icons.Bold.RectangleHistoryCirclePlus: ImageVector
    get() {
        if (_rectangleHistoryCirclePlus != null) {
            return _rectangleHistoryCirclePlus!!
        }
        _rectangleHistoryCirclePlus = Builder(name = "RectangleHistoryCirclePlus", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.721f, 24.0f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-10.5f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(14.5f)
                curveToRelative(-2.525f, 0.0f, -4.773f, 1.173f, -6.24f, 3.0f)
                lineTo(3.5f, 13.0f)
                curveToRelative(-0.276f, 0.0f, -0.5f, 0.225f, -0.5f, 0.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(7.587f)
                curveToRelative(0.471f, 1.162f, 1.208f, 2.185f, 2.134f, 3.0f)
                close()
                moveTo(24.0f, 18.0f)
                curveToRelative(0.0f, 3.314f, -2.686f, 6.0f, -6.0f, 6.0f)
                reflectiveCurveToRelative(-6.0f, -2.686f, -6.0f, -6.0f)
                reflectiveCurveToRelative(2.686f, -6.0f, 6.0f, -6.0f)
                reflectiveCurveToRelative(6.0f, 2.686f, 6.0f, 6.0f)
                close()
                moveTo(22.0f, 17.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(21.0f, 5.0f)
                lineTo(3.0f, 5.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(18.0f, 0.0f)
                lineTo(6.0f, 0.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(12.0f)
                lineTo(18.0f, 0.0f)
                close()
            }
        }
        .build()
        return _rectangleHistoryCirclePlus!!
    }

private var _rectangleHistoryCirclePlus: ImageVector? = null
