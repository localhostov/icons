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

public val Icons.Outline.ArrowDownSmallBig: ImageVector
    get() {
        if (_arrowDownSmallBig != null) {
            return _arrowDownSmallBig!!
        }
        _arrowDownSmallBig = Builder(name = "ArrowDownSmallBig", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5f, 17.5f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-4.5f, 4.5f)
                curveToRelative(-0.39f, 0.39f, -0.9f, 0.58f, -1.41f, 0.58f)
                reflectiveCurveToRelative(-1.02f, -0.19f, -1.41f, -0.58f)
                lineTo(0.09f, 18.91f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(3.5f, 3.5f)
                lineTo(4.96f, 0.0f)
                horizontalLineToRelative(2.0f)
                reflectiveCurveToRelative(0.04f, 21.0f, 0.04f, 21.0f)
                lineToRelative(3.5f, -3.5f)
                close()
                moveTo(14.0f, 13.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(10.0f)
                lineTo(14.0f, 23.0f)
                lineTo(14.0f, 13.0f)
                close()
                moveTo(16.0f, 21.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(24.0f, 1.0f)
                lineTo(24.0f, 9.0f)
                horizontalLineToRelative(-8.0f)
                lineTo(16.0f, 1.0f)
                horizontalLineToRelative(8.0f)
                close()
                moveTo(22.0f, 3.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(18.0f, 7.0f)
                horizontalLineToRelative(4.0f)
                lineTo(22.0f, 3.0f)
                close()
            }
        }
        .build()
        return _arrowDownSmallBig!!
    }

private var _arrowDownSmallBig: ImageVector? = null
