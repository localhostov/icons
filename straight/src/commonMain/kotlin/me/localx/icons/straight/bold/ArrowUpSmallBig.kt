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

public val Icons.Bold.ArrowUpSmallBig: ImageVector
    get() {
        if (_arrowUpSmallBig != null) {
            return _arrowUpSmallBig!!
        }
        _arrowUpSmallBig = Builder(name = "ArrowUpSmallBig", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.27f, 0.73f)
                lineToRelative(4.25f, 4.25f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(-2.4f, -2.4f)
                lineTo(8.0f, 24.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(5.0f, 4.67f)
                lineToRelative(-2.45f, 2.4f)
                lineTo(0.45f, 4.93f)
                lineTo(4.74f, 0.72f)
                curveToRelative(0.96f, -0.96f, 2.55f, -0.96f, 3.52f, 0.01f)
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
        return _arrowUpSmallBig!!
    }

private var _arrowUpSmallBig: ImageVector? = null
