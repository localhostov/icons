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

public val Icons.Bold.ArrowDownSmallBig: ImageVector
    get() {
        if (_arrowDownSmallBig != null) {
            return _arrowDownSmallBig!!
        }
        _arrowDownSmallBig = Builder(name = "ArrowDownSmallBig", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.4f, 16.9f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(-4.25f, 4.25f)
                curveToRelative(-0.49f, 0.49f, -1.13f, 0.73f, -1.77f, 0.73f)
                reflectiveCurveToRelative(-1.28f, -0.24f, -1.77f, -0.73f)
                lineTo(0.45f, 19.07f)
                lineToRelative(2.1f, -2.14f)
                lineToRelative(2.45f, 2.4f)
                lineTo(5.0f, 0.0f)
                horizontalLineToRelative(3.0f)
                lineTo(8.0f, 19.29f)
                lineToRelative(2.4f, -2.4f)
                close()
                moveTo(14.0f, 23.0f)
                horizontalLineToRelative(10.0f)
                lineTo(24.0f, 13.0f)
                lineTo(14.0f, 13.0f)
                verticalLineToRelative(10.0f)
                close()
                moveTo(16.0f, 1.0f)
                lineTo(16.0f, 9.0f)
                horizontalLineToRelative(8.0f)
                lineTo(24.0f, 1.0f)
                horizontalLineToRelative(-8.0f)
                close()
            }
        }
        .build()
        return _arrowDownSmallBig!!
    }

private var _arrowDownSmallBig: ImageVector? = null
