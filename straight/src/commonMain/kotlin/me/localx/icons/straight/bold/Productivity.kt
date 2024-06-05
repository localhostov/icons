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

public val Icons.Bold.Productivity: ImageVector
    get() {
        if (_productivity != null) {
            return _productivity!!
        }
        _productivity = Builder(name = "Productivity", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 12.0f)
                curveToRelative(0.0f, -1.285f, -0.252f, -2.51f, -0.696f, -3.64f)
                lineToRelative(1.838f, -1.061f)
                lineToRelative(-1.5f, -2.598f)
                lineToRelative(-1.839f, 1.062f)
                curveToRelative(-1.537f, -1.919f, -3.765f, -3.253f, -6.303f, -3.638f)
                lineTo(13.5f, 0.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.125f)
                curveToRelative(-2.539f, 0.385f, -4.766f, 1.719f, -6.303f, 3.638f)
                lineToRelative(-1.839f, -1.062f)
                lineToRelative(-1.5f, 2.598f)
                lineToRelative(1.839f, 1.061f)
                curveToRelative(-0.444f, 1.13f, -0.696f, 2.355f, -0.696f, 3.64f)
                reflectiveCurveToRelative(0.252f, 2.51f, 0.696f, 3.64f)
                lineToRelative(-1.839f, 1.061f)
                lineToRelative(1.5f, 2.598f)
                lineToRelative(1.839f, -1.062f)
                curveToRelative(1.537f, 1.919f, 3.765f, 3.253f, 6.303f, 3.638f)
                verticalLineToRelative(2.125f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.125f)
                curveToRelative(2.539f, -0.385f, 4.766f, -1.719f, 6.303f, -3.638f)
                lineToRelative(1.839f, 1.062f)
                lineToRelative(1.5f, -2.598f)
                lineToRelative(-1.838f, -1.061f)
                curveToRelative(0.444f, -1.13f, 0.696f, -2.355f, 0.696f, -3.64f)
                close()
                moveTo(12.0f, 19.0f)
                curveToRelative(-3.859f, 0.0f, -7.0f, -3.141f, -7.0f, -7.0f)
                reflectiveCurveToRelative(3.141f, -7.0f, 7.0f, -7.0f)
                reflectiveCurveToRelative(7.0f, 3.141f, 7.0f, 7.0f)
                reflectiveCurveToRelative(-3.141f, 7.0f, -7.0f, 7.0f)
                close()
                moveTo(16.5f, 11.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-3.0f)
                lineToRelative(3.793f, -3.707f)
                curveToRelative(0.391f, -0.391f, 1.024f, -0.391f, 1.414f, 0.0f)
                lineToRelative(3.793f, 3.707f)
                close()
            }
        }
        .build()
        return _productivity!!
    }

private var _productivity: ImageVector? = null
