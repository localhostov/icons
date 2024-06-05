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

public val Icons.Outline.ArrowUpSmallBig: ImageVector
    get() {
        if (_arrowUpSmallBig != null) {
            return _arrowUpSmallBig!!
        }
        _arrowUpSmallBig = Builder(name = "ArrowUpSmallBig", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.37f, 0.59f)
                lineToRelative(4.5f, 4.5f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-3.5f, -3.5f)
                lineTo(6.96f, 24.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(4.96f, 3.0f)
                lineTo(1.46f, 6.5f)
                lineTo(0.04f, 5.09f)
                lineTo(4.54f, 0.59f)
                curveToRelative(0.78f, -0.78f, 2.05f, -0.78f, 2.83f, 0.0f)
                close()
                moveTo(23.96f, 1.0f)
                lineTo(23.96f, 9.0f)
                lineTo(15.96f, 9.0f)
                lineTo(15.96f, 1.0f)
                horizontalLineToRelative(8.0f)
                close()
                moveTo(21.96f, 3.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(17.96f, 7.0f)
                horizontalLineToRelative(4.0f)
                lineTo(21.96f, 3.0f)
                close()
                moveTo(13.96f, 13.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(10.0f)
                lineTo(13.96f, 23.0f)
                lineTo(13.96f, 13.0f)
                close()
                moveTo(15.96f, 21.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(6.0f)
                close()
            }
        }
        .build()
        return _arrowUpSmallBig!!
    }

private var _arrowUpSmallBig: ImageVector? = null
