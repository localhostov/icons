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

public val Icons.Bold.ArrowUpSquareTriangle: ImageVector
    get() {
        if (_arrowUpSquareTriangle != null) {
            return _arrowUpSquareTriangle!!
        }
        _arrowUpSquareTriangle = Builder(name = "ArrowUpSquareTriangle", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 10.0f)
                lineTo(14.0f, 10.0f)
                lineTo(14.0f, 1.0f)
                horizontalLineToRelative(9.0f)
                lineTo(23.0f, 10.0f)
                close()
                moveTo(18.5f, 14.0f)
                lineToRelative(-5.5f, 9.0f)
                horizontalLineToRelative(11.0f)
                lineToRelative(-5.5f, -9.0f)
                close()
                moveTo(10.914f, 7.604f)
                lineToRelative(-2.896f, -2.896f)
                lineTo(8.018f, 24.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(5.018f, 4.707f)
                lineToRelative(-2.896f, 2.896f)
                lineTo(0.0f, 5.482f)
                lineTo(4.75f, 0.732f)
                curveToRelative(0.488f, -0.487f, 1.127f, -0.732f, 1.768f, -0.732f)
                reflectiveCurveToRelative(1.28f, 0.244f, 1.768f, 0.731f)
                lineToRelative(4.75f, 4.75f)
                lineToRelative(-2.121f, 2.121f)
                verticalLineToRelative(0.002f)
                close()
            }
        }
        .build()
        return _arrowUpSquareTriangle!!
    }

private var _arrowUpSquareTriangle: ImageVector? = null
