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

public val Icons.Bold.CopyImage: ImageVector
    get() {
        if (_copyImage != null) {
            return _copyImage!!
        }
        _copyImage = Builder(name = "CopyImage", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 7.5f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(24.0f, 5.5f)
                verticalLineToRelative(11.5f)
                lineTo(5.0f, 17.0f)
                lineTo(5.0f, 5.5f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(12.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(8.0f, 14.0f)
                lineToRelative(5.0f, -5.0f)
                lineToRelative(3.3f, 3.3f)
                lineToRelative(4.7f, -4.78f)
                verticalLineToRelative(-2.02f)
                curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                lineTo(8.5f, 5.0f)
                curveToRelative(-0.28f, 0.0f, -0.5f, 0.22f, -0.5f, 0.5f)
                lineTo(8.0f, 14.0f)
                close()
                moveTo(3.0f, 5.05f)
                curveToRelative(-1.69f, 0.25f, -3.0f, 1.69f, -3.0f, 3.45f)
                verticalLineToRelative(13.5f)
                lineTo(19.0f, 22.0f)
                verticalLineToRelative(-3.0f)
                lineTo(3.0f, 19.0f)
                lineTo(3.0f, 5.05f)
                close()
            }
        }
        .build()
        return _copyImage!!
    }

private var _copyImage: ImageVector? = null
