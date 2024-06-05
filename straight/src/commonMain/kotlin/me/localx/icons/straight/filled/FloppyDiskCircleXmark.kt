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

public val Icons.Filled.FloppyDiskCircleXmark: ImageVector
    get() {
        if (_floppyDiskCircleXmark != null) {
            return _floppyDiskCircleXmark!!
        }
        _floppyDiskCircleXmark = Builder(name = "FloppyDiskCircleXmark", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 12.0f)
                curveToRelative(-3.31f, 0.0f, -6.0f, 2.69f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.69f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.69f, 6.0f, -6.0f)
                reflectiveCurveToRelative(-2.69f, -6.0f, -6.0f, -6.0f)
                close()
                moveTo(21.21f, 19.79f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-1.79f, -1.79f)
                lineToRelative(-1.79f, 1.79f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(1.79f, -1.79f)
                lineToRelative(-1.79f, -1.79f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(1.79f, 1.79f)
                lineToRelative(1.79f, -1.79f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-1.79f, 1.79f)
                lineToRelative(1.79f, 1.79f)
                close()
                moveTo(10.0f, 18.0f)
                curveToRelative(0.0f, 1.06f, 0.21f, 2.07f, 0.59f, 3.0f)
                lineTo(0.0f, 21.0f)
                lineTo(0.0f, 3.0f)
                curveTo(0.0f, 1.35f, 1.35f, 0.0f, 3.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                lineTo(5.0f, 7.0f)
                horizontalLineToRelative(11.0f)
                lineTo(16.0f, 0.0f)
                horizontalLineToRelative(0.01f)
                lineToRelative(4.99f, 4.99f)
                verticalLineToRelative(5.6f)
                curveToRelative(-0.93f, -0.38f, -1.94f, -0.59f, -3.0f, -0.59f)
                curveToRelative(-1.73f, 0.0f, -3.33f, 0.56f, -4.64f, 1.49f)
                curveToRelative(-0.63f, -0.9f, -1.68f, -1.49f, -2.86f, -1.49f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                curveToRelative(0.0f, 1.78f, 1.35f, 3.24f, 3.08f, 3.46f)
                curveToRelative(-0.04f, 0.34f, -0.08f, 0.69f, -0.08f, 1.04f)
                close()
                moveTo(14.0f, 5.0f)
                lineTo(7.0f, 5.0f)
                lineTo(7.0f, 0.0f)
                horizontalLineToRelative(7.0f)
                lineTo(14.0f, 5.0f)
                close()
                moveTo(11.86f, 12.88f)
                curveToRelative(-0.53f, 0.63f, -0.96f, 1.34f, -1.27f, 2.12f)
                curveToRelative(-0.03f, 0.0f, -0.06f, 0.0f, -0.09f, 0.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                curveToRelative(0.6f, 0.0f, 1.12f, 0.36f, 1.36f, 0.88f)
                close()
            }
        }
        .build()
        return _floppyDiskCircleXmark!!
    }

private var _floppyDiskCircleXmark: ImageVector? = null
