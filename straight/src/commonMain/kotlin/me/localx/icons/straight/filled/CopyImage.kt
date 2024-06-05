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

public val Icons.Filled.CopyImage: ImageVector
    get() {
        if (_copyImage != null) {
            return _copyImage!!
        }
        _copyImage = Builder(name = "CopyImage", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 20.0f)
                verticalLineToRelative(2.0f)
                lineTo(0.0f, 22.0f)
                lineTo(0.0f, 9.0f)
                curveToRelative(0.0f, -1.65f, 1.35f, -3.0f, 3.0f, -3.0f)
                verticalLineToRelative(14.0f)
                lineTo(19.0f, 20.0f)
                close()
                moveTo(24.0f, 5.0f)
                verticalLineToRelative(13.0f)
                lineTo(5.0f, 18.0f)
                lineTo(5.0f, 5.0f)
                curveToRelative(0.0f, -1.65f, 1.35f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(13.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, 1.35f, 3.0f, 3.0f)
                close()
                moveTo(8.0f, 6.5f)
                curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                close()
                moveTo(22.0f, 4.77f)
                lineToRelative(-6.11f, 6.11f)
                lineToRelative(-3.3f, -3.3f)
                lineToRelative(-5.59f, 5.59f)
                verticalLineToRelative(2.83f)
                lineToRelative(5.59f, -5.59f)
                lineToRelative(3.3f, 3.3f)
                lineToRelative(6.11f, -6.11f)
                verticalLineToRelative(-2.83f)
                close()
            }
        }
        .build()
        return _copyImage!!
    }

private var _copyImage: ImageVector? = null
