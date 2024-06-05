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

public val Icons.Bold.Ad: ImageVector
    get() {
        if (_ad != null) {
            return _ad!!
        }
        _ad = Builder(name = "Ad", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.5f, 12.459f)
                lineToRelative(0.971f, 2.541f)
                horizontalLineToRelative(-1.942f)
                lineToRelative(0.971f, -2.541f)
                close()
                moveTo(17.0f, 14.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, 0.449f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.449f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.449f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.449f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(24.0f, 5.5f)
                lineTo(24.0f, 22.0f)
                lineTo(0.0f, 22.0f)
                lineTo(0.0f, 5.5f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                lineTo(20.5f, 2.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(13.186f, 19.0f)
                lineTo(8.0f, 5.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(1.814f, 19.0f)
                horizontalLineToRelative(3.186f)
                lineToRelative(0.382f, -1.0f)
                horizontalLineToRelative(4.236f)
                lineToRelative(0.382f, 1.0f)
                horizontalLineToRelative(3.186f)
                close()
                moveTo(21.0f, 5.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(6.142f)
                curveToRelative(-0.322f, -0.084f, -0.653f, -0.142f, -1.0f, -0.142f)
                curveToRelative(-2.206f, 0.0f, -4.0f, 1.794f, -4.0f, 4.0f)
                reflectiveCurveToRelative(1.794f, 4.0f, 4.0f, 4.0f)
                horizontalLineToRelative(4.0f)
                lineTo(21.0f, 5.0f)
                close()
            }
        }
        .build()
        return _ad!!
    }

private var _ad: ImageVector? = null
