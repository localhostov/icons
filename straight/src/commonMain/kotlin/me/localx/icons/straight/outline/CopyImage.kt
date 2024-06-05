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

public val Icons.Outline.CopyImage: ImageVector
    get() {
        if (_copyImage != null) {
            return _copyImage!!
        }
        _copyImage = Builder(name = "CopyImage", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 7.5f)
                curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(24.0f, 5.0f)
                verticalLineToRelative(13.0f)
                lineTo(5.0f, 18.0f)
                lineTo(5.0f, 5.0f)
                curveToRelative(0.0f, -1.65f, 1.35f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(13.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, 1.35f, 3.0f, 3.0f)
                close()
                moveTo(7.0f, 5.0f)
                lineTo(7.0f, 15.78f)
                lineToRelative(7.85f, -7.85f)
                lineToRelative(3.3f, 3.3f)
                lineToRelative(3.85f, -3.85f)
                verticalLineToRelative(-2.38f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                lineTo(8.0f, 4.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                close()
                moveTo(22.0f, 16.0f)
                verticalLineToRelative(-5.79f)
                lineToRelative(-3.85f, 3.85f)
                lineToRelative(-3.3f, -3.3f)
                lineToRelative(-5.24f, 5.24f)
                horizontalLineToRelative(12.39f)
                close()
                moveTo(2.0f, 9.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, 1.35f, -3.0f, 3.0f)
                verticalLineToRelative(13.0f)
                lineTo(19.0f, 22.0f)
                verticalLineToRelative(-2.0f)
                lineTo(2.0f, 20.0f)
                lineTo(2.0f, 9.0f)
                close()
            }
        }
        .build()
        return _copyImage!!
    }

private var _copyImage: ImageVector? = null
