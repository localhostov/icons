package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.Peace: ImageVector
    get() {
        if (_peace != null) {
            return _peace!!
        }
        _peace = Builder(name = "Peace", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(21.0f, 12.0f)
                curveToRelative(0.0f, 1.425f, -0.333f, 2.773f, -0.926f, 3.972f)
                lineToRelative(-6.574f, -6.574f)
                lineTo(13.5f, 3.126f)
                curveToRelative(4.251f, 0.716f, 7.5f, 4.423f, 7.5f, 8.874f)
                close()
                moveTo(10.5f, 20.874f)
                curveToRelative(-1.857f, -0.313f, -3.522f, -1.196f, -4.809f, -2.463f)
                lineToRelative(4.809f, -4.809f)
                verticalLineToRelative(7.272f)
                close()
                moveTo(13.5f, 13.639f)
                lineToRelative(4.79f, 4.79f)
                curveToRelative(-1.285f, 1.257f, -2.943f, 2.133f, -4.79f, 2.444f)
                verticalLineToRelative(-7.235f)
                close()
                moveTo(10.5f, 3.125f)
                verticalLineToRelative(6.235f)
                lineToRelative(-6.587f, 6.587f)
                curveToRelative(-0.584f, -1.192f, -0.913f, -2.532f, -0.913f, -3.947f)
                curveToRelative(0.0f, -4.451f, 3.249f, -8.158f, 7.5f, -8.874f)
                close()
            }
        }
        .build()
        return _peace!!
    }

private var _peace: ImageVector? = null
