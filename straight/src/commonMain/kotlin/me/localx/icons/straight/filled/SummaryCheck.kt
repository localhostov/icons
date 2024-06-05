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

public val Icons.Filled.SummaryCheck: ImageVector
    get() {
        if (_summaryCheck != null) {
            return _summaryCheck!!
        }
        _summaryCheck = Builder(name = "SummaryCheck", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 18.0f)
                curveToRelative(0.0f, -0.692f, 0.097f, -1.36f, 0.262f, -2.0f)
                lineTo(4.0f, 16.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(7.079f)
                curveToRelative(0.437f, -0.754f, 0.992f, -1.428f, 1.642f, -2.0f)
                lineTo(4.0f, 12.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(0.692f, 0.0f, 1.36f, 0.097f, 2.0f, 0.262f)
                lineTo(20.0f, 2.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(17.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(15.0f, 2.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(13.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(11.0f, 2.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(9.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(7.0f, 2.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(5.0f, 0.0f)
                lineTo(3.0f, 0.0f)
                lineTo(3.0f, 2.0f)
                lineTo(0.0f, 2.0f)
                lineTo(0.0f, 21.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                lineTo(12.721f, 24.0f)
                curveToRelative(-1.665f, -1.466f, -2.721f, -3.607f, -2.721f, -6.0f)
                close()
                moveTo(4.0f, 6.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(2.0f)
                lineTo(4.0f, 8.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(18.0f, 12.0f)
                curveToRelative(-3.314f, 0.0f, -6.0f, 2.686f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.686f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.686f, 6.0f, -6.0f)
                reflectiveCurveToRelative(-2.686f, -6.0f, -6.0f, -6.0f)
                close()
                moveTo(18.619f, 20.414f)
                curveToRelative(-0.378f, 0.378f, -0.88f, 0.586f, -1.414f, 0.586f)
                horizontalLineToRelative(-0.002f)
                curveToRelative(-0.534f, 0.0f, -1.036f, -0.209f, -1.413f, -0.587f)
                lineToRelative(-2.012f, -2.012f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(2.013f, 2.013f)
                lineToRelative(3.615f, -3.615f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-3.615f, 3.615f)
                close()
            }
        }
        .build()
        return _summaryCheck!!
    }

private var _summaryCheck: ImageVector? = null
