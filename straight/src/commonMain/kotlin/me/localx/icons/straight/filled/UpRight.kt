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

public val Icons.Filled.UpRight: ImageVector
    get() {
        if (_upRight != null) {
            return _upRight!!
        }
        _upRight = Builder(name = "UpRight", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.84f, 23.23f)
                lineTo(0.77f, 16.16f)
                lineTo(10.96f, 5.97f)
                lineTo(6.02f, 0.99f)
                horizontalLineToRelative(13.98f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, 0.0f)
                curveToRelative(0.8f, 0.0f, 1.55f, 0.31f, 2.12f, 0.88f)
                curveToRelative(0.57f, 0.57f, 0.88f, 1.32f, 0.88f, 2.13f)
                verticalLineToRelative(13.96f)
                reflectiveCurveToRelative(-4.97f, -4.92f, -4.97f, -4.92f)
                lineTo(7.84f, 23.23f)
                close()
            }
        }
        .build()
        return _upRight!!
    }

private var _upRight: ImageVector? = null
